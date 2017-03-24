package com.cosplay.demo.mvp.view.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.cosplay.demo.mvp.R;
import com.cosplay.demo.mvp.adapter.FragmentViewPagerAdapter;
import com.cosplay.demo.mvp.view.fragment.BaseFragment;
import com.cosplay.demo.mvp.view.fragment.Book2Fragment;
import com.cosplay.demo.mvp.view.fragment.BookFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ZhiHuActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    List<Fragment> fragmentList = new ArrayList<>();
    FragmentViewPagerAdapter fragmentViewPagerAdapter;
    @BindView(R.id.db_tablayout)
    TabLayout dbTablayout;
    @BindView(R.id.db_viewpager)
    ViewPager dbViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi_hu);
        ButterKnife.bind(this);
        fragmentManager = getSupportFragmentManager();
        BookFragment bookFragment = new BookFragment();
        Book2Fragment bookFragment2 = new Book2Fragment();
        fragmentList.add(bookFragment2);
        fragmentList.add(bookFragment);

        fragmentViewPagerAdapter = new FragmentViewPagerAdapter(fragmentManager,fragmentList);
        dbViewpager.setAdapter(fragmentViewPagerAdapter);
        dbTablayout.setTabMode(TabLayout.MODE_FIXED);
        dbTablayout.setupWithViewPager(dbViewpager);
        dbViewpager.setOffscreenPageLimit(1);
    }


}
