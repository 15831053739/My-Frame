package com.bwei.live.view.activity;
//  ┏┓　　　┏┓
//┏┛┻━━━┛┻┓
//┃　　　　　　　┃
//┃　　　━　　　┃
//┃　┳┛　┗┳　┃
//┃　　　　　　　┃
//┃　　　┻　　　┃
//┃　　　　　　　┃
//┗━┓　　　┏━┛
//   ┃　　　┃   神兽保佑
//   ┃　　　┃   代码无BUG！
//   ┃　　　┗━━━┓
//   ┃　　　　　　　┣┓
//   ┃　　　　　　　┏┛
//   ┗┓┓┏━┳┓┏┛
//     ┃┫┫　┃┫┫
//     ┗┻┛　┗┻┛
import android.content.Context;
import android.content.Intent;
import android.database.Observable;
import android.os.Bundle;
import android.util.Log;

import com.bwei.live.R;
import com.bwei.live.model.Bean.TestBean;
import com.bwei.live.model.MyObserver;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<String,String> map = new HashMap<>();
        map.put("type","top");
        map.put("key","684c4adb4039d6a4e0ecedb81bbc3f7b");
        mHttpUtil.loadDateNet(mHttpUtil.mApiService.requestBean(map), new MyObserver<TestBean>() {
            @Override
            protected void onNextTo(TestBean testBean) {
                Log.d("tag", "onNextTo: "+testBean.getStat());
            }
        });
    }



    @Override
    protected void initDate() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void addActivity() {
        application.addActivity(this);
    }

    @Override
    protected Context initContext() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
