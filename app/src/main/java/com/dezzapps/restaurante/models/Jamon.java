package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Relleno;



public class Jamon extends Relleno {
    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public int calories() {
        return 54;
    }

    @Override
    public String description() {
        return "Relleno de Jamon";
    }

    @Override
    public String image() {
        return "R.drawable.ham";
    }
}
