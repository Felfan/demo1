package com.awu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CanUseTickeyActivity extends AppCompatActivity {

    private ImageView canUseTickey_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_can_use_tickey);
        canUseTickey_back= (ImageView) findViewById(R.id.canUseTickey_back);
        canUseTickey_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CanUseTickeyActivity.this.finish();
            }
        });
    }
}
