package com.li.androidutils.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.li.androidutils.R;

import java.util.List;

/**
 * Created by long on 17-2-15.
 */

public class HomeAdapter extends BaseArrayListAdapter {


    private Context mContext;

    public HomeAdapter(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.data = list;
    }
    @Override
    public ViewHolder getViewHolder(View convertView, ViewGroup parent, int position) {
        ViewHolder mViewHolder = null;
        mViewHolder = ViewHolder.get(mContext, convertView, parent, R.layout.homeitem);
        TextView name = mViewHolder.findViewById(R.id.name);
        name.setText(data.get(position).toString());
        return mViewHolder;
    }
}
