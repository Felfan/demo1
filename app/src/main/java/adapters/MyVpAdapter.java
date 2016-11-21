package adapters;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class MyVpAdapter extends PagerAdapter{
    private List<ImageView>mImageViews;

    public MyVpAdapter() {
        mImageViews = new ArrayList<>();
    }

    public void setImageViews(List<ImageView> list) {
        this.mImageViews = list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (mImageViews.size() == 0) {
            return null;
        }
        position %= mImageViews.size();
        if (position < 0) {
            position = mImageViews.size() + position;
        }
        ImageView imageView = mImageViews.get(position);
        ViewParent parent = imageView.getParent();
        if (parent != null) {
            ViewGroup group = (ViewGroup) parent;
            group.removeView(imageView);
        }
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //super.destroyItem(container, position, object);
      //  container.removeView(mImageViews.get(position));
    }
}
