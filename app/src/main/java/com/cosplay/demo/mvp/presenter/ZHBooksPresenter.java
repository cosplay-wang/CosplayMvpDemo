package com.cosplay.demo.mvp.presenter;

import android.os.Handler;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.cosplay.demo.mvp.bean.FHnews;
import com.cosplay.demo.mvp.bean.ZhiHuBook;
import com.cosplay.demo.mvp.view.IView.IBookFragmentView;
import com.google.gson.Gson;

import static com.cosplay.demo.mvp.DdemoApplication.getApp;

/**
 * Created by zhiwei.wang on 2017/3/23.
 */

public class ZHBooksPresenter {
    private IBookFragmentView iBookFragmentView;
    public String ZHBOOKS_URL = "https://api.douban.com/v2/book/search?q=android&start=0&count=10";
    public ZHBooksPresenter(IBookFragmentView iBookFragmentView) {
        this.iBookFragmentView = iBookFragmentView;
    }
    public void  lodingZhihuBooks(){
        iBookFragmentView.showLoding();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                StringRequest stringRequest = new StringRequest(ZHBOOKS_URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Gson gson = new Gson();
                        ZhiHuBook zhihu = gson.fromJson(s, ZhiHuBook.class);
                        iBookFragmentView.Success(zhihu);
                        iBookFragmentView.hidingLoding();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        iBookFragmentView.Failed(1);
                    }
                });
                getApp().getRequestQueue().add(stringRequest);
            }
        },3000);

    }

}
