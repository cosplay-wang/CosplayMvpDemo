package com.cosplay.demo.mvp.presenter;

import android.os.Handler;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.cosplay.demo.mvp.bean.Weather;
import com.cosplay.demo.mvp.view.IView.IWeatherView;
import com.google.gson.Gson;


/**
 * Created by zhiwei.wang on 2017/3/22.
 */

public class WeatherQueryPresenter {
    private IWeatherView iWeatherView;
    public  String WEATHER_URL = "http://v.juhe.cn/weather/index?key="+"c190c6bd72fdc7a2cdb38e660b8d2fd1&cityname=";
    public WeatherQueryPresenter(IWeatherView iWeatherView) {
        this.iWeatherView = iWeatherView;
    }
    public void startQueryWeather(final RequestQueue mQueue){
        iWeatherView.showLoding();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                StringRequest stringRequest = new StringRequest(WEATHER_URL + iWeatherView.getqueryContent(), new Response.Listener<String>() {
                    @Override
                    public void onResponse(String str) {
                        iWeatherView.Success();
                        Gson gson = new Gson();
                        String json = "{\"resultcode\": \"200\", \n" +
                                "    \"reason\": \"查询成功!\",  \"result\":\"西风\", \"error_code\": 0}";
                        Weather weather = gson.fromJson(str,Weather.class);
                        if(weather.getResultcode()=="200"||weather.getResultcode().equals("200")){
                            iWeatherView.showWeatherData(weather.getResult().getSk().getWind_direction());
                        }else{
                            iWeatherView.showWeatherData(weather.getResultcode()+weather.getReason());
                        }
                      //  iWeatherView.showWeatherData(str);
                        iWeatherView.hideLoding();

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                       iWeatherView.Failed(1);
                        iWeatherView.showWeatherData(volleyError.toString());
                        iWeatherView.hideLoding();
                    }
                });
                mQueue.add(stringRequest);
            }

        },0);
    }
}
