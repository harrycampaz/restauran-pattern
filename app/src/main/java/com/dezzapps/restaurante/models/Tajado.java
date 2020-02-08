package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Bread;


public class Tajado extends Bread {
    @Override
    public String name() {
        return "Tajado";
    }

    @Override
    public int calories() {
        return 30;
    }

    @Override
    public String description() {
        return "Pan de tajado";
    }

    @Override
    public String image() {
        return null;
    }
}
