package com.cosplay.demo.mvp.app;

import android.app.Application;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.orhanobut.logger.Logger;

import timber.log.Timber;


/**
 * Created by zhiwei.wang on 2017/3/22.
 */

public class DdemoApplication extends Application {
    private static DdemoApplication myApp;
    private RequestQueue requestQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        this.myApp = this;
        initVolley();
      //  Logger.init("cosplayL");
        Timber.plant(new Timber.DebugTree());

    }

    public static DdemoApplication getApp(){
        return  myApp;
    }
    private void initVolley(){
        requestQueue = Volley.newRequestQueue(this);
    }
    public RequestQueue getRequestQueue(){
        return requestQueue;
    }


}

