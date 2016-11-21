package com.awu;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;

@ContentView(R.layout.activity_mine_setting)
public class MineSettingActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.mine_setting_back)
    private ImageView mine_setting_back;//返回键
    @ViewInject(R.id.mine_setting_persionMessage)
    private RelativeLayout persionMessage;//个人信息
    @ViewInject(R.id.mine_setting_address)
    private RelativeLayout address;//收货地址
    @ViewInject(R.id.mine_setting_phoneNum)
    private RelativeLayout phoneNum;// 手机号码
    @ViewInject(R.id.mine_setting_changePassword)
    private RelativeLayout changePassword;//个人密码
    @ViewInject(R.id.mine_setting_userAgreement)
    private RelativeLayout userAgreement;//用户协议
    @ViewInject(R.id.mine_setting_aboutUs)
    private RelativeLayout aboutUs;//关于我们
    @ViewInject(R.id.mine_setting_loginOut)
    private CardView loginout;//退出登陆

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
        initListerner();
    }

    private void initListerner() {
        loginout.setOnClickListener(this);
        persionMessage.setOnClickListener(this);
        address.setOnClickListener(this);
        phoneNum.setOnClickListener(this);
        changePassword.setOnClickListener(this);
        userAgreement.setOnClickListener(this);
        aboutUs.setOnClickListener(this);
        mine_setting_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
//        loginout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.mine_setting_persionMessage:
                intent = new Intent(this, MineSettingPersionMessageActivity.class);
                break;
            case R.id.mine_setting_address:
                intent = new Intent(this, MineSettingAddressActivity.class);
                break;
            case R.id.mine_setting_phoneNum:
                intent = new Intent(this, MineSettintPhoneNumActivity.class);
                break;
            case R.id.mine_setting_changePassword:
                intent = new Intent(this, MineSettingChangePwdActivity.class);
                break;
            case R.id.mine_setting_userAgreement:
                intent = new Intent(this, MineSettingUserAgreementActivity.class);
                break;
            case R.id.mine_setting_aboutUs:
                intent = new Intent(this, MineSettingAboutUsActivity.class);
                break;
            case R.id.mine_setting_loginOut:
                Snackbar.make(view,"退出登陆",Snackbar.LENGTH_SHORT).show();
                SMSSDK.unregisterEventHandler(new EventHandler());
                intent=new Intent(this,MainActivity.class);
                break;
        }
        if (intent != null) {

            startActivity(intent);
        }
    }

}
