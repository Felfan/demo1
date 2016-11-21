package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.awu.R;

import java.util.ArrayList;
import java.util.List;

import adapters.viewholders.AbstractViewHolder;
import adapters.viewholders.MyBrandViewHolder;
import adapters.viewholders.MyDisplayViewHolder;
import adapters.viewholders.MyViewHolder1;
import adapters.viewholders.MyViewHolder6;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/9.
 */
public class MyDpRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private final LayoutInflater mInflater;
    private List<IItem> mList;

    //数据的添加
    public void addList(List<IItem> list) {
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    //数据的更新
    public void addItem(IItem item) {
        this.mList.add(item);
        notifyItemInserted(0);
    }
    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }

    public MyDpRvAdapter(Context context) {
        mContext = context;
        this.mInflater = LayoutInflater.from(mContext);
        mList = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case IItem.ONE_IMAGE:
                return new MyViewHolder1
                        (mContext, mInflater.inflate(R.layout.home_item1, parent, false));
            case IItem.DISPLAY_ITEM:
                return new MyDisplayViewHolder
                        (mContext, mInflater.inflate(R.layout.item_match_fragment_recycler, parent, false));
            case IItem.FOOT_ITEM:
                return new MyViewHolder6
                        (mInflater.inflate(R.layout.home_item6, parent, false));
            case IItem.GRID_ITEM:
                return new MyBrandViewHolder
                        (mContext, mInflater.inflate(R.layout.grid_item, parent, false));

        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((AbstractViewHolder) holder).bind(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    //清空数据
    public void clear() {
        mList.clear();
        notifyDataSetChanged();
    }
}
