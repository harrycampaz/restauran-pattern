package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Bread;


public class Frances implements Bread {
    @Override
    public String name() {
        return "Frances";
    }

    @Override
    public String calories() {
        return ": 23 kcal";
    }

    @Override
    public String description() {
        return "Pan frances";

    }

    @Override
    public String image() {
        return null;
    }
}
