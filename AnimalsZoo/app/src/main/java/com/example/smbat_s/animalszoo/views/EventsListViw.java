package com.example.smbat_s.animalszoo.views;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.adapters.EventsListAdapter;
import com.example.smbat_s.animalszoo.models.Event;

import java.util.ArrayList;


public class EventsListViw {

    private RecyclerView recyclerView;

    public EventsListViw(View view) {
        this.recyclerView = view.findViewById(R.id.animal_types_recycler_view);
    }

    public void loadEventsList(Context context, ArrayList<Event> events) {
        final EventsListAdapter adapter = new EventsListAdapter(context, events);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
}
