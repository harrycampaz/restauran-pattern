package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Drink;

public class Coke implements Drink {
    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public String calories() {
        return ": 140 kcal";
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
