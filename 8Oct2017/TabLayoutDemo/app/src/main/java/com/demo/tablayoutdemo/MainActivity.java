package com.demo.tablayoutdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPagerLayout);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        ArrayList<Fragment> fragments = new ArrayList<>();
        ArrayList<String> tabTitles = new ArrayList<>();
        tabTitles.add("NEWS SECTION");
        tabTitles.add("WEATHER SECTION");
        tabTitles.add("SCROES SECTION");
        tabTitles.add("NEWS SECTION");
        tabTitles.add("WEATHER SECTION");
        tabTitles.add("SCROES SECTION");
        fragments.add(new NewsFragment());
        fragments.add(new WeatherSection());
        fragments.add(new ScoresSection());
        fragments.add(new NewsFragment());
        fragments.add(new WeatherSection());
        fragments.add(new ScoresSection());
        CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(getSupportFragmentManager(),fragments,tabTitles);
        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);

    }
}
