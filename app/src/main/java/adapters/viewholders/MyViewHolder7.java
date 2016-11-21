package adapters.viewholders;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.awu.MatchHtmlActivity;
import com.awu.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import adapters.MyVpAdapter;
import beans.Item6_home;
import config.UrlConfig;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class MyViewHolder7 extends AbstractViewHolder implements ViewPager.OnPageChangeListener, View.OnClickListener {
    private Context mContext;
    private List<ImageView> mImageViews;
    private ViewPager mViewPager;
    private MyVpAdapter mMyVpAdapter;
    private LinearLayout mLinearIndicators;
    //记录ViewPager中的ImageView的个数
    private int totalSize;
    //保存每张图片的url--h5页面进行跳转
    private List<String> mUrls;
//    private ImageView circleBall;

    public MyViewHolder7(Context context, View itemView) {
        super(itemView);
        mImageViews = new ArrayList<>();
        this.mContext = context;
        this.mViewPager = (ViewPager) itemView.findViewById(R.id.viewPager_item7);
        mMyVpAdapter = new MyVpAdapter();
        mLinearIndicators = (LinearLayout) itemView.findViewById(R.id.linear_item7_indicator);
        mUrls = new ArrayList<>();
        initIndicators(5);
    }

    @Override
    public void bind(IItem iItem) {
        Item6_home item = (Item6_home) iItem;
        Map<String, String> map = item.getMap();
        Set<String> urls = map.keySet();
        Iterator<String> iterator = urls.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String url = iterator.next();
            mUrls.add(map.get(url));
            ImageView imageView = new ImageView(mContext);
            //把要跳转的url网址设置给ImageView
            imageView.setTag(i++);
            imageView.setOnClickListener(this);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.with(mContext)
                    .load(url)
                    .placeholder(R.drawable.iv_details_loading)
                    .error(R.drawable.iv_details_loading)
                    .into(imageView);
            mImageViews.add(imageView);
        }
        mViewPager.setAdapter(mMyVpAdapter);
        //通知adapter进行更新
        mMyVpAdapter.setImageViews(mImageViews);
        mViewPager.setCurrentItem(mSelectedIndex);

        totalSize = urls.size();
        //防止下拉时数据选择的点重新回到第一个！！！！！！！！！！
        //viewPager初始化完毕，初始化下面的指示器
        // initIndicators(totalSize);
        //创建viewPager的监听事件
        initListener();

        //带动滑动起来
        initHandler();
    }

    private void initListener() {
        mViewPager.addOnPageChangeListener(this);
    }

    private int mSelectedIndex = Integer.MAX_VALUE / 2 + 2;
    private int mLastIndex = 0;

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (this.hasMessages(100)) {
                this.removeMessages(100);
            }
            switch (msg.what) {
                case 100:
                    mSelectedIndex++;
                    mViewPager.setCurrentItem(mSelectedIndex, true);
                    this.sendEmptyMessageDelayed(100, 3000);
                    break;
                case 200:
                    if (this.hasMessages(100)) {
                        this.removeMessages(100);
                    }
                    break;
                case 300:
                    mSelectedIndex = msg.arg1;
                    this.sendEmptyMessageDelayed(100, 3000);
                    break;
            }
        }
    };

    private void initHandler() {
        mHandler.sendEmptyMessageDelayed(100, 5000);
    }

    private void initIndicators(int size) {
        //每次刷新删除以前的
        mLinearIndicators.removeAllViews();
        //ViewPager有多个ImageView,就动态添加几个小点指示器
        for (int i = 0; i < size; i++) {
            ImageView image = new ImageView(mContext);
            image.setBackgroundResource(R.drawable.aliwx_unselected);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(13, 13);
            params.rightMargin = 20;
            image.setLayoutParams(params);
            mLinearIndicators.addView(image);
        }
        mLinearIndicators.getChildAt(0).setBackgroundResource(R.drawable.aliwx_selected);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mLinearIndicators.getChildAt(mLastIndex % totalSize).setBackgroundResource(R.drawable.aliwx_unselected);
        mLinearIndicators.getChildAt(position % totalSize).setBackgroundResource(R.drawable.aliwx_selected);
        mLastIndex = position;
        Message msg = Message.obtain();
        msg.what = 300;
        msg.arg1 = position;
        mHandler.sendMessage(msg);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        switch (state) {
            case ViewPager.SCROLL_STATE_DRAGGING:
                mHandler.sendEmptyMessage(200);
                break;
        }
    }

    //图片的点击事件
    @Override
    public void onClick(View v) {
        //Snackbar.make(v, "进入图片的url:--"+v.getTag(), Snackbar.LENGTH_SHORT).show();
        int index = (int) v.getTag();
        String title = null;
        String url = null;
        //加载本地的html页面
        //String url = "file:///android_asset/home_top.html";
        switch (index) {
            case 0:
                title = "爸爸去哪儿4同款搭配大揭秘！";
                url = UrlConfig.BABAQUNALE_URL;
                break;
            case 1:
                title = "非常大牌第17期，全场包邮9.9元起";
                url = UrlConfig.FEICHANGDAPAI_URL;
                break;
            case 2:
                title = "羽绒服专场";
                url = UrlConfig.YURONGFUZHUANCHANG_URL;
                break;
            case 3:
                title = "69-99元秋冬新品 全场包邮";
                url = UrlConfig.QIUDONG69_99_URL;
                break;
            case 4:
                title = "气温骤降穿什么？我家宝贝还缺一件暖黄色大衣！";
                url = UrlConfig.QIWENZHOUJIANG_URL;
                break;
        }
        //加载网页的html
        //String url = mUrls.get(index);
        Intent intent = new Intent(mContext, MatchHtmlActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("url", url);
        mContext.startActivity(intent);
    }
}
