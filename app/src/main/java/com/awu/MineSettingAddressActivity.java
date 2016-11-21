package com.awu;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.List;
import java.util.Map;

import adapters.AddressAdapter;
import interfaces.DataObserver;
import sql.MySQLiteOpenHelper;
import utils.LogUtils;

@ContentView(R.layout.activity_mine_setting_address)
public class MineSettingAddressActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.address_back)
    private ImageView address_back;//返回键
    @ViewInject(R.id.address_listView)
    private ListView mListView;//
    @ViewInject(R.id.address_add)
    private TextView add;
    private MySQLiteOpenHelper mSQLiteOpenHelper=null;
    private AddressAdapter mAdapter=null;
    private ImageView delete,write,img_true,img_false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mine_setting_address);
        mSQLiteOpenHelper=new MySQLiteOpenHelper(this);
        initListerner();
        initListView();
        initRegister();
    }

    private void initRegister() {

        mSQLiteOpenHelper.registerObserver(new DataObserver() {
            @Override
            public void onDataChanged() {
                List<Map<String, Object>> list = mSQLiteOpenHelper.selectList("select * from tb_address", new String[]{});
                LogUtils.d("angle","----------"+list.get(0).get("name").toString());
                mAdapter.setList(list);
            }
        });
    }

    private void initListView() {
        LogUtils.d("angle","------------listView");
        mAdapter=new AddressAdapter(MineSettingAddressActivity.this);
        mListView.setAdapter(mAdapter);
        List<Map<String, Object>> list = mSQLiteOpenHelper.selectList("select * from tb_address", new String[]{});
//        LogUtils.d("angle","----------"+list.get(0).get("name").toString());
        mAdapter.setList(list);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                img_true= (ImageView) view.findViewById(R.id.address_listView_check_true);
                img_false= (ImageView) view.findViewById(R.id.address_listView_check_false);
                write= (ImageView) view.findViewById(R.id.address_listView_write);
                delete= (ImageView) view.findViewById(R.id.address_listView_delete);
                img_false.setOnClickListener(MineSettingAddressActivity.this);
                img_true.setOnClickListener(MineSettingAddressActivity.this);
                write.setOnClickListener(MineSettingAddressActivity.this);
                delete.setOnClickListener(MineSettingAddressActivity.this);
            }
        });
    }

    private void initListerner() {
        address_back.setOnClickListener(this);
        add.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.address_back://左上角的回退键
                finish();
                break;
            case R.id.address_add://添加按钮
                Intent intent=new Intent(this,MineSettingAddAddressActivity.class);
                startActivity(intent);
                break;
            case R.id.address_listView_write:
                Snackbar.make(view,"点击了编辑按钮",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.address_listView_delete:
                Snackbar.make(view,"点击了删除按钮",Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.address_listView_check_true:
                img_true.setVisibility(View.GONE);
                img_false.setVisibility(View.VISIBLE);
                break;
            case R.id.address_listView_check_false:
                img_true.setVisibility(View.VISIBLE);
                img_false.setVisibility(View.GONE);
                break;
        }
    }
}
