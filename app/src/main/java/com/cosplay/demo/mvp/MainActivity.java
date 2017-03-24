package com.cosplay.demo.mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.cosplay.demo.mvp.presenter.UserLoginPresenter;
import com.cosplay.demo.mvp.view.IView.IUserLoginView;
import com.cosplay.demo.mvp.view.activity.FHnewsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements IUserLoginView {
    UserLoginPresenter userLoginPresenter = new UserLoginPresenter(this);
    @BindView(R.id.tv_login_name)
    TextView tvLoginName;
    @BindView(R.id.et_login_name)
    EditText etLoginName;
    @BindView(R.id.tv_login_pw)
    TextView tvLoginPw;
    @BindView(R.id.et_login_pw)
    EditText etLoginPw;
    @BindView(R.id.tv_srat_login)
    TextView tvSratLogin;
    @BindView(R.id.bar_login)
    ProgressBar barLogin;

    @OnClick(R.id.tv_srat_login)
    public void startLogin() {
        userLoginPresenter.sratLogin();
    }

    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public String getUserName() {
        return etLoginName.getText().toString();
    }

    @Override
    public String getUserPassword() {
        return etLoginPw.getText().toString();
    }

    @Override
    public void showLoding() {
        barLogin.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoding() {
        barLogin.setVisibility(View.GONE);
    }

    @Override
    public void loginSuccess() {

        Toast.makeText(getApplicationContext(), "login_success", Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, FHnewsActivity.class));
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
        this.finish();
    }

    @Override
    public void loginFailed(int faliedType) {
        if(faliedType == 1){
            Toast.makeText(getApplicationContext(), "用户名和密码不能为空", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "login_falied", Toast.LENGTH_LONG).show();
        }

    }
}
