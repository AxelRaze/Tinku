package com.example.recyclerview;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.recyclerview.activity.MainActivityAbarrotes;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class cat_Ayuda extends AppCompatActivity {

    Button nosotros;
    Button politicas;

    private Button compartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_ayudas);
        Button btCall = findViewById(R.id.emertinku);
        final String numero = "7671311321";

        btCall.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + numero)); startActivity(intent);
        }
        });

        nosotros =(Button)findViewById(R.id.btnnoso);
        nosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nosotross = new Intent (cat_Ayuda.this, cat_Nosotros.class);
                startActivity(nosotross);
            }
        });

        politicas =(Button)findViewById(R.id.butplv);
        politicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent politi = new Intent (cat_Ayuda.this, cat_Polit.class);
                startActivity(politi);
            }
        });

        Button jbt_link = (Button) findViewById(R.id.calificarapp);
        jbt_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://play.google.com/store/apps/details?id=com.tinku.juma&pli=1";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        compartir=findViewById(R.id.compartir);
        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Compartiendo App", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void compartirApp() {
        try {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.app_name));
            String aux = "Descarga la app\n";
            aux = aux + "https://play.google.com/store/apps/details?id=com.tinku.juma&pli=1"+getBaseContext().getPackageName();
            i.putExtra(Intent.EXTRA_TEXT, aux);
            startActivity(i);
        } catch (Exception e) {
        }
    }
}