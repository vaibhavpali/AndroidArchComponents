package com.vaibhav.android.archcomponents;

import android.app.Application;

public class MyApplication extends Application {

    private AppExecutor mAppExecutor;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppExecutor = new AppExecutor();
    }
}
