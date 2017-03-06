package com.bwei.live.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhang on 2017/2/21.
 */

public class Tutils {
    //短时间的吐司
    public static void showShort(Context context,String str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }

}
