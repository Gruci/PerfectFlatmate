package com.buckle.perf.perfectflatmate.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.BaseActivity;
import com.buckle.perf.perfectflatmate.R;
import com.tsengvn.typekit.TypekitContextWrapper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class IAmActivity extends BaseActivity{

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_am);
        ButterKnife.bind(this);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("I am ...");

        setSupportActionBar(toolbar);

    }

    @OnClick(R.id.next_btn)
    public void nextBtnClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
