package com.example.smbat_s.animalszoo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.adapters.AnimalsListAdapter;
import com.example.smbat_s.animalszoo.adapters.SingleAnimalsListAdapter;
import com.example.smbat_s.animalszoo.models.SingleAnimal;
import com.example.smbat_s.animalszoo.providers.AnimalsProvider;
import com.example.smbat_s.animalszoo.views.AnimalsListView;

import java.util.ArrayList;

public class AnimalsGridFragment extends Fragment implements AnimalsProvider.SingleAnimalsCallback {

    private View rootView;
    private int position;
    private AnimalsListView animalsListView;

    public AnimalsGridFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_animals, container, false);
        position = getArguments().getInt(AnimalsListAdapter.ANIMAL_TYPE_POSITION);
        final AnimalsProvider animalsProvider = new AnimalsProvider();
        animalsProvider.loadSingleAnimals(this, rootView.getContext(), position);
        animalsListView = new AnimalsListView(rootView);
        return rootView;
    }

    @Override
    public void onSingleAnimalsLoaded(ArrayList<SingleAnimal> singleAnimals) {
        animalsListView.loadAnimals(getContext(), singleAnimals, position);
    }
}
