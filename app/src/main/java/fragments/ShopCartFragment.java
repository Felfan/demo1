package fragments;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.awu.MainActivity;
import com.awu.R;
import com.awu.alipay.PayDemoActivity;

import java.util.List;
import java.util.Map;

import adapters.ShopCardListViewAdapter;
import interfaces.DataObserver;
import sql.MySQLiteOpenHelper;
import utils.LogUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopCartFragment extends Fragment implements View.OnClickListener, DataObserver, AdapterView.OnItemLongClickListener {

    private LinearLayout mLinearLayout = null;
    private View mView;
    //数据库
    private MySQLiteOpenHelper mMySQLiteOpenHelper = null;
    //放置数据库中查询到的数据
    private List<Map<String, Object>> mList;

    private ImageView mImageView1;
    private ImageView mImageView2;
    private TextView mAllPrice;
    private Button mBuyButton;

    private ListView mListView;
    private View mNoEmpty;
    private ShopCardListViewAdapter mListViewAdapter;

    public ShopCartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_shop_cart, container, false);

        mMySQLiteOpenHelper = new MySQLiteOpenHelper(getContext());

        //控件初始化
        initView();
        //注册观察者
        mMySQLiteOpenHelper.registerObserver(this);
        //加载数据
        initData();

        return mView;
    }


    private void initData() {
        mList = mMySQLiteOpenHelper.selectList("select * from tb_shopping_card", null);
        if (mList.size() == 0) {
            View empty = LayoutInflater.from(getContext()).inflate(R.layout.shopcard_nodata, mLinearLayout, false);
            TextView goShopping = (TextView) empty.findViewById(R.id.textView_shopCardFragment_goShopping);
            goShopping.setOnClickListener(this);
            mLinearLayout.addView(empty);
        } else {
            LogUtils.d("shopCardFragment", mNoEmpty + "-------" + mLinearLayout);
            mNoEmpty = LayoutInflater.from(getContext()).inflate(R.layout.shopcard_havadata, mLinearLayout, false);
            mImageView1 = (ImageView) mNoEmpty.findViewById(R.id.imageView_shopCardFragment_1);
            mImageView2 = (ImageView) mNoEmpty.findViewById(R.id.imageView_shopCardFragment_2);
            mAllPrice = (TextView) mNoEmpty.findViewById(R.id.textView_shopCardFragment_allPrice);
            mBuyButton = (Button) mNoEmpty.findViewById(R.id.button_shopCardFragment_buy);
            //点击事件
            mImageView1.setOnClickListener(this);
            mImageView2.setOnClickListener(this);
            mBuyButton.setOnClickListener(this);

            mAllPrice.setText("总金额:￥" + getAllPrice());

            //判断是否全部选中
            boolean isAllChoose = true;
            for (int i = 0; i < mList.size(); i++) {
                if (Integer.parseInt(mList.get(i).get("is_choose").toString()) == 0){
                    isAllChoose = false;
                }
            }
            if (isAllChoose){
                mImageView1.setVisibility(View.VISIBLE);
                mImageView2.setVisibility(View.GONE);
                mBuyButton.setClickable(true);
                mBuyButton.setBackgroundColor(0xffe48dc8);
            }else {
                mImageView1.setVisibility(View.GONE);
                mImageView2.setVisibility(View.VISIBLE);
                //判断是否全部都没选中
                boolean isNoAllChoose = false;
                for (int i = 0; i < mList.size(); i++) {
                    if (Integer.parseInt(mList.get(i).get("is_choose").toString()) == 1){
                        isNoAllChoose = true;
                    }
                }
                if (!isNoAllChoose){
                    mBuyButton.setClickable(false);
                    mBuyButton.setBackgroundColor(0xFFC8C8C8);
                }
            }

            //当购物车中有数据时，加载数据
            initNoEmpty(mNoEmpty);

            mLinearLayout.addView(mNoEmpty);
        }
    }

    //当购物车中有数据时，加载数据
    private void initNoEmpty(View view) {
        //控件
        mListView = (ListView) view.findViewById(R.id.listView_shopCardFragment_item);

        mListViewAdapter = new ShopCardListViewAdapter(getContext());
        mListView.setAdapter(mListViewAdapter);

        mListViewAdapter.setList(mList);

        mListView.setOnItemLongClickListener(this);

    }


    //控件初始化
    private void initView() {
        mLinearLayout = (LinearLayout) mView.findViewById(R.id.linearLayout_shopCardFragment);
    }

    //点击监听
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //当购物车中为空的时候，“去逛逛”的点击事件
            case R.id.textView_shopCardFragment_goShopping:
                startActivity(new Intent(getContext(), MainActivity.class));
                break;
            //全选的点击事件，点击后都不选
            case R.id.imageView_shopCardFragment_1:

                for (int i = 0; i < mList.size(); i++) {
                    ContentValues values2 = new ContentValues();
                    values2.put("is_choose", 0);
                    mMySQLiteOpenHelper.update("tb_shopping_card", values2, "goods_id=?", new String[]{mList.get(i).get("goods_id").toString()});
                }
                break;
            //全选的点击事件，点击后选择全部
            case R.id.imageView_shopCardFragment_2:

                for (int i = 0; i < mList.size(); i++) {
                    ContentValues values2 = new ContentValues();
                    values2.put("is_choose", 1);
                    mMySQLiteOpenHelper.update("tb_shopping_card", values2, "goods_id=?", new String[]{mList.get(i).get("goods_id").toString()});
                }

                break;
            //结算按钮的点击事件
            case R.id.button_shopCardFragment_buy:
                Intent intent2 = new Intent(getContext(), PayDemoActivity.class);
                intent2.putExtra("name", mList.get(0).get("goods_name").toString());
                intent2.putExtra("price", getAllPrice() + "");
                startActivity(intent2);
                break;
        }
    }

    //计算总价
    public double getAllPrice() {
        double allPrice = 0;
        for (int i = 0; i < mList.size(); i++) {
            if (Integer.parseInt(mList.get(i).get("is_choose").toString()) == 1) {
                allPrice += Double.parseDouble(mList.get(i).get("goods_price").toString())
                        * Integer.parseInt(mList.get(i).get("number").toString());
            }
        }
        return allPrice;
    }

    @Override
    public void onDataChanged() {
        mList.clear();
        mLinearLayout.removeAllViews();
        initData();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(getContext(), "点击了" + position, Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        builder.setMessage("删除购物车商品？");

        final int index = position;

        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                mMySQLiteOpenHelper.delete("tb_shopping_card", "goods_id=?", new String[]{mList.get(index).get("goods_id").toString()});

            }
        });

        builder.setNegativeButton("取消", null);
        builder.create().show();
        return true;
    }

}

