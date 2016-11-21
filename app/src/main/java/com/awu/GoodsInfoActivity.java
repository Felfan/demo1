package com.awu;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.awu.IM.IMActivity;
import com.awu.alipay.PayDemoActivity;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import adapters.GoodsInfoViewPagerAdapter;
import beans.GoodsInfoDatas;
import myviews.MyRadioGroup;
import myviews.NumberIcon;
import sql.MySQLiteOpenHelper;
import utils.LoadJson;
import utils.LogUtils;
import utils.ShareSdk;

public class GoodsInfoActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener{

    private ImageView backImageView = null;
    private ImageView favoriteImageView = null;
    private ImageView unFavoriteImageView = null;
    private ImageView shareImageView = null;
    private ViewPager mViewPager = null;
    private TextView nameTextView = null;
    private TextView costPriceTextView = null;
    private TextView priceTextView = null;
    private RelativeLayout vipRelativeLayout = null;
    private RelativeLayout chooseRelativeLayout = null;
    //用于放置商品列表
    private LinearLayout goodsInfoLinearLayout = null;
    //用于放置指数球
    private LinearLayout indicatorLinearLayout = null;
    //客服
    private LinearLayout detailLinearLayout = null;
    //购物车
    private LinearLayout shoppingCardLinearLayout = null;
    //自定义View购物车图片
    private NumberIcon mNumberIcon = null;
    //加入购物车
    private TextView addShoppingCardTextView = null;
    //立即购买
    private TextView buyTextView = null;
    //bean类对象
    private GoodsInfoDatas mGoodsInfoDatas;

    private WebView mWebView = null;
    //数据库
    private MySQLiteOpenHelper mMySQLiteOpenHelper = null;
    private PopupWindow mPopupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_info);
        mMySQLiteOpenHelper = new MySQLiteOpenHelper(this);
        //控件初始化
        initView();
        //获取数据
        initData();
        //是否已经加入心愿单
        initIsAddFavorite();
        //设置ViewPager
        initViewPager();
        //handler发送数据，实现轮播
        initHandler();
        //ViewPager下面商品信息的设置
        initGoodsInfo();
        //商品列表添加到LinearLayout
        initAddGoodsToLinearLayout();
        //监听
        initListener();
        //设置webView
        initWebView();
    }

    //是否已经加入心愿单
    private void initIsAddFavorite() {
        boolean isAddFavorite = false;
        List<Map<String, Object>> mapList = mMySQLiteOpenHelper.selectList("select * from tb_favorite", null);
        for (int i = 0; i < mapList.size(); i++) {
            if (mGoodsInfoDatas.getResult().getGoods_info().getGoods_name().equals((String) mapList.get(i).get("name"))) {
                isAddFavorite = true;
            }
        }
        if (isAddFavorite) {
            favoriteImageView.setVisibility(View.VISIBLE);
            unFavoriteImageView.setVisibility(View.GONE);
        }
    }

    //商品列表添加到LinearLayout
    private void initAddGoodsToLinearLayout() {
        if (mGoodsInfoDatas.getResult().getRelation_goods_list().size() != 0 && mGoodsInfoDatas.getResult().getRelation_goods_list() != null) {
            for (int i = 0; i < mGoodsInfoDatas.getResult().getRelation_goods_list().size(); i++) {
                View itemView = LayoutInflater.from(this).inflate(R.layout.item_goodsinfo_activity, null);
                ImageView itemImageView = (ImageView) itemView.findViewById(R.id.imageView_goodsInfoActivity_item);
                TextView itemNameTextView = (TextView) itemView.findViewById(R.id.textView_goodsInfoActivity_item_name);
                TextView itemPriceTextView = (TextView) itemView.findViewById(R.id.textView_goodsInfoActivity_item_price);
                Picasso.with(this).load(mGoodsInfoDatas.getResult().getRelation_goods_list().get(i).getGoods_pic()).into(itemImageView);
                itemNameTextView.setText(mGoodsInfoDatas.getResult().getRelation_goods_list().get(i).getGoods_name());
                itemPriceTextView.setText(mGoodsInfoDatas.getResult().getRelation_goods_list().get(i).getGoods_price());
                goodsInfoLinearLayout.addView(itemView);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(GoodsInfoActivity.this, GoodsInfoActivity.class);
                        intent.putExtra("itemUrl", "goodsinfoactivity_item_1");
                        startActivity(intent);
                    }
                });
            }
        }
    }

    //ViewPager下面商品信息的设置
    private void initGoodsInfo() {
        nameTextView.setText(mGoodsInfoDatas.getResult().getGoods_info().getGoods_name());
        costPriceTextView.setText("会员价:￥" + mGoodsInfoDatas.getResult().getGoods_info().getGoods_costprice());
        priceTextView.setText("非会员价:￥" + mGoodsInfoDatas.getResult().getGoods_info().getGoods_price());
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (this.hasMessages(100)) {
                this.removeMessages(100);
            }
            switch (msg.what) {
                case 100:
                    position++;
                    mViewPager.setCurrentItem(position);
                    this.sendEmptyMessageDelayed(100, 3000);
                    break;
                case 200:
                    this.removeMessages(100);
                    break;
                case 300:
                    position = msg.arg1;
                    this.sendEmptyMessageDelayed(100, 3000);
                    break;
            }
        }
    };

    //handler发送数据，实现自动轮播
    private void initHandler() {
        handler.sendEmptyMessageDelayed(100, 3000);
    }

    private List<ImageView> mImageViewList = new ArrayList<>();
    private int lastIndex = 0;
    private int position = Integer.MAX_VALUE / 2;

    //获取数据
    private void initData() {
        //从本地assets中获取json数据
        Intent intent = getIntent();
        String itemUrl = intent.getStringExtra("itemUrl");
        if (itemUrl == null || itemUrl.length() == 0) {
            itemUrl = "match_recyclerview_item_1";
        }
        String jsonData = LoadJson.getJsonData(itemUrl, this);
        Gson gson = new Gson();
        mGoodsInfoDatas = gson.fromJson(jsonData, GoodsInfoDatas.class);
        LogUtils.d("GoodInfoActivity", "--------->:" + jsonData);
        int size = mGoodsInfoDatas.getResult().getGoods_info().getGoods_image_mobile().size();
        lastIndex = Integer.MAX_VALUE / 2 % size;
        for (int i = 0; i < size; i++) {
            //图片
            ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.with(this).load(mGoodsInfoDatas.getResult().getGoods_info().getGoods_image_mobile().get(i)).into(imageView);
            mImageViewList.add(imageView);
            //指示球
            View view = new View(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(10, 10);
            layoutParams.leftMargin = 5;
            layoutParams.rightMargin = 5;
            layoutParams.gravity = Gravity.CENTER;
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(R.mipmap.aliwx_selected);
            indicatorLinearLayout.addView(view);
        }
        indicatorLinearLayout.getChildAt(Integer.MAX_VALUE / 2 % size).setBackgroundResource(R.mipmap.aliwx_topbar_icon_new);

        //设置购物车图标的初始值
        List<Map<String, Object>> mapList = mMySQLiteOpenHelper.selectList("select * from tb_shopping_card", null);
        mNumberIcon.setNum(mapList.size());
    }

    //设置ViewPager
    private void initViewPager() {
        GoodsInfoViewPagerAdapter adapter = new GoodsInfoViewPagerAdapter();
        mViewPager.setAdapter(adapter);
        adapter.setList(mImageViewList);
        mViewPager.setCurrentItem(Integer.MAX_VALUE / 2);
    }

    //监听
    private void initListener() {
        backImageView.setOnClickListener(this);
        favoriteImageView.setOnClickListener(this);
        unFavoriteImageView.setOnClickListener(this);
        shareImageView.setOnClickListener(this);
        vipRelativeLayout.setOnClickListener(this);
        chooseRelativeLayout.setOnClickListener(this);
        //ViewPager监听
        mViewPager.addOnPageChangeListener(this);

        detailLinearLayout.setOnClickListener(this);
        shoppingCardLinearLayout.setOnClickListener(this);
        addShoppingCardTextView.setOnClickListener(this);
        buyTextView.setOnClickListener(this);

    }

    //控件初始化
    private void initView() {
        backImageView = (ImageView) findViewById(R.id.imageView_goodsInfoActivity_back);
        favoriteImageView = (ImageView) findViewById(R.id.imageView_goodsInfoActivity_favorite);
        unFavoriteImageView = (ImageView) findViewById(R.id.imageView_goodsInfoActivity_un_favorite);
        shareImageView = (ImageView) findViewById(R.id.imageView_goodsInfoActivity_share);
        mViewPager = (ViewPager) findViewById(R.id.viewPager_goodsInfoActivity);
        nameTextView = (TextView) findViewById(R.id.textView_goodsInfoActivity_name);
        costPriceTextView = (TextView) findViewById(R.id.textView_goodsInfoActivity_costPrice);
        priceTextView = (TextView) findViewById(R.id.textView_goodsInfoActivity_price);
        vipRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout_goodsInfoActivity_vip);
        chooseRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout_goodsInfoActivity_choose);
        goodsInfoLinearLayout = (LinearLayout) findViewById(R.id.linearLayout_goodsInfoActivity_goodsInfo);
        indicatorLinearLayout = (LinearLayout) findViewById(R.id.linearLayout_goodsInfoActivity_indicator);
        detailLinearLayout = (LinearLayout) findViewById(R.id.linearLayout_goodsInfoActivity_detail);
        shoppingCardLinearLayout = (LinearLayout) findViewById(R.id.linearLayout_goodsInfoActivity_shopping_card);
        mNumberIcon = (NumberIcon) findViewById(R.id.numberIcon_goodsInfoActivity_shoppingCard_icon);
        addShoppingCardTextView = (TextView) findViewById(R.id.textView_goodsInfoActivity_addShoppingCard);
        buyTextView = (TextView) findViewById(R.id.textView_goodsInfoActivity_buy);
        mWebView = (WebView) findViewById(R.id.webView_goodsInfoActivity);
    }

    //点击监听回调
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView_goodsInfoActivity_back:
                this.finish();
                break;
            //取消心愿单
            case R.id.imageView_goodsInfoActivity_favorite:
                unFavoriteImageView.setVisibility(View.VISIBLE);
                favoriteImageView.setVisibility(View.GONE);
                //数据库删除数据
                int delete = mMySQLiteOpenHelper.delete("tb_favorite", "name=?", new String[]{mGoodsInfoDatas.getResult().getGoods_info().getGoods_name()});
                if (delete > 0) {
                    Toast.makeText(this, "取消心愿单成功", Toast.LENGTH_SHORT).show();
                }
                break;
            //加入心愿单
            case R.id.imageView_goodsInfoActivity_un_favorite:
                favoriteImageView.setVisibility(View.VISIBLE);
                unFavoriteImageView.setVisibility(View.GONE);
                //向数据库中插入数据
                ContentValues values = new ContentValues();
                //name varchar,imageUrl varchar,price varchar,url varchar
                Intent intent = getIntent();
                String itemUrl = intent.getStringExtra("itemUrl");
                values.put("name", mGoodsInfoDatas.getResult().getGoods_info().getGoods_name());
                values.put("imageUrl", mGoodsInfoDatas.getResult().getGoods_info().getGoods_image());
                values.put("price", mGoodsInfoDatas.getResult().getGoods_info().getGoods_price());
                values.put("url", itemUrl);
                int insert = mMySQLiteOpenHelper.insert("tb_favorite", null, values);
                if (insert > 0) {
                    Toast.makeText(this, "成功加入心愿单", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.imageView_goodsInfoActivity_share:
                ShareSdk.showShare(this);
                Toast.makeText(this, "分享", Toast.LENGTH_SHORT).show();
                break;
            case R.id.relativeLayout_goodsInfoActivity_vip:
                startActivity(new Intent(this, VipPayActivity.class));
                break;
            case R.id.relativeLayout_goodsInfoActivity_choose:
                View contentView = LayoutInflater.from(this).inflate(R.layout.popup_goods_choose_goodsinfoactivity, null);
                //得到popupWindow中的控件
                LinearLayout linearLayout = (LinearLayout) contentView.findViewById(R.id.linearLayout_goodsInfoActivity_popup);
                TextView addShoppingCardPopup = (TextView) contentView.findViewById(R.id.textView_popupWindow_goodsInfoActivity_addShoppingCard);
                TextView buyPopup = (TextView) contentView.findViewById(R.id.textView_popupWindow_goodsInfoActivity_buy);

                //在LinearLayout中添加商品的相关信息
                initLinearLayout(linearLayout);

                //对popupWin中的“加入购物车”和“立即购买”设置点击监听事件
                addShoppingCardPopup.setOnClickListener(this);
                buyPopup.setOnClickListener(this);
                //参数四：设置popupwindow是否占有焦点
                mPopupWindow = new PopupWindow(contentView, ViewGroup.LayoutParams.MATCH_PARENT, getResources().getDisplayMetrics().heightPixels / 10 * 6, true);

                //设置
                //popupWindow不会占满全屏，点击其他位置，popupWindow
                mPopupWindow.setOutsideTouchable(true);

                //！！！如果想让setOutsideTouchable起作用必须设置setBackgroundDrawable
                //这个属于Android漏洞
                mPopupWindow.setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                //显示
                //参数一：只要是当前Activity下的View控件----->getWindowToken();---->识别是当前的窗体
                //参数三四是偏移量左边负右边是正；上边是负下边是正
                mPopupWindow.showAtLocation(v, Gravity.BOTTOM, 0, 0);

                break;
            //客服（即时通讯）
            case R.id.linearLayout_goodsInfoActivity_detail:
                startActivity(new Intent(GoodsInfoActivity.this, IMActivity.class));
                break;
            //打开购物车
            case R.id.linearLayout_goodsInfoActivity_shopping_card:
                Intent intent1 = new Intent(GoodsInfoActivity.this, MainActivity.class);
                intent1.putExtra("fragmentId", 2);
                startActivity(intent1);
                break;
            //加入购物车
            case R.id.textView_goodsInfoActivity_addShoppingCard:
                Toast.makeText(this, "加入购物车", Toast.LENGTH_SHORT).show();
                break;
            //popup中加入购物车
            case R.id.textView_popupWindow_goodsInfoActivity_addShoppingCard:
                //向数据库中插入数据
                List<Map<String, Object>> mapList = mMySQLiteOpenHelper.selectList("select * from tb_shopping_card", null);
                //判断是否插入数据库，即加入购物车
                boolean isInsert = false;
                for (int i = 0; i < mIsChooseMap.size(); i++) {
                    //如果用户已经选择
                    if (mIsChooseMap.get(i)){
                        GoodsInfoDatas.ResultBean.RelationGoodsListBean bean = mGoodsInfoDatas.getResult().getRelation_goods_list().get(i);
                        boolean isAddShopCard = false;

                        for (int j = 0; j < mapList.size(); j++) {
                            if (bean.getGoods_id().equals(mapList.get(j).get("goods_id"))) {
                                isAddShopCard = true;
                            }
                        }
                        if (!isAddShopCard) {
                            ContentValues values2 = new ContentValues();
                            values2.put("goods_id", bean.getGoods_id());
                            values2.put("goods_name",bean.getGoods_name());
                            values2.put("goods_price",bean.getGoods_price());
                            values2.put("goods_costprice",bean.getGoods_costprice());
                            values2.put("goods_image",bean.getGoods_pic());
                            values2.put("color",colorMap.get(i));
                            values2.put("size",sizeMap.get(i));
                            values2.put("number",numMap.get(i));
                            values2.put("storage",bean.getGoods_storage());
                            values2.put("is_choose",1);
                            int insert2 = mMySQLiteOpenHelper.insert("tb_shopping_card", null, values2);
                            if (insert2 > 0) {
                                isInsert = true;
                            }
                        }
                    }
                }
                if (isInsert) {
                    List<Map<String, Object>> map = mMySQLiteOpenHelper.selectList("select * from tb_shopping_card", null);
                    mNumberIcon.setNum(map.size());
                    Toast.makeText(this, "加入购物车成功", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"购物车中已经存在该商品",Toast.LENGTH_SHORT).show();
                }
                mPopupWindow.dismiss();
                break;
            //立即购买
            case R.id.textView_goodsInfoActivity_buy:
                Toast.makeText(this, "立即购买", Toast.LENGTH_SHORT).show();
                break;
            //popup中立即购买
            case R.id.textView_popupWindow_goodsInfoActivity_buy:
                double allPrice = 0;
                for (int i = 0; i < mIsChooseMap.size(); i++) {
                    GoodsInfoDatas.ResultBean.RelationGoodsListBean bean = mGoodsInfoDatas.getResult().getRelation_goods_list().get(i);
                    if (mIsChooseMap.get(i)){
                        allPrice += Double.parseDouble(bean.getGoods_price())*Integer.parseInt(numMap.get(i));
                    }
                }
                Intent intent2 = new Intent(GoodsInfoActivity.this, PayDemoActivity.class);
                intent2.putExtra("name",mGoodsInfoDatas.getResult().getGoods_info().getGoods_name());
                intent2.putExtra("price",allPrice+"");
                startActivity(intent2);
                break;
        }
    }
    //存放RadioGroup中选中的颜色
    private Map<Integer,String>colorMap = new HashMap<>();
    //存放RadioGroup中选中的尺寸
    private Map<Integer,String>sizeMap = new HashMap<>();
    //保存popupWindows linearLayout中的条目是否选中
    private Map<Integer,Boolean>mIsChooseMap = new HashMap<>();
    //存放商品的数目
    private Map<Integer,String>numMap = new HashMap<>();

    private void initLinearLayout(LinearLayout linearLayout) {
        if (mGoodsInfoDatas.getResult().getRelation_goods_list() != null && mGoodsInfoDatas.getResult().getRelation_goods_list().size() != 0) {
            //保存linearLayout中的条目是否选中
            for (int i = 0; i < mGoodsInfoDatas.getResult().getRelation_goods_list().size(); i++) {
                //是否选中
                final GoodsInfoDatas.ResultBean.RelationGoodsListBean bean = mGoodsInfoDatas.getResult().getRelation_goods_list().get(i);
                //设置初始值
                mIsChooseMap.put(i,true);
                numMap.put(i,"1");
                colorMap.put(i,bean.getSpec_value().get(0).get(0));
                sizeMap.put(i,bean.getSpec_value().get(1).get(0));

                View view = LayoutInflater.from(this).inflate(R.layout.item_popup_goodsinfoactivity, linearLayout, false);

                final ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView_popup_goodsInfo_1);
                final ImageView imageView2 = (ImageView) view.findViewById(R.id.imageView_popup_goodsInfo_2);
                ImageView image = (ImageView) view.findViewById(R.id.imageView_popup_goodsInfo_image);
                TextView popupName = (TextView) view.findViewById(R.id.textView_popup_goodsInfo_name);
                TextView popupPrice = (TextView) view.findViewById(R.id.textView_popup_goodsInfo_price);
                final MyRadioGroup colorLiuShi = (MyRadioGroup) view.findViewById(R.id.liuShiViewGroup_popup_color);
                MyRadioGroup sizeLiuShi = (MyRadioGroup) view.findViewById(R.id.liuShiViewGroup_popup_size);
                ImageView deleteImageView = (ImageView) view.findViewById(R.id.imageView_popup_goodsInfo_delete);
                ImageView addImageView = (ImageView) view.findViewById(R.id.imageView_popup_goodsInfo_add);
                final TextView numberTextView = (TextView) view.findViewById(R.id.textView_popup_goodsInfo_number);
                TextView storageTextView = (TextView) view.findViewById(R.id.textView_popup_goodsInfo_storage);

                //库存数
                final int storage = Integer.parseInt(bean.getGoods_storage());
                storageTextView.setText("库存："+ storage +"件");

                //记录位置
                final int index = i;

                //减少数量的监听
                deleteImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int number = Integer.parseInt(numberTextView.getText().toString());
                        if (number > 1){
                            numberTextView.setText((number-1)+"");
                            numMap.put(index,(number-1)+"");
                        }
                    }
                });
                //增加数量的监听
                addImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int number2 = Integer.parseInt(numberTextView.getText().toString());
                        if (number2 < storage){
                            numberTextView.setText((number2+1)+"");
                            numMap.put(index,(number2+1)+"");
                        }else {
                            Toast.makeText(GoodsInfoActivity.this,"已达到库存上限",Toast.LENGTH_LONG).show();
                        }
                    }
                });

                imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imageView1.setVisibility(View.GONE);
                        imageView2.setVisibility(View.VISIBLE);
                        mIsChooseMap.put(index,true);
                    }
                });

                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imageView2.setVisibility(View.GONE);
                        imageView1.setVisibility(View.VISIBLE);
                        mIsChooseMap.put(index,false);
                    }
                });

                Picasso.with(this).load(bean.getGoods_pic()).into(image);
                popupName.setText(bean.getGoods_name());
                popupPrice.setText("￥"+bean.getGoods_price());

                //颜色的RadioGroup中增加RadioButton
                for (int j = 0; j < bean.getSpec_value().get(0).size(); j++) {
                    RadioButton radioButton = (RadioButton) LayoutInflater.from(this).inflate(R.layout.radio_button, colorLiuShi,false);
                    radioButton.setText(bean.getSpec_value().get(0).get(j));
                    colorLiuShi.addView(radioButton);
                }

                //尺寸的RadioGroup中增加RadioButton
                for (int k = 0; k < bean.getSpec_value().get(1).size(); k++) {
                    RadioButton radioButton = (RadioButton) LayoutInflater.from(this).inflate(R.layout.radio_button, sizeLiuShi,false);
                    radioButton.setText(bean.getSpec_value().get(1).get(k));
                    sizeLiuShi.addView(radioButton);
                }
                colorLiuShi.check(colorLiuShi.getChildAt(0).getId());
                sizeLiuShi.check(sizeLiuShi.getChildAt(0).getId());
                //RadioGroup的点击监听
                colorLiuShi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        for (int j = 0; j < group.getChildCount(); j++) {
                            if (group.getChildAt(j).getId() == checkedId){
                                colorMap.put(index,bean.getSpec_value().get(0).get(j));
                            }
                        }
                    }
                });
                sizeLiuShi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        for (int j = 0; j < group.getChildCount(); j++) {
                            if (group.getChildAt(j).getId() == checkedId){
                                sizeMap.put(index,bean.getSpec_value().get(1).get(j));
                            }
                        }
                    }
                });
                linearLayout.addView(view);
            }
        } else {
            GoodsInfoDatas.ResultBean.GoodsInfoBean infoBean = mGoodsInfoDatas.getResult().getGoods_info();

        }
    }

    //ViewPager监听的回调
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    //ViewPager监听的回调
    @Override
    public void onPageSelected(int position) {
        indicatorLinearLayout.getChildAt(lastIndex).setBackgroundResource(R.mipmap.aliwx_selected);
        indicatorLinearLayout.getChildAt(position % mImageViewList.size()).setBackgroundResource(R.mipmap.aliwx_topbar_icon_new);
        lastIndex = position % mImageViewList.size();
        handler.sendMessage(handler.obtainMessage(300, position, 0));
    }

    //ViewPager监听的回调
    @Override
    public void onPageScrollStateChanged(int state) {
        switch (state) {
            case ViewPager.SCROLL_STATE_DRAGGING:
                handler.sendEmptyMessage(200);
                break;
            case ViewPager.SCROLL_STATE_IDLE:

                break;
            case ViewPager.SCROLL_STATE_SETTLING:

                break;
        }
    }

    //设置webView
    @SuppressLint("JavascriptInterface")
    private void initWebView() {
        //设置WebView中的值
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.loadUrl("file:///android_asset/webview/goods_info_activity_html.html");
    }

}
