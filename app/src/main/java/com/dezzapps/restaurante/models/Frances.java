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
}
