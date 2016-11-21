package com.awu;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_mine_free)
public class MineFreeActivity extends AppCompatActivity {

    @ViewInject(R.id.mineFree_back)
    private ImageView mineFree_back;
    @ViewInject(R.id.btn1)
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_free);
        mineFree_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MineFreeActivity.this.finish();
            }
        });
    }

    public void btnOnClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                String flag=btn1.getText().toString();
                if (flag.equals("已领取")){
                    Toast.makeText(MineFreeActivity.this, "抱歉，您已经享受过会员体验了", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn2:
//                Snackbar.make(view,"点击了马上开通",Snackbar.LENGTH_SHORT).show();
                startActivity(new Intent(this,VipPayActivity.class));
                break;
        }
    }
}
