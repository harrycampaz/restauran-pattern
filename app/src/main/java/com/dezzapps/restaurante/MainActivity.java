package com.dezzapps.restaurante;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
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
import com.dezzapps.restaurante.models.User;
import com.dezzapps.restaurante.models.interfaces.Bread;
import com.dezzapps.restaurante.models.interfaces.Drink;
import com.dezzapps.restaurante.models.interfaces.Relleno;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        final DrawerLayout drawerLayout = findViewById(R.id.drawer);

        if(toolbar != null){
            setSupportActionBar(toolbar);
        }


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                Log.d(TAG, "onDrawerOpened: Si");

                User user = User.getUser();

                user.setName("Tomas");

                Log.d(TAG, "onDrawerOpened: "+ user.getName());

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                Log.d(TAG, "onDrawerClosed: ");
                User user = User.getUser();

                Log.d(TAG, "onDrawerOpened: "+ user.getName());
            }

        };

        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                drawerLayout.closeDrawers();

                switch (menuItem.getItemId()){
                    case R.id.drama:
                      ContentFragment fragment = new ContentFragment();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment, fragment);
                        transaction.commit();
                        return  true;

                    case R.id.comedia:
                        Log.d(TAG, "onNavigationItemSelected: Comedia");
                        return  true;


                    case R.id.terror:
                        Log.d(TAG, "onNavigationItemSelected: Terror");
                        return  true;

                        default:
                            return false;
                }

            }
        });


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);


        return super.onCreateOptionsMenu(menu);
    }
}
