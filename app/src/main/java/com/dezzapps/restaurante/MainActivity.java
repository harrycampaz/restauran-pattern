package com.dezzapps.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dezzapps.restaurante.factory.AbstractFactory;
import com.dezzapps.restaurante.factory.BreadFactory;
import com.dezzapps.restaurante.factory.DrinkFactory;
import com.dezzapps.restaurante.factory.FactoryGenerator;
import com.dezzapps.restaurante.factory.RellenoFactory;
import com.dezzapps.restaurante.models.Queso;
import com.dezzapps.restaurante.models.interfaces.Bread;
import com.dezzapps.restaurante.models.interfaces.Drink;
import com.dezzapps.restaurante.models.interfaces.Relleno;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        TextView textView = findViewById(R.id.text_view);

        AbstractFactory rellenofactory = FactoryGenerator.getFactory("REL");
        Relleno relleno = rellenofactory.getRelleno("QUE");

        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("FRA");

        AbstractFactory drinkFactory = FactoryGenerator.getFactory("DRI");
        Drink drink = drinkFactory.getDrink("BEE");



//        textView.setText(new StringBuilder()
//        .append(bread.name() + bread.calories() + " / " +
//                relleno.name() + relleno.calories() + " / " +
//                drink.name() + drink.calories()).toString());
    }
}
