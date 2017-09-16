package com.example.smbat_s.animalszoo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.models.Event;

import java.util.ArrayList;

public class EventsListAdapter extends RecyclerView.Adapter<EventsListAdapter.EventViewHolder> {

    private ArrayList<Event> events;

    public EventsListAdapter(ArrayList<Event> events) {
        this.events = events;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EventViewHolder(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        holder.image.setImageDrawable(events.get(position).getImage());
        holder.title.setText(events.get(position).getTitle());
        holder.description.setText(events.get(position).getDescription());
        holder.date.setText(events.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView image;
        private TextView description;
        private Button date;

        EventViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.event_card_item, parent, false));
            title = itemView.findViewById(R.id.card_title);
            description = itemView.findViewById(R.id.card_text);
            image = itemView.findViewById(R.id.card_image);
            date = itemView.findViewById(R.id.card_date);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO
                }
            });
        }
    }
}