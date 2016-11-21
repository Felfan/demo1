package adapters;

import android.content.ContentValues;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.awu.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import sql.MySQLiteOpenHelper;

/**
 * Created by Yizhongli on 2016/11/15.
 */
public class ShopCardListViewAdapter extends BaseAdapter {
    private Context mContext = null;
    private List<Map<String, Object>> mList = null;
    private MySQLiteOpenHelper mMySQLiteOpenHelper = null;

    public ShopCardListViewAdapter(Context context) {
        mContext = context;
        mMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        mList = new ArrayList<Map<String, Object>>();
    }

    public void setList(List<Map<String, Object>> list) {
        mList = list;
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
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        MyListener myListener = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            myListener = new MyListener(position);
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_shopcard_fragment, parent, false);
            viewHolder.itemImageView1 = (ImageView) convertView.findViewById(R.id.imageView_item_shopCardFragment_1);
            viewHolder.itemImageView2 = (ImageView) convertView.findViewById(R.id.imageView_item_shopCardFragment_2);
            viewHolder.picImageView = (ImageView) convertView.findViewById(R.id.imageView_item_shopCardFragment_pic);
            viewHolder.nameItem = (TextView) convertView.findViewById(R.id.textView_item_shopCardFragment_name);
            viewHolder.colorItem = (TextView) convertView.findViewById(R.id.textView_item_shopCardFragment_color);
            viewHolder.sizeItem = (TextView) convertView.findViewById(R.id.textView_item_shopCardFragment_size);
            viewHolder.priceItem = (TextView) convertView.findViewById(R.id.textView_item_shopCardFragment_price);
            viewHolder.deleteItem = (ImageView) convertView.findViewById(R.id.imageView_item_shopCardFragment_delete);
            viewHolder.addItem = (ImageView) convertView.findViewById(R.id.imageView_item_shopCardFragment_add);
            viewHolder.numTextView = (TextView) convertView.findViewById(R.id.textView_item_shopCardFragment_number);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.deleteItem.setOnClickListener(myListener);
        viewHolder.addItem.setOnClickListener(myListener);
        viewHolder.itemImageView1.setOnClickListener(myListener);
        viewHolder.itemImageView2.setOnClickListener(myListener);

        //设置数据
        Picasso.with(mContext).load(mList.get(position).get("goods_image").toString()).into(viewHolder.picImageView);
        viewHolder.nameItem.setText(mList.get(position).get("goods_name").toString());
        viewHolder.colorItem.setText("颜色:" + mList.get(position).get("color").toString());
        viewHolder.sizeItem.setText("尺码:" + mList.get(position).get("size").toString());
        viewHolder.priceItem.setText("￥" + mList.get(position).get("goods_price").toString());
        viewHolder.numTextView.setText(mList.get(position).get("number").toString());
        if (Integer.parseInt(mList.get(position).get("is_choose").toString()) == 1) {
            viewHolder.itemImageView1.setVisibility(View.GONE);
            viewHolder.itemImageView2.setVisibility(View.VISIBLE);
        } else {
            viewHolder.itemImageView1.setVisibility(View.VISIBLE);
            viewHolder.itemImageView2.setVisibility(View.GONE);
        }

        return convertView;
    }

    class ViewHolder {
        ImageView itemImageView1;
        ImageView itemImageView2;
        ImageView picImageView;
        TextView nameItem;
        TextView colorItem;
        TextView sizeItem;
        TextView priceItem;
        ImageView deleteItem;
        ImageView addItem;
        TextView numTextView;

    }

    private class MyListener implements View.OnClickListener {
        int position;

        public MyListener(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                //选择的监听
                case R.id.imageView_item_shopCardFragment_1:
                    ContentValues values1 = new ContentValues();
                    values1.put("is_choose", 1);
                    mMySQLiteOpenHelper.update("tb_shopping_card", values1, "_id=?", new String[]{mList.get(position).get("_id").toString()});
                    break;
                //不选择的监听
                case R.id.imageView_item_shopCardFragment_2:
                    ContentValues values2 = new ContentValues();
                    values2.put("is_choose", 0);
                    mMySQLiteOpenHelper.update("tb_shopping_card", values2, "_id=?", new String[]{mList.get(position).get("_id").toString()});
                    break;
                //数量减少的监听
                case R.id.imageView_item_shopCardFragment_delete:
                    int number = Integer.parseInt(mList.get(position).get("number").toString());
                    if (number > 1) {
                        ContentValues values = new ContentValues();
                        values.put("number", number - 1);
                        mMySQLiteOpenHelper.update("tb_shopping_card", values, "_id=?", new String[]{mList.get(position).get("_id").toString()});
                    }
                    break;
                //数量增加的监听
                case R.id.imageView_item_shopCardFragment_add:
                    int number2 = Integer.parseInt(mList.get(position).get("number").toString());
                    int storage = Integer.parseInt(mList.get(position).get("storage").toString());
                    if (number2 < storage) {
                        ContentValues values = new ContentValues();
                        values.put("number", number2 + 1);
                        mMySQLiteOpenHelper.update("tb_shopping_card", values, "_id=?", new String[]{mList.get(position).get("_id").toString()});
                    } else {
                        Toast.makeText(mContext, "已达到库存上限", Toast.LENGTH_LONG).show();
                    }
                    break;
            }
        }
    }
}

