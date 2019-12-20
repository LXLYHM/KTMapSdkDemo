package com.keytop.mapsdkdemo;

import android.app.Application;

import com.keytop.map.ktutils.KTUtils;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KTUtils.init(this);
    }
}
