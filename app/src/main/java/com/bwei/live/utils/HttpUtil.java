package com.bwei.live.utils;

import com.bwei.live.BaseUrl;
import com.bwei.live.model.Bean.HttpResult;
import com.bwei.live.view.interfaces.ApiService;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhang on 2017/2/20.3
 * retrofit请求方法
 */

public class HttpUtil {

    //接口对象
    public ApiService mApiService;
    //retrofit对象
    private Retrofit mRetrofit;
    private HttpUtil() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl.Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        mApiService = mRetrofit.create(ApiService.class);
    }

    static class MyHttpUtil {
        public static final HttpUtil instance = new HttpUtil();
    }

    public static HttpUtil getInstance() {
        return MyHttpUtil.instance;
    }

    public <T> void loadDateNet(Observable<HttpResult<T>> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .map(new Function<HttpResult<T>, T>() {
                    @Override
                    public T apply(HttpResult<T> tHttpResult) throws Exception {
                        return tHttpResult.getResult();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
