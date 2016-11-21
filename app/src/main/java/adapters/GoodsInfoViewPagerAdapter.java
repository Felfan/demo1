package adapters;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yizhongli on 2016/11/8.
 */
public class GoodsInfoViewPagerAdapter extends PagerAdapter{
    private List<ImageView>mList = null;

    public GoodsInfoViewPagerAdapter() {
        mList = new ArrayList<>();
    }

    public void setList(List<ImageView> list) {
        mList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (mList.size() == 0){
            return null;
        }else {
            ImageView ret = mList.get(position%mList.size());
            ViewParent parent = ret.getParent();
            if (parent != null){
                ViewGroup group = (ViewGroup) parent;
                group.removeView(ret);
            }
            container.addView(ret);
            return ret;
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
    }
}
