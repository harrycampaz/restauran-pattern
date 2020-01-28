package com.dezzapps.restaurante.factory;

import com.dezzapps.restaurante.models.interfaces.Bread;
import com.dezzapps.restaurante.models.interfaces.Relleno;



public abstract class AbstractFactory {

    public  abstract Bread getBread(String breadType);

    public abstract Relleno getRelleno(String rellenoType);

}
