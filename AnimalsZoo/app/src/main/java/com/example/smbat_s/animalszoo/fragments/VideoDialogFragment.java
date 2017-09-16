package com.example.smbat_s.animalszoo.fragments;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smbat_s.animalszoo.R;
import com.example.smbat_s.animalszoo.activities.DetailActivity;
import com.example.smbat_s.animalszoo.views.AnimalDetailView;
import com.example.smbat_s.animalszoo.views.AnimalVideoDialogView;

public class VideoDialogFragment extends DialogFragment {

    public VideoDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_video_dialog, container, false);
        final String videoUrl = getArguments().getString(AnimalDetailView.VIDEO_URL_KEY);
        final AnimalVideoDialogView dialogView = new AnimalVideoDialogView(view);
        dialogView.playVideo(videoUrl);
        return view;
    }

}
