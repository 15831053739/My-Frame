package com.bwei.live.application;

import android.app.Activity;
import android.app.Application;

import com.bwei.live.utils.HttpUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2017/2/21.
 */

public class MyApplication extends Application {
    //工具类对象实例化
    protected HttpUtil mHttpUtil;
    //所有Activity集合
    private List<Activity> mActivityList;


    @Override
    public void onCreate() {
        super.onCreate();
        if(mHttpUtil == null){
            mHttpUtil = HttpUtil.getInstance();
        }
        if(mActivityList == null){
            mActivityList =new ArrayList<>();
        }
    }

    //初始化HttpUtil工具类
    public HttpUtil getmHttpUtil() {
        return mHttpUtil;
    }
    //添加所有Activity
    public void addActivity(Activity mActivity){
        mActivityList.add(mActivity);
    }
    //一键退出所有Acitivyt
    public void removeAll(){
        for(Activity m:mActivityList){
            if(!m.isFinishing()){
                m.finish();
            }
        }
    }
}
