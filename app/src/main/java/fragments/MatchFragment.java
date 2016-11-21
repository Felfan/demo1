package fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.awu.GoodsInfoActivity;
import com.awu.MatchCheckAllActivity;
import com.awu.MatchHtmlActivity;
import com.awu.R;
import com.squareup.picasso.Picasso;

import org.xutils.common.Callback;
import org.xutils.x;

import adapters.MatchRecyclerAdapter;
import beans.MatchFragmentBeans;
import interfaces.RecyclerOnChildClickListener;
import params.MatchFragmentParams;

/**
 * A simple {@link Fragment} subclass.
 */
public class MatchFragment extends Fragment implements Callback.CommonCallback<MatchFragmentBeans>, SwipeRefreshLayout.OnRefreshListener, View.OnClickListener, RecyclerOnChildClickListener {
    //Fragment对应的布局
    private View mView;

    private RecyclerView mRecyclerView = null;
    private SwipeRefreshLayout mSwipeRefreshLayout = null;
    private MatchRecyclerAdapter mMatchRecyclerAdapter;
    private View headView = null;
    private TextView checkAllTextView = null;
    private ImageView mImageView1 = null;
    private ImageView mImageView2 = null;
    private MatchFragmentBeans mMatchFragmentBeans;

    public MatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_match, container, false);

        //初始化控件
        initView();
        //设置recyclerView
        initRecyclerView();
        //加载数据
        initData();
        //设置下拉刷新
        initSwipeRefreshLayout();
        //监听
        initListener();

        return mView;
    }

    //监听头布局点击事件
    private void initListener() {
        checkAllTextView.setOnClickListener(this);
        mImageView1.setOnClickListener(this);
        mImageView2.setOnClickListener(this);
        mMatchRecyclerAdapter.setOnChildClickListener(this);
    }

    //设置SwipeRefreshLayout
    private void initSwipeRefreshLayout() {
        //设置SwipeRefreshLayout的颜色
        mSwipeRefreshLayout.setColorSchemeColors(0xFF3FDCCC);
        //下拉刷新的监听
        mSwipeRefreshLayout.setOnRefreshListener(this);
    }

    private void initData() {
        MatchFragmentParams matchFragmentParams = new MatchFragmentParams();
        //网络请求数据
        x.http().post(matchFragmentParams, this);
    }

    //设置RecyclerView
    private void initRecyclerView() {
        GridLayoutManager manager = new GridLayoutManager(getContext(), 2);
        //GridLayout列合并
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position == 0) {
                    return 2;
                }
                return 1;
            }
        });
        mRecyclerView.setLayoutManager(manager);

        mMatchRecyclerAdapter = new MatchRecyclerAdapter(getContext(), headView);
        mRecyclerView.setAdapter(mMatchRecyclerAdapter);
    }

    //初始化控件
    private void initView() {
        mRecyclerView = (RecyclerView) mView.findViewById(R.id.recyclerView_match_fragment);
        mSwipeRefreshLayout = (SwipeRefreshLayout) mView.findViewById(R.id.swipeRefresh_match_fragment);
        headView = LayoutInflater.from(getContext()).inflate(R.layout.header_recyclerview_match_fragment, null);
        checkAllTextView = (TextView) headView.findViewById(R.id.textView_match_recyclerViewHeader);
        mImageView1 = (ImageView) headView.findViewById(R.id.imageView_match_recyclerViewHeader_1);
        mImageView2 = (ImageView) headView.findViewById(R.id.imageView_match_recyclerViewHeader_2);

    }

    //网络数据请求成功的回调
    @Override
    public void onSuccess(MatchFragmentBeans result) {
        mMatchFragmentBeans = result;
        Picasso.with(getContext()).load(mMatchFragmentBeans.getResult().getSpecial_top_two().get(0).getPic_brand()).into(mImageView1);
        Picasso.with(getContext()).load(mMatchFragmentBeans.getResult().getSpecial_top_two().get(1).getPic_brand()).into(mImageView2);
        mSwipeRefreshLayout.setRefreshing(false);
        mMatchRecyclerAdapter.setMatchFragmentBeans(mMatchFragmentBeans);
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }

    //SwipeRefreshLayout刷新的监听
    @Override
    public void onRefresh() {
        initData();
    }

    //Recycler 头布局点击监听
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.textView_match_recyclerViewHeader:
                startActivity(new Intent(getContext(), MatchCheckAllActivity.class));
                break;
            case R.id.imageView_match_recyclerViewHeader_1:
                //点击跳转展示html的页面，intent传的值为标题和html的url
                Intent intent = new Intent(getContext(), MatchHtmlActivity.class);
                intent.putExtra("title", mMatchFragmentBeans.getResult().getSpecial_top_two().get(0).getTitle());
                intent.putExtra("url", "file:///android_asset/webview/match_recycler_view_header_1.html");
                startActivity(intent);
//                Toast.makeText(getContext(),"imageView1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView_match_recyclerViewHeader_2:
                //点击跳转展示html的页面，intent传的值为标题和html的url
                Intent intent2 = new Intent(getContext(), MatchHtmlActivity.class);
                intent2.putExtra("title", mMatchFragmentBeans.getResult().getSpecial_top_two().get(1).getTitle());
                intent2.putExtra("url", "file:///android_asset/webview/match_recycler_view_header_2.html");
                startActivity(intent2);
//                Toast.makeText(getContext(),"imageView2",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //Recycler item的点击监听
    @Override
    public void onClick(View view, int position, MatchRecyclerAdapter.MyViewHolder myViewHolder) {
        if (position != 0){
            Intent intent = new Intent(getContext(), GoodsInfoActivity.class);
            intent.putExtra("itemUrl","match_recyclerview_item_1");
            startActivity(intent);
        }
    }
}
