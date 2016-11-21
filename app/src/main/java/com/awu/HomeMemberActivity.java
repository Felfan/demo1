package com.awu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;
@ContentView(R.layout.activity_home_member)
public class HomeMemberActivity extends AppCompatActivity {
    @ViewInject(R.id.button_homeMember)
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home_member);
        x.view().inject(this);
        AnimationSet set = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.rs_button);
        mButton.startAnimation(set);
    }

    public void toMember(View view) {
        Intent intent = new Intent(this, MineFreeActivity.class);
        this.startActivity(intent);
    }

    public void back(View view) {
        this.finish();
    }
}
