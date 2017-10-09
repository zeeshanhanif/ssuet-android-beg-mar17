package com.demo.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(R.id.newsSection,new NewsFragment());
        changeFragment(R.id.weatherSection,new WeatherSection());
        changeFragment(R.id.scoresSection,new ScoresSection());

    }

    public void changeFragment(int container, Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(container,fragment);
        fragmentTransaction.commit();
    }
}
