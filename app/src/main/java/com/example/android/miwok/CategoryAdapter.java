package com.example.android.miwok;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private final int pageCount=4;
    private String tabTitles[]=new String[] {"Numbers","Family","Colors","Phrases"};


    public CategoryAdapter(FragmentManager fm) {
        super(fm);
        // Required empty public constructor
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new NumbersFragment();
        else if (position==1)
            return new FamilyFragment();
        else if (position==2)
            return new ColorsFragment();
        else
            return new PhrasesFragment();
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
