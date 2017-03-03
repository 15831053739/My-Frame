package com.bwei.live.utils;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;

import com.bwei.live.R;

/**
 * Created by zhang on 2017/2/21.
 */

public class DaiLogUtil {
    private Context mContext;
    public static DaiLogUtil mDialogUtil;
    private Dialog mDialog;
    private boolean flag;
    private DaiLogUtil(Context mContext,boolean flag){
        this.mContext = mContext;
        this.flag = flag;
        initDailog();
    }
    //创建dialog
    private void initDailog() {
        if(mDialog == null){
            mDialog = new Dialog(mContext,R.style.Dialog);
        }
        View view = View.inflate(mContext,R.layout.progressbar_activity,null);
        // dialog弹出后会点击屏幕，dialog不消失；点击物理返回键dialog消失
        mDialog.setCanceledOnTouchOutside(true);
        //对话框是否可取消
        mDialog.setCancelable(flag);
        mDialog.setContentView(view);
        //设置Dialog位置
        Window window = mDialog.getWindow();
        window.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);

    }
    public static DaiLogUtil getInstance(Context mContext,boolean flag) {
        if (mDialogUtil == null) {
            synchronized (DaiLogUtil.class) {
                if (mDialogUtil == null) {
                    mDialogUtil = new DaiLogUtil(mContext,flag);
                }
            }
        }
        return mDialogUtil;
    }
    //dialog show方法
    public void mDialogShow(){
        if(mDialog!=null &&!mDialog.isShowing()){
            mDialog.show();
        }

    }

    //dialog隐藏方法
    public void mDialogHied(){
        if(mDialog!=null &&mDialog.isShowing()){
            mDialog.dismiss();
        }
    }
}
