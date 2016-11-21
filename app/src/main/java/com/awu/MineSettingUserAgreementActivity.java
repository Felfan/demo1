package com.awu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import utils.LoadJson;

@ContentView(R.layout.activity_mine_setting_user_agreement)
public class MineSettingUserAgreementActivity extends AppCompatActivity {

    @ViewInject(R.id.userAgreement_close)
    private ImageView userAgreement_close;
    @ViewInject(R.id.userAgreement_text)
    private TextView userAgreement_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
        userAgreement_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        userAgreement_text.setText(LoadJson.getJsonData("useragreement.txt",this));
    }
}
