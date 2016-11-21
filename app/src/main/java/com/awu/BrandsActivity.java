package com.awu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import adapters.MyDpRvAdapter;
import beans.Item1_home;
import beans.Item_draw;
import interfaces.IItem;

@ContentView(R.layout.activity_brand)
public class BrandsActivity extends AppCompatActivity implements
        SwipeRefreshLayout.OnRefreshListener,
        Callback.CommonCallback<String> {

    @ViewInject(R.id.swipeRefresh_brand)
    private SwipeRefreshLayout mSwipeRefreshLayout;
    @ViewInject(R.id.recyclerView_brand)
    private RecyclerView mRecyclerView;
    private MyDpRvAdapter mRvAdapter;
    private String url = "http://console.awu.cn/api/index.php?act=brands";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //view 的注入
        x.view().inject(this);
        //获得外界传入的url，没有就使用默认的url
        initUrl();
        //初始化swipeRefreshLayout
        initSwipeRefreshLayout();
        //初始化recyclerView
        initRecyclerView();
        //初始化要展示的数据
        initData();
    }

    private void initData() {
        mRvAdapter.clear();
        RequestParams params = new RequestParams(url);
        x.http().post(params, this);
    }

    private void initUrl() {
        Intent intent = this.getIntent();
        String url = intent.getStringExtra("url");
        if (url != null) {
            this.url = url;
        }
    }

    private void initSwipeRefreshLayout() {
        mSwipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.RED, Color.GREEN, Color.GRAY);
        mSwipeRefreshLayout.setOnRefreshListener(this);
    }

    private void initRecyclerView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position == 0 ? 3 : 1;
            }
        });
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRvAdapter = new MyDpRvAdapter(this);
        mRecyclerView.setAdapter(mRvAdapter);
    }

    //回退键的点击
    public void oneOfImageClick(View view) {
        //this.overridePendingTransition();
        this.finish();
    }

    //刷新的监听
    @Override
    public void onRefresh() {
        initData();
    }

    //数据成功下载的回调---进行解析并通知显示同时刷新和加载动画也要消失
    @Override
    public void onSuccess(String result) {
        List<IItem> list = new ArrayList<>();
        try {

            JSONObject jsonObject = new JSONObject(result);
            JSONObject resultJson = jsonObject.optJSONObject("result");
            //头部广告图的添加
            JSONArray advArray = resultJson.optJSONArray("brandAdv");
            JSONObject brandAdvJson = advArray.optJSONObject(0);
            Item1_home item1 = new Item1_home();
            item1.setImageUrl(brandAdvJson.optString("brandadv_pic"));
            list.add(item1);
            JSONArray brandsArray = resultJson.optJSONArray("brandList");

            for (int i = 0; i < brandsArray.length(); i++) {
                JSONObject brand = brandsArray.optJSONObject(i);
                Item_draw item2 = new Item_draw();
                item2.setImageUrl(brand.optString("brand_pic2"));
                item2.setToUrl(brand.optString("brand_pic"));
                item2.setTitle(brand.optString("brand_name"));
                item2.setId(brand.optString("brand_id"));
                list.add(item2);
            }
            //通知刷新
            mRvAdapter.addList(list);
            //刷新完成了
            if (mSwipeRefreshLayout.isRefreshing()) {
                mSwipeRefreshLayout.setRefreshing(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }
}
