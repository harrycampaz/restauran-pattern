package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Drink;

public class Beer implements Drink {
    @Override
    public String name() {
        return "Beer";
    }

    @Override
    public String calories() {
        return ": 100 kcal";
    }

    @Override
    public String description() {
        return "Bebida refrescante";
    }

    @Override
    public String image() {
        return null;
    }
}
