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

public class MainActivityfarma extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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

    private void initViews() {
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
        itemLists.add(new ItemList("Farma Vida", "FarmaVida te permite encontrar la más amplia oferta de productos para tu salud, cuidado personal, el bebé, alimentos, hogar, fotoelectrónica, servicios financieros y más; al mejor precio, en un solo lugar.\n\nHorario\nLunes a Sábado 7:00 a 21:00\nDomingo 16:00 a 21:00", R.drawable.farmavida, "767 130 8102", "Av. Morelos #208, Cd.Altamirano,Gro.", R.drawable.farmavidamap, "", "","","",""));
        itemLists.add(new ItemList("Farmacia OJesus", "TU BIENESTAR PRIMERO", R.drawable.ojesus, "767 688 45 98", "Av. Lazaro Cardenas, Cd.Altamirano,Gro.", R.drawable.ojesusmap, "", ""," FARMACIAS OJESUS","",""));
        itemLists.add(new ItemList("Farmacia Moderna", "Farmacia Moderna de descuento", R.drawable.farmoder, "", "Av. Lázaro Cárdenas 501, Col. Centro, Cd. Altamirano, Gro.", R.drawable.farmodermap, "", "","","",""));
        itemLists.add(new ItemList("Farmacia Sagrado Corazón", "Ahorro REAL en medicamentos. 30%, 40% y 50% de descuento", R.drawable.sagrado, "", "Av. Ejercito mexicano #108 pte., Cd. Altamirano, Gro.", R.drawable.sagradomap, "", "","","",""));
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


