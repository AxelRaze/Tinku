package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview.activity.MainActivityMeca1;
import com.example.recyclerview.activity.MainActivityMeca2;
import com.example.recyclerview.activity.MainActivityMeca3;
import com.example.recyclerview.activity.MainActivityMeca4;
import com.example.recyclerview.activity.MainActivityMeca5;
import com.example.recyclerview.activity.MainActivityMeca6;
import com.example.recyclerview.activity.MainActivityPer1;
import com.example.recyclerview.activity.MainActivityPer2;
import com.example.recyclerview.activity.MainActivityPer3;
import com.example.recyclerview.activity.MainActivityPer4;
import com.example.recyclerview.activity.MainActivityPer5;
import com.example.recyclerview.activity.MainActivityPer6;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class cat_Mecanico extends AppCompatActivity {



    SliderView sliderView;
    int[] images = {R.drawable.one};


    Button Meca1;
    Button Meca2;
    Button Meca3;
    Button Meca4;
    Button Meca5;
    Button Meca6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_mecanico);

        Meca1 =(Button)findViewById(R.id.meca1);

        Meca1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per1 = new Intent (cat_Mecanico.this, MainActivityMeca1.class);
                startActivity(per1);

            }
        });

        Meca2 =(Button)findViewById(R.id.meca2);

        Meca2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per2 = new Intent (cat_Mecanico.this, MainActivityMeca2.class);
                startActivity(per2);

            }
        });

        Meca3 =(Button)findViewById(R.id.meca3);

        Meca3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per3 = new Intent (cat_Mecanico.this, MainActivityMeca3.class);
                startActivity(per3);

            }
        });
        Meca4 =(Button)findViewById(R.id.meca4);

        Meca4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per4 = new Intent (cat_Mecanico.this, MainActivityMeca4.class);
                startActivity(per4);

            }
        });
        Meca5 =(Button)findViewById(R.id.meca5);

        Meca5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per5 = new Intent (cat_Mecanico.this, MainActivityMeca5.class);
                startActivity(per5);

            }
        });
        Meca6 =(Button)findViewById(R.id.meca6);

        Meca6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per2 = new Intent (cat_Mecanico.this, MainActivityMeca6.class);
                startActivity(per2);

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