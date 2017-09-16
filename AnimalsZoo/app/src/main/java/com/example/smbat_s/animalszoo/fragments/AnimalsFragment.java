package com.example.smbat_s.animalszoo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.adapters.AnimalsListAdapter;
import com.example.smbat_s.animalszoo.models.BaseAnimal;
import com.example.smbat_s.animalszoo.providers.AnimalsProvider;
import com.example.smbat_s.animalszoo.views.AnimalsListView;

import java.util.ArrayList;

public class AnimalsFragment extends Fragment implements AnimalsProvider.AnimalsCallback {

    private AnimalsListView animalsListView;

    public AnimalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_animals, container, false);
        final AnimalsProvider animalsProvider = new AnimalsProvider();
        animalsProvider.loadAnimalTypes(this, rootView.getContext());
        animalsListView = new AnimalsListView(rootView);
        return rootView;
    }

    @Override
    public void onAnimalTypesLoaded(ArrayList<BaseAnimal> animalTypes) {
        animalsListView.loadAnimalTypesList(getContext(), animalTypes);
    }
}
