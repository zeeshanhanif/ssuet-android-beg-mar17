package com.demo.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ishaq Hassan on 9/24/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView tvName;
    public MyViewHolder(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.tvName);
    }
}
