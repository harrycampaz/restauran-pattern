package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Relleno;



public class Queso extends Relleno {
    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public int calories() {
        return 21;
    }

    @Override
    public String description() {
        return "Relleno de quesos";
    }

    @Override
    public String image() {
        return null;
    }
}
