package com.buckle.perf.perfectflatmate.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.BaseActivity;
import com.buckle.perf.perfectflatmate.R;
import com.tsengvn.typekit.TypekitContextWrapper;


public class IAmActivity extends BaseActivity{

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_am);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("I am ...");

        setSupportActionBar(toolbar);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }
}
