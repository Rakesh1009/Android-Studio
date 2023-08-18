package com.example.studyplanner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

@SuppressWarnings("deprecation")
public class PagerAdapter extends FragmentPagerAdapter {

    private int numoftabs=0;

    public PagerAdapter(FragmentManager fm, int numoftabs){

        super(fm);
        this.numoftabs = numoftabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0:
                return new StudyPlanFragment();
            case 1:
                return new AssignmentFragment();
            case 2:
                return new ExamFragment();
            case 3:
                return new LectureFragment();

            default:
                return new StudyPlanFragment();
        }
    }
    @NonNull
    @Override
    public int getCount() {

        return numoftabs;
    }
}
