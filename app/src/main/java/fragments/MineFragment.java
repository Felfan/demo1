package fragments;

;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.awu.AboutAwuActivity;
import com.awu.IM.IMActivity;
import com.awu.MainActivity;
import com.awu.MineCanUseActivity;
import com.awu.MineCanWithDrawalActivity;
import com.awu.MineFreeActivity;
import com.awu.MineNoGetActivity;
import com.awu.MineNotifyActivity;
import com.awu.MineOrderMessageActivity;
import com.awu.MineSettingActivity;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.awu.MineVipActivity;
import com.awu.MineWishActivity;
import com.awu.R;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;
;
import java.util.HashMap;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.gui.RegisterPage;

/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends Fragment implements View.OnClickListener {


    private View ret;
    @ViewInject(R.id.mine_setting)
    private ImageView setting;//设置
    @ViewInject(R.id.mine_wish)
    private LinearLayout mine_wish;//心愿单
    @ViewInject(R.id.mine_notify)
    private ImageView mine_notify;//右上角信封
    @ViewInject(R.id.mine_RadioButton_guid)
    private RadioButton guid;//全部订单
    @ViewInject(R.id.mine_RadioButton_pay)
    private RadioButton pay;//代付款
    @ViewInject(R.id.mine_RadioButton_send)
    private RadioButton send;//代发货
    @ViewInject(R.id.mine_RadioButton_accept)
    private RadioButton accept;//代收货
    @ViewInject(R.id.mine_awu)
    private RadioButton awu;//关于啊屋会员
    @ViewInject(R.id.mine_free)
    private RadioButton free;//免费开通会员
    @ViewInject(R.id.mine_vip)
    private RadioButton vip;//会员中心
    @ViewInject(R.id.mine_money_canUse)
    private LinearLayout canUse;//可使用布票
    @ViewInject(R.id.mine_money_noGet)
    private LinearLayout noGet;//未领取红包
    @ViewInject(R.id.mine_money_canWithdrawal)
    private LinearLayout canWithdrawal;//可提现余额
    @ViewInject(R.id.mine_customerSever)
    private LinearLayout customerSever;//联系客服
    @ViewInject(R.id.mine_phone)
    private TextView mine_phone;
    private SlidingMenu mSlidingMenu;

    public MineFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        x.view().inject(this,inflater,container);
        ret = inflater.inflate(R.layout.fragment_mine, container, false);
        //登陆的抽屉
//        initSlidingMenu();
        return ret;
    }

    private void initSlidingMenu() {
        mSlidingMenu = new SlidingMenu(getContext());
        mSlidingMenu.setMode(SlidingMenu.RIGHT);
        mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
        mSlidingMenu.setBehindWidth(getResources().getDisplayMetrics().widthPixels);
        mSlidingMenu.attachToActivity(getActivity(),SlidingMenu.SLIDING_WINDOW);
        mSlidingMenu.setMenu(R.layout.login_slidingmenu);
        mSlidingMenu.toggle();
        View view = mSlidingMenu.getMenu();
        Button login= (Button) view.findViewById(R.id.loginSlidMenu_login);
        ImageView back= (ImageView) view.findViewById(R.id.loginSlidMenu_back);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initRegister();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSlidingMenu.toggle();
                startActivity(new Intent(getContext(),MainActivity.class));
            }
        });

    }


    private void initRegister() {
        //打开注册页面
        final RegisterPage registerPage = new RegisterPage();
        registerPage.setRegisterCallback(new EventHandler() {
            public void afterEvent(int event, int result, Object data) {
// 解析注册结果
                if (result == SMSSDK.RESULT_COMPLETE) {
                    @SuppressWarnings("unchecked")
                    HashMap<String,Object> phoneMap = (HashMap<String, Object>) data;
                    String country = (String) phoneMap.get("country");
                    String phone = (String) phoneMap.get("phone");
                    Toast.makeText(getContext(), "country"+country, Toast.LENGTH_SHORT).show();
//                    mine_phone.setText(phone);
                        mSlidingMenu.toggle();

// 提交用户信息（此方法可以不调用）
//                    registerUser(country, phone);
                }
                if (result==SMSSDK.RESULT_ERROR){
                    SMSSDK.unregisterEventHandler(new EventHandler());
                    startActivity(new Intent(getContext(),MainActivity.class));
                }
            }
        });
        registerPage.show(getContext());
    }




    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        x.view().inject(this,this.getView());
        super.onViewCreated(view, savedInstanceState);
        initListerner();
    }


    private void initListerner() {
        setting.setOnClickListener(this);
        mine_wish.setOnClickListener(this);
        mine_notify.setOnClickListener(this);
        guid.setOnClickListener(this);
        pay.setOnClickListener(this);
        send.setOnClickListener(this);
        accept.setOnClickListener(this);
        awu.setOnClickListener(this);
        free.setOnClickListener(this);
        vip.setOnClickListener(this);
        canUse.setOnClickListener(this);
        noGet.setOnClickListener(this);
        canWithdrawal.setOnClickListener(this);
        customerSever.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent intent=null;
        Snackbar snackbar=null;
        switch (view.getId()){
            case R.id.mine_setting:
                snackbar=Snackbar.make(view,"左上角设置",Snackbar.LENGTH_SHORT);
                intent=new Intent(getContext(), MineSettingActivity.class);
                break;
            case R.id.mine_wish:
                snackbar=Snackbar.make(view,"心愿单",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineWishActivity.class);
                break;
            case R.id.mine_notify:
                snackbar=Snackbar.make(view,"右上角信封",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineNotifyActivity.class);
                break;
            case R.id.mine_RadioButton_guid:
                snackbar=Snackbar.make(view,"全部订单",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineOrderMessageActivity.class);
                intent.putExtra("order",0);
                break;
            case R.id.mine_RadioButton_pay:
                snackbar=Snackbar.make(view,"代付款",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineOrderMessageActivity.class);
                intent.putExtra("order",1);
                break;
            case R.id.mine_RadioButton_send:
                snackbar=Snackbar.make(view,"代发货",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineOrderMessageActivity.class);
                intent.putExtra("order",2);
                break;
            case R.id.mine_RadioButton_accept:
                snackbar=Snackbar.make(view,"代收货",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineOrderMessageActivity.class);
                intent.putExtra("order",3);
                break;
            case R.id.mine_awu:
                snackbar=Snackbar.make(view,"关于啊屋会员",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), AboutAwuActivity.class);
                break;
            case R.id.mine_free:
                snackbar=Snackbar.make(view,"免费开通会员",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineFreeActivity.class);
                break;
            case R.id.mine_vip:
                snackbar=Snackbar.make(view,"会员中心",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineVipActivity.class);
                break;
            case R.id.mine_money_canUse:
                snackbar=Snackbar.make(view,"可使用布票",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineCanUseActivity.class);
                break;
            case R.id.mine_money_noGet:
                snackbar=Snackbar.make(view,"未领取红包",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineNoGetActivity.class);
                break;
            case R.id.mine_money_canWithdrawal:
                snackbar=Snackbar.make(view,"可提现余额",Snackbar.LENGTH_SHORT);
                intent = new Intent(getContext(), MineCanWithDrawalActivity.class);
                break;
            case R.id.mine_customerSever:
                snackbar=Snackbar.make(view,"联系客服",Snackbar.LENGTH_SHORT);
                View view1=LayoutInflater.from(getContext()).inflate(R.layout.minefragment_dialog,null);
                final PopupWindow pop=new PopupWindow(view1,400,WindowManager.LayoutParams.WRAP_CONTENT,true);
                pop.setOutsideTouchable(true);
                pop.setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                pop.showAtLocation(awu, Gravity.CENTER,0,0);
                //窗体变暗
                WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
                lp.alpha=0.4f;
                getActivity().getWindow().setAttributes(lp);

                //popupwindow的关闭监听，能让窗体还原
                pop.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
                        lp.alpha=1f;
                        getActivity().getWindow().setAttributes(lp);
                    }
                });
                TextView cancle= (TextView) view1.findViewById(R.id.text_cancle);
                TextView net= (TextView) view1.findViewById(R.id.text_net);
                TextView phone= (TextView) view1.findViewById(R.id.text_phone);
                cancle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        pop.dismiss();
                    }
                });
                net.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar.make(view,"点击了在线客服",Snackbar.LENGTH_SHORT).show();
                        startActivity(new Intent(getContext(), IMActivity.class));
                    }
                });
                phone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar.make(view,"点击了拨打热线",Snackbar.LENGTH_SHORT).show();
                    }
                });
                break;
        }
//        snackbar.show();
        if(intent!=null){
            startActivity(intent);
        }

    }

}

