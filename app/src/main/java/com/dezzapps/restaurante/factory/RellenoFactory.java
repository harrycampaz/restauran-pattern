package com.dezzapps.restaurante.factory;

import com.dezzapps.restaurante.factory.AbstractFactory;
import com.dezzapps.restaurante.models.Jamon;
import com.dezzapps.restaurante.models.Queso;
import com.dezzapps.restaurante.models.interfaces.Bread;
import com.dezzapps.restaurante.models.interfaces.Relleno;

public class RellenoFactory extends AbstractFactory {
    @Override
    public Bread getBread(String breadType) {
        return null;
    }

    @Override
    public Relleno getRelleno(String rellenoType) {

        if(rellenoType == null){
            return  null;
        }
        if(rellenoType.equals("QUE")){
            return  new Queso();
        }else if(rellenoType.equals("JAM")){
            return new Jamon();
        }
        return null;
    }
}
