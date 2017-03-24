package com.cosplay.demo.mvp.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.cosplay.demo.mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zhiwei.wang on 2017/3/24.
 */

public abstract class BaseFragment extends Fragment {
    private boolean onViewCreate = false;
    private boolean onFirstLoad = true;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        onViewCreate = true;
        doLazyLoad();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        doLazyLoad() ;

    }
   private void doLazyLoad(){
       if(getUserVisibleHint()&&onViewCreate&&onFirstLoad){
           onFirstLoad = false;
           lazyLoad();
       }
   }
    /**
     * 延迟加载的方法
     */
    public abstract  void lazyLoad();
}
