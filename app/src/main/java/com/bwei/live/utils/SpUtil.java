package com.bwei.live.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by zhang on 2017/2/21.
 * shareprefrence工具类
 */

public class SpUtil {
    private static SpUtil mSpUtil;
    private static SharedPreferences mSp;

    //私有化构造方法
    private SpUtil(Context context) {
        if (mSp == null) {
            mSp = context.getSharedPreferences("property", Activity.MODE_PRIVATE);
        }
    }

    //提供静态方法
    public static SpUtil instance(Context context) {
        if (mSpUtil == null) {
            synchronized (SpUtil.class) {
                if (mSpUtil == null) {
                    mSpUtil = new SpUtil(context);
                }
            }
        }
        return mSpUtil;
    }

    //提供设置
    public void setBoolean(String key, boolean flag) {
        mSp.edit().putBoolean(key, flag).commit();
    }

    public boolean getBoolean(String key, boolean defaultflag) {
        return mSp.getBoolean(key, defaultflag);
    }

    public void setString(String key, String str) {
        mSp.edit().putString(key, str).commit();
    }

    public String getString(String key, String defaultString) {
        return mSp.getString(key, defaultString);
    }
}
