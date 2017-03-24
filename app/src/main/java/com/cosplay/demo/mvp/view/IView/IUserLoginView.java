package com.cosplay.demo.mvp.view.IView;

/**
 * Created by zhiwei.wang on 2017/3/22.
 */

public interface IUserLoginView {

    String getUserName();
    String getUserPassword();


    void showLoding();
    void hideLoding();

    void loginSuccess();
    void loginFailed(int falideType);

}
