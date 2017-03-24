package com.cosplay.demo.mvp.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.cosplay.demo.mvp.R;
import com.cosplay.demo.mvp.presenter.WeatherQueryPresenter;
import com.cosplay.demo.mvp.view.IView.IWeatherView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShowMainActivity extends AppCompatActivity implements IWeatherView {
    WeatherQueryPresenter weatherQueryPresenter = new WeatherQueryPresenter(this);
    RequestQueue mQueue;
    @BindView(R.id.bt_query_weather)
    Button btQueryWeather;
    @BindView(R.id.et_query_weather)
    EditText etQueryWeather;
    @BindView(R.id.bar_query)
    ProgressBar barQuery;
    @BindView(R.id.yv_showmain)
    TextView yvShowmain;
    @OnClick(R.id.bt_query_weather)
    public void dealOnclick(){
        weatherQueryPresenter.startQueryWeather(mQueue);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_main);
        ButterKnife.bind(this);
        mQueue = Volley.newRequestQueue(this);
    }

    @Override
    public String getqueryContent() {
        return etQueryWeather.getText().toString();
    }

    @Override
    public void showLoding() {
        barQuery.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoding() {
        barQuery.setVisibility(View.GONE);
    }

    @Override
    public void Success() {
        Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Failed(int falideType) {
        Toast.makeText(getApplicationContext(),"falied",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showWeatherData(String weather) {
        yvShowmain.setText(weather);
    }
}
