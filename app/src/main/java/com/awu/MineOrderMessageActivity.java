package com.awu;

import android.content.Intent;
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
import fragments.OrderAcceptFragment;
import fragments.OrderGuidFragment;
import fragments.OrderPayFragment;
import fragments.OrderSendFragment;

@ContentView(R.layout.activity_mine_order_message)
public class MineOrderMessageActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.mineOrder_back)
    private ImageView orderBack;
    @ViewInject(R.id.mineOrder_tablayout)
    private TabLayout orderTablayout;
    @ViewInject(R.id.mineOrder_viewpager)
    private ViewPager orderViewPager;

    private OrderGuidFragment mOrderGuidFragment;
    private OrderPayFragment mOrderPayFragment;
    private OrderSendFragment mOrderSendFragment;
    private OrderAcceptFragment mOrderAcceptFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_order_message);
        initTablayout();
        initViewPager();
        initListerner();
    }

    private void initListerner() {
        orderBack.setOnClickListener(this);
        Intent intent = getIntent();
        int order = intent.getIntExtra("order", 0);
        switch (order) {
            case 0:
                orderViewPager.setCurrentItem(0);
                break;
            case 1:
                orderViewPager.setCurrentItem(1);
                break;
            case 2:
                orderViewPager.setCurrentItem(2);
                break;
            case 3:
                orderViewPager.setCurrentItem(3);
                break;
        }
    }

    private void initViewPager() {
        List<Fragment> list = new ArrayList<Fragment>();
        mOrderGuidFragment = new OrderGuidFragment();
        mOrderPayFragment = new OrderPayFragment();
        mOrderSendFragment = new OrderSendFragment();
        mOrderAcceptFragment = new OrderAcceptFragment();
        list.add(mOrderGuidFragment);
        list.add(mOrderPayFragment);
        list.add(mOrderSendFragment);
        list.add(mOrderAcceptFragment);
        OrderAdapter adapter = new OrderAdapter(getSupportFragmentManager(), list);
        orderViewPager.setAdapter(adapter);
        orderViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(orderTablayout));

    }

    private void initTablayout() {
        String[] order = getResources().getStringArray(R.array.order);
        for (int i = 0; i < order.length; i++) {
            TabLayout.Tab tab = orderTablayout.newTab();
            tab.setText(order[i]);
            orderTablayout.addTab(tab);
        }
        orderTablayout.setTabMode(TabLayout.MODE_FIXED);
        orderTablayout.setSelectedTabIndicatorColor(Color.RED);
        orderTablayout.setTabTextColors(Color.BLACK, Color.RED);
        orderTablayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(orderViewPager));
    }

    @Override
    public void onClick(View view) {
        MineOrderMessageActivity.this.finish();
    }
    public void btnSend(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

}
