package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Relleno;



public class Jamon implements Relleno {
    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public String calories() {
        return " : 56 kcal";
    }
}
