package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;

import com.awu.R;
import com.squareup.picasso.Picasso;

import beans.MatchFragmentBeans;
import interfaces.RecyclerOnChildClickListener;

/**
 * Created by Yizhongli on 2016/11/7.
 */
public class MatchRecyclerAdapter extends RecyclerView.Adapter<MatchRecyclerAdapter.MyViewHolder> {

    //adapter中封装一个点击监听器，并且对外提供方法。
    private RecyclerOnChildClickListener onChildClickListener=null;
    public void setOnChildClickListener(RecyclerOnChildClickListener onChildClickListener){
        this.onChildClickListener=onChildClickListener;
    }

    public static final int TYPE_HEADER = 0;
    public static final int TYPE_NORMAL = 1;

    private Context context = null;
    private MatchFragmentBeans mMatchFragmentBeans = null;
    private View headerView = null;

    public MatchRecyclerAdapter(Context context, View headerView) {
        this.context = context;
        this.headerView = headerView;
    }

    public void setMatchFragmentBeans(MatchFragmentBeans matchFragmentBeans) {
        mMatchFragmentBeans = matchFragmentBeans;
        notifyDataSetChanged();
    }

    public void addMatchFragmentBeans(MatchFragmentBeans matchFragmentBeans){
        mMatchFragmentBeans.getResult().getGoods_list().addAll(matchFragmentBeans.getResult().getGoods_list());
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (headerView == null) return TYPE_NORMAL;
        if (position == 0) return TYPE_HEADER;
        return TYPE_NORMAL;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(headerView != null && viewType == TYPE_HEADER) return new MyViewHolder(headerView);
        View view = LayoutInflater.from(context).inflate(R.layout.item_match_fragment_recycler, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if(getItemViewType(position) == TYPE_HEADER) return;
        MatchFragmentBeans.ResultBean.GoodsListBean bean = mMatchFragmentBeans.getResult().getGoods_list().get(position-1);
        Picasso.with(context).load(bean.getGoods_image()).into(holder.imageView);
        holder.name.setText(bean.getGoods_name());
        holder.price.setText("￥" + bean.getGoods_price_nonMember());
    }

    @Override
    public int getItemCount() {
        return mMatchFragmentBeans != null ?
                (headerView == null ?
                        mMatchFragmentBeans.getResult().getGoods_list().size()
                        :mMatchFragmentBeans.getResult().getGoods_list().size()+1)
                : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView name;
        TextView price;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView_matchItem);
            name = (TextView) itemView.findViewById(R.id.textView_matchItem_name);
            price = (TextView) itemView.findViewById(R.id.textView_matchItem_price);
            //对于每一个itemview设置监听器，这个监听是view源生的点击监听
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //在源生的点击监听的基础上，添加两个参数：序号、ViewHolder
            //回调自己定义的点击监听。
            if(onChildClickListener!=null){
                onChildClickListener.onClick(v,getLayoutPosition(),this);
            }
        }
    }
}

