package com.buckle.perf.perfectflatmate.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.BaseActivity;
import com.buckle.perf.perfectflatmate.R;

/**
 * Created by JJ on 2017-03-22.
 */

public class MateDetailActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mate_detail);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Finding Mates");

        setSupportActionBar(toolbar);
    }
}
