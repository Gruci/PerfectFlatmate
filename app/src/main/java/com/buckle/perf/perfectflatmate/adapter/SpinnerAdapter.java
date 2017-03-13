package com.buckle.perf.perfectflatmate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.R;
import com.buckle.perf.perfectflatmate.model.SpinnerModel;

import java.util.ArrayList;


public class SpinnerAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<SpinnerModel> lists;

    public SpinnerAdapter(Context context, ArrayList<SpinnerModel> lists){
        inflater = LayoutInflater.from(context);
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long)position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SpinnerModel current = lists.get(position);
        View view = inflater.inflate(R.layout.spinner_row,parent,false);
        TextView list = (TextView) view.findViewById(R.id.spinner_list);
        list.setText(current.getSpinnerText());

        return view;
    }
}
