package adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public abstract class AbstractViewHolder extends RecyclerView.ViewHolder {

    public AbstractViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(IItem iItem);
}
