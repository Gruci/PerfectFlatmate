package com.buckle.perf.perfectflatmate.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Spinner;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.BaseActivity;
import com.buckle.perf.perfectflatmate.R;
import com.buckle.perf.perfectflatmate.adapter.SpinnerAdapter;
import com.buckle.perf.perfectflatmate.model.SpinnerModel;

import java.util.ArrayList;


public class SettingActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Setting");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        initSearchSpinner();
    }

    private void initSearchSpinner() {
        Spinner spinner = (Spinner) findViewById(R.id.search_ppl_spinner);
        spinner.setAdapter(new SpinnerAdapter(this, getData()));
    }

    public static ArrayList<SpinnerModel> getData() {
        ArrayList<SpinnerModel> lists = new ArrayList<>();
        String[] search = {"모두표시", "학생", "일반인"};
        for (int i = 0; i < search.length; i++){
            SpinnerModel current = new SpinnerModel();
            current.setSpinnerText(search[i]);
            lists.add(current);
        }
        return lists;
    }
}
