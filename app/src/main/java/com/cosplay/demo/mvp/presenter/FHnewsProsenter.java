package com.cosplay.demo.mvp.presenter;

import android.os.Handler;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.cosplay.demo.mvp.bean.FHnews;
import com.cosplay.demo.mvp.view.IView.IFHnewsView;
import com.google.gson.Gson;

import static com.cosplay.demo.mvp.app.DdemoApplication.getApp;

/**
 * Created by zhiwei.wang on 2017/3/23.
 */

public class FHnewsProsenter {
    private IFHnewsView ifHnewsView;
    public String FHNEWS_URL = "http://api.irecommend.ifeng.com/irecommendList.php?userId=359908051392059&count=15&gv=5.5.3" +
            "&av=5.5.3&uid=359908051392059&deviceid=359908051392059&proid=ifengnews&os=android_22&df=" +
            "androidphone&vt=5&screen=1600x2560&publishid=2024&nw=wifi&city=%E5%8C%97%E4%BA%AC%E5%B8%82&province=%E5%8C%97%E4%BA%AC%E5%B8%82&lastDoc=,,,";

    public FHnewsProsenter(IFHnewsView ifHnewsView) {
        this.ifHnewsView = ifHnewsView;
    }
    public void  lodingFHnews(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                StringRequest stringRequest = new StringRequest(FHNEWS_URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Gson gson = new Gson();
                        FHnews fHnews = gson.fromJson(s, FHnews.class);
                        ifHnewsView.Success(fHnews);
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        ifHnewsView.Failed(1);
                    }
                });
                getApp().getRequestQueue().add(stringRequest);
            }
        },0);

    }
}
