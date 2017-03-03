package com.bwei.live.view.interfaces;


import com.bwei.live.model.Bean.HttpResult;
import com.bwei.live.model.Bean.TestBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;


/**
 * Created by zhang on 2017/2/20.
 * 请求方法
 */

public interface ApiService {
    /**
     * 示例：
     * @FormUrlEncoded
     * @post("")
     * Observable<T> requsetDate(@FieldMap Map<String, String> map)
     */
    @FormUrlEncoded
    @POST("/toutiao/index")
    Observable<HttpResult<TestBean>> requestBean(@FieldMap Map<String,String> map);
}
