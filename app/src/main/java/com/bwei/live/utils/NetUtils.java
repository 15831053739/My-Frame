package com.bwei.live.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by zhang on 2017/3/4.
 */

public class NetUtils {
    private static NetUtils mNetUtils;
    private static Context context;
    private NetUtils(Context context){
        this.context = context;
    }
    //提供静态方法
    public static NetUtils instance(Context context) {
        if (mNetUtils == null) {
            synchronized (SpUtil.class) {
                if (mNetUtils == null) {
                    mNetUtils = new NetUtils(context);
                }
            }
        }
        return mNetUtils;
    }
    /**
     * 判断网络是否连接
     */
    public static boolean isConnected(){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager!=null){
            NetworkInfo info = connectivityManager.getActiveNetworkInfo();
            if(info!=null&&info.isConnected()){
                if(info.getState() == NetworkInfo.State.CONNECTED){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 判断是否wifi链接
     */
    public static boolean isWifi(){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
               if (cm == null)
                       return false;
             return cm.getActiveNetworkInfo().getType() == ConnectivityManager.TYPE_WIFI;
    }
}
