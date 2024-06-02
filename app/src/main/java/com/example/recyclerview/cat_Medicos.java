package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerview.activity.MainActivity;
import com.example.recyclerview.activity.MainActivityMed10;
import com.example.recyclerview.activity.MainActivityMed11;
import com.example.recyclerview.activity.MainActivityMed12;
import com.example.recyclerview.activity.MainActivityMed14;
import com.example.recyclerview.activity.MainActivityMed2;
import com.example.recyclerview.activity.MainActivityMed3;
import com.example.recyclerview.activity.MainActivityMed4;
import com.example.recyclerview.activity.MainActivityMed5;
import com.example.recyclerview.activity.MainActivityMed6;
import com.example.recyclerview.activity.MainActivityMed7;
import com.example.recyclerview.activity.MainActivityMed8;
import com.example.recyclerview.activity.MainActivityMed9;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class cat_Medicos extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.medicosbanner};
    Button laboratorios;
    Button hospital;
    Button dent;
    Button orto;
    Button general;
    Button nutriologo;
    Button quiropractico;
    Button trauma;
    Button neourologo;
    Button ginecologia;
    Button oftamologia;
    Button pedriatria;
    Button psicologo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_medicos);

        laboratorios =(Button)findViewById(R.id.medi1);
        laboratorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent medicos = new Intent (cat_Medicos.this, MainActivity.class);
                startActivity(medicos);
            }
        });

        hospital =(Button)findViewById(R.id.medi2);

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hospital = new Intent (cat_Medicos.this, MainActivityMed2.class);
                startActivity(hospital);
            }
        });

        dent =(Button)findViewById(R.id.medi3);
        dent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orto = new Intent (cat_Medicos.this, MainActivityMed3.class);
                startActivity(orto);
            }
        });

        orto =(Button)findViewById(R.id.medi4);
        orto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orto = new Intent (cat_Medicos.this, MainActivityMed4.class);
                startActivity(orto);
            }
        });

        general =(Button)findViewById(R.id.medi5);
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent general = new Intent (cat_Medicos.this, MainActivityMed5.class);
                startActivity(general);

            }
        });

        nutriologo =(Button)findViewById(R.id.medi6);
        nutriologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent orto = new Intent (cat_Medicos.this, MainActivityMed6.class);
                startActivity(orto);
            }
        });

        quiropractico =(Button)findViewById(R.id.medi7);
        quiropractico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ortoni = new Intent (cat_Medicos.this, MainActivityMed7.class);
                startActivity(ortoni);

            }
        });

        trauma =(Button)findViewById(R.id.medi8);
        trauma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nutriologo = new Intent (cat_Medicos.this, MainActivityMed8.class);
                startActivity(nutriologo);

            }
        });

        neourologo =(Button)findViewById(R.id.medi9);
        neourologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiropractico = new Intent (cat_Medicos.this, MainActivityMed9.class);
                startActivity(quiropractico);

            }
        });

        ginecologia =(Button)findViewById(R.id.medi10);
        ginecologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trauma = new Intent (cat_Medicos.this, MainActivityMed10.class);
                startActivity(trauma);

            }
        });

        oftamologia =(Button)findViewById(R.id.medi11);
        oftamologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neuro = new Intent (cat_Medicos.this, MainActivityMed11.class);
                startActivity(neuro);

            }
        });

        pedriatria =(Button)findViewById(R.id.medi12);
        pedriatria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gine = new Intent (cat_Medicos.this, MainActivityMed12.class);
                startActivity(gine);
            }
        });

        psicologo =(Button)findViewById(R.id.medi14);
        psicologo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gine = new Intent (cat_Medicos.this, MainActivityMed14.class);
                startActivity(gine);
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