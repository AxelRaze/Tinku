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

public class MainActivityPer5 extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Silk Salon \nToño Romero", "Salon de belleza Silk \n Micropigmentación \n Toño Romero", R.drawable.tonoromero, "55 1649 6588", "Vicente Guerrero 116, Col del Centro, Cd. Altamirano, Gro.", R.drawable.tonoromeromap, "", "","","",""));
        itemLists.add(new ItemList("D' Laris \nShop & Salon", "Salon de belleza\n\nAtención con previa cita\n\nHorario de atencion\nLunes a Sabado de 9 a 19 horas\nDomingo de 9 a 17 horas", R.drawable.dlaris, "733 107 2155", "Benito Juarez Ote 108 Col. Centro Ciudad Altarmirano, Gro.", R.drawable.dlarismap, "", "d.larissalon","","",""));
        itemLists.add(new ItemList("Estudio de belleza Queens", "Salon de belleza", R.drawable.salonqueens, "767 116 4194", "Fray Juan Bautista Moya 808, Col del Centro, Cd. Altamirano, Gro.", R.drawable.salonqueensmap, "", "","","",""));
        itemLists.add(new ItemList("Nails Salon by\nViry Terán", "Uñas de acrílico\nGel semipermanente (gelish)\nEncapsulado de acrílico en uña natural\nAcripie-Manicura y Pedicura Spa\nLash Lifting\nCejas HD\nDiseño de cejas", R.drawable.unasviry, "767 113 6042", "Francisco I. Madero Ote. 20, Col. Centro, Cd. Altamirano, Gro.", R.drawable.unasvirymap, "", "","","",""));
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


