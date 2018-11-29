package com.it.yangkun;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.CrashUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;

/**
 * Created by yangk on 2018/11/28.
 */

public class App extends Application {
    private String TAG = getClass().getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        ARouter.init(this);
        CrashUtils.init(new CrashUtils.OnCrashListener() {
            @Override
            public void onCrash(Throwable e) {
                LogUtils.i(TAG, e.getMessage());
            }
        });
    }
}
