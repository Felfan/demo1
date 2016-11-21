package com.awu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_mine_vip)
public class MineVipActivity extends AppCompatActivity {

    @ViewInject(R.id.mineVip_back)
    private ImageView mineVip_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_vip);
        mineVip_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MineVipActivity.this.finish();
            }
        });
    }
    public void btnClick(View view) {
        startActivity(new Intent(this,MineVipPayActivity.class));
    }
}
