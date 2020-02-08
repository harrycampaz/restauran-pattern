package com.dezzapps.restaurante.models;

import android.util.Log;

import com.dezzapps.restaurante.models.interfaces.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private static final String TAG = "Sandwich";
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();


    public void addIngrediens(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public int getCalories(){
        int calories = 0;

        for (Ingredient i: ingredients){
            calories += i.calories();
        }

        return calories;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void getIngredienst(){
        for (Ingredient i: ingredients){
            Log.i(TAG, i.name() +" : " +i.calories()+" kcal");
        }
    }
}
