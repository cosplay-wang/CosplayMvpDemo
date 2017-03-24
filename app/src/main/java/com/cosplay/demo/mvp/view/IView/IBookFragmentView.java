package com.cosplay.demo.mvp.view.IView;

import com.cosplay.demo.mvp.bean.FHnews;
import com.cosplay.demo.mvp.bean.ZhiHuBook;

/**
 * Created by zhiwei.wang on 2017/3/23.
 */

public interface IBookFragmentView {
    void showLoding();
    void hidingLoding();

    void Success(ZhiHuBook zhiHuBook);
    void Failed(int falideType);

    void loding();
    void showContent();
}
