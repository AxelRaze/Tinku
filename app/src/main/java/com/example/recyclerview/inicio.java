package com.example.recyclerview;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.recyclerview.activity.MainActivity2;
import com.example.recyclerview.activity.MainActivityAutolavado;
import com.example.recyclerview.activity.MainActivityBienesrai;
import com.example.recyclerview.activity.MainActivityConstruccion;
import com.example.recyclerview.activity.MainActivityContaduria;
import com.example.recyclerview.activity.MainActivityAbogados;
import com.example.recyclerview.activity.MainActivityEmergencia;
import com.example.recyclerview.activity.MainActivityGimnacio;
import com.example.recyclerview.activity.MainActivityHerreria;
import com.example.recyclerview.activity.MainActivityHotel;
import com.example.recyclerview.activity.MainActivityImprenta;
import com.example.recyclerview.activity.MainActivityMarketin;
import com.example.recyclerview.activity.MainActivityPeronalizado;
import com.example.recyclerview.activity.MainActivityReparacion;
import com.example.recyclerview.activity.MainActivityTortilleria;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class inicio extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.slider2dosriosfb, R.drawable.one, R.drawable.bannertortaschilangas};
    Button emergencia;
    Button medicos;
    Button transporte;
    Button tienda;
    Button comida;
    Button ayuda;
    Button cuidadopersonal;
    Button marketing;
    Button bienesraiz;
    Button mecanico;
    Button domestico;
    Button tortilleria;
    Button hotel;
    Button construccion;
    Button contaduria;
    Button reparacion;
    Button herreria;
    Button autolavado;
    Button imprenta;
    Button gimnacio;
    Button personal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        emergencia =(Button)findViewById(R.id.bt0);
        emergencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent medicos = new Intent (inicio.this, MainActivityEmergencia.class);
                startActivity(medicos);
            }
        });

        tienda =(Button)findViewById(R.id.btienda);
        tienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tienda = new Intent (inicio.this, cat_Tienda.class);
                startActivity(tienda);
            }
        });

        comida =(Button)findViewById(R.id.btcomida);
        comida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comida = new Intent (inicio.this, cat_Comida.class);
                startActivity(comida);
            }
        });

        medicos =(Button)findViewById(R.id.bt1);
        medicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent medicos = new Intent (inicio.this, cat_Medicos.class);
                startActivity(medicos);
            }
        });


        cuidadopersonal =(Button)findViewById(R.id.cuidadoperonal);
        cuidadopersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cuidadoperonal  = new Intent (inicio.this, cat_Cuidadopersonal.class);
                startActivity(cuidadoperonal);
            }
        });

        mecanico =(Button)findViewById(R.id.mecanico);
        mecanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cuidadoperonal  = new Intent (inicio.this, cat_Mecanico.class);
                startActivity(cuidadoperonal);
            }
        });

        transporte =(Button)findViewById(R.id.bt2);
        transporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transporte = new Intent (inicio.this, MainActivity2.class);
                startActivity(transporte);
            }
        });

        domestico =(Button)findViewById(R.id.domestico);
        domestico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent domestico = new Intent (inicio.this, MainActivityAbogados.class);
                startActivity(domestico);
            }
        });

        tortilleria =(Button)findViewById(R.id.tortilleria);
        tortilleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tortilleria = new Intent (inicio.this, MainActivityTortilleria.class);
                startActivity(tortilleria);
            }
        });

        reparacion =(Button)findViewById(R.id.reparacion);
        reparacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reparacion = new Intent (inicio.this, MainActivityReparacion.class);
                startActivity(reparacion);
            }
        });

        herreria =(Button)findViewById(R.id.herreria);
        herreria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent herreria = new Intent (inicio.this, MainActivityHerreria.class);
                startActivity(herreria);
            }
        });

        autolavado =(Button)findViewById(R.id.autolavado);
        autolavado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent autolavado = new Intent (inicio.this, MainActivityAutolavado.class);
                startActivity(autolavado);
            }
        });

        contaduria =(Button)findViewById(R.id.contaduria);
        contaduria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contaduria = new Intent (inicio.this, MainActivityContaduria.class);
                startActivity(contaduria);
            }
        });

        construccion =(Button)findViewById(R.id.constru);
        construccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent construc = new Intent (inicio.this, MainActivityConstruccion.class);
                startActivity(construc);
            }
        });

        hotel =(Button)findViewById(R.id.hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotel = new Intent (inicio.this, MainActivityHotel.class);
                startActivity(hotel);
            }
        });

        imprenta =(Button)findViewById(R.id.imprenta);
        imprenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imprenta = new Intent (inicio.this, MainActivityImprenta.class);
                startActivity(imprenta);
            }

        });
        gimnacio =(Button)findViewById(R.id.gimnacio);
        gimnacio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gimnacio = new Intent (inicio.this, MainActivityGimnacio.class);
                startActivity(gimnacio);
            }
        });

        marketing =(Button)findViewById(R.id.marketing);
        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent transporte = new Intent (inicio.this, MainActivityMarketin.class);
                startActivity(transporte);
            }
        });

        bienesraiz =(Button)findViewById(R.id.bienesraiz);
        bienesraiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bienesraiz = new Intent (inicio.this, MainActivityBienesrai.class);
                startActivity(bienesraiz);
            }
        });

        personal =(Button)findViewById(R.id.peronal);
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent personal = new Intent (inicio.this, MainActivityPeronalizado.class);
                startActivity(personal);
            }
        });

        FloatingActionButton my_fab = (FloatingActionButton) findViewById(R.id.fab);
        my_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Panel de Ayuda", Snackbar.LENGTH_LONG).show();
                Intent Ayuda = new Intent (inicio.this, cat_Ayuda.class);
                startActivity(Ayuda);
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