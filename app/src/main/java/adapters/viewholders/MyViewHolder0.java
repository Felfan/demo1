package adapters.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.awu.R;
import com.squareup.picasso.Picasso;

import beans.Item0_home;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class MyViewHolder0 extends AbstractViewHolder {
    private ImageView mImageView1,mImageView2,mImageView3,mImageView4;
    private Context mContext;
    public MyViewHolder0(Context context,View itemView) {
        super(itemView);
        this.mContext = context;
        mImageView1 = (ImageView) itemView.findViewById(R.id.image1_head_home);
        mImageView2 = (ImageView) itemView.findViewById(R.id.image2_head_home);
        mImageView3 = (ImageView) itemView.findViewById(R.id.image3_head_home);
        mImageView4 = (ImageView) itemView.findViewById(R.id.image4_head_home);
    }

    @Override
    public void bind(IItem iItem) {
        Item0_home item0Home = (Item0_home) iItem;
        mImageView1.setTag(item0Home.getTo1());
        mImageView2.setTag(item0Home.getTo2());
        mImageView3.setTag(item0Home.getTo3());
        //打开抽屉
        //mImageView4.setTag(item0Home.getTo4());
        Picasso.with(mContext).load(item0Home.getImageUrl1())
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView1);
        Picasso.with(mContext)
                .load(item0Home.getImageUrl2())
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView2);
        Picasso.with(mContext)
                .load(item0Home.getImageurl3())
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView3);
        Picasso.with(mContext)
                .load(item0Home.getImageUrl4())
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView4);
    }
}
