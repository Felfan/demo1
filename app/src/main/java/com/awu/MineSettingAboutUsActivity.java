package com.awu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_mine_setting_about_us)
public class MineSettingAboutUsActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.aboutUs_back)
    private ImageView aboutUs_back;
    @ViewInject(R.id.aboutUs_http)
    private RelativeLayout aboutUs_http;
    @ViewInject(R.id.aboutUs_publicAccount)
    private RelativeLayout aboutUs_publicAccount;

    private String http="http://www.awu.cn";
    private String publicAccount="http://www.weibo.com/awutech";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_setting_about_us);
        initListerner();
    }
    private void initListerner() {
        aboutUs_back.setOnClickListener(this);
        aboutUs_http.setOnClickListener(this);
        aboutUs_publicAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,MatchHtmlActivity.class);;
        switch (view.getId()){
            case R.id.aboutUs_back:
                finish();
                break;
            case R.id.aboutUs_http:
//                Toast.makeText(MineSettingAboutUsActivity.this, "进入官网", Toast.LENGTH_SHORT).show();
                intent.putExtra("title","啊屋官网");
                intent.putExtra("url",http);
                startActivity(intent);
                break;
            case R.id.aboutUs_publicAccount:
//                Toast.makeText(MineSettingAboutUsActivity.this, "进入微博公众号", Toast.LENGTH_SHORT).show();
                intent.putExtra("title","啊屋微博");
                intent.putExtra("url",publicAccount);
                startActivity(intent);
                break;
        }
    }
}
