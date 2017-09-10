package com.demo.listviewcustomadapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 9/10/2017.
 */

public class MyAdapter extends ArrayAdapter<Contact> {
    ArrayList<Contact> contacts;
    public MyAdapter(@NonNull Context context,ArrayList<Contact> contacts) {
        super(context, 0,contacts);
        this.contacts = contacts;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View myListItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        ImageView contactIcon = (ImageView) myListItem.findViewById(R.id.contactIcon);
        TextView contactName = (TextView) myListItem.findViewById(R.id.contactName);
        TextView contactNumber = (TextView) myListItem.findViewById(R.id.contactNumber);
        Button contactCall = (Button) myListItem.findViewById(R.id.contactCall);
        final Contact contact = contacts.get(position);
        contactName.setText(contact.getName());
        contactNumber.setText(contact.getContactNo());
        contactIcon.setImageResource(contact.getImage());
        contactCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber(contact.getContactNo());
            }
        });
        return myListItem;
    }

    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getContext().getPackageManager()) != null) {
            getContext().startActivity(intent);
        }
    }
}
