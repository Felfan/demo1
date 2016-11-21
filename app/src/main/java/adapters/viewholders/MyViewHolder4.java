package adapters.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.awu.R;
import com.bumptech.glide.Glide;

import beans.Item4_home;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class MyViewHolder4 extends AbstractViewHolder {
    private ImageView mImageView1, mImageView2;
    private Context mContext;

    public MyViewHolder4(Context context, View itemView) {
        super(itemView);
        this.mContext = context;
        mImageView1 = (ImageView) itemView.findViewById(R.id.image1_item4);
        mImageView2 = (ImageView) itemView.findViewById(R.id.image2_item4);
    }

    @Override
    public void bind(IItem iItem) {
        Item4_home item = (Item4_home) iItem;
        Glide.with(mContext)
                .load(item.getImageUrl1())
                .crossFade()
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView1);
        Glide.with(mContext)
                .load(item.getImageUrl2())
                .crossFade()
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView2);
    }
}
