package com.awu;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import adapters.OrderAdapter;
import fragments.NoGetFragment;
import fragments.OrderAcceptFragment;
import fragments.OrderGuidFragment;
import fragments.OrderPayFragment;
import fragments.OrderSendFragment;
import fragments.YesGetFragment;

@ContentView(R.layout.activity_mine_no_get)
public class MineNoGetActivity extends AppCompatActivity {

    @ViewInject(R.id.noGet_back)
    private ImageView noGetBack;
    @ViewInject(R.id.noGet_tablayout)
    private TabLayout noGetTablayout;
    @ViewInject(R.id.noGet_viewpager)
    private ViewPager noGetViewPager;

    private NoGetFragment mNoGetFragment=null;
    private YesGetFragment mYesGetFragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_no_get);
        initTablayout();
        initViewPager();
        initListerner();
    }

    private void initListerner() {
        noGetBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MineNoGetActivity.this.finish();
            }
        });
    }

    private void initViewPager() {
        List<Fragment> list = new ArrayList<Fragment>();
        mNoGetFragment=new NoGetFragment();
        mYesGetFragment=new YesGetFragment();
        list.add(mNoGetFragment);
        list.add(mYesGetFragment);

        OrderAdapter adapter = new OrderAdapter(getSupportFragmentManager(), list);
        noGetViewPager.setAdapter(adapter);
        noGetViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(noGetTablayout));

    }

    private void initTablayout() {
        String[] order = new String[]{"未领取","已领取"};
        for (int i = 0; i < order.length; i++) {
            TabLayout.Tab tab = noGetTablayout.newTab();
            tab.setText(order[i]);
            noGetTablayout.addTab(tab);
        }
        noGetTablayout.setTabMode(TabLayout.MODE_FIXED);
        noGetTablayout.setSelectedTabIndicatorColor(Color.RED);
        noGetTablayout.setTabTextColors(Color.BLACK, Color.RED);
        noGetTablayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(noGetViewPager));
    }
}
