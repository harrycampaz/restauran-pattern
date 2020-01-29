package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Relleno;



public class Queso implements Relleno {
    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public String calories() {
        return ": 21 kcal";
    }
}
