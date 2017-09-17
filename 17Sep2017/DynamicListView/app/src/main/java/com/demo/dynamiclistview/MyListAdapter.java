package com.demo.dynamiclistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 9/17/2017.
 */

public class MyListAdapter extends ArrayAdapter<Contact> {
    ArrayList<Contact> contacts;
    public MyListAdapter(@NonNull Context context,ArrayList<Contact> contacts) {
        super(context, 0,contacts);
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_layout,parent,false);
        }else{
            view = convertView;
        }
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView tvPhone = (TextView) view.findViewById(R.id.tvNumber);
        Contact contact = contacts.get(position);
        tvName.setText(contact.getName());
        tvPhone.setText(contact.getPhone());
        return view;
    }
}
