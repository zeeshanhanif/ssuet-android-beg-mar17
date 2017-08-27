package com.demo.spdp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.myTextView);
        textView.setBackgroundColor(getResources().getColor(R.color.my_button_bg));

        String myLabelText = getResources().getString(R.string.my_label);
        float size=getResources().getDimension(R.dimen.heading_size);
    }
}
