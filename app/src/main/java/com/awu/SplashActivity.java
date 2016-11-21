package com.awu;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import cn.jpush.android.api.JPushInterface;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SharedPreferences sp = this.getSharedPreferences("userInfo", MODE_PRIVATE);
        boolean isFirst = sp.getBoolean("isFirst", true);
        if (isFirst) {
            mHandler.sendEmptyMessageDelayed(100, 6000);
        } else {
            mHandler.sendEmptyMessageDelayed(200, 6000);
        }
    }

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 100:
                    SplashActivity.this.startActivity(new Intent(SplashActivity.this, GuideActivity.class));
                    break;
                case 200:
                    SplashActivity.this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    break;
            }
            SplashActivity.this.finish();
        }
    };


    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }
}
