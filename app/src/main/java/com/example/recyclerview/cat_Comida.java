package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview.activity.MainActivityBirria;
import com.example.recyclerview.activity.MainActivityFondas;
import com.example.recyclerview.activity.MainActivityRestaurant;
import com.example.recyclerview.activity.MainActivityTacos;
import com.example.recyclerview.activity.MainActivityTaqueria;
import com.example.recyclerview.activity.MainActivityCarneasa;
import com.example.recyclerview.activity.MainActivityCarniceria;
import com.example.recyclerview.activity.MainActivityComidachina;
import com.example.recyclerview.activity.MainActivityPasteleria;
import com.example.recyclerview.activity.MainActivityPizzerias;
import com.example.recyclerview.activity.MainActivityPollo;
import com.example.recyclerview.activity.MainActivityTortas;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class cat_Comida extends AppCompatActivity {



    SliderView sliderView;
    int[] images = {R.drawable.bannertortaschilangas};

    Button birria;
    Button carneasa;
    Button carnicerias;
    Button comidachina;
    Button fondas;
    Button pasteleria;
    //boton heladeria
    Button pizzerias;
    Button pollo;
    Button restaurant;
    Button tacos;
    Button tortas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_comida);

        birria =(Button)findViewById(R.id.birria);
        birria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent birria = new Intent (cat_Comida.this, MainActivityBirria.class);
                startActivity(birria);
            }
        });
        carneasa =(Button)findViewById(R.id.per1);
        carneasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent carneasa = new Intent (cat_Comida.this, MainActivityCarneasa.class);
                startActivity(carneasa);
            }
        });

        carnicerias =(Button)findViewById(R.id.carnicerias);
        carnicerias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent carnicerias = new Intent (cat_Comida.this, MainActivityCarniceria.class);
                startActivity(carnicerias);
            }
        });

        comidachina =(Button)findViewById(R.id.comidachina);
        comidachina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent comidachina = new Intent (cat_Comida.this, MainActivityComidachina.class);
                startActivity(comidachina);

            }
        });

        fondas =(Button)findViewById(R.id.fondas);
        fondas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fondas = new Intent (cat_Comida.this, MainActivityFondas.class);
                startActivity(fondas);

            }
        });
        pasteleria =(Button)findViewById(R.id.pasteleria);
        pasteleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pasteleria = new Intent (cat_Comida.this, MainActivityPasteleria.class);
                startActivity(pasteleria);

            }
        });

        pizzerias =(Button)findViewById(R.id.pizzerias);
        pizzerias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pizzerias = new Intent (cat_Comida.this, MainActivityPizzerias.class);
                startActivity(pizzerias);

            }
        });

        pollo =(Button)findViewById(R.id.pollo);
        pollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pollo = new Intent (cat_Comida.this, MainActivityPollo.class);
                startActivity(pollo);

            }
        });

        restaurant =(Button)findViewById(R.id.restaurant);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent restaurant = new Intent (cat_Comida.this, MainActivityRestaurant.class);
                startActivity(restaurant);

            }
        });
        tacos =(Button)findViewById(R.id.tacos);
        tacos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent taco = new Intent (cat_Comida.this, MainActivityTacos.class);
                startActivity(taco);

            }
        });
        tortas =(Button)findViewById(R.id.tortas);
        tortas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tortas = new Intent (cat_Comida.this, MainActivityTortas.class);
                startActivity(tortas);

            }
        });

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }
}