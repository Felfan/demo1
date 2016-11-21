package adapters.viewholders;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.awu.GoodsInfoActivity;
import com.awu.R;
import com.bumptech.glide.Glide;

import beans.Item_display;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/9.
 */
public class MyDisplayViewHolder extends AbstractViewHolder implements View.OnClickListener {
    private Context mContext;
    private ImageView mImageView;
    private TextView name;
    private TextView price;
    private LinearLayout mLinearLayout;

    public MyDisplayViewHolder(Context context,View itemView) {
        super(itemView);
        this.mContext = context;
        mImageView = (ImageView) itemView.findViewById(R.id.imageView_matchItem);
        name = (TextView) itemView.findViewById(R.id.textView_matchItem_name);
        price = (TextView) itemView.findViewById(R.id.textView_matchItem_price);
        mLinearLayout = (LinearLayout) itemView.findViewById(R.id.linear_matchItem);
    }

    @Override
    public void bind(IItem iItem) {
        Item_display itemDisplay = (Item_display) iItem;
        name.setText(itemDisplay.getName());
        price.setText("￥"+itemDisplay.getPrice());
        Glide.with(mContext).load(itemDisplay.getImageUrl())
                .placeholder(R.drawable.iv_goods_loading)
                .crossFade()
                .error(R.drawable.iv_goods_failure)
                .into(mImageView);
        mLinearLayout.setTag(itemDisplay.getId());
        mLinearLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String id = (String) v.getTag();
        Snackbar.make(v, "xuanzenl 商品" + id,Snackbar.LENGTH_SHORT).show();
        Intent intent = new Intent(mContext, GoodsInfoActivity.class);
        mContext.startActivity(intent);
    }
}
