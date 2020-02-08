package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Drink;

public class Beer implements Drink {
    @Override
    public String name() {
        return "Beer";
    }

    @Override
    public int calories() {
        return 100;
    }

    @Override
    public String description() {
        return "Bebida refrescante";
    }

    @Override
    public String image() {
        return "R.drawable.beer";
    }
}
