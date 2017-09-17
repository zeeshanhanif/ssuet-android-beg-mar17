package com.demo.dynamiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.myListView);
        contacts = new ArrayList<>();
        for(int i=0;i<100;i++){
            contacts.add(new Contact("Contact "+i,"123456"+i));
        }
        MyListAdapter adapter = new MyListAdapter(this,contacts);
        listView.setAdapter(adapter);
    }
}
