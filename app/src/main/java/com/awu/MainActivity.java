package com.awu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import adapters.MyLvAdapter;
import cn.jpush.android.api.JPushInterface;
import config.UrlConfig;
import fragments.DrawerFragment;
import fragments.HomePageFragment;
import fragments.MatchFragment;
import fragments.MineFragment;
import fragments.ShopCartFragment;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements
        RadioGroup.OnCheckedChangeListener,
        AdapterView.OnItemClickListener {

    @ViewInject(R.id.radioGroup_main)
    private RadioGroup mRadioGroup;
    //定义需要显示的4个Fragment
    private HomePageFragment mHomePageFragment;
    private MatchFragment mMatchFragment;
    private ShopCartFragment mShopCartFragment;
    private MineFragment mMineFragment;
    //用于标记当前页面显示的Fragment
    private Fragment mCurrentFragment;
    //定义一个fragment管理者
    private FragmentManager mFragmentManager;
    //存放四个Fragment的容器的id
    private int mContainerId;
    //抽屉布局的视图
    private DrawerLayout mDrawerLayout;
    //要打开的抽屉
    private LinearLayout mLinearContent;
    //左边的标题栏的展示
    private ListView mListView;
    //定义一个抽屉中右边需要动态改变的Fragment
    private DrawerFragment mDrawerFragment;
    private MyLvAdapter mLvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //注入View
        x.view().inject(this);

        //找到存放Fragment的id
        mContainerId = R.id.linearLayout_main_container;

        //初始化第一个Fragment---默认显示第一个并设置RadioGroup的监听
        initHomeAndListener();

        //显示购物车的Fragment
        Intent intent = getIntent();
        if (intent.getIntExtra("fragmentId", -1) == 2) {
            showShopCardFragment();
            mRadioGroup.check(R.id.button3);
        }

        //抽屉里视图的初始化
        initDrawerLayoutView();

        //确定下抽屉的宽
        initDrawerLayout();

        //监听抽屉中listView和gridView的点击
        initListener();

        //初始化抽屉中的ListView
        initListView();

        //初始化抽屉中的Container,默认显示第一个Fragment
        initContainer();


    }



    //默认显示第一个Fragment----即：首页视图
    private void initHomeAndListener() {
        mFragmentManager = this.getSupportFragmentManager();
        mHomePageFragment = new HomePageFragment();
        mFragmentManager.beginTransaction()
                .add(mContainerId, mHomePageFragment, "one")
                .commit();
        mCurrentFragment = mHomePageFragment;
        //为RadioGroup设置选择监听
        mRadioGroup.setOnCheckedChangeListener(this);
    }

    //抽屉右边Fragment的添加
    private void initContainer() {
        mDrawerFragment = new DrawerFragment();
        mFragmentManager.beginTransaction()
                .add(R.id.linear_drawer_containFragment, mDrawerFragment)
                .commit();
    }

    private void initListener() {
        mListView.setOnItemClickListener(this);
    }

    private void initListView() {
        String[] titles = getResources().getStringArray(R.array.titles);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            list.add(titles[i]);
        }
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
//                android.R.id.text1,list);
        mLvAdapter = new MyLvAdapter(this, list);
        mListView.setAdapter(mLvAdapter);
    }

    private void initDrawerLayout() {
        ViewGroup.LayoutParams params = mLinearContent.getLayoutParams();
        params.width = getResources().getDisplayMetrics().widthPixels;
        mLinearContent.setLayoutParams(params);
        //可以使屏幕一直高亮状态---设置玻璃颜色
        mDrawerLayout.setScrimColor(0x00fffffff);
    }

    private void initDrawerLayoutView() {
        mDrawerLayout = (DrawerLayout) this.findViewById(R.id.drawer_main);
        mLinearContent = (LinearLayout) this.findViewById(R.id.linear_drawer);
        mListView = (ListView) this.findViewById(R.id.listView_drawer);
    }

    //下方四个按钮的点击，切换不同的Fragment的切换
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.button1:
                if (mHomePageFragment != null) {
                    mFragmentManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .show(mHomePageFragment)
                            .commit();
                } else {
                    mHomePageFragment = new HomePageFragment();
                    mFragmentManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .add(mContainerId, mHomePageFragment, "one")
                            .commit();
                }
                mCurrentFragment = mHomePageFragment;
                break;
            case R.id.button2:
                if (mMatchFragment != null) {
                    mFragmentManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .show(mMatchFragment)
                            .commit();
                } else {
                    mMatchFragment = new MatchFragment();
                    mFragmentManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .add(mContainerId, mMatchFragment, "two")
                            .commit();
                }
                mCurrentFragment = mMatchFragment;
                break;
            case R.id.button3:
                if (mShopCartFragment != null) {
                    mFragmentManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .show(mShopCartFragment)
                            .commit();
                } else {
                    mShopCartFragment = new ShopCartFragment();
                    mFragmentManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .add(mContainerId, mShopCartFragment, "three")
                            .commit();
                }
                mCurrentFragment = mShopCartFragment;
                break;
            case R.id.button4:
                if (mMineFragment != null) {
                    mFragmentManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .show(mMineFragment)
                            .commit();
                } else {
                    mMineFragment = new MineFragment();
                    mFragmentManager.beginTransaction()
                            .hide(mCurrentFragment)
                            .add(mContainerId, mMineFragment, "four")
                            .commit();
                }
                mCurrentFragment = mMineFragment;
                break;
        }
    }


    //定义一个抽屉是否打开的标志位
    private boolean isOpen = false;

    //打开或者关闭抽屉
    private void openOrCloseDrawer() {
        if (!isOpen) {
            mDrawerLayout.openDrawer(mLinearContent);
            mListView.setSelection(lastIndex);
        } else {
            mDrawerLayout.closeDrawer(mLinearContent);
        }
        isOpen = !isOpen;
    }

    //跳转到可以加载html界面的activity中
    //向传入的intent中传入数据---title 和 url
    private void putExtra(Intent intent, String title, String url) {
        intent.putExtra("title", title);
        intent.putExtra("url", url);
    }

    //记录ListView的点击条目
    private int lastIndex = 0;

    //抽屉的ListView的点击事件
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //颜色的变化
        mLvAdapter.setIndex(position);

        //Fragment的动态改变--点击除了第二个和最后一个
        if (position != 1 && position != 10) {
            mDrawerFragment.setIndex(position);
        } else if (position == 1) {//点击了亲子装，进行跳转
            Snackbar.make(view, "1111", Snackbar.LENGTH_SHORT).show();
            Intent intent = new Intent(this, DisplayActivity.class);
            // intent.putExtra("title", "亲子装");
            //  intent.putExtra("url", "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
            putExtra(intent,
                    "亲子装",
                    "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
            this.startActivity(intent);
        } else {//点击了搭配，进行跳转
            Intent intent = new Intent(this, DisplayActivity.class);
            putExtra(intent,
                    "搭配",
                    "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
            this.startActivity(intent);
        }
        //最后一次点击的位置更新
        lastIndex = position;
    }

    //首页Fragment中的各种点击事件
    public void oneOfImageClick(View view) {
        Intent intent = null;
        String title = null;
        switch (view.getId()) {
            case R.id.imageView_homeFragment_menu:
                //Snackbar.make(view, "开启菜单按钮的抽屉", Snackbar.LENGTH_SHORT).show();
                openOrCloseDrawer();
                break;
//            case R.id.imageView_homeFragment_search:
//                Snackbar.make(view, "开启搜索的事件1111", Snackbar.LENGTH_SHORT).show();
//                break;
            //-------------------------
            case R.id.image1_head_home:
                // Snackbar.make(view, "开启今日上新的事件", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                title = "今日上新";
                String url_new = (String) view.getTag();
                putExtra(intent, title, url_new);
                break;
            case R.id.image2_head_home:
//                Snackbar.make(view, "开启韩国版的事件", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                title = "韩国版";
                String url_han = (String) view.getTag();
                putExtra(intent, title, url_han);
                break;
            case R.id.image3_head_home:
//                Snackbar.make(view, "开启top的事件", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                title = "top榜单";
                String url_top = (String) view.getTag();
                putExtra(intent, title, url_top);
                break;
            case R.id.image4_head_home:
                //Snackbar.make(view, "开启全部分类的抽屉", Snackbar.LENGTH_SHORT).show();
                openOrCloseDrawer();
                break;

            //新人专享事件在viewholder1中进行监听----如果进行复用尽量别用findViewById进行监听

            //-------------------------
            case R.id.image1_item2:
//                Snackbar.make(view, "开启会员制的抽屉", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, HomeMemberActivity.class);
                break;
            case R.id.image2_item2:///和viewPager中的一张图片一样
//                Snackbar.make(view, "开启非常大牌的抽屉", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "非常打牌--图片",
                        UrlConfig.FEICHANGDAPAI_URL);
                break;
            case R.id.image3_item2:
//                Snackbar.make(view, "开启巨便宜的事件", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "巨便宜",
                        UrlConfig.JUPIANYI_URL);

                break;
            case R.id.image4_item2:
//                Snackbar.make(view, "开启特价清仓的抽屉", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "特价清仓",
                        UrlConfig.TEJIAQINGCANG_URL);
                break;

            //---------------
            case R.id.linear_item3_enter:
            case R.id.text_item3_enter:
            case R.id.image_item3:
                // Snackbar.make(view, "进入品牌馆", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, BrandsActivity.class);
                break;
            case R.id.image1_item3:
//                Snackbar.make(view, "进入品牌1", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, DisplayActivity.class);
                putExtra(intent,
                        "Bayabaya",
                        "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                break;
            case R.id.image2_item3:
                //  Snackbar.make(view, "进入品牌2", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, DisplayActivity.class);
                putExtra(intent,
                        "Balabala",
                        "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                break;
            case R.id.image3_item3:
                //  Snackbar.make(view, "进入品牌3", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, DisplayActivity.class);
                putExtra(intent,
                        "adidas",
                        "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                break;
            case R.id.image4_item3:
//                Snackbar.make(view, "进入品牌4", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, DisplayActivity.class);
                putExtra(intent,
                        "耐克",
                        "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                break;
            case R.id.image5_item3:
//                Snackbar.make(view, "进入品牌5", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, DisplayActivity.class);
                putExtra(intent,
                        "南极人",
                        "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                break;
            case R.id.image6_item3:
//                Snackbar.make(view, "进入品牌6", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, DisplayActivity.class);
                putExtra(intent,
                        "米妮-哈鲁",
                        "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                break;
            case R.id.image7_item3:
//                Snackbar.make(view, "进入品牌7", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, DisplayActivity.class);
                putExtra(intent,
                        "马克珍妮",
                        "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                break;
            case R.id.image8_item3:
                //Snackbar.make(view, "进入品牌8", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, DisplayActivity.class);
                putExtra(intent,
                        "361度",
                        "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                break;
            case R.id.image9_item3:
                // Snackbar.make(view, "进入棉鞋h5", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "棉鞋",
                        "http://console.awu.cn/shop/index.php?act=zts&zt_id=176&memberstate=1");
                break;
            case R.id.image10_item3:
                // Snackbar.make(view, "进入毛衣h5", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "毛衣",
                        "http://console.awu.cn/shop/index.php?act=zts&zt_id=177&memberstate=1");
                break;
            case R.id.image11_item3:
                // Snackbar.make(view, "进入婴幼h5", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "婴儿套装",
                        "http://console.awu.cn/shop/index.php?act=zts&zt_id=174&memberstate=1");
                break;
            case R.id.image12_item3:
                // Snackbar.make(view, "进入羽绒服h5", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "羽绒服棉服",
                        "http://console.awu.cn/shop/index.php?act=zts&zt_id=175&memberstate=1");
                break;
            case R.id.image13_item3:
                // Snackbar.make(view, "进入居家内衣H513", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "家居内衣",
                        "http://console.awu.cn/shop/index.php?act=zts&zt_id=178&memberstate=1");
                break;
            case R.id.image14_item3:
                //Snackbar.make(view, "进入玩具H514", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "教辅玩具",
                        "http://console.awu.cn/shop/index.php?act=zts&zt_id=179&memberstate=1");
                break;

            //--------------------
            case R.id.linear_item4_moreMatcher:
//                Snackbar.make(view, "进入更多搭配界面", Snackbar.LENGTH_SHORT).show();
                mRadioGroup.check(R.id.button2);
                break;
            case R.id.image1_item4:
                //Snackbar.make(view, "打开出国游h5", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "出国游",
                        "http://console.awu.cn/data/upload/special/1475222594/parent_child.html");
                break;
            case R.id.image2_item4:
                // Snackbar.make(view, "打开古镇游h5", Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, MatchHtmlActivity.class);
                putExtra(intent,
                        "古镇游",
                        "http://console.awu.cn/data/upload/special/1474626296/pattern.html");
                break;

            //---------------------
            case R.id.image0_item5:
                title = (String) view.getTag();
                intent = new Intent(this, DisplayActivity.class);
                switch (title) {
                    case "81":
                        putExtra(intent,
                                "梦多多",
                                "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                        intent.putExtra("headUrl", "http://image.awu.cn/data/upload/shop/editor/web-127.jpg?994");
                        break;

                    case "23":
                        putExtra(intent,
                                "南极人",
                                "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                        intent.putExtra("headUrl", "http://image.awu.cn/data/upload/shop/editor/web-128.jpg?265");
                        break;
                    case "98":
                        putExtra(intent,
                                "贝贝帕克",
                                "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                        intent.putExtra("headUrl", "http://image.awu.cn/data/upload/shop/editor/web-129.jpg?475");
                        break;
                    case "82":
                        putExtra(intent,
                                "迷你巴拉巴拉",
                                "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
                        intent.putExtra("headUrl", "http://image.awu.cn/data/upload/shop/editor/web-130.jpg?612");
                        break;
                    default:
                        intent = null;
                        Snackbar.make(view, "进入对应的品牌详情" + title, Snackbar.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image1_item5:
                //Snackbar.make(view, "进入对应的商品1商品详情页面" + view.getTag(), Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, GoodsInfoActivity.class);
                break;
            case R.id.image2_item5:
               // Snackbar.make(view, "进入对应的商品2商品详情页面" + view.getTag(), Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, GoodsInfoActivity.class);
                break;
            case R.id.image3_item5:
                //Snackbar.make(view, "进入对应的商品3商品详情页面" + view.getTag(), Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, GoodsInfoActivity.class);
                break;
            case R.id.image4_item5:
                Snackbar.make(view, "进入对应的商品4商品详情页面" + view.getTag(), Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.image5_item5:
                //Snackbar.make(view, "进入对应的商品5商品详情页面" + view.getTag(), Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, GoodsInfoActivity.class);
                break;
            case R.id.image6_item5:
                //Snackbar.make(view, "进入对应的商品6商品详情页面" + view.getTag(), Snackbar.LENGTH_SHORT).show();
                intent = new Intent(this, GoodsInfoActivity.class);
                break;
        }
        if (intent != null) {
            this.startActivity(intent);
        }
    }

    //展示购物车的fragment
    public void showShopCardFragment() {
        if (mShopCartFragment != null) {
            mFragmentManager.beginTransaction()
                    .hide(mCurrentFragment)
                    .show(mShopCartFragment)
                    .commit();
        } else {
            mShopCartFragment = new ShopCartFragment();
            mFragmentManager.beginTransaction()
                    .hide(mCurrentFragment)
                    .add(mContainerId, mShopCartFragment, "three")
                    .commit();
        }
        mCurrentFragment = mShopCartFragment;
    }

    @Override
    protected void onResume() {
        super.onResume();
        JPushInterface.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        JPushInterface.onPause(this);
    }
}
