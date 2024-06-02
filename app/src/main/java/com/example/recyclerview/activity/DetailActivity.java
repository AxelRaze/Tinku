package com.example.recyclerview.activity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.recyclerview.R;
import com.example.recyclerview.model.ItemList;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgItemDetail;
    private TextView tvTituloDetail;
    private TextView tvDescripcionDetail;
    private TextView tvTelefono;
    private TextView tvDirec;
    private ItemList itemDetail;
    private ImageView tvMapa;
    private TextView tvCorreo;
    private TextView tvWeb;
    private TextView tvFace;
    private TextView MessengerFace;
    private  TextView whatsapp;
    Button buttonCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle(getClass().getSimpleName());
        initViews();
        initValues();
    }

    private void initViews() {
        imgItemDetail = findViewById(R.id.imgItemDetail);
        tvTituloDetail = findViewById(R.id.tvTituloDetail);
        tvDescripcionDetail = findViewById(R.id.tvDescripcionDetail);
        tvTelefono = findViewById(R.id.tvTelefono);
        tvDirec = findViewById(R.id.tvDirec);
        tvMapa = findViewById(R.id.tvMapa);
        tvCorreo = findViewById(R.id.tvCorreo);
        tvWeb = findViewById(R.id.tvWeb);
        tvFace = findViewById(R.id.tvFace);
        MessengerFace = findViewById(R.id.MessengerFace);
        whatsapp = findViewById(R.id.whatsapp);

        buttonCall = findViewById(R.id.emertinku);
        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toCall = "tel:" + tvTelefono.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL,
                        Uri.parse(toCall)));}
        });

        buttonCall = findViewById(R.id.emertinku);
        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toCall = "tel:" + tvTelefono.getText().toString();
                startActivity(new Intent(Intent.ACTION_DIAL,
                        Uri.parse(toCall)));}
        });

        TextView jtv_link = (TextView) findViewById(R.id.tvWeb);
        jtv_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.instagram.com/"+ tvWeb.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        TextView jtv_link2 = (TextView) findViewById(R.id.tvFace);
        jtv_link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://fb.com/"+ tvFace.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        TextView jtv_link3 = (TextView) findViewById(R.id.whatsapp);
        jtv_link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://wa.me/"+ whatsapp.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        TextView jtv_link4 = (TextView) findViewById(R.id.MessengerFace);
        jtv_link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://m.me/"+ MessengerFace.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }

    private void initValues(){
        itemDetail = (ItemList) getIntent().getExtras().getSerializable("itemDetail");
        imgItemDetail.setImageResource(itemDetail.getImgResource());
        tvTituloDetail.setText(itemDetail.getTitulo());
        tvDescripcionDetail.setText(itemDetail.getDescripcion());
        tvTelefono.setText(itemDetail.getTelefono());
        tvDirec.setText(itemDetail.getDirec());
        tvMapa.setImageResource(itemDetail.getMapa());
        tvCorreo.setText(itemDetail.getCorreo());
        tvWeb.setText(itemDetail.getInstagram());
        tvFace.setText(itemDetail.getFaceB());
        MessengerFace.setText(itemDetail.getMessengerFace());
        whatsapp.setText(itemDetail.getWhatsapp());
    }
}
