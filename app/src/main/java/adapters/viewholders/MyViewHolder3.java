package adapters.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.awu.R;
import com.bumptech.glide.Glide;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import beans.Item3_home;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class MyViewHolder3 extends AbstractViewHolder {

    private Context mContext;
    private List<ImageView> mImageViews = new ArrayList<>();

    public MyViewHolder3(Context context,View itemView) {
        super(itemView);
        this.mContext = context;
        //通过反射得到itemView中的14个ImageView
        Class<R.id> clazz = R.id.class;
        for (int i = 1; i < 15; i++) {
            try {
                //image5_item3
                Field field = clazz.getField("image" + i + "_item3");
                field.setAccessible(true);
                int id = field.getInt(null);
                mImageViews.add((ImageView) itemView.findViewById(id));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void bind(IItem iItem) {
        Item3_home item = (Item3_home) iItem;
        List<String> list = item.getList();
        //14个ImageView 的赋值
        for (int i = 0; i < list.size(); i++) {
            Glide.with(mContext)
                    .load(list.get(i))
                    .crossFade()
                    .placeholder(R.drawable.iv_goods_loading)
                    .error(R.drawable.iv_goods_failure)
                    .into(mImageViews.get(i));
        }
    }
}
