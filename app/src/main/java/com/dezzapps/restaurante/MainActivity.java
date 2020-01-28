package com.dezzapps.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dezzapps.restaurante.factory.BreadFactory;
import com.dezzapps.restaurante.factory.DrinkFactory;
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


        TextView textView = findViewById(R.id.text_view);

        BreadFactory breadFactory = new BreadFactory();
        Bread bread = breadFactory.getBread("FRA");

        RellenoFactory rellenoFactory =new  RellenoFactory();

        Relleno relleno = rellenoFactory.getRelleno("QUE");

        DrinkFactory drinkFactory = new DrinkFactory();

        Drink drink = drinkFactory.getDrink("COK");

        textView.setText(new StringBuilder()
        .append(bread.name() +" - "+ relleno.name() +" - "+ drink.name()).toString());
    }
}
