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
import com.cosplay.demo.mvp.bean.ZhiHuBook;

import java.util.List;

/**
 * Created by zhiwei.wang on 2017/3/23.
 */

public class ZHbooksAdapter extends BaseAdapter{

    List<ZhiHuBook.BooksBean> booksBeanList;
    Context context;

    public ZHbooksAdapter(List<ZhiHuBook.BooksBean> booksBeanList, Context context) {
        this.booksBeanList = booksBeanList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return booksBeanList==null?0:booksBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return booksBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ZHbooksAdapter.ViewHolder viewHolder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.fhnew_item_layout,null);
            viewHolder = new ZHbooksAdapter.ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ZHbooksAdapter.ViewHolder) convertView.getTag();
        }
        viewHolder.tv.setText(booksBeanList.get(position).getTitle());
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
