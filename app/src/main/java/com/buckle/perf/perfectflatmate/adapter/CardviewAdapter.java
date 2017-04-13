package com.buckle.perf.perfectflatmate.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.R;
import com.buckle.perf.perfectflatmate.model.CardviewModel;
import com.liulishuo.magicprogresswidget.MagicProgressCircle;

import java.util.Collections;
import java.util.List;

/**
 * Created by Joan on 2017-04-10.
 */

public class CardviewAdapter extends RecyclerView.Adapter<CardviewAdapter.CardviewHolder> {

    private LayoutInflater inflater;
    private List<CardviewModel> data = Collections.emptyList();

    float mPercent;

    public CardviewAdapter (Context context, List<CardviewModel> data){
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public CardviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.mate_cardview,parent,false);
        CardviewHolder holder = new CardviewHolder(view);


        return holder;
    }


    @Override
    public void onBindViewHolder(CardviewHolder holder, int position) {

    }

    @Override
    public int getItemCount() { return data.size(); }

    class CardviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView profileCardImage;
        TextView profileName;
        TextView profileIntro;
        TextView matchingPercent;
        MagicProgressCircle matchingPercentCircle;

        public CardviewHolder(View itemView) {
            super(itemView);
            profileCardImage = (ImageView) itemView.findViewById(R.id.profile_card_image);
            profileName = (TextView) itemView.findViewById(R.id.profile_name);
            profileIntro = (TextView) itemView.findViewById(R.id.profile_intro);
            matchingPercent = (TextView) itemView.findViewById(R.id.matching_percent_num);
            matchingPercentCircle = (MagicProgressCircle) itemView.findViewById(R.id.matching_percent_circle);
//            String mPer = matchingPercent.getText().toString();
//            mPercent = Float.valueOf(mPer);
//            matchingPercentCircle.setSmoothPercent(mPercent);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
