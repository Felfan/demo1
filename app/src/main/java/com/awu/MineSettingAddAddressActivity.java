package com.awu;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import net.AddrXmlParser;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import beans.CityInfoModel;
import beans.DistrictInfoModel;
import beans.ProvinceInfoModel;
import myviews.WheelView;
import sql.MySQLiteOpenHelper;

@ContentView(R.layout.activity_mine_setting_add_address)
public class MineSettingAddAddressActivity extends AppCompatActivity implements View.OnClickListener {

    @ViewInject(R.id.addAddress_back)
    private ImageView back;//回退键
    @ViewInject(R.id.addAddress_name)
    private EditText name;//收货人姓名
    @ViewInject(R.id.addAddress_phoneNum)
    private EditText phoneNum;//手机号码
    @ViewInject(R.id.addAddress_chooseProvince)
    private RelativeLayout chooseProvince;//省市区
    @ViewInject(R.id.addAddress_province)
    private TextView province;//省市区textview
    @ViewInject(R.id.addAddress_completeAddress)
    private EditText completeAddress;//详细地址
    @ViewInject(R.id.addAddress_chacked_true)
    private  ImageView image_true;
    @ViewInject(R.id.addAddress_chacked_false)
    private ImageView image_false;

    private MySQLiteOpenHelper mSQLiteOpenHelper=null;

    protected boolean isDataLoaded = false;
    private PopupWindow addrPopWindow;
    private WheelView mProvincePicker;
    private WheelView mCityPicker;
    private WheelView mCountyPicker;
    private LinearLayout boxBtnCancel;
    private LinearLayout boxBtnOk;

    private View contentView;

    protected ArrayList<String> mProvinceDatas;
    protected Map<String, ArrayList<String>> mCitisDatasMap = new HashMap<String, ArrayList<String>>();
    protected Map<String, ArrayList<String>> mDistrictDatasMap = new HashMap<String, ArrayList<String>>();
    protected String mCurrentProviceName;
    protected String mCurrentCityName;
    protected String mCurrentDistrictName;
    private boolean isAddrChoosed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
        mSQLiteOpenHelper=new MySQLiteOpenHelper(this);
//        setContentView(R.layout.activity_mine_setting_add_address);
        initListerner();
    }

    private void initListerner() {
        back.setOnClickListener(this);
        image_true.setOnClickListener(this);
        image_false.setOnClickListener(this);
        initProviceSelectView();
        chooseProvince.setOnClickListener(this);
    }
    int isChoose=0;
    ContentValues values=new ContentValues();
    public void saveAddress(View view) {
        if (phoneNum.getText().toString().equals("")){
            Toast.makeText(MineSettingAddAddressActivity.this, "请输入正确的手机号码", Toast.LENGTH_SHORT).show();
        }else{
            String aName=name.getText().toString();
            String aPhone=phoneNum.getText().toString();
            String aProvice=province.getText().toString();
            String aAddress=completeAddress.getText().toString();
            values.put("name",aName);
            values.put("phone",aPhone);
            values.put("province",aProvice);
            values.put("address",aAddress);
            values.put("ischoose",isChoose);
            mSQLiteOpenHelper.insert("tb_address",null,values);
            Intent intent=new Intent(this,MineSettingAddressActivity.class);
            startActivity(intent);
        }
    }
    private void  initProviceSelectView(){

        contentView = LayoutInflater.from(this).inflate(R.layout.addr_picker, null);
        mProvincePicker = (WheelView) contentView.findViewById(R.id.province);
        mCityPicker = (WheelView) contentView.findViewById(R.id.city);
        mCountyPicker = (WheelView) contentView.findViewById(R.id.county);
        boxBtnCancel = (LinearLayout) contentView.findViewById(R.id.box_btn_cancel);
        boxBtnOk = (LinearLayout) contentView.findViewById(R.id.box_btn_ok);


        addrPopWindow = new PopupWindow(contentView,
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
        //addrPopWindow.setBackgroundDrawable(new ColorDrawable(0xffffff));
        addrPopWindow.setBackgroundDrawable(new BitmapDrawable());
        mProvincePicker.setOnSelectListener(new WheelView.OnSelectListener() {
            @Override
            public void endSelect(int id, String text) {
                String provinceText = mProvinceDatas.get(id);
                if (!mCurrentProviceName.equals(provinceText)) {
                    mCurrentProviceName = provinceText;
                    ArrayList<String> mCityData = mCitisDatasMap.get(mCurrentProviceName);
                    mCityPicker.resetData(mCityData);
                    mCityPicker.setDefault(0);
                    mCurrentCityName = mCityData.get(0);

                    ArrayList<String> mDistrictData = mDistrictDatasMap.get(mCurrentCityName);
                    mCountyPicker.resetData(mDistrictData);
                    mCountyPicker.setDefault(0);
                    mCurrentDistrictName = mDistrictData.get(0);
                }
            }

            @Override
            public void selecting(int id, String text) {
            }
        });

        mCityPicker.setOnSelectListener(new WheelView.OnSelectListener() {
            @Override
            public void endSelect(int id, String text) {
                ArrayList<String> mCityData = mCitisDatasMap.get(mCurrentProviceName);
                String cityText = mCityData.get(id);
                if (!mCurrentCityName.equals(cityText)) {
                    mCurrentCityName = cityText;
                    ArrayList<String> mCountyData = mDistrictDatasMap.get(mCurrentCityName);
                    mCountyPicker.resetData(mCountyData);
                    mCountyPicker.setDefault(0);
                    mCurrentDistrictName = mCountyData.get(0);
                }
            }

            @Override
            public void selecting(int id, String text) {

            }
        });

        mCountyPicker.setOnSelectListener(new WheelView.OnSelectListener() {
            @Override
            public void endSelect(int id, String text) {
                ArrayList<String> mDistrictData = mDistrictDatasMap.get(mCurrentCityName);
                String districtText = mDistrictData.get(id);
                if (!mCurrentDistrictName.equals(districtText)) {
                    mCurrentDistrictName = districtText;
                }
            }

            @Override
            public void selecting(int id, String text) {

            }
        });

        boxBtnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addrPopWindow.dismiss();
            }
        });

        boxBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isAddrChoosed = true;
                String addr = mCurrentProviceName + mCurrentCityName;
                if (!mCurrentDistrictName.equals("其他")) {
                    addr += mCurrentDistrictName;
                }
                province.setText(addr);
                // tvAddr.setTextColor(Color.parseColor("#000000"));
                addrPopWindow.dismiss();
            }
        });

        // 启动线程读取数据
        new Thread() {
            @Override
            public void run() {
                // 读取数据
                isDataLoaded = readAddrDatas();

                // 通知界面线程
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        mProvincePicker.setData(mProvinceDatas);
                        mProvincePicker.setDefault(0);
                        mCurrentProviceName = mProvinceDatas.get(0);

                        ArrayList<String> mCityData = mCitisDatasMap.get(mCurrentProviceName);
                        mCityPicker.setData(mCityData);
                        mCityPicker.setDefault(0);
                        mCurrentCityName = mCityData.get(0);

                        ArrayList<String> mDistrictData = mDistrictDatasMap.get(mCurrentCityName);
                        mCountyPicker.setData(mDistrictData);
                        mCountyPicker.setDefault(0);
                        mCurrentDistrictName = mDistrictData.get(0);
                    }
                });
            }
        }.start();
    }

    /**
     * 读取地址数据，请使用线程进行调用
     *
     * @return
     */
    protected boolean readAddrDatas() {
        List<ProvinceInfoModel> provinceList = null;
        AssetManager asset = getAssets();
        try {
            InputStream input = asset.open("province_data.xml");
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser parser = spf.newSAXParser();
            AddrXmlParser handler = new AddrXmlParser();
            parser.parse(input, handler);
            input.close();
            provinceList = handler.getDataList();
            if (provinceList != null && !provinceList.isEmpty()) {
                mCurrentProviceName = provinceList.get(0).getName();
                List<CityInfoModel> cityList = provinceList.get(0).getCityList();
                if (cityList != null && !cityList.isEmpty()) {
                    mCurrentCityName = cityList.get(0).getName();
                    List<DistrictInfoModel> districtList = cityList.get(0).getDistrictList();
                    mCurrentDistrictName = districtList.get(0).getName();
                }
            }
            mProvinceDatas = new ArrayList<String>();
            for (int i = 0; i < provinceList.size(); i++) {
                mProvinceDatas.add(provinceList.get(i).getName());
                List<CityInfoModel> cityList = provinceList.get(i).getCityList();
                ArrayList<String> cityNames = new ArrayList<String>();
                for (int j = 0; j < cityList.size(); j++) {
                    cityNames.add(cityList.get(j).getName());
                    List<DistrictInfoModel> districtList = cityList.get(j).getDistrictList();
                    ArrayList<String> distrinctNameArray = new ArrayList<String>();
                    DistrictInfoModel[] distrinctArray = new DistrictInfoModel[districtList.size()];
                    for (int k = 0; k < districtList.size(); k++) {
                        DistrictInfoModel districtModel = new DistrictInfoModel(districtList.get(k).getName(), districtList.get(k).getZipcode());
                        distrinctArray[k] = districtModel;
                        distrinctNameArray.add(districtModel.getName());
                    }
                    mDistrictDatasMap.put(cityNames.get(j), distrinctNameArray);
                }
                mCitisDatasMap.put(provinceList.get(i).getName(), cityNames);
            }
            return true;
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addAddress_back:
                finish();
                break;
            case R.id.addAddress_chacked_false:
                image_true.setVisibility(View.VISIBLE);
                image_false.setVisibility(View.GONE);
                break;
            case R.id.addAddress_chacked_true:
                image_true.setVisibility(View.GONE);
                image_false.setVisibility(View.VISIBLE);
                break;
            case R.id.addAddress_chooseProvince:
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                if (isDataLoaded)
                    addrPopWindow.showAtLocation(back,Gravity.CENTER, 0, 0);
                break;
        }
    }
}
