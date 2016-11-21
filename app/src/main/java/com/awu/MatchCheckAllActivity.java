package com.awu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import org.xutils.common.Callback;
import org.xutils.x;

import adapters.MatchCheckAllListViewAdapter;
import beans.MatchCheckAllBeans;
import params.MatchFragmentParams;

public class MatchCheckAllActivity extends AppCompatActivity implements Callback.CommonCallback<MatchCheckAllBeans>, View.OnClickListener, AbsListView.OnScrollListener, AdapterView.OnItemClickListener {

    private ImageView backFragmentImageView = null;
    private ListView mListView = null;
    private ImageView backTopImageView = null;
    private MatchCheckAllListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_check_all);
        //初始化控件
        initView();
        //加载数据
        initData();
        //设置ListView
        initListView();
        //监听
        initListener();
    }
    //监听
    private void initListener() {
        backTopImageView.setOnClickListener(this);
        backFragmentImageView.setOnClickListener(this);
        //listView滑动监听
        mListView.setOnScrollListener(this);
        //listView item 点击监听
        mListView.setOnItemClickListener(this);
    }

    //设置ListView
    private void initListView() {

        mAdapter = new MatchCheckAllListViewAdapter(this);
        mListView.setAdapter(mAdapter);

    }

    //加载数据
    private void initData() {
        MatchFragmentParams matchFragmentParams = new MatchFragmentParams();
        matchFragmentParams.op = "special_list";
        x.http().post(matchFragmentParams,this);
    }

    //初始化控件
    private void initView() {
        backFragmentImageView = (ImageView) findViewById(R.id.imageView_matchCheckAllActivity_backFragment);
        mListView = (ListView) findViewById(R.id.listView_matchCheckAllActivity);
        backTopImageView = (ImageView) findViewById(R.id.imageView_matchCheckAllActivity_backTop);

    }

    //网络数据请求成功的回调
    @Override
    public void onSuccess(MatchCheckAllBeans result) {
        mAdapter.setMatchCheckAllBeans(result);
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

    //点击监听
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView_matchCheckAllActivity_backTop:
                mListView.setSelection(0);
                backTopImageView.setVisibility(View.GONE);
                break;
            case R.id.imageView_matchCheckAllActivity_backFragment:
                this.finish();
                break;
        }
    }

    //listView是否滑动到底部
    private boolean isBottom = false;

    //listView滑动监听的回调
    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if (isBottom&&scrollState == SCROLL_STATE_IDLE){
            backTopImageView.setVisibility(View.VISIBLE);
        }
    }

    //listView滑动监听的回调
    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        isBottom = (firstVisibleItem+visibleItemCount) == totalItemCount;
    }

    //listView item 点击监听
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(MatchCheckAllActivity.this,GoodsInfoActivity.class));
    }
}
