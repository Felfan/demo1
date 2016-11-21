package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.awu.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Yizhongli on 2016/11/10.
 */
public class MineWishRecyclerAdapter extends RecyclerView.Adapter<MineWishRecyclerAdapter.MyViewHolder> {

    //adapter中封装一个点击监听器，并且对外提供方法。
    private RecyclerOnChildClickListener onChildClickListener=null;
    public void setOnChildClickListener(RecyclerOnChildClickListener onChildClickListener){
        this.onChildClickListener=onChildClickListener;
    }

    private Context mContext = null;
    private List<Map<String,Object>>mList = null;

    public MineWishRecyclerAdapter(Context context) {
        mContext = context;
        mList = new ArrayList<Map<String, Object>>();
    }

    public void setList(List<Map<String, Object>> list) {
        mList = list;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_match_fragment_recycler, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //name varchar,imageUrl varchar,price varchar,url varchar
        Picasso.with(mContext).load((String) mList.get(position).get("imageUrl")).into(holder.imageView);
        holder.name.setText((String)mList.get(position).get("name"));
        holder.price.setText("￥" + (String) mList.get(position).get("price"));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

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

    //自定义的一个recycler item的点击事件
    public interface RecyclerOnChildClickListener {
        void onClick(View view, int position, MineWishRecyclerAdapter.MyViewHolder myViewHolder);
    }
}
