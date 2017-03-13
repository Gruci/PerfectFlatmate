package com.buckle.perf.perfectflatmate;

import android.app.Application;

import com.tsengvn.typekit.Typekit;


public class CustomFonts extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this, "Comfortaa-Regular.ttf"))
                .addBold(Typekit.createFromAsset(this, "Comfortaa-Bold.ttf"));
    }
}
