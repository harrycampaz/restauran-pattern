package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Bread;


public class Tajado implements Bread {
    @Override
    public String name() {
        return "Tajado";
    }

    @Override
    public String calories() {
        return " :30 kcal";
    }
}
