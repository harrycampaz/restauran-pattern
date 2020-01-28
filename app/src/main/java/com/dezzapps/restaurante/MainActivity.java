package com.dezzapps.restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.dezzapps.restaurante.factory.BreadFactory;
import com.dezzapps.restaurante.models.interfaces.Bread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.text_view);

        BreadFactory breadFactory = new BreadFactory();
        Bread bread = breadFactory.getBread("FRA");

        textView.setText(new StringBuilder()
        .append(bread.name()).toString());
    }
}
