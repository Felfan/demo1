package com.awu;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import myviews.Text;

@ContentView(R.layout.activity_mine_can_use)
public class MineCanUseActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.canUse_back)
    private ImageView canUse_back;//左上角返回键
    @ViewInject(R.id.canUse_num)
    private TextView canUse_num;//布票数量
    @ViewInject(R.id.canUse_lookTicket)
    private Text canUse_lookTickey;//查看布票明细
    @ViewInject(R.id.canUse_todayGet)
    private TextView canUse_todayGet;//今日收入
    @ViewInject(R.id.canUse_todaySend)
    private TextView canUse_todaySend;//今日支出
    @ViewInject(R.id.canUse_getTickey)
    private RelativeLayout canUse_getTickey;//如何获取布票

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_can_use);
        canUse_lookTickey.setDeleteLineStyle(1);
        initListerner();
    }

    private void initListerner(){
        canUse_back.setOnClickListener(this);
        canUse_lookTickey.setOnClickListener(this);
        canUse_getTickey.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.canUse_back:
                MineCanUseActivity.this.finish();
                break;
            case R.id.canUse_lookTicket:
                Snackbar.make(view,"点击了查看布票明细",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.canUse_getTickey:
                startActivity(new Intent(this,CanUseTickeyActivity.class));
                break;
        }

    }
}
