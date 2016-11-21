package interfaces;

import android.view.View;

import adapters.MatchRecyclerAdapter;

/**
 * Created by Yizhongli on 2016/11/8.
 */
//自定义的一个recycler item的点击事件
public interface RecyclerOnChildClickListener {
    void onClick(View view, int position, MatchRecyclerAdapter.MyViewHolder myViewHolder);
}
