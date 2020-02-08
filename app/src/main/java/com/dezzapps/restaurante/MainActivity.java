package com.dezzapps.restaurante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import com.dezzapps.restaurante.builder.SandwichBuilder;
import com.dezzapps.restaurante.factory.AbstractFactory;
import com.dezzapps.restaurante.factory.BreadFactory;
import com.dezzapps.restaurante.factory.DrinkFactory;
import com.dezzapps.restaurante.factory.FactoryGenerator;
import com.dezzapps.restaurante.factory.RellenoFactory;
import com.dezzapps.restaurante.models.Frances;
import com.dezzapps.restaurante.models.Jamon;
import com.dezzapps.restaurante.models.Queso;
import com.dezzapps.restaurante.models.QuesoGratidando;
import com.dezzapps.restaurante.models.Sandwich;
import com.dezzapps.restaurante.models.interfaces.Bread;
import com.dezzapps.restaurante.models.interfaces.Drink;
import com.dezzapps.restaurante.models.interfaces.Relleno;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

        if(toolbar != null){
            setSupportActionBar(toolbar);
        }


//        TextView textView = findViewById(R.id.text_view);

        SandwichBuilder builder = new SandwichBuilder();

        Sandwich sandwich = builder.cheeseAndHam();

        Log.d(TAG, "Primer sandwich : Kcal" + sandwich.getCalories());

        sandwich.getIngredientsprin();


        Sandwich sandwich1 = builder.cheeseAndHam();

        builder.build(sandwich1, new QuesoGratidando());

        Log.d(TAG, "Segundo sandwich : Kcal " + sandwich1.getCalories());

        sandwich1.getIngredientsprin();


        Sandwich s3 = new Sandwich();

        builder.build(s3, new Frances());
        builder.build(s3, new Jamon());

        Log.d(TAG, "Tercero sandwich : Kcal " + s3.getCalories());
        s3.getIngredientsprin();


    }
}
