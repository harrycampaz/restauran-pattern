package com.dezzapps.restaurante.factory;

import com.dezzapps.restaurante.factory.AbstractFactory;
import com.dezzapps.restaurante.factory.BreadFactory;
import com.dezzapps.restaurante.factory.RellenoFactory;

public class FactoryGenerator {

    public static AbstractFactory getFactory(String factoryType){
        if(factoryType == null){
            return  null;
        }

        if(factoryType.equals("BRE")){
            return new BreadFactory();
        }else if(factoryType.equals("REL")){
            return new RellenoFactory();
        }else if(factoryType.equals("DRI")){
            return new DrinkFactory();
        }

        return  null;
    }
}
