package adapters.viewholders;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.awu.MatchHtmlActivity;
import com.awu.R;
import com.facebook.drawee.view.SimpleDraweeView;

import beans.Item1_home;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class MyViewHolder1 extends AbstractViewHolder implements View.OnClickListener {
    private SimpleDraweeView mSimpleDraweeView;
    private Context mContext;

    public MyViewHolder1(Context context,View itemView) {
        super(itemView);
        this.mContext = context;
        mSimpleDraweeView = (SimpleDraweeView) itemView.findViewById(R.id.image_item1);
        mSimpleDraweeView.setOnClickListener(this);
    }

    @Override
    public void bind(IItem iItem) {
        Item1_home item1_home = (Item1_home) iItem;
        mSimpleDraweeView.setTag(item1_home.getId());
        //非死不可 Fresco
        mSimpleDraweeView.setImageURI(item1_home.getImageUrl());
    }

    @Override
    public void onClick(View v) {
        int i = (int) v.getTag();
        if (i == 0) {
//            0的时候就是简单的一张图片，不用进行跳转
            return;
        }
        //跳转
        //Snackbar.make(v, "新人专享", Snackbar.LENGTH_SHORT).show();
        Intent intent = new Intent(mContext, MatchHtmlActivity.class);
        intent.putExtra("title", "新人专享");
        intent.putExtra("url", "http://console.awu.cn/wxshop/wx_shop.php?act=goods&op=new_user_goodsLists");
        mContext.startActivity(intent);
    }
}
