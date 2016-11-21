package com.awu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_mine_setting_change_pwd)
public class MineSettingChangePwdActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.changePwd_back)
    private ImageView changePwd_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_setting_change_pwd);
        initListerner();
    }

    private void initListerner() {
        changePwd_back.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.changePwd_back://左上角的回退键
                finish();
                break;
        }
    }
}
