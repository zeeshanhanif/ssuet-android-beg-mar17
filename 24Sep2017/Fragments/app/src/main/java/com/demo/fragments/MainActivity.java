package com.demo.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragmentContainerOne,new FragmentOne());
        fragmentTransaction.add(R.id.fragmentContainerTwo,new FragmentTwo());
        fragmentTransaction.add(R.id.fragmentContainerThree,new FragmentThree());
        fragmentTransaction.commit();

    }
}
