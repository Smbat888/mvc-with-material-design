package com.example.smbat_s.animalszoo.models;

import android.graphics.drawable.Drawable;

public class SingleAnimal {

    private String name;
    private Drawable image;
    private String description;
    private String videoUrl;

    public SingleAnimal() {
    }

    public SingleAnimal(String name, Drawable image, String description, String videoUrl) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.videoUrl = videoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
