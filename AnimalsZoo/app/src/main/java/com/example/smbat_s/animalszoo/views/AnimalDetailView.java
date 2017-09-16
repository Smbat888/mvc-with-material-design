package com.example.smbat_s.animalszoo.views;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.activities.DetailActivity;
import com.example.smbat_s.animalszoo.fragments.VideoDialogFragment;
import com.example.smbat_s.animalszoo.models.SingleAnimal;

public class AnimalDetailView {

    public static final String VIDEO_URL_KEY = "com.example.smbat_s.animalszoo.views.VIDEO_PARH";

    private ImageView animalImage;
    private TextView animalName;
    private TextView animalDescription;
    private ImageView videoImageButton;

    public AnimalDetailView(View view) {
        this.animalImage = view.findViewById(R.id.bg_image);
        this.animalName = view.findViewById(R.id.animal_name);
        this.animalDescription = view.findViewById(R.id.animal_description);
        this.videoImageButton = view.findViewById(R.id.video_button);
    }

    public void loadAnimalDetail(final SingleAnimal animal, final Context context) {
        animalImage.setImageDrawable(animal.getImage());
        animalName.setText(animal.getName());
        animalDescription.setText(animal.getDescription());
        videoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showVideoDialog((DetailActivity) context, animal);
            }
        });
    }

    private void showVideoDialog(DetailActivity context, SingleAnimal animal) {
        FragmentTransaction ft = context.getSupportFragmentManager().beginTransaction();
        Fragment prev = context.getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);
        DialogFragment newFragment = new VideoDialogFragment();
        Bundle bundle = new Bundle();
        System.out.println("animal = " + animal.getVideoUrl());
        bundle.putString(VIDEO_URL_KEY, animal.getVideoUrl());
        newFragment.setArguments(bundle);
        newFragment.show(ft, "dialog");
    }
}
