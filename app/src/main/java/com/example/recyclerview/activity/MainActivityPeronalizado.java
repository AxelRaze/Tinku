package com.example.recyclerview.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.adaptador.RecyclerAdapter;
import com.example.recyclerview.model.ItemList;

import java.util.ArrayList;
import java.util.List;

public class MainActivityPeronalizado extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter adapter;
    private List<ItemList> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initValues();
        initListener();
    }

    private void initViews(){
        rvLista = findViewById(R.id.rvLista);
        svSearch = findViewById(R.id.svSearch);
    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new RecyclerAdapter(items, this);
        rvLista.setAdapter(adapter);
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }

    private List<ItemList> getItems() {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("OG ARTE", "Retratos\nRestauración de una foto en dibujo\nCollage (varias fotos en un solo dibujo)\nDibujos a lápiz o a color", R.drawable.ogarte, "767 679 2113", "Ciudad Altamirano, Gro.", R.drawable.ogartebanner, "", "omargm18","profile.php?id=100064747354840","767 679 2113","profile.php?id=100064747354840"));
        itemLists.add(new ItemList("FAMILIA SON RISITAS", "\"Familia sonrisitas\"\n" +
                "\n" +
                "¿No tienes quien anime tu fiesta? No te preocupes más Familia Sonrisitas lo sacará de ese apuro.\n" +
                "Contamos con todo tipo de paquetes para fiestas, Bautizo, Presentación, Cumpleaños, Entrega de regalos, Baby Shower y mucho más. \n" +
                "Solo marque a los números celulares: 767-101-8453,\n" +
                "767-112-6996, 747-140-8333 o al 767-1004320.", R.drawable.familiasonrisitas, "767 100 4320", "Cd. Altamirano, Gro.", R.drawable.expendiomap, "", "","jonatangabriel.pinedapenalosa","767 100 4320","jonatangabriel.pinedapenalosa"));
        itemLists.add(new ItemList("Expendio BIMBO", "Expendio Bimbo te ofrecen productos BIMBO hasta el 50% más económicos que en cualquier otra sucursal abierta al público", R.drawable.expendio, "767 679 3393", "Col, Timangaro, Cd. Altamirano, Gro.", R.drawable.expendiomap, "", "","","",""));
        itemLists.add(new ItemList("Auto Tapiceria Arce", "Reparacipon de todo tipo de asientos\nAutos\nMotos\nSalas\nSillas", R.drawable.tapiceriaarce, "7671173055", "16 de Septiembre 14, Rio Balsas, 40664 Cd Altamirano, Gro.", R.drawable.tapiceriaarcemap, "", "","","7671173055",""));
        itemLists.add(new ItemList("Lavandería Nu2", "Servicios de Lavandería en Altamirano\nLunes a Viernes de 9 a.m. a 5 p.m.\nSábado de 9 a.m. a 3 p.m.", R.drawable.nu2, "", "Antonio El Castillo Ote. 115, Col. Centro, Cd. Altamirano, Gro.", R.drawable.nu2map, "", "","","",""));
        itemLists.add(new ItemList("Estudio de tatuajes \nAD HOC", "Se hacen tatuajes permanentes o temporales y piercings\nLunes a Domingo de 10 a.m. a 6 p.m.", R.drawable.adhoc, "767 679 0210", "Vicente Guerrero 205, Pungarabato, Mexico", R.drawable.adhocmap, "anny1705@hotmail.com", "","","",""));
        itemLists.add(new ItemList("Tramites y servicios", "Trámites y servicios\nCURP\nBuró de crédito\nCréditos del ISSTE.", R.drawable.liclauraponce, "767 672 0717", "Av. Pungarabato Pte. No. 210 Col. Centro. Ciudad Altamirano, Gro.", R.drawable.liclauraponcemap, "computectc95215@gmail.com", "","","",""));
        itemLists.add(new ItemList("Tu Negocio", "La Descricion de tu Negocio .", R.drawable.reparto, "Tu Numero", "Donde Estas Ubicado.", R.drawable.mapa, "", "","","",""));

        return itemLists;
    }

    @Override
    public void itemClick(ItemList item) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("itemDetail", item);
        startActivity(intent);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.filter(newText);
        return false;
    }


}
