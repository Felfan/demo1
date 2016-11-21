package com.awu;

import android.app.DatePickerDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ContentView(R.layout.activity_mine_setting_persion_message)
public class MineSettingPersionMessageActivity extends AppCompatActivity implements View.OnClickListener {

    //回退键
    @ViewInject(R.id.persionMessage_back)
    private ImageView persionMessage_back;
    //头像
    @ViewInject(R.id.persionMessage_head)
    private ImageView persionMessage_head;
    private PopupWindow popWin=null;
    private String mCameraPicName;
    //昵称
    @ViewInject(R.id.persionMessage_nickname_text)
    private TextView persionMessage_nickName_text;
    @ViewInject(R.id.persionMessage_nickname)
    private RelativeLayout persionMessage_nickName;
    //性别
    @ViewInject(R.id.persionMessage_sex)
    private RelativeLayout persionMessage_sex;
    @ViewInject(R.id.persionMessage_sex_text)
    private TextView persionMessage_sex_text;
    //生日
    @ViewInject(R.id.persionMessage_birthday)
    private RelativeLayout persionMessage_birthday;
    @ViewInject(R.id.persionMessage_birthday_text)
    private TextView persionMessage_birthday_text;
    //家庭身份
    @ViewInject(R.id.persionMessage_familyIdentity)
    private RelativeLayout persionMessage_familyIdentity;
    @ViewInject(R.id.persionMessage_familyIdentity_text)
    private TextView persionMessage_familyIdentity_text;

    //手机号
    @ViewInject(R.id.persionMessage_phoneNum_text)
    private TextView phoneNum;
    //会员
    @ViewInject(R.id.persionMessage_member_text)
    private TextView member;

    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
        initListerner();
    }

//    DatePickerDialog的选择监听，监听到底选择了哪一个
    private class ChoiceOnClickListener implements DialogInterface.OnClickListener {

        private int which = 0;
        @Override
        public void onClick(DialogInterface dialogInterface, int which) {
            this.which = which;
        }

        public int getWhich() {
            return which;
        }
    }

    private void initListerner() {
        persionMessage_back.setOnClickListener(this);
        persionMessage_head.setOnClickListener(this);
        persionMessage_nickName.setOnClickListener(this);
        persionMessage_sex.setOnClickListener(this);
        persionMessage_birthday.setOnClickListener(this);
        persionMessage_familyIdentity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        AlertDialog.Builder builder=null;
        switch (view.getId()){
            case R.id.persionMessage_back://左上角的回退键
                finish();
                break;
            case R.id.persionMessage_head://设置头像的监听
                showPopupWindow();//显示popupWindow
                break;
            case R.id.pop_camera://拍照
//                Toast.makeText(MineSettingPersionMessageActivity.this, "点击了拍照", Toast.LENGTH_SHORT).show();
                intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                mCameraPicName = System.currentTimeMillis() + ".jpg";
                File photofile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)+File.separator+ mCameraPicName);
                Uri uri= Uri.fromFile(photofile);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
                startActivityForResult(intent,2);
                popWin.dismiss();
                break;
            case R.id.pop_openPhoto://相册
//                Toast.makeText(MineSettingPersionMessageActivity.this, "点击了打开手机相册", Toast.LENGTH_SHORT).show();
                intent=new Intent(Intent.ACTION_GET_CONTENT,null);
                intent.setType("image/*");
                startActivityForResult(intent,0);
                popWin.dismiss();
                break;
            case R.id.pop_cancle:
                Toast.makeText(MineSettingPersionMessageActivity.this, "点击了取消", Toast.LENGTH_SHORT).show();
                popWin.dismiss();
                break;
            case R.id.persionMessage_nickname://昵称
//                Snackbar.make(view,"点击了昵称",Snackbar.LENGTH_SHORT).show();
                builder=new AlertDialog.Builder(this);
                builder.setTitle("修改昵称");
                View nickView=LayoutInflater.from(this).inflate(R.layout.view,null);
                builder.setView(nickView);
                final EditText editText= (EditText) nickView.findViewById(R.id.persionMessage_nickname_editText);
                builder.setPositiveButton("完成", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String nickname=editText.getText().toString();
                        persionMessage_nickName_text.setText(nickname);
                    }
                });
                builder.setNegativeButton("取消",null);
                AlertDialog dialog = builder.create();
                dialog.show();
                break;
            case R.id.persionMessage_sex://性别
//                Snackbar.make(view,"点击了性别",Snackbar.LENGTH_SHORT).show();
                builder=new AlertDialog.Builder(this);
                builder.setTitle("请选择性别");

                final ChoiceOnClickListener choiceItem=new ChoiceOnClickListener();
                builder.setSingleChoiceItems(R.array.sex,0,choiceItem);

                DialogInterface.OnClickListener listener=new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        int choiceWhice=choiceItem.getWhich();
                        String sexTxt=getResources().getStringArray(R.array.sex)[choiceWhice];
                        persionMessage_sex_text.setText(sexTxt);
                    }
                };
                builder.setPositiveButton("完成",listener);
                builder.setNegativeButton("取消",null);
                AlertDialog sexDialog = builder.create();
                sexDialog.show();
                break;
            case R.id.persionMessage_birthday://生日
//                Snackbar.make(view,"点击了生日",Snackbar.LENGTH_SHORT).show();
                Calendar calendar=Calendar.getInstance(Locale.CHINA);
                Date myDate=new Date();
                calendar.setTime(myDate);
                year=calendar.get(Calendar.YEAR);
                month=calendar.get(Calendar.MONTH);
                day=calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog data=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        year=i;
                        month=i1;
                        day=i2;
                        persionMessage_birthday_text.setText(year+"-"+(month+1)+"-"+day);
                    }
                },year,month,day);
                data.show();
                break;
            case R.id.persionMessage_familyIdentity://家庭身份
//                Snackbar.make(view,"点击了家庭身份",Snackbar.LENGTH_SHORT).show();
                builder=new AlertDialog.Builder(this);
                builder.setTitle("请选择家庭身份");
                final ChoiceOnClickListener choiceItems=new ChoiceOnClickListener();
                builder.setSingleChoiceItems(R.array.family,0,choiceItems);

                DialogInterface.OnClickListener listeners=new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        int choiceWhice=choiceItems.getWhich();
                        String family=getResources().getStringArray(R.array.family)[choiceWhice];
                        persionMessage_familyIdentity_text.setText(family);
                    }
                };
                builder.setPositiveButton("完成",listeners);
                builder.setNegativeButton("取消",null);
                AlertDialog familyDialog = builder.create();
                familyDialog.show();
                break;
        }
    }

    //获取拍照和相册中的图片
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){
            switch (requestCode){
                case 2:
                    Bitmap bitmap= BitmapFactory.decodeFile(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)+File.separator+mCameraPicName);
                    persionMessage_head.setImageBitmap(bitmap);
                    break;
                case 0:
                    ContentResolver resolver=getContentResolver();
                    Uri uri=data.getData();
                    try {
                        Bitmap photo=MediaStore.Images.Media.getBitmap(resolver,uri);
                        if (photo!=null){
                            persionMessage_head.setImageBitmap(photo);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

    //对popupwindow进行设置
    private void showPopupWindow() {
        View view= LayoutInflater.from(this).inflate(R.layout.persionmessage_popupwindow_view,null);
        popWin=new PopupWindow(view, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT,true);

        //点击popupWindow其他地方，popupWindow消失
        popWin.setOutsideTouchable(true);
        popWin.setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        //popupWindow获取焦点
        popWin.setFocusable(true);

        //popupwindow打开，窗体变暗
        WindowManager.LayoutParams lp=getWindow().getAttributes();
        lp.alpha=0.4f;
        getWindow().setAttributes(lp);

        //popupWindow消失的监听，让窗体还原
        popWin.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp=getWindow().getAttributes();
                lp.alpha=1f;
                getWindow().setAttributes(lp);
            }
        });

        TextView popcamera= (TextView) view.findViewById(R.id.pop_camera);
        TextView popOpenPhoto= (TextView) view.findViewById(R.id.pop_openPhoto);
        TextView popCancle= (TextView) view.findViewById(R.id.pop_cancle);
        popcamera.setOnClickListener(this);
        popOpenPhoto.setOnClickListener(this);
        popCancle.setOnClickListener(this);

        popWin.showAtLocation(persionMessage_back, Gravity.BOTTOM, 0, 0);
    }
}
