package com.awu;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_mine_can_with_drawal)
public class MineCanWithDrawalActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.canWithDrawal_back)
    private ImageView canWithDrawal_back;
    @ViewInject(R.id.canWithDrawal_allRedPacket)
    private LinearLayout canWithDrawal_allRedpacket;
    @ViewInject(R.id.canWithDrawal_askBackNow)
    private LinearLayout canWithDrawal_askBackNow;
    @ViewInject(R.id.canWithDrawal_paymentDetails)
    private LinearLayout canWithDrawal_paymentDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_can_with_drawal);
        initListerner();
    }

    private void initListerner() {
        canWithDrawal_back.setOnClickListener(this);
        canWithDrawal_allRedpacket.setOnClickListener(this);
        canWithDrawal_askBackNow.setOnClickListener(this);
        canWithDrawal_paymentDetails.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.canWithDrawal_back:
                MineCanWithDrawalActivity.this.finish();
                break;
            case R.id.canWithDrawal_allRedPacket:
                startActivity(new Intent(this,MineNoGetActivity.class));
                break;
            case R.id.canWithDrawal_askBackNow:
                startActivity(new Intent(this,GetMoneyActivity.class));
                break;
            case R.id.canWithDrawal_paymentDetails:
                Snackbar.make(view,"点击了收支明细",Snackbar.LENGTH_SHORT).show();
                break;
        }
    }
}
