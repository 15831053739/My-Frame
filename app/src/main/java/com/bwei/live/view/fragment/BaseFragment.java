package com.bwei.live.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.live.application.MyApplication;
import com.bwei.live.utils.HttpUtil;
import com.bwei.live.utils.SpUtil;
import com.bwei.live.view.activity.MainActivity;

/**
 * Created by zhang on 2017/2/23.
 */

public abstract class BaseFragment extends Fragment {
    protected MainActivity mActivity;
    protected Context context;
    protected View mView;
    protected HttpUtil mHttpUtil;
    protected String TAG;
    protected SpUtil mSpUtil;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();
        context = getActivity();
        mHttpUtil = ((MyApplication) mActivity.getApplication()).getmHttpUtil();
        TAG="tag";
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = initView();
        //初始化组件
        initUI();
        //初始化数据
        initData();
        return mView;
    }
    public abstract void initData();

    public abstract void initUI();

    public abstract View initView();
}
