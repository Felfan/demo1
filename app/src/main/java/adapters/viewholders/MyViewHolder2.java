package adapters.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.awu.R;
import com.bumptech.glide.Glide;

import beans.Item2_home;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class MyViewHolder2 extends AbstractViewHolder {

    private ImageView mImageView1, mImageView2, mImageView3, mImageView4;
    private Context mContext;

    public MyViewHolder2(Context context, View itemView) {
        super(itemView);
        this.mContext = context;
        mImageView1 = (ImageView) itemView.findViewById(R.id.image1_item2);
        mImageView2 = (ImageView) itemView.findViewById(R.id.image2_item2);
        mImageView3 = (ImageView) itemView.findViewById(R.id.image3_item2);
        mImageView4 = (ImageView) itemView.findViewById(R.id.image4_item2);
    }

    @Override
    public void bind(IItem iItem) {
        Item2_home item2_home = (Item2_home) iItem;
        Glide.with(mContext)
                .load(item2_home.getImageUrl1())
                .crossFade()
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure).into(mImageView1);
        Glide.with(mContext)
                .load(item2_home.getImageUrl2())
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView2);
        Glide.with(mContext)
                .load(item2_home.getImageurl3())
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView3);
        Glide.with(mContext)
                .load(item2_home.getImageUrl4())
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView4);
    }
}
