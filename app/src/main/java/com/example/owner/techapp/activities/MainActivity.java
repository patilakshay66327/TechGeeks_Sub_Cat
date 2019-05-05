package com.example.owner.techapp.activities;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

import com.example.owner.techapp.R;
import com.example.owner.techapp.adapter.SectionPageAdapter;
import com.example.owner.techapp.fragments.ArticleFragment;
import com.example.owner.techapp.fragments.VideoFragment;

public class MainActivity extends AppCompatActivity
{
    private static final String Tag = "MainActivity";

    private SectionPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag ,"Oncreate Starting");

        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    public void  setupViewPager(ViewPager viewPager)
    {
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragmnt(new ArticleFragment(),"Article");
        adapter.addFragmnt(new VideoFragment(),"Video");
        viewPager.setAdapter(adapter);
    }
}
