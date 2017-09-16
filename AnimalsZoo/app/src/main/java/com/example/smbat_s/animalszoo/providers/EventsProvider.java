package com.example.smbat_s.animalszoo.providers;


import android.content.Context;

import com.example.smbat_s.animalszoo.models.Event;
import com.example.smbat_s.animalszoo.tasks.LoadEventsTask;

import java.util.ArrayList;

public class EventsProvider {

    public void loadAnimalTypes(EventsProvider.EventsCallback callback, Context context) {
        new LoadEventsTask(callback, context).execute();
    }

    public interface EventsCallback {
        void onEventsLoaded(ArrayList<Event> animalTypes);
    }
}