package com.example.smbat_s.animalszoo.providers;

import android.content.Context;

import com.example.smbat_s.animalszoo.models.BaseAnimal;
import com.example.smbat_s.animalszoo.models.SingleAnimal;
import com.example.smbat_s.animalszoo.tasks.LoadAnimalDetailTask;
import com.example.smbat_s.animalszoo.tasks.LoadAnimalTypesTask;
import com.example.smbat_s.animalszoo.tasks.LoadSingleAnimalsTask;

import java.util.ArrayList;

public class AnimalsProvider {

    public void loadAnimalTypes(AnimalsCallback callback, Context context) {
        new LoadAnimalTypesTask(callback, context).execute();
    }

    public void loadSingleAnimals(SingleAnimalsCallback callback, Context context, int position) {
        new LoadSingleAnimalsTask(callback, context, position).execute();
    }

    public void loadAnimalDetail(DetailAnimalCallback callback, Context context, int[] position) {
        new LoadAnimalDetailTask(callback, context, position).execute();
    }

    public interface AnimalsCallback {
        void onAnimalTypesLoaded(ArrayList<BaseAnimal> animalTypes);
    }

    public interface SingleAnimalsCallback {
        void onSingleAnimalsLoaded(ArrayList<SingleAnimal> singleAnimals);
    }

    public interface DetailAnimalCallback {
        void onAnimalDetailLoaded(SingleAnimal singleAnimals);
    }

}
