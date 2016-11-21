package adapters;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.awu.DisplayActivity;
import com.awu.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import beans.Item_draw;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class MyGvAdapter extends BaseAdapter implements View.OnClickListener {
    private Context mContext;
    private final LayoutInflater mLayoutInflater;
    private List<Item_draw> mList;

    public MyGvAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
        mList = new ArrayList<>();
    }

    public void setList(List<Item_draw>list) {
        this.mList = list;
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
            convertView = mLayoutInflater.inflate(R.layout.grid_item, parent, false);
            holder = new ViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.text_grid);
            holder.mImageView = (ImageView) convertView.findViewById(R.id.image_grid);
            holder.mLinearLayout = (LinearLayout) convertView.findViewById(R.id.linear_gridItem);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //进行赋值
        Item_draw itemDraw = mList.get(position);
        holder.title.setText(itemDraw.getTitle());
        holder.mImageView.setTag(itemDraw.getId());
      //  holder.mImageView.setOnClickListener(this);
        holder.mLinearLayout.setOnClickListener(this);
        Picasso.with(mContext)
                .load(itemDraw.getImageUrl())
                .placeholder(R.drawable.iv_details_loading)
                .error(R.drawable.iv_details_loading)
                .into(holder.mImageView);
        return convertView;
    }

    //根据点击的具体条目跳到具体的展示页面
    @Override
    public void onClick(View v) {
        String id = (String) ((ViewGroup) v).getChildAt(0).getTag();
        Snackbar.make(v, "商品的id为--" + id, Snackbar.LENGTH_SHORT).show();
        String title = ((TextView) (((ViewGroup) v).getChildAt(1))).getText().toString();
        String url = "http://console.awu.cn/api/index.php?act=goods&op=goodsList_byBrand";
        Intent intent = new Intent(mContext, DisplayActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("url", url);
        mContext.startActivity(intent);
    }

    static class ViewHolder {
        private LinearLayout mLinearLayout;
        private TextView title;
        private ImageView mImageView;
    }
}