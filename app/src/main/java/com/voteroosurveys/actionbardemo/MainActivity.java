package com.voteroosurveys.actionbardemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsPagerAdapter mSectionsPagerAdapter; // this is the class we made
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_like);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_government);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_trending);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment());;
        adapter.addFragment(new Tab2Fragment());;
        adapter.addFragment(new Tab3Fragment());;
        viewPager.setAdapter(adapter);
    }
}
