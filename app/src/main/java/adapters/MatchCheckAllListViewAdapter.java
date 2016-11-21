package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.awu.R;
import com.squareup.picasso.Picasso;

import beans.MatchCheckAllBeans;

/**
 * Created by Yizhongli on 2016/11/8.
 */
public class MatchCheckAllListViewAdapter extends BaseAdapter {
    private Context context = null;
    private MatchCheckAllBeans mMatchCheckAllBeans = null;

    public MatchCheckAllListViewAdapter(Context context) {
        this.context = context;
    }

    public void setMatchCheckAllBeans(MatchCheckAllBeans matchCheckAllBeans) {
        mMatchCheckAllBeans = matchCheckAllBeans;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mMatchCheckAllBeans != null ? mMatchCheckAllBeans.getResult().size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return mMatchCheckAllBeans.getResult().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_matchcheckall_listview, parent, false);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageView_matchCheckAllActivity_item);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //设置数据
        Picasso.with(context).load(mMatchCheckAllBeans.getResult().get(position).getPic_brand()).into(viewHolder.imageView);

        return convertView;
    }

    class ViewHolder {
        ImageView imageView;
    }
}
