package com.example.movie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        MoviesFragment moviesFragment = new MoviesFragment();
        Bundle bundle = new Bundle();

        if(position == 0){
            bundle.putString("GENRE", "Action");
        }else if(position == 1){

            bundle.putString("GENRE", "Comedy");

        }else if(position == 2){

            bundle.putString("GENRE", "Horror");

        }
        moviesFragment.setArguments(bundle);
        return moviesFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

