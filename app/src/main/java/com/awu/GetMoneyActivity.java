package com.awu;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_get_money)
public class GetMoneyActivity extends AppCompatActivity implements View.OnClickListener {
    @ViewInject(R.id.getMoney_back)
    private ImageView getMoney_back;
    @ViewInject(R.id.getMoney_explain)
    private TextView getMoney_explain;//提现详情
    @ViewInject(R.id.getMoney_edit1)
    private EditText getMoney_edit1;//提现金额
    @ViewInject(R.id.getMoney_edit2)
    private EditText getMoney_edit2;//登陆密码
    @ViewInject(R.id.getMoney_edit3)
    private EditText getMoney_edit3;//支付宝账号
    @ViewInject(R.id.getMoney_edit4)
    private EditText getMoney_edit4;//姓名

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        x.view().inject(this);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_get_money);
        initListerner();
    }

    private void initListerner() {
        getMoney_back.setOnClickListener(this);
        getMoney_explain.setOnClickListener(this);
    }

    public void btnOnClick(View view) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.getMoney_back:
                GetMoneyActivity.this.finish();
                break;
            case R.id.getMoney_explain:
                final AlertDialog dialog=new AlertDialog.Builder(this).create();

                dialog.show();
                Window window=dialog.getWindow();
                window.setContentView(R.layout.getmoney_dialog);
                Button ok= (Button) window.findViewById(R.id.ok);
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                break;
        }
    }
}
