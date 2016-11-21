package adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.awu.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 房庆丰 on 2016/11/9.
 */
public class MyLvAdapter extends BaseAdapter {
    private final LayoutInflater mInflater;
    private List<String> mList = new ArrayList<>();
    //记录当前的位置
    private int mIndex = 0;

    public MyLvAdapter(Context context, List<String> list) {
        mInflater = LayoutInflater.from(context);
        mList = list;
    }

    public void setIndex(int index) {
        this.mIndex = index;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_title, parent, false);
            holder.title = (TextView) convertView.findViewById(R.id.textView_item);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //进行传值
        holder.title.setTextColor(Color.GRAY);
        holder.title.setBackgroundColor(Color.parseColor("#e0e0e0"));
        if (position == mIndex) {
            holder.title.setTextColor(Color.RED);
            holder.title.setBackgroundColor(Color.WHITE);
        }
        holder.title.setText(mList.get(position));

        return convertView;
    }

    static class ViewHolder {
        private TextView title;
    }
}
