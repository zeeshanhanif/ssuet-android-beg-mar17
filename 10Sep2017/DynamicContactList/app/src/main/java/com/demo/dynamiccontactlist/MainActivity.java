package com.demo.dynamiccontactlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList = (ListView) findViewById(R.id.myList);
        final ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(R.drawable.icon,"Hello First","123"));
        contacts.add(new Contact(R.drawable.icon,"Hello Second","456"));
        contacts.add(new Contact(R.drawable.icon,"Hello Third","789"));
        contacts.add(new Contact(R.drawable.icon,"Hello Fourth","012"));
        contacts.add(new Contact(R.drawable.icon,"Hello Fifth","345"));
        final MyAdapter adapter = new MyAdapter(this,contacts);
        myList.setAdapter(adapter);

        final EditText etContactName = (EditText)findViewById(R.id.etContactName);
        final EditText etContactNumber = (EditText)findViewById(R.id.etContactNumber);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etContactName.getText().toString();
                String number = etContactNumber.getText().toString();
                Contact contact = new Contact(R.mipmap.ic_launcher,name,number);
                contacts.add(contact);
                adapter.notifyDataSetChanged();
            }
        });

    }
}
