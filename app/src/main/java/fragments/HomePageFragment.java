package fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.awu.R;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import adapters.MyRvAdapter;
import beans.Item0_home;
import beans.Item1_home;
import beans.Item2_home;
import beans.Item3_home;
import beans.Item4_home;
import beans.Item5_home;
import beans.Item6_home;
import myviews.MyLiuShiViewGroup;
import utils.LoadJson;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends Fragment implements
        SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {

    private View mInflate;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private MyRvAdapter mRvAdapter;
    private LinearLayout mLinearEmpty;
    private ImageView searchImage;
    private LayoutInflater mLayoutInflater;
    //抽屉
    private SlidingMenu mSlidingMenu;
    //取消，把抽屉放回去
    private TextView cancel;

    public HomePageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mLayoutInflater = inflater;
        mInflate = inflater.inflate(R.layout.fragment_home_page, container, false);
        mLinearEmpty = (LinearLayout) mInflate.findViewById(R.id.linearLayout_home_empty);

        initWidget();

        initSlidingMenu();

        initSwipeRefreshLayout();

        initRecyclerView();

        initHandler();
        //initData();
        //-----抽屉的打开和关闭监听
        searchImage.setOnClickListener(this);

        return mInflate;
    }

    //初始化SlidingMenu
    private void initSlidingMenu() {
        mSlidingMenu = new SlidingMenu(this.getContext());
        mSlidingMenu.setMode(SlidingMenu.RIGHT);
        View view = mLayoutInflater.inflate(R.layout.search_slide, mSlidingMenu, false);
        cancel = (TextView) view.findViewById(R.id.textView_slide_cancel);
        //设置流式布局的行间距和列间距
        MyLiuShiViewGroup viewGroup = (MyLiuShiViewGroup) view.findViewById(R.id.myLiuShiViewGroup_slide);
        viewGroup.setHorizontalSpacing(24);
        viewGroup.setVerticalSpacing(20);
        cancel.setOnClickListener(this);
        mSlidingMenu.setMenu(view);
        mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
        mSlidingMenu.setBehindWidth(getResources().getDisplayMetrics().widthPixels);
        mSlidingMenu.attachToActivity(this.getActivity(), SlidingMenu.SLIDING_CONTENT);
    }

    //模拟下载时间----开始加载动画
    private void initHandler() {
        mHandler.sendEmptyMessageDelayed(100, 4000);
        mLinearEmpty.setVisibility(View.VISIBLE);
                //加载动画展示
        ImageView image = (ImageView) mLinearEmpty.getChildAt(0);
        if (mRvAdapter.getTotalSize() == 0) {
            RotateAnimation animation = new RotateAnimation
                    (-90f, 270f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setDuration(2000);
            animation.setInterpolator(new AccelerateDecelerateInterpolator());
            animation.setRepeatMode(Animation.RESTART);
            image.startAnimation(animation);
            animation.setRepeatCount(2);//设置重复次数
           // animation.setFillAfter(true);//动画执行完后是否停留在执行完的状态
          //  animation.setStartOffset(0);//执行前的等待时间
        }
    }

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //当加载动画完成的时候
            initData();
        }
    };

    private void initData() {
        //加载动画消失
        mLinearEmpty.setVisibility(View.GONE);
        //清空一下数据
        mRvAdapter.clear();


//         先添加头布局viewPager
        Item6_home item6Home = new Item6_home();
        Map<String, String> map = new HashMap<>();
        map.put("http://image.awu.cn/data/upload/shop/editor/20161102-09585519.jpg",
                "http://console.awu.cn/shop/index.php?act=zts&zt_id=180");
        map.put("http://image.awu.cn/data/upload/shop/editor/20161031-18080234.jpg",
                "http://console.awu.cn/data/upload/special/1477651196/warmyellowcoat.html");
        map.put("http://image.awu.cn/data/upload/shop/editor/20161101-09162431.jpg", "" +
                "http://console.awu.cn/shop/index.php?act=zts&zt_id=173");
        map.put("http://image.awu.cn/data/upload/shop/editor/20161024-10433262.jpg",
                "http://console.awu.cn/data/upload/special/1477048282/wheredadgo.html");
        map.put("http://image.awu.cn/data/upload/shop/editor/20161028-09493580.jpg",
                "http://console.awu.cn/shop/index.php?act=zts&zt_id=172");
        item6Home.setMap(map);
        mRvAdapter.addItem(item6Home, 0);

        String jsonData = LoadJson.getJsonData("home_head_2.txt", this.getContext());
        try {
            JSONObject jsonOb = new JSONObject(jsonData);
            JSONObject resuJson = jsonOb.optJSONObject("result");
            JSONArray jsonArray = resuJson.optJSONArray("moduleList");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject bannerListJson = jsonArray.optJSONObject(i);
                JSONArray bannerArray = bannerListJson.optJSONArray("bannerList");
                Item0_home item0Home = new Item0_home();
                for (int j = 0; j < bannerArray.length(); j++) {
                    JSONObject banner = bannerArray.optJSONObject(j);
                    switch (j) {
                        case 0:
                            item0Home.setImageUrl1(banner.optString("banner_img"));
                            item0Home.setTo1(banner.optString("banner_url"));
                            break;
                        case 1:
                            item0Home.setImageUrl2(banner.optString("banner_img"));
                            item0Home.setTo2(banner.optString("banner_url"));
                            break;
                        case 2:
                            item0Home.setImageurl3(banner.optString("banner_img"));
                            item0Home.setTo3(banner.optString("banner_url"));
                            break;
                        case 3:
                            item0Home.setImageUrl4(banner.optString("banner_img"));
//                            item0Home.setTo4(banner.optString("banner_url"));
                            break;
                    }
                }
//            1---------4个图片的更新
                mRvAdapter.addItem(item0Home, 1);
            }

//            2-----------新人专享的刷新
            Item1_home item1Home = new Item1_home();
            item1Home.setImageUrl("http://console.awu.cn/api/templates/default/newuser.jpg");
            item1Home.setId(1);
            mRvAdapter.addItem(item1Home, 2);


//            3------------四张图片的添加刷新--会员制的刷新
            jsonData = LoadJson.getJsonData("home_head_4.txt", this.getContext());
            JSONObject jsonO = new JSONObject(jsonData);
            JSONObject resuJso = jsonO.optJSONObject("result");
            JSONArray jsonArra = resuJso.optJSONArray("moduleList");
            for (int i = 0; i < jsonArra.length(); i++) {
                JSONObject bannerListJson = jsonArra.optJSONObject(i);
                JSONArray banerArray = bannerListJson.optJSONArray("bannerList");
                // Item0_home item0Home = new Item0_home();
                Item2_home item2Home = new Item2_home();
                for (int j = 0; j < banerArray.length(); j++) {
                    JSONObject banner = banerArray.optJSONObject(j);
                    switch (j) {
                        case 0:
                            item2Home.setImageUrl1(banner.optString("banner_img"));
                            item2Home.setTo1(banner.optString("banner_url"));
                            break;
                        case 1:
                            item2Home.setImageUrl2(banner.optString("banner_img"));
                            item2Home.setTo1(banner.optString("banner_url"));
                            break;
                        case 2:
                            item2Home.setImageurl3(banner.optString("banner_img"));
                            item2Home.setTo1(banner.optString("banner_url"));
                            break;
                        case 3:
                            item2Home.setImageUrl4(banner.optString("banner_img"));
                            item2Home.setTo1(banner.optString("banner_url"));
                            break;
                    }
                }
                mRvAdapter.addItem(item2Home, 3);
            }

//          4----进入品牌馆的刷新
            jsonData = LoadJson.getJsonData("home_recommend.txt", this.getContext());
            JSONObject json = new JSONObject(jsonData);
            JSONObject resuJs = json.optJSONObject("result");
            JSONArray jsonArr = resuJs.optJSONArray("moduleList");
            for (int i = 0; i < jsonArr.length(); i++) {
                JSONObject bannerListJson = jsonArr.optJSONObject(i);
                JSONArray banerArray = bannerListJson.optJSONArray("bannerList");
                Item3_home item3Home = new Item3_home();
                List<String> list = new ArrayList<>();
                List<String> headImageList = new ArrayList<>();
                for (int j = 0; j < banerArray.length(); j++) {
                    JSONObject banner = banerArray.optJSONObject(j);
                    String url = banner.optString("banner_img");
                    String toHeaderImageUrl = banner.optString("banner_pic");
                    list.add(url);
                    headImageList.add(toHeaderImageUrl);
                }
                item3Home.setList(list);
                item3Home.setToList(headImageList);
                mRvAdapter.addItem(item3Home, 4);
            }
//          5----潮流搭配的刷新
            jsonData = LoadJson.getJsonData("home_fashion.txt", this.getContext());
            JSONObject jsonOb_5 = new JSONObject(jsonData);
            JSONObject resuJson_5 = jsonOb_5.optJSONObject("result");
            JSONArray jsonArray_5 = resuJson_5.optJSONArray("moduleList");
            for (int i = 0; i < jsonArray_5.length(); i++) {
                JSONObject bannerListJson = jsonArray_5.optJSONObject(i);
                JSONArray bannerArray = bannerListJson.optJSONArray("bannerList");
                // Item0_home item0Home = new Item0_home();
                Item4_home item4Home = new Item4_home();
                for (int j = 0; j < bannerArray.length(); j++) {
                    JSONObject banner = bannerArray.optJSONObject(j);
                    switch (j) {
                        case 0:
                            item4Home.setImageUrl1(banner.optString("banner_img"));
                            item4Home.setToUrl1(banner.optString("banner_url"));
                            break;
                        case 1:
                            item4Home.setImageUrl2(banner.optString("banner_img"));
                            item4Home.setToUrl2(banner.optString("banner_url"));
                            break;

                    }
                }
                mRvAdapter.addItem(item4Home, 5);
            }
//         6 ：梦多多的刷新
            jsonData = LoadJson.getJsonData("home_mengdd.txt", this.getContext());
            JSONObject json_6 = new JSONObject(jsonData);
            JSONObject resuJs_6 = json_6.optJSONObject("result");
            JSONArray jsonArr_6 = resuJs_6.optJSONArray("moduleList");
            for (int i = 0; i < jsonArr_6.length(); i++) {
                JSONObject bannerListJson = jsonArr_6.optJSONObject(i);
                Item5_home item5Home = new Item5_home();
                List<String> imUrls = new ArrayList<>();
                List<String> tabs = new ArrayList<>();

                //赋值
                item5Home.setTitle(bannerListJson.optString("web_name"));
                imUrls.add(bannerListJson.optString("web_pic"));
                tabs.add(bannerListJson.optString("web_url"));
                JSONArray bannerArray = bannerListJson.optJSONArray("bannerList");
                for (int j = 0; j < bannerArray.length(); j++) {
                    JSONObject banner = bannerArray.optJSONObject(j);
                    String url = banner.optString("banner_img");
                    String tag = banner.optString("banner_url");
                    imUrls.add(url);
                    tabs.add(tag);
                }
                item5Home.setImageUrls(imUrls);
                item5Home.setTabs(tabs);
                mRvAdapter.addItem(item5Home, 6);
            }

//         7:南极人的刷新
            jsonData = LoadJson.getJsonData("home_nanjiren.txt", this.getContext());
            JSONObject json_7 = new JSONObject(jsonData);
            JSONObject resuJs_7 = json_7.optJSONObject("result");
            JSONArray jsonArr_7 = resuJs_7.optJSONArray("moduleList");
            for (int i = 0; i < jsonArr_7.length(); i++) {
                JSONObject bannerListJson = jsonArr_7.optJSONObject(i);
                Item5_home item5Home = new Item5_home();
                List<String> imUrls = new ArrayList<>();
                List<String> tabs = new ArrayList<>();

                //赋值
                item5Home.setTitle(bannerListJson.optString("web_name"));
                imUrls.add(bannerListJson.optString("web_pic"));
                tabs.add(bannerListJson.optString("web_url"));
                JSONArray bannerArray = bannerListJson.optJSONArray("bannerList");
                for (int j = 0; j < bannerArray.length(); j++) {
                    JSONObject banner = bannerArray.optJSONObject(j);
                    String url = banner.optString("banner_img");
                    String tag = banner.optString("banner_url");
                    imUrls.add(url);
                    tabs.add(tag);
                }
                item5Home.setImageUrls(imUrls);
                item5Home.setTabs(tabs);
                mRvAdapter.addItem(item5Home, 7);
            }

//         8:贝克帕克的刷新
            jsonData = LoadJson.getJsonData("home_bbpark.txt", this.getContext());
            JSONObject json_8 = new JSONObject(jsonData);
            JSONObject resuJs_8 = json_8.optJSONObject("result");
            JSONArray jsonArr_8 = resuJs_8.optJSONArray("moduleList");
            for (int i = 0; i < jsonArr_8.length(); i++) {
                JSONObject bannerListJson = jsonArr_8.optJSONObject(i);
                Item5_home item5Home = new Item5_home();
                List<String> imUrls = new ArrayList<>();
                List<String> tabs = new ArrayList<>();

                //赋值
                item5Home.setTitle(bannerListJson.optString("web_name"));
                imUrls.add(bannerListJson.optString("web_pic"));
                tabs.add(bannerListJson.optString("web_url"));
                JSONArray bannerArray = bannerListJson.optJSONArray("bannerList");
                for (int j = 0; j < bannerArray.length(); j++) {
                    JSONObject banner = bannerArray.optJSONObject(j);
                    String url = banner.optString("banner_img");
                    String tag = banner.optString("banner_url");
                    imUrls.add(url);
                    tabs.add(tag);
                }
                item5Home.setImageUrls(imUrls);
                item5Home.setTabs(tabs);
                mRvAdapter.addItem(item5Home, 8);
            }
//         9:迷你巴拉巴拉的刷新
            jsonData = LoadJson.getJsonData("home_minibala.txt", this.getContext());
            JSONObject json_9 = new JSONObject(jsonData);
            JSONObject resuJs_9 = json_9.optJSONObject("result");
            JSONArray jsonArr_9 = resuJs_9.optJSONArray("moduleList");
            for (int i = 0; i < jsonArr_9.length(); i++) {
                JSONObject bannerListJson = jsonArr_9.optJSONObject(i);
                Item5_home item5Home = new Item5_home();
                List<String> imUrls = new ArrayList<>();
                List<String> tabs = new ArrayList<>();

                //赋值
                item5Home.setTitle(bannerListJson.optString("web_name"));
                imUrls.add(bannerListJson.optString("web_pic"));
                tabs.add(bannerListJson.optString("web_url"));
                JSONArray bannerArray = bannerListJson.optJSONArray("bannerList");
                for (int j = 0; j < bannerArray.length(); j++) {
                    JSONObject banner = bannerArray.optJSONObject(j);
                    String url = banner.optString("banner_img");
                    String tag = banner.optString("banner_url");
                    imUrls.add(url);
                    tabs.add(tag);
                }
                item5Home.setImageUrls(imUrls);
                item5Home.setTabs(tabs);
                mRvAdapter.addItem(item5Home, 9);
            }
//         10：尾部局照片的添加
            Item1_home item1Home_foot = new Item1_home();
            item1Home_foot.setType(6);
            mRvAdapter.addItem(item1Home_foot, 10);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        //模拟网络请求
        sleep();
    }

    private void sleep() {
        //模拟刷新的时间
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                mSwipeRefreshLayout.post(new Runnable() {
                    @Override
                    public void run() {
                        if (mSwipeRefreshLayout.isRefreshing()) {
                            mSwipeRefreshLayout.setRefreshing(false);
                        }
                    }
                });
            }
        }).start();
    }

    private void initSwipeRefreshLayout() {
        // mSwipeRefreshLayout.setProgressViewOffset(true, 0, 100);
        mSwipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.RED, Color.GREEN, Color.GRAY);
        mSwipeRefreshLayout.setOnRefreshListener(this);
    }

    private void initRecyclerView() {
        mLinearLayoutManager = new LinearLayoutManager(this.getContext());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRvAdapter = new MyRvAdapter(this.getContext());
        mRecyclerView.setAdapter(mRvAdapter);
    }

    private void initWidget() {
        searchImage = (ImageView) mInflate.findViewById(R.id.imageView_homeFragment_search);
        mSwipeRefreshLayout = (SwipeRefreshLayout) mInflate.findViewById(R.id.swipeRefreshLayout_home);
        mRecyclerView = (RecyclerView) mInflate.findViewById(R.id.recyclerView);
    }

    @Override
    public void onRefresh() {
        initData();
    }

    //点击了搜索按钮---打开
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //打开抽屉
            case R.id.imageView_homeFragment_search:
                mSlidingMenu.toggle();
                break;
            //关闭抽屉
            case R.id.textView_slide_cancel:
                mSlidingMenu.toggle();
                break;
        }
    }
}
