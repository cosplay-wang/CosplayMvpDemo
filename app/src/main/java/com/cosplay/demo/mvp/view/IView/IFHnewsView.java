package com.cosplay.demo.mvp.view.IView;

import com.cosplay.demo.mvp.bean.FHnews;

/**
 * Created by zhiwei.wang on 2017/3/23.
 */

public interface IFHnewsView {
    void showLoding();
    void hidingLoding();

    void Success(FHnews fHnews);
    void Failed(int falideType);

    void loding();
    void showContent();

}
