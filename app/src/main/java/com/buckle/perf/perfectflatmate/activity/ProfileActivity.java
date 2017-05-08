package com.buckle.perf.perfectflatmate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.BaseActivity;
import com.buckle.perf.perfectflatmate.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Joan on 2017-04-03.
 */

public class ProfileActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Profile Activity");

        setSupportActionBar(toolbar);
    }

    @OnClick(R.id.profile_edit_button)
    public void profileEditBtnClick(View v) {
        Intent intent = new Intent(this, ProfileEditActivity.class);
        startActivity(intent);

    }

//    @OnClick(R.id.answer_edit_button)
//    Button answer_edit_btn;

//    @OnClick(R.id.map_edit_button)
//    Button map_edit_btn;
}
