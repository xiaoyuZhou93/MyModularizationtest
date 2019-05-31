package com.example.modulelib;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Author: zhouXiaoyu
 * @CreateDate: 2019/5/31
 * @CreateTime: 下午 2:17
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
        ARouter.openDebug();
        ARouter.openLog();

    }
}
