package com.bwei.live.model;

import com.bwei.live.utils.DaiLogUtil;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by zhang on 2017/2/21.
 */

public abstract  class MyObserver<T> implements Observer<T> {
    private DaiLogUtil mDaiLogUtil;
    {
      mDaiLogUtil = DaiLogUtil.mDialogUtil;
    }
    @Override
    public void onSubscribe(Disposable d) {
        if(mDaiLogUtil!=null){
            mDaiLogUtil.mDialogShow();
        }
    }

    @Override
    public void onNext(T t) {
        onNextTo(t);
    }

    @Override
    public void onError(Throwable e) {
        if(mDaiLogUtil!=null){
            mDaiLogUtil.mDialogHied();
        }
    }

    @Override
    public void onComplete() {
       if(mDaiLogUtil!=null){
            mDaiLogUtil.mDialogHied();
        }
    }
    protected  abstract  void onNextTo(T t);
}
