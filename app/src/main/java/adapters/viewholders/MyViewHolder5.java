package adapters.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.awu.R;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import beans.Item5_home;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class MyViewHolder5 extends AbstractViewHolder{
    private Context mContext;
    private List<ImageView>mImageViews;
    private TextView mTvTitle;

    public MyViewHolder5(Context context, View itemView) {
        super(itemView);
        this.mContext = context;
        this.mImageViews = new ArrayList<>();

        //通过反射得到itemView中的7个ImageView
        Class<R.id> clazz = R.id.class;
        //image1_item5
        for (int i = 0; i < 7; i++) {
            try {
                //image5_item3
                Field field = clazz.getField("image" + i + "_item5");
                field.setAccessible(true);
                int id = field.getInt(null);
                mImageViews.add((ImageView) itemView.findViewById(id));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        mTvTitle = (TextView) itemView.findViewById(R.id.text_item5_title);
    }

    @Override
    public void bind(IItem iItem) {
        Item5_home item = (Item5_home) iItem;
        List<String> tabs = item.getTabs();
        mTvTitle.setText(item.getTitle());
        for (int i = 0; i < mImageViews.size(); i++) {
            ImageView target = mImageViews.get(i);
            target.setTag(tabs.get(i));
            if (i == 0) {
                //第一张图片用大图默认显示
                Picasso.with(mContext)
                        .load(item.getImageUrls().get(i))
                        .placeholder(R.drawable.iv_home_loading)
                        .error(R.drawable.iv_goods_failure)
                        .into(target);
            } else {
                Picasso.with(mContext)
                        .load(item.getImageUrls().get(i))
                        .placeholder(R.drawable.iv_goods_loading)
                        .error(R.drawable.iv_goods_failure)
                        .into(target);
            }
        }
    }
}
