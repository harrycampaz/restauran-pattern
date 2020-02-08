package com.dezzapps.restaurante.models.interfaces;

public abstract class Relleno implements Ingredient  {
    @Override
    public abstract String name();
    @Override
    public abstract int calories();
    @Override
    public abstract String description();
    @Override
    public abstract String image();
}
