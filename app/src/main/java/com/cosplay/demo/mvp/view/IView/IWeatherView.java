package com.cosplay.demo.mvp.view.IView;

import com.cosplay.demo.mvp.bean.Weather;

/**
 * Created by zhiwei.wang on 2017/3/22.
 */

public interface IWeatherView {

    String getqueryContent();
    void showWeatherData(String weather);
    void showLoding();
    void hideLoding();

    void Success();
    void Failed(int falideType);

}
