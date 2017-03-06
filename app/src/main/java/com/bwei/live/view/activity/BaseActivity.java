package com.bwei.live.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.bwei.live.application.MyApplication;
import com.bwei.live.utils.DaiLogUtil;
import com.bwei.live.utils.HttpUtil;
import com.bwei.live.utils.NetUtils;
import com.bwei.live.utils.SpUtil;

/**
 * Created by zhang on 2017/2/21.
 */

public abstract class BaseActivity  extends FragmentActivity{
    protected HttpUtil mHttpUtil;
    protected MyApplication application;
    protected  Context mContext;
    protected DaiLogUtil mDialogUtil;
    protected SpUtil mSp;
    protected NetUtils mNetUtils;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(mContext == null){
            mContext = initContext();
        }
        if(application ==null){
            application = (MyApplication) getApplication();
        }
        if(mHttpUtil==null){
            mHttpUtil=application.getmHttpUtil();
        }
        if(mDialogUtil == null){
            mDialogUtil = new DaiLogUtil(mContext,false);
        }
        if(mSp == null){
            mSp=SpUtil.instance(mContext);
        }
        if(mNetUtils == null){
            mNetUtils = NetUtils.instance(mContext);
        }
        //初始化视图
        initView();
        //加载数据
        initDate();
        
    }
    protected abstract void initDate();

    protected abstract void initView();

    protected abstract  void addActivity();

    // 得到当前 Activity 的上下文
    protected abstract Context initContext();
    
}
