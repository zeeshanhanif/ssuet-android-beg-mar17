package com.demo.recyclerviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        if(DataHolder.students == null){
            DataHolder.students = new ArrayList<>();
        }

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        Button addBtn = (Button) findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataHolder.students.add(new Students(etName.getText().toString(),etPhone.getText().toString(),etEmail.getText().toString()));
                startActivity(new Intent(AddActivity.this,MainActivity.class));
            }
        });

    }
}
