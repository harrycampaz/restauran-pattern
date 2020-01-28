package com.dezzapps.restaurante.factory;

import com.dezzapps.restaurante.factory.AbstractFactory;
import com.dezzapps.restaurante.models.Frances;
import com.dezzapps.restaurante.models.Tajado;
import com.dezzapps.restaurante.models.interfaces.Bread;
import com.dezzapps.restaurante.models.interfaces.Relleno;



public class BreadFactory extends AbstractFactory {
    @Override
    public Bread getBread(String breadType) {
        if(breadType == null){
            return null;
        }

        if(breadType.equals("FRA")){
            return  new Frances();
        }else if(breadType.equals("TAJ")){
            return  new Tajado();
        }

        return  null;
    }

    @Override
    public Relleno getRelleno(String rellenoType) {
        return null;
    }
}
