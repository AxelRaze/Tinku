package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview.activity.MainActivity;
import com.example.recyclerview.activity.MainActivityPer1;
import com.example.recyclerview.activity.MainActivityPer2;
import com.example.recyclerview.activity.MainActivityPer3;
import com.example.recyclerview.activity.MainActivityPer4;
import com.example.recyclerview.activity.MainActivityPer5;
import com.example.recyclerview.activity.MainActivityPer6;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class cat_Cuidadopersonal extends AppCompatActivity {



    SliderView sliderView;
    int[] images = {R.drawable.one,
            };
    Button per1;
    Button per2;
    Button per3;
    Button per4;
    Button per5;
    Button per6;
    Button unas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_cuidadopersonal);

        per1 =(Button)findViewById(R.id.per1);

        per1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per1 = new Intent (cat_Cuidadopersonal.this, MainActivityPer1.class);
                startActivity(per1);

            }
        });

        per2 =(Button)findViewById(R.id.per2);

        per2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per2 = new Intent (cat_Cuidadopersonal.this, MainActivityPer2.class);
                startActivity(per2);

            }
        });

        per3 =(Button)findViewById(R.id.per3);

        per3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per3 = new Intent (cat_Cuidadopersonal.this, MainActivityPer3.class);
                startActivity(per3);

            }
        });
        per4 =(Button)findViewById(R.id.per4);

        per4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per4 = new Intent (cat_Cuidadopersonal.this, MainActivityPer4.class);
                startActivity(per4);

            }
        });
        per5 =(Button)findViewById(R.id.per5);

        per5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per5 = new Intent (cat_Cuidadopersonal.this, MainActivityPer5.class);
                startActivity(per5);

            }
        });
        per6 =(Button)findViewById(R.id.per6);

        per6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent per2 = new Intent (cat_Cuidadopersonal.this, MainActivityPer6.class);
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