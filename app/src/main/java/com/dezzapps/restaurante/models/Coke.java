package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Drink;

public class Coke implements Drink {
    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public int calories() {
        return 140;
    }

    @Override
    public String description() {
        return "Bebida refrescante";
    }

    @Override
    public String image() {
        return "R.drawable.coke";
    }
}
