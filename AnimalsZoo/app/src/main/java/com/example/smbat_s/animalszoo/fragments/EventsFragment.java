package com.example.smbat_s.animalszoo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.models.Event;
import com.example.smbat_s.animalszoo.providers.EventsProvider;
import com.example.smbat_s.animalszoo.views.EventsListViw;

import java.util.ArrayList;

public class EventsFragment extends Fragment implements EventsProvider.EventsCallback {

    private EventsListViw eventsListViw;

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);
        final EventsProvider animalsProvider = new EventsProvider();
        animalsProvider.loadAnimalTypes(this, rootView.getContext());
        eventsListViw = new EventsListViw(rootView);
        return rootView;
    }

    @Override
    public void onEventsLoaded(ArrayList<Event> events) {
        eventsListViw.loadEventsList(getContext(), events);
    }
}
