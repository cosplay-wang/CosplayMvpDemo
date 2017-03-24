package com.cosplay.demo.mvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cosplay.demo.mvp.R;
import com.cosplay.demo.mvp.bean.FHnews;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by zhiwei.wang on 2017/3/23.
 */

public class FHnewsAdapter extends BaseAdapter{
    List<FHnews.ItemBean> fHnewsList;
    Context context;

    public FHnewsAdapter(List<FHnews.ItemBean> fHnewsList, Context context) {
        this.fHnewsList = fHnewsList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return fHnewsList==null?0:fHnewsList.size();
    }

    @Override
    public Object getItem(int position) {
        return fHnewsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.fhnew_item_layout,null);
             viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tv.setText(fHnewsList.get(position).getTitle());
        return convertView;
    }
    class ViewHolder {
        TextView tv;
        ImageView iv;

        public ViewHolder(View view) {
            this.tv = (TextView) view.findViewById(R.id.tv_fhnews);
        }
    }
}
