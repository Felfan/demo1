package com.awu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import adapters.MyDpRvAdapter;
import beans.Item1_home;
import beans.Item_display;
import interfaces.IItem;
import myviews.MyEmptyRecyclerView;

public class DisplayActivity extends AppCompatActivity
        implements SwipeRefreshLayout.OnRefreshListener,
        Callback.CommonCallback<String>,
        View.OnClickListener {

    private TextView mTextView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private MyEmptyRecyclerView mRecyclerView;
    private MyDpRvAdapter mRvAdapter;
    private String url;
    private String title;
    private String headUrl;
    private int lastIndex;
    private ImageView backTop;
    private LinearLayout empty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //初始化外界传入的值
        initUrlTitle();
        //初始化控件
        initWidget();
        //初始化swipeRefreshLayout
        initSwipeRefreshLayout();
        //初始化recyclerView
        initRecyclerView();
        //数据的获取或者更新
        initData();
    }

    private void initUrlTitle() {
        Intent intent = this.getIntent();
        title = intent.getStringExtra("title");
        url = intent.getStringExtra("url");
        headUrl = intent.getStringExtra("headUrl");
    }

    private void initWidget() {
        mTextView = (TextView) this.findViewById(R.id.textView_display_title);
        if (title != null) {
            mTextView.setText(title);
        }
        mSwipeRefreshLayout = (SwipeRefreshLayout) this.findViewById(R.id.swipeRefreshLayout_display);
        mRecyclerView = (MyEmptyRecyclerView) this.findViewById(R.id.recyclerView_display);
        backTop = (ImageView) this.findViewById(R.id.imageView_display_top);
        backTop.setOnClickListener(this);
        //设置空布局展示
        empty = (LinearLayout) this.findViewById(R.id.linear_display_empty);
        mRecyclerView.setEmptyView(empty);
    }

    private void initSwipeRefreshLayout() {
        mSwipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.RED, Color.GREEN, Color.GRAY);
        mSwipeRefreshLayout.setOnRefreshListener(this);
    }

    private void initData() {
        mRvAdapter.clear();
        if (url == null) {
            return;
        }
        //直接添加头布局---一张图片
        if (headUrl != null) {
            Item1_home item = new Item1_home();
            item.setImageUrl(headUrl);
            mRvAdapter.addItem(item);
        }
        RequestParams params = new RequestParams(url);
        x.http().post(params, this);
    }

    private void initRecyclerView() {
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(layoutManager);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (headUrl == null && position == lastIndex) {
                    return 2;
                }
                if (headUrl != null && position == 0 || position == lastIndex) {
                    return 2;
                }
                return 1;
            }
        });
        mRvAdapter = new MyDpRvAdapter(this);
        mRecyclerView.setAdapter(mRvAdapter);

        //滑动监听
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0) {
                    backTop.setVisibility(View.VISIBLE);
                } else {
                    backTop.setVisibility(View.GONE);
                }
            }
        });
    }

    //回退键的监听
    public void oneOfImageClick(View view) {
        switch (view.getId()) {
            case R.id.imageView_display_back:
                //点击了回退键
                this.finish();
                break;
        }
    }

    //swipeRefreshLayout的刷新监听
    @Override
    public void onRefresh() {
        initData();
    }

    //数据下载成功的回调
    @Override
    public void onSuccess(String result) {
        //解析并进行通知刷新
        try {
            JSONObject jsonObject = new JSONObject(result);
            JSONArray resultArray = jsonObject.optJSONArray("result");
            List<IItem> list = new ArrayList<>();
            for (int i = 0; i < resultArray.length(); i++) {
                JSONObject json = resultArray.optJSONObject(i);
                Item_display itemDisplay = new Item_display();
                itemDisplay.setId(json.optString("store_id"));
                itemDisplay.setImageUrl(json.optString("goods_image"));
                itemDisplay.setPrice(json.optString("goods_marketprice"));
                itemDisplay.setName(json.optString("goods_name"));
                list.add(itemDisplay);
            }
            list.add(new IItem() {
                @Override
                public int getType() {
                    return IItem.FOOT_ITEM;
                }
            });
            //记录数据的最后一直位置，也就是全部的个数，好判断出最后一个尾部局要占两列
            lastIndex = list.size() + (headUrl == null ? -1 : 0);
            //通知adapter进行更新数据
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

    //点击了返回顶部
    @Override
    public void onClick(View v) {
        mRecyclerView.smoothScrollToPosition(0);
    }
}
