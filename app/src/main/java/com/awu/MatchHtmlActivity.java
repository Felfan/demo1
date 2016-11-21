package com.awu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

//加载html页面
public class MatchHtmlActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView backImageView = null;
    private TextView titleTextView = null;
    private WebView mWebView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_html);

        //初始化控件
        initView();
        //设置WebView
        initWebView();
        //监听
        initListener();
    }

    private void initListener() {
        backImageView.setOnClickListener(this);
    }

    //说明这个方法中有关于javascript的接口，用于给javascript使用的方法
    @SuppressLint("JavascriptInterface")
    private void initWebView() {
        //接收Intent中传过来的值
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String url = intent.getStringExtra("url");
        //设置WebView中的值
        WebSettings webSettings=mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.loadUrl(url);
        //给javascript添加一个接口方法
        //html中跳转的方法
        mWebView.addJavascriptInterface(new Object(){
            @android.webkit.JavascriptInterface
            public void callFromJs( ){
                Intent intent = new Intent(MatchHtmlActivity.this, GoodsInfoActivity.class);
                intent.putExtra("itemUrl", "goodsinfoactivity_item_1");
                startActivity(intent);
            }
        },"single");
        mWebView.addJavascriptInterface(new Object(){
            @android.webkit.JavascriptInterface
            public void callFromJs( ){
                Intent intent = new Intent(MatchHtmlActivity.this, GoodsInfoActivity.class);
                intent.putExtra("itemUrl", "match_recyclerview_item_1");
                startActivity(intent);
            }
        },"group");
        titleTextView.setText(title);
    }

    private void initView() {
        backImageView = (ImageView) findViewById(R.id.imageView_matchHtmlActivity_back);
        titleTextView = (TextView) findViewById(R.id.textView_matchHtmlActivity_title);
        mWebView = (WebView) findViewById(R.id.webView_matchHtmlActivity);
    }

    //点击监听
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView_matchHtmlActivity_back:
                this.finish();
                break;
        }
    }
}
