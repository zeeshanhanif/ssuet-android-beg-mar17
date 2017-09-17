package com.demo.recyclerviewsampleone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        ArrayList<Contact> contacts = new ArrayList<>();
        for(int i=0;i<100;i++){
            contacts.add(new Contact("Contact "+i,"123456"+i));
        }
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(contacts);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}
