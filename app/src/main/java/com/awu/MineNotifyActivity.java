package com.awu;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.awu.IM.IMActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_mine_notify)
public class MineNotifyActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.notify_back)
    private ImageView notify_back;
    @ViewInject(R.id.notify_awuCustomServer)
    private RelativeLayout notify_awuCustomServer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_notify);
        initListerner();
    }

    private void initListerner() {
        notify_back.setOnClickListener(this);
        notify_awuCustomServer.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.notify_back:
                MineNotifyActivity.this.finish();
                break;
            case R.id.notify_awuCustomServer:
                Snackbar.make(view,"进入客服",Snackbar.LENGTH_SHORT).show();
                startActivity(new Intent(MineNotifyActivity.this, IMActivity.class));
                break;
        }
    }
}
