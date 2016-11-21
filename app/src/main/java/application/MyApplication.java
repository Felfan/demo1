package application;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import net.BaseRetorfit;

import org.xutils.x;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.im.android.api.JMessageClient;

import cn.smssdk.SMSSDK;


/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        BaseRetorfit.initRetrofit();
        Fresco.initialize(this);


        JPushInterface.setDebugMode(true);    // 设置开启日志,发布时请关闭日志
//        JPushInterface.init(this);     		// 初始化 JPush
        JMessageClient.init(getApplicationContext());

        //用户登录只有一次，这里写死了
        JMessageClient.login("103258", "103258", null);
        //JMessageClient.login("kefu", "103258", null);

        //用户的退出
/**
 * mProgressDialog = ProgressDialog.show(SettingMainActivity.this, "提示：", "正在加载中。。。");
 UserInfo myInfo = JMessageClient.getMyInfo();
 if (myInfo != null) {
 JMessageClient.logout();
 Toast.makeText(getApplicationContext(), "退出成功", Toast.LENGTH_SHORT).show();
 } else {
 Toast.makeText(SettingMainActivity.this, "退出失败", Toast.LENGTH_SHORT).show();
 mProgressDialog.dismiss();
 }
 */
        SMSSDK.initSDK(this,"18f4eb0d166fc","df74ae34b705eee3cde99f18484592eb");
    }

}

