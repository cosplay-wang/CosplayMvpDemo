package com.cosplay.demo.mvp.presenter;

import android.os.Handler;

import com.cosplay.demo.mvp.bean.User;
import com.cosplay.demo.mvp.view.IView.IUserLoginView;

/**
 * Created by zhiwei.wang on 2017/3/22.
 */

public class UserLoginPresenter {
    private IUserLoginView IUserLoginView;

    public UserLoginPresenter(IUserLoginView IUserLoginView) {
        this.IUserLoginView = IUserLoginView;
    }
    public void sratLogin(){
        if(IUserLoginView.getUserName()!=null&& IUserLoginView.getUserPassword()!=null
                && IUserLoginView.getUserName()!=""&& IUserLoginView.getUserPassword()!=""&&
                !IUserLoginView.getUserName().equals("")&&!IUserLoginView.getUserPassword().equals("")){
            IUserLoginView.showLoding();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    User user = new User(1, IUserLoginView.getUserName(), IUserLoginView.getUserPassword());
                    try {
                        Thread.sleep(2000);

                        if(true){
                            IUserLoginView.loginSuccess();
                        }else{
                            IUserLoginView.loginFailed(2);
                        }
                        IUserLoginView.hideLoding();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },1000);
        }else{
            IUserLoginView.loginFailed(1);
        }




    }
}
