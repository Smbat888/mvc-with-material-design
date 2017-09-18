package com.example.smbat_s.animalszoo.adapters;


import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.smbat_s.animalszoo.R;

import java.util.ArrayList;

public class AnimalImagesListAdapter extends
        RecyclerView.Adapter<AnimalImagesListAdapter.ImageViewHolder> {

    private ArrayList<Drawable> images;

    public AnimalImagesListAdapter(ArrayList<Drawable> images) {
        this.images = images;
    }

    @Override
    public AnimalImagesListAdapter.ImageViewHolder onCreateViewHolder(ViewGroup parent,
                                                                              int viewType) {
        return new AnimalImagesListAdapter.ImageViewHolder(
                LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(AnimalImagesListAdapter.ImageViewHolder holder,
                                 int position) {
        holder.cardImage.setImageDrawable(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {

        private ImageView cardImage;

        ImageViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.card_animal_image, parent, false));
            cardImage = itemView.findViewById(R.id.card_image);
        }
    }
}
