package com.example.smbat_s.animalszoo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.views.MainView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MainView mainView = new MainView(getWindow().getDecorView(), this);
        mainView.loadDefaultFragment();
        mainView.loadBottomNavigationMenu();
    }
}
