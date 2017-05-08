package com.buckle.perf.perfectflatmate.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.buckle.perf.perfectflatmate.R;
import com.buckle.perf.perfectflatmate.activity.MessageActivity;
import com.buckle.perf.perfectflatmate.activity.ProfileActivity;
import com.buckle.perf.perfectflatmate.activity.SettingActivity;
import com.buckle.perf.perfectflatmate.model.NavigationModel;

import java.util.Collections;
import java.util.List;


public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.NavViewHolder> {

    private LayoutInflater inflater;
    private List<NavigationModel> data = Collections.emptyList();

    public NavigationAdapter (Context context, List<NavigationModel> data){
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public NavViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.navigation_row,parent,false);
        NavViewHolder holder = new NavViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(NavViewHolder holder, int position) {
        NavigationModel current = data.get(position);
        holder.navSetting.setText(current.getNavSetting());
        holder.navIcon.setImageResource(current.getNavIcon());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class NavViewHolder extends RecyclerView.ViewHolder{
        TextView navSetting;
        ImageView navIcon;

        public NavViewHolder(View itemView) {
            super(itemView);
            navSetting = (TextView) itemView.findViewById(R.id.setting_text);
            navSetting.setTypeface(navSetting.getTypeface(), Typeface.BOLD);
            navIcon = (ImageView) itemView.findViewById(R.id.setting_icon);

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent;
                    int position = getAdapterPosition();

                    switch (position){
                        case 0:
                            intent = new Intent(view.getContext(), ProfileActivity.class);
                            view.getContext().startActivity(intent);
                            break;
                        case 1:
                            intent = new Intent(view.getContext(), MessageActivity.class);
                            view.getContext().startActivity(intent);
                            break;
                        case 2:
                            intent = new Intent(view.getContext(), SettingActivity.class);
                            view.getContext().startActivity(intent);
                            break;
                    }
                }
            });
        }
    }
}
