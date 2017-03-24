package com.cosplay.demo.mvp;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

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
