package com.dezzapps.restaurante.builder;

import com.dezzapps.restaurante.models.Jamon;
import com.dezzapps.restaurante.models.Queso;
import com.dezzapps.restaurante.models.Sandwich;
import com.dezzapps.restaurante.models.Tajado;
import com.dezzapps.restaurante.models.interfaces.Ingredient;

public class SandwichBuilder {

    public  static Sandwich cheeseAndHam(){
        Sandwich s = new Sandwich();

        s.addIngrediens((new Tajado()));
        s.addIngrediens(new Jamon());
        s.addIngrediens(new Queso());

        return  s;
    }

    public static Sandwich build(Sandwich s, Ingredient i){
        s.addIngrediens(i);
        return s;
    }

}
