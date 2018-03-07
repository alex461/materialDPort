package com.example.alexander.miappalex.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.alexander.miappalex.fragment.HomeFragment;
import com.example.alexander.miappalex.fragment.ProfileFragment;
import com.example.alexander.miappalex.fragment.SearchFragment;

public class ViewAdapter extends FragmentStatePagerAdapter {
    private int numberOfTab;

    public ViewAdapter (FragmentManager fm, int numberOfTab) {
        super(fm);
        this.numberOfTab= numberOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SearchFragment();
            case 1:
                return new HomeFragment();
            case 2:
                return new ProfileFragment();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return numberOfTab;
    }
}