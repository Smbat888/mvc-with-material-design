package com.example.smbat_s.animalszoo.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.fragments.AnimalsFragment;
import com.example.smbat_s.animalszoo.fragments.EventsFragment;
import com.example.smbat_s.animalszoo.fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.main_container, new AnimalsFragment()).commit();
        initBottomNavigationView();
    }

    private void initBottomNavigationView() {
        final BottomNavigationView bottomNavigation = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigation.inflateMenu(R.menu.bottom_menu);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.action_search:
                        fragment = new AnimalsFragment();
                        break;
                    case R.id.action_cart:
                        fragment = new EventsFragment();
                        break;
                    case R.id.action_hot_deals:
                        fragment = new SettingsFragment();
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit();
                return true;
            }
        });
    }
}
