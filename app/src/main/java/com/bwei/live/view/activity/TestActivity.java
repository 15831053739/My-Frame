package com.bwei.live.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.bwei.live.R;
import com.bwei.live.model.Bean.TestEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


/**
 * Created by zhang on 2017/2/21.
 */
public class TestActivity extends BaseActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void initDate() {
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void addActivity() {

    }

    @Override
    protected Context initContext() {
        return this;
    }


}
