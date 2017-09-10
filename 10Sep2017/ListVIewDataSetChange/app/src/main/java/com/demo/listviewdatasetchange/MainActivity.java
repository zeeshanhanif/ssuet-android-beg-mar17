package com.demo.listviewdatasetchange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etContactName = (EditText) findViewById(R.id.etContactName);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        ListView myList = (ListView) findViewById(R.id.myList);
        final ArrayList<String> myContacts = new ArrayList<>();
        myContacts.add("String 1");
        myContacts.add("String 2");
        myContacts.add("String 3");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,myContacts
        );
        myList.setAdapter(adapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String contactName = etContactName.getText().toString();
                myContacts.add(contactName);
                adapter.notifyDataSetChanged();
            }
        });

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,myContacts.get(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
