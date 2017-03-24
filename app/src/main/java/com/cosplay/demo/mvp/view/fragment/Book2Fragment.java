package com.cosplay.demo.mvp.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.cosplay.demo.mvp.R;
import com.cosplay.demo.mvp.adapter.ZHbooksAdapter;
import com.cosplay.demo.mvp.bean.ZhiHuBook;
import com.cosplay.demo.mvp.presenter.ZHBooksPresenter;
import com.cosplay.demo.mvp.view.IView.IBookFragmentView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Book2Fragment extends BaseFragment implements IBookFragmentView{

    ZHBooksPresenter zhBooksPresenter = new ZHBooksPresenter(this);
    @BindView(R.id.lv_fh_news)
    ListView lvFhNews;
    @BindView(R.id.bar_fhnews)
    ProgressBar barFhnews;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("dddddddddddd","11111111111eeeeeeeeeeeeeeeee");
        View view = inflater.inflate(R.layout.activity_fhnews, container, false);
        ButterKnife.bind(this, view);

        return view;
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
    public void Success(ZhiHuBook zhiHuBook) {
         lvFhNews.setAdapter(new ZHbooksAdapter(zhiHuBook.getBooks(),getContext()));
    }

    @Override
    public void Failed(int falideType) {

    }

    @Override
    public void loding() {

    }

    @Override
    public void showContent() {

    }

    @Override
    public void lazyLoad() {
        zhBooksPresenter.lodingZhihuBooks();






    }
}
