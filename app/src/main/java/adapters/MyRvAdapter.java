package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.awu.R;

import java.util.ArrayList;
import java.util.List;

import adapters.viewholders.AbstractViewHolder;
import adapters.viewholders.MyViewHolder0;
import adapters.viewholders.MyViewHolder1;
import adapters.viewholders.MyViewHolder2;
import adapters.viewholders.MyViewHolder3;
import adapters.viewholders.MyViewHolder4;
import adapters.viewholders.MyViewHolder5;
import adapters.viewholders.MyViewHolder6;
import adapters.viewholders.MyViewHolder7;
import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class MyRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<IItem>mList;

    public MyRvAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mList = new ArrayList<>();
    }

    public int getTotalSize() {
        return getItemCount();
    }

    public void addItem(IItem iItem, int position) {

        this.mList.add(iItem);
       // notifyDataSetChanged();
        notifyItemInserted(position);
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                return new MyViewHolder0(mContext,
                        mLayoutInflater.inflate(R.layout.home_item0, parent, false));
            case 1:
                return new MyViewHolder1(mContext,
                        mLayoutInflater.inflate(R.layout.home_item1, parent, false));
            case 2:
                return new MyViewHolder2(mContext,
                        mLayoutInflater.inflate(R.layout.home_item2, parent, false));
            case 3:
                return new MyViewHolder3(mContext,
                        mLayoutInflater.inflate(R.layout.home_item3, parent, false));
            case 4:
                return new MyViewHolder4(mContext,
                        mLayoutInflater.inflate(R.layout.home_item4, parent, false));
            case 5:
                return new MyViewHolder5(mContext,
                        mLayoutInflater.inflate(R.layout.home_item5, parent, false));
            case 6:
                return new MyViewHolder6(
                        mLayoutInflater.inflate(R.layout.home_item6, parent, false));
            case 7:
                return new MyViewHolder7(mContext,
                        mLayoutInflater.inflate(R.layout.home_item7, parent, false));
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

    public void clear() {
        this.mList.clear();
        notifyDataSetChanged();
    }
}
