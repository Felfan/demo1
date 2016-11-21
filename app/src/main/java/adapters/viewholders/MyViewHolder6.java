package adapters.viewholders;

import android.view.View;
import android.widget.ImageView;

import com.awu.R;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class MyViewHolder6 extends AbstractViewHolder {
    private ImageView mImageView;
    public MyViewHolder6(View itemView) {
        super(itemView);
        this.mImageView = (ImageView) itemView.findViewById(R.id.image_item6_foot);
    }

    @Override
    public void bind(IItem iItem) {
        mImageView.setImageResource(R.drawable.img_goods);
    }
}
