package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.awu.R;

import org.json.JSONArray;
import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import adapters.MyGvAdapter;
import beans.Item_draw;
import params.MatchFragmentParams;
import utils.LogUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrawerFragment extends Fragment implements Callback.CommonCallback<String> {


    private View mInflate;
    private GridView mGridView;
    private MyGvAdapter mGvAdapter;
    private List<Item_draw> mList = new ArrayList<>();
    private ImageView empty;

    public DrawerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mInflate = inflater.inflate(R.layout.fragment_drawer, container, false);

        mGridView = (GridView) mInflate.findViewById(R.id.gridView_drawerFragment);
        empty = (ImageView) mInflate.findViewById(R.id.imageView_drawer_empty);

        mGvAdapter = new MyGvAdapter(this.getContext());

        mGridView.setAdapter(mGvAdapter);

        mGridView.setEmptyView(empty);

        MatchFragmentParams params = new MatchFragmentParams();

        params.act = "goods";

        params.op = "optional";

        x.http().post(params, this);


        return mInflate;
    }

    //存放具体的条目的点击集合
    private List<Item_draw> itemList = new ArrayList<>();

    //根据点击的位置放置不同的数据
    public void setIndex(int index) {
        if (itemList.size() > 0) {
            itemList.clear();
        }
        if (!(mList.size() > 0)) {
            return;
        }
        switch (index) {
            case 0:
                for (int i = 0; i < 8; i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 1:
                break;
            case 2:
                for (int i = 8; i < 21; i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 3:
                for (int i = 21; i < 28; i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 4:
                for (int i = 28; i < 31; i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 5:
                for (int i = 31; i < 35; i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 6:
                for (int i = 35; i < 37; i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 7:
                for (int i = 37; i < 47; i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 8:
                for (int i = 47; i < 56; i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 9:
                for (int i = 56; i <mList.size(); i++) {
                    itemList.add(mList.get(i));
                }
                break;
            case 10:
                break;
        }
        if (itemList.size() != 0) {
            mGvAdapter.setList(itemList);
        }
    }

    @Override
    public void onSuccess(String result) {
        //Toast.makeText(DrawerFragment.this.getContext(), "success---" + result, Toast.LENGTH_SHORT).show();
        //数据成功返回了---保存所有的解析商品  item
        try {
            JSONObject json = new JSONObject(result);
            JSONObject resultJson = json.optJSONObject("result");
            JSONObject goodsClass = resultJson.optJSONObject("goods_class");
            JSONArray class1 = goodsClass.optJSONArray("class1");
            for (int i = 0; i < class1.length(); i++) {
                JSONObject jsonObject = class1.optJSONObject(i);
                JSONArray class2 = jsonObject.optJSONArray("class2");
                for (int j = 0; j < class2.length(); j++) {
                    if (j == 1 || j == 10) {
                        continue;
                    }
                    JSONObject class3Json = class2.optJSONObject(j);
                    JSONArray class3 = class3Json.optJSONArray("class3");
                    for (int z = 0; z < class3.length(); z++) {
                        JSONObject class3Item = class3.optJSONObject(z);
                        Item_draw itemDraw = new Item_draw();
                        itemDraw.setId(class3Item.optString("gc_id"));
                        itemDraw.setImageUrl(class3Item.optString("pic"));
                        itemDraw.setTitle(class3Item.optString("gc_name"));
                        mList.add(itemDraw);
                    }
                }
            }

            //默认显示前8个数据
            for (int i = 0; i < 8; i++) {
                itemList.add(mList.get(i));
            }
//           通知adapter进行更新下
            mGvAdapter.setList(itemList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        LogUtils.d("flag", "下载失败----error");
    }

    @Override
    public void onCancelled(CancelledException cex) {
        LogUtils.d("flag", "下载取消----cancelled");
    }

    @Override
    public void onFinished() {
        LogUtils.d("flag", "下载结束----Finished");
    }
}
