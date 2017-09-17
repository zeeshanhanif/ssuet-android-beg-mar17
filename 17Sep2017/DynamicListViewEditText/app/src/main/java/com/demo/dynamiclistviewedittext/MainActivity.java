package com.demo.dynamiclistviewedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
        final MyListAdapter adapter = new MyListAdapter(this,contacts);

        final EditText etName = (EditText)findViewById(R.id.etName);
        final EditText etPhone = (EditText)findViewById(R.id.etPhone);
        Button saveBtn = (Button) findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etNameStr = etName.getText().toString();
                String etPhoneStr = etPhone.getText().toString();
                Contact contact = new Contact(etNameStr,etPhoneStr);
                contacts.add(contact);
                adapter.notifyDataSetChanged();

            }
        });

        listView.setAdapter(adapter);
    }
}
