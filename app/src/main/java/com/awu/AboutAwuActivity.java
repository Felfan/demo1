package com.awu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_about_awu)
public class AboutAwuActivity extends AppCompatActivity {

    @ViewInject(R.id.aboutAwu_back)
    private ImageView aboutAwu_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_about_awu);
        aboutAwu_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AboutAwuActivity.this.finish();
            }
        });
    }

    public void btnClick(View view) {
        Intent intent=null;
        switch (view.getId()){
            case R.id.aboutAwu_button1:
                intent=new Intent(this,MineFreeActivity.class);
                break;
            case R.id.aboutAwu_button2:
                intent=new Intent(this,MineVipActivity.class);
                break;
        }
        startActivity(intent);
    }
}
