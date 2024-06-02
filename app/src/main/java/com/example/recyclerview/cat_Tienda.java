package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview.activity.MainActivityAbarrotes;
import com.example.recyclerview.activity.MainActivityAireac;
import com.example.recyclerview.activity.MainActivityAutos;
import com.example.recyclerview.activity.MainActivityBicicletas;
import com.example.recyclerview.activity.MainActivityBu;
import com.example.recyclerview.activity.MainActivityHamacas;
import com.example.recyclerview.activity.MainActivityHerreria;
import com.example.recyclerview.activity.MainActivityOpticas;
import com.example.recyclerview.activity.MainActivityPapeleria;
import com.example.recyclerview.activity.MainActivityPinturas;
import com.example.recyclerview.activity.MainActivityRelojeria;
import com.example.recyclerview.activity.MainActivitySaludables;
import com.example.recyclerview.activity.MainActivitySombreros;
import com.example.recyclerview.activity.MainActivityTelefonia;
import com.example.recyclerview.activity.MainActivityVariedades;
import com.example.recyclerview.activity.MainActivityfarma;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class cat_Tienda extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.tiendabanner};

    Button abarrotes;
    Button aire;
    Button autos;
    Button bicicletas;
    Button boutique;
    Button farmacia;
    Button herreria;
    Button hamacas;
    Button optica;
    Button papeleria;
    Button pinturas;
    Button telefonia;
    Button relojeria;
    Button saludable;
    Button sombreros;
    Button variedades;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_tienda);

        abarrotes =(Button)findViewById(R.id.per1);
        abarrotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent medicos = new Intent (cat_Tienda.this, MainActivityAbarrotes.class);
                startActivity(medicos);

            }
        });

        boutique =(Button)findViewById(R.id.bu);
        boutique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent boutique = new Intent (cat_Tienda.this, MainActivityBu.class);
                startActivity(boutique);

            }
        });

        farmacia =(Button)findViewById(R.id.far);
        farmacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent farmacia = new Intent (cat_Tienda.this, MainActivityfarma.class);
                startActivity(farmacia);

            }
        });

        herreria=(Button)findViewById(R.id.herreria);
        herreria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent herreria = new Intent (cat_Tienda.this, MainActivityHerreria.class);
                startActivity(herreria);

            }
        });

        aire=(Button)findViewById(R.id.Aire);
        aire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent aire = new Intent (cat_Tienda.this, MainActivityAireac.class);
                startActivity(aire);

            }
        });

        autos=(Button)findViewById(R.id.autos);
        autos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent autos = new Intent (cat_Tienda.this, MainActivityAutos.class);
                startActivity(autos);

            }
        });


        bicicletas=(Button)findViewById(R.id.bicicletas);
        bicicletas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bicletas = new Intent (cat_Tienda.this, MainActivityBicicletas.class);
                startActivity(bicletas);

            }
        });

        hamacas=(Button)findViewById(R.id.hamacas);
        hamacas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hamacas = new Intent (cat_Tienda.this, MainActivityHamacas.class);
                startActivity(hamacas);

            }
        });

        optica=(Button)findViewById(R.id.opticas);
        optica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent optica = new Intent (cat_Tienda.this, MainActivityOpticas.class);
                startActivity(optica);

            }
        });

        papeleria=(Button)findViewById(R.id.papeleria);
        papeleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent papeleria = new Intent (cat_Tienda.this, MainActivityPapeleria.class);
                startActivity(papeleria);

            }
        });

        pinturas=(Button)findViewById(R.id.pinturas);
        pinturas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pintame = new Intent (cat_Tienda.this, MainActivityPinturas.class);
                startActivity(pintame);

            }
        });

        telefonia=(Button)findViewById(R.id.telefonia);

        telefonia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tel = new Intent (cat_Tienda.this, MainActivityTelefonia.class);
                startActivity(tel);

            }
        });

        relojeria=(Button)findViewById(R.id.relojeria);

        relojeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent reloj = new Intent (cat_Tienda.this, MainActivityRelojeria.class);
                startActivity(reloj);

            }
        });

        saludable=(Button)findViewById(R.id.saludables);
        saludable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent saludables = new Intent (cat_Tienda.this, MainActivitySaludables.class);
                startActivity(saludables);

            }
        });

        sombreros=(Button)findViewById(R.id.sombreros);
        sombreros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sombreros = new Intent (cat_Tienda.this, MainActivitySombreros.class);
                startActivity(sombreros);

            }
        });

        variedades=(Button)findViewById(R.id.variedades);

        variedades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent variedades = new Intent (cat_Tienda.this, MainActivityVariedades.class);
                startActivity(variedades);

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