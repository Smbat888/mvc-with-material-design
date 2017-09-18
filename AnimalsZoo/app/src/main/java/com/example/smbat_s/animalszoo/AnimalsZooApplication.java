package com.example.smbat_s.animalszoo;


import android.app.Application;

import com.example.smbat_s.animalszoo.helpers.DataBaseHelper;

public class AnimalsZooApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataBaseHelper.initInstance(this);
    }
}
