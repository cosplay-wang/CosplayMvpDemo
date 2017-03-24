package com.cosplay.demo.mvp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by zhiwei.wang on 2017/3/23.
 */

public class FragmentViewPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;

    public FragmentViewPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }



    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return  "搜图书";
        }else {
            return "搜其他";
        }
    }
}
