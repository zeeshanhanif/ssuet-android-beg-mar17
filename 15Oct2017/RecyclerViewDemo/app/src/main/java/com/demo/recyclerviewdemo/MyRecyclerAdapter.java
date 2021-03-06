package com.demo.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 9/24/2017.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {
    ArrayList<Students> friends;

    public MyRecyclerAdapter(ArrayList<Students> friends) {
        this.friends = friends;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View myItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(myItemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Students student = friends.get(position);
        holder.tvName.setText(student.getName());
    }

    @Override
    public int getItemCount() {
        return friends.size();
    }
}
