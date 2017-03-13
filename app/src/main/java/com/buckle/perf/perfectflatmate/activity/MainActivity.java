package com.buckle.perf.perfectflatmate.activity;

import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.BaseActivity;
import com.buckle.perf.perfectflatmate.R;
import com.buckle.perf.perfectflatmate.fragment.NavigationDrawerFragment;


public class MainActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Finding Mates");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer,(DrawerLayout)findViewById(R.id.main_drawer_layout),toolbar);
    }

}
