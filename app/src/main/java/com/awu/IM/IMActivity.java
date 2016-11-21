package com.awu.IM;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.awu.R;

import adapters.MyIMListAdapter;
import beans.ClientItem;
import beans.ServerItem;
import cn.jpush.android.api.JPushInterface;
import cn.jpush.im.android.api.JMessageClient;
import cn.jpush.im.android.api.content.MessageContent;
import cn.jpush.im.android.api.content.TextContent;
import cn.jpush.im.android.api.enums.ContentType;
import cn.jpush.im.android.api.model.Conversation;
import cn.jpush.im.android.api.model.Message;
import cn.jpush.im.api.BasicCallback;

public class IMActivity extends AppCompatActivity {
    //对方的name
    private String name = "kefu";
    //要发送的文本内容
    private String text;
    private ListView mListView;
    private EditText mEditText;
    private MyIMListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im);

        init();

        initWidget();

        createThread();

    }

    private void initWidget() {
        mEditText = (EditText) this.findViewById(R.id.editText_IM);
        mListView = (ListView) this.findViewById(R.id.listView_IM);
        mAdapter = new MyIMListAdapter(this);
        mListView.setAdapter(mAdapter);
    }

    private void init() {
        // 初始化 JPush。
        JPushInterface.init(getApplicationContext());
        //进入会话，状态栏不再进行展示
        JMessageClient.enterSingleConversation(name, null);
    }

    private boolean isForeground = true;

    private void createThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (isForeground) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    IMActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            getInfo();
                        }
                    });
                }
            }
        }).start();

    }

    @Override
    protected void onResume() {
        isForeground = true;
        JPushInterface.onResume(this);
        super.onResume();
    }


    @Override
    protected void onPause() {
        isForeground = false;
        JPushInterface.onPause(this);
        super.onPause();
    }

    private int lastId = 0;
    public void getInfo() {
        Conversation conversation = JMessageClient.getSingleConversation(name, null);
        if (conversation == null) return;
        /**=================     获取会话中的属性    =================*/
        Message latestMessage = conversation.getLatestMessage();
        int id = latestMessage.getId();
        if (lastId == id) {
            return;
        }
        if (latestMessage != null) {
            if (!latestMessage.getFromUser().getUserName().equals(name)) {
                return;
            }
            MessageContent content = latestMessage.getContent();
            if (content.getContentType() == ContentType.text) {
                TextContent stringExtra = (TextContent) content;
                //stringExtra.getText()---->得到发送过来的内容
                ServerItem item = new ServerItem();
                item.setInfo(stringExtra.getText());
                mAdapter.addItem(item);
            }
        }
        lastId = id;
    }

    //发送按钮被点击了
    public void onClick(View view) {
        text = mEditText.getText().toString();
        if (TextUtils.isEmpty(text)) {
            //Toast.makeText(this, "请输入内容", Toast.LENGTH_SHORT).show();
            return;
        }
        Message message = JMessageClient.createSingleTextMessage(name, null, text);
        message.setOnSendCompleteCallback(new BasicCallback() {
            @Override
            public void gotResult(int i, String s) {
                if (i == 0) {
                    //Log.i("flag", "JMessageClient.createSingleTextMessage" + ", responseCode = " + i + " ; LoginDesc = " + s);
                    //Toast.makeText(getApplicationContext(), "发送成功", Toast.LENGTH_SHORT).show();
                    mEditText.setText("");
                    ClientItem item = new ClientItem();
                    item.setInfo(text.toString());
                    mAdapter.addItem(item);
                } else {
                    // Log.i("flag", "JMessageClient.createSingleTextMessage" + ", responseCode = " + i + " ; LoginDesc = " + s);
                    Toast.makeText(getApplicationContext(), "发送失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //发送动作建议放在callback之后
        JMessageClient.sendMessage(message);
    }

    public void back(View view) {
        //调用exitConversation之后，将恢复对应的通知栏提示
        JMessageClient.exitConversation();
        this.finish();
    }
}
