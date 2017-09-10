package com.demo.listviewcustomadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList = (ListView) findViewById(R.id.myList);
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(R.drawable.icon,"Hello First","123"));
        contacts.add(new Contact(R.drawable.icon,"Hello Second","456"));
        contacts.add(new Contact(R.drawable.icon,"Hello Third","789"));
        contacts.add(new Contact(R.drawable.icon,"Hello Fourth","012"));
        contacts.add(new Contact(R.drawable.icon,"Hello Fifth","345"));
        MyAdapter adapter = new MyAdapter(this,contacts);
        myList.setAdapter(adapter);

    }
}
