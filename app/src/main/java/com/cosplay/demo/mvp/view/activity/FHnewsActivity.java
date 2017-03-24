package com.cosplay.demo.mvp.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.cosplay.demo.mvp.R;
import com.cosplay.demo.mvp.adapter.FHnewsAdapter;
import com.cosplay.demo.mvp.bean.FHnews;
import com.cosplay.demo.mvp.presenter.FHnewsProsenter;
import com.cosplay.demo.mvp.view.IView.IFHnewsView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FHnewsActivity extends AppCompatActivity implements IFHnewsView {
    FHnewsProsenter fHnewsProsenter = new FHnewsProsenter(this);
    FHnewsAdapter fHnewsAdapter ;
    List<FHnews.ItemBean> fHnewsList = new ArrayList<>();
    @BindView(R.id.lv_fh_news)
    ListView lvFhNews;
    @BindView(R.id.bar_fhnews)
    ProgressBar barFhnews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fhnews);
        ButterKnife.bind(this);
        fHnewsAdapter = new FHnewsAdapter(fHnewsList,this);
        lvFhNews.setAdapter(fHnewsAdapter);

        fHnewsProsenter.lodingFHnews();
        lvFhNews.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if(totalItemCount<=(firstVisibleItem+visibleItemCount)){
                    fHnewsProsenter.lodingFHnews();
                }
            }
        });
    }


    @Override
    public void showLoding() {
        barFhnews.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidingLoding() {
        barFhnews.setVisibility(View.GONE);
    }

    @Override
    public void Success(FHnews fHnews) {
        fHnewsList.addAll(fHnews.getItem());
        fHnewsAdapter.notifyDataSetChanged();


    }

    @Override
    public void Failed(int falideType) {
        Toast.makeText(getApplicationContext(),"失败",Toast.LENGTH_LONG).show();
    }

    @Override
    public void loding() {

    }

    @Override
    public void showContent() {

    }
}
