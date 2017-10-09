package com.demo.viewpagerdemoone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 10/8/2017.
 */

public class CustomViewPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragments;
    public CustomViewPagerAdapter(FragmentManager fm,ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
