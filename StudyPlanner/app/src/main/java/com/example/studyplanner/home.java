package com.example.studyplanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class home extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TabLayout tabLayout = getActivity().findViewById(R.id.tabBar);
        ViewPager viewPager = getActivity().findViewById(R.id.viewPager);
        int numoftabs;

        //numoftabs=tabLayout.getTabCount();
        //PagerAdapter pagerAdapter = new PagerAdapter(getActivity().getSupportFragmentManager(),numoftabs);

        //viewPager.setAdapter(pagerAdapter);

        //tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
        //    @Override
        //    public void onTabSelected(TabLayout.Tab tab) {
        //        viewPager.setCurrentItem(tab.getPosition());
        //   }

        // @Override
        //    public void onTabUnselected(TabLayout.Tab tab) {

        //    }

        //    @Override
        //    public void onTabReselected(TabLayout.Tab tab) {

        //    }
        //});
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }
}
