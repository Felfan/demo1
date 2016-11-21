package com.awu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_mine_vip_pay)
public class MineVipPayActivity extends AppCompatActivity {

    @ViewInject(R.id.mineVipPay_back)
    private ImageView mineVipPay_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_vip_pay);
        mineVipPay_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MineVipPayActivity.this.finish();
            }
        });
    }
    public void btnOnClick(View view) {
        startActivity(new Intent(this,VipPayActivity.class));
    }
}
