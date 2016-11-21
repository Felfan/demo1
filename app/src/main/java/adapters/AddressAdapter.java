package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.awu.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import beans.Address;
import utils.LogUtils;

/**
 * Created by Administrator on 2016/11/9 0009.
 */
public class AddressAdapter extends BaseAdapter{
    private List<Map<String, Object>>list;
    private Context context=null;
//    ImageView img_true,img_false;

    public AddressAdapter(Context context) {
        this.context = context;
        this.list=new ArrayList<Map<String, Object>>();
    }

    public void setList(List<Map<String, Object>> list) {
        LogUtils.d("angle","-------setList:"+list.size());
        this.list=list;
        notifyDataSetChanged();

    }

    @Override
    public int getCount() {
        LogUtils.d("angle","------getCount:"+list.size());
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LogUtils.d("angle","---------------->getView:"+i);
        AddressViewHolder holder=null;
        if (view==null){
            holder=new AddressViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.mine_address_listview_item,viewGroup,false);
//            img_true= (ImageView) view.findViewById(R.id.address_listView_check_true);
//            img_false= (ImageView) view.findViewById(R.id.address_listView_check_false);
            holder.address= (TextView) view.findViewById(R.id.address_listview_address);
            holder.name= (TextView) view.findViewById(R.id.address_listview_name);
            holder.phone= (TextView) view.findViewById(R.id.address_listview_phone);
            holder.province= (TextView) view.findViewById(R.id.address_listview_province);
            view.setTag(holder);
        }else{
            holder= (AddressViewHolder) view.getTag();
        }
        holder.province.setText((String)list.get(i).get("province"));
        holder.name.setText((String) list.get(i).get("name"));
        holder.phone.setText((String) list.get(i).get("phone"));
        holder.address.setText((String) list.get(i).get("address"));
        return view;
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.address_listView_check_true:
//                img_true.setVisibility(View.INVISIBLE);
//                img_false.setVisibility(View.VISIBLE);
//                break;
//            case R.id.address_listView_check_false:
//                img_true.setVisibility(View.VISIBLE);
//                img_false.setVisibility(View.INVISIBLE);
//                break;
//        }
//    }


    class AddressViewHolder{
        TextView name,phone,address,province;
    }

}
