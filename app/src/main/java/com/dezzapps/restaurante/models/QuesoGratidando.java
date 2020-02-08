package com.dezzapps.restaurante.models;

import com.dezzapps.restaurante.models.interfaces.Relleno;

public class QuesoGratidando extends Relleno {
    @Override
    public String name() {
        return "Queso Gratinado";
    }

    @Override
    public int calories() {
        return 21;
    }

    @Override
    public String description() {
        return "Relleno de quesos gratinado";
    }

    @Override
    public String image() {
        return null;
    }
}