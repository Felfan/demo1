package com.awu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;
import java.util.Map;

import adapters.MineWishRecyclerAdapter;
import sql.MySQLiteOpenHelper;
import utils.LogUtils;

@ContentView(R.layout.activity_mine_wish)
public class MineWishActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.mine_wish_back)
    private ImageView myWish;
    @ViewInject(R.id.recyclerView_mineWishActivity)
    private RecyclerView mRecyclerView = null;

    private MySQLiteOpenHelper mMySQLiteOpenHelper = null;
    //放置数据库中查询到的数据
    private List<Map<String, Object>> mList;
    private MineWishRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_wish);
        //设置RecyclerView
        initRecyclerView();
        //获得数据
        initData();
        //监听
        initListener();
    }

    private void initData() {
        mMySQLiteOpenHelper = new MySQLiteOpenHelper(this);
        mList = mMySQLiteOpenHelper.selectList("select * from tb_favorite", null);
        LogUtils.d("MineWishActivity","------------>:"+mList.size());
        mAdapter.setList(mList);
        mAdapter.setOnChildClickListener(new MineWishRecyclerAdapter.RecyclerOnChildClickListener() {
            @Override
            public void onClick(View view, int position, MineWishRecyclerAdapter.MyViewHolder myViewHolder) {
                Intent intent = new Intent(MineWishActivity.this,GoodsInfoActivity.class);
                intent.putExtra("itemUrl",(String) mList.get(position).get("url"));
                startActivity(intent);
            }
        });
    }

    private void initRecyclerView() {
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter = new MineWishRecyclerAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initListener() {
        myWish.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mine_wish_back:
                finish();
                break;
        }
    }
}
