package adapters.viewholders;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.awu.DisplayActivity;
import com.awu.R;
import com.squareup.picasso.Picasso;

import beans.Item_draw;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/10.
 */
public class MyBrandViewHolder extends AbstractViewHolder implements View.OnClickListener {
    private Context mContext;
    private ImageView mImageView;
    private TextView mTextView;
    private LinearLayout mLinearLayout;

    public MyBrandViewHolder(Context context,View itemView) {
        super(itemView);
        this.mContext = context;
        this.mImageView = (ImageView) itemView.findViewById(R.id.image_grid);
        this.mTextView = (TextView) itemView.findViewById(R.id.text_grid);
        this.mLinearLayout = (LinearLayout) itemView.findViewById(R.id.linear_gridItem);
    }

    @Override
    public void bind(IItem iItem) {
        Item_draw item = (Item_draw) iItem;
        mTextView.setText(item.getTitle());
        mImageView.setTag(item.getImageUrl());
        Picasso.with(mContext)
                .load(item.getImageUrl())
                .placeholder(R.drawable.iv_goods_loading)
                .error(R.drawable.iv_goods_failure)
                .into(mImageView);
        mLinearLayout.setTag(item.getToUrl());
        this.mLinearLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //点击了某一个具体的条目
        Intent intent = new Intent(mContext, DisplayActivity.class);
        intent.putExtra("title", mTextView.getText());
        intent.putExtra("headUrl", "" + mLinearLayout.getTag());
        //intent.putExtra("headUrl", "" + mImageView.getTag());
        intent.putExtra("url", "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand");
        mContext.startActivity(intent);
    }
}
