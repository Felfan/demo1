package com.awu;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_vip_pay)
public class VipPayActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.vipPay_back)
    private ImageView vipPay_back;
    @ViewInject(R.id.vipPay_imageView_true)
    private ImageView vipPay_imageView_true;
    @ViewInject(R.id.vipPay_imageView_false)
    private ImageView vipPay_imageView_false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_vip_pay);
        initListerner();
    }

    private void initListerner() {
        vipPay_imageView_true.setOnClickListener(this);
        vipPay_imageView_false.setOnClickListener(this);
        vipPay_back.setOnClickListener(this);
    }
    public void btnOnClick(View view) {
        Snackbar.make(view,"点击了支付按钮",Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.vipPay_imageView_false:
                vipPay_imageView_true.setVisibility(View.VISIBLE);
                vipPay_imageView_false.setVisibility(View.GONE);
                break;
            case R.id.vipPay_imageView_true:
                vipPay_imageView_true.setVisibility(View.GONE);
                vipPay_imageView_false.setVisibility(View.VISIBLE);
                break;
            case R.id.vipPay_back:
                VipPayActivity.this.finish();
                break;
        }
    }
}
