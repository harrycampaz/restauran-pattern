package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Bread;


public class Frances extends Bread {
    @Override
    public String name() {
        return "Frances";
    }

    @Override
    public int calories() {
        return 23;
    }

    @Override
    public String description() {
        return "Pan frances";

    }

    @Override
    public String image() {
        return "R.drawable.sliced";
    }
}
