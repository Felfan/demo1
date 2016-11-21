package com.awu;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import pagetransformers.CubeOutTransformer;

public class GuideActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager mViewPager;
    private int[] mImgIds = new int[]{R.drawable.guide_image1,
            R.drawable.guide_image2, R.drawable.guide_image3};
    private List<ImageView> mImageViews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        initSp();

        initData();

        mViewPager = (ViewPager) findViewById(R.id.viewPager_splash);

       // mViewPager.setPageTransformer(true, new RotateDownPageTransformer());
        mViewPager.setPageTransformer(true, new CubeOutTransformer());

        mViewPager.setAdapter(new PagerAdapter() {
            @Override
            public Object instantiateItem(ViewGroup container, int position) {

                container.addView(mImageViews.get(position));
                return mImageViews.get(position);
            }

            @Override
            public void destroyItem(ViewGroup container, int position,
                                    Object object) {

                container.removeView(mImageViews.get(position));
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public int getCount() {
                return mImgIds.length;
            }
        });

    }

    private void initSp() {
        SharedPreferences sp = this.getSharedPreferences("userInfo", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        //修改了
        editor.putBoolean("isFirst", true);
        editor.commit();
    }

    private void initData() {
        for (int imgId : mImgIds) {
            ImageView imageView = new ImageView(getApplicationContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageResource(imgId);
            mImageViews.add(imageView);
        }
        mImageViews.get(mImageViews.size()-1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.startActivity(new Intent(this, MainActivity.class));
        this.finish();
    }
}
