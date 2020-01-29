package com.dezzapps.restaurante.factory;

import com.dezzapps.restaurante.models.Beer;
import com.dezzapps.restaurante.models.Coke;
import com.dezzapps.restaurante.models.interfaces.Bread;
import com.dezzapps.restaurante.models.interfaces.Drink;
import com.dezzapps.restaurante.models.interfaces.Relleno;

public class DrinkFactory extends AbstractFactory {
    @Override
    public Bread getBread(String breadType) {
        return null;
    }

    @Override
    public Relleno getRelleno(String rellenoType) {
        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {
        if(drinkType == null){
            return null;
        }

        if(drinkType.equals("COK")){
            return  new Coke();
        }else if(drinkType.equals("BEE")){
            return new Beer();
        }

        return  null;
    }
}
