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

public class MainActivityPer1 extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Barbershop Romero", "Los mejores cortes, estilos y acabados para caballero. ¡Agenda tu cita ahora!", R.drawable.romero, "767 6710904", "Francisco I. Madero Ote. 404 esquina con Hermenegildo Galeana, Col. Centro, Cd. Altamirano, Gro.", R.drawable.romeromap, "", "","","",""));
        itemLists.add(new ItemList("Alta Barber Shop", "Cortes de cabello para caballeros,", R.drawable.altabarber, "732 122 5231", "Mariano Abasolo 810, Col. Centro, Cd. Altamirano, Gro.", R.drawable.altabarbermap, "", "","AltaBarberShop","",""));
        itemLists.add(new ItemList("Yisus Barber Shop", " Servicios: \nUndercut, Comb Over, Taper Fade, Burst Fade, Sutch Side, Low Fade", R.drawable.yisus, "767 113 3526", "Benito Juárez Poniente 203, Centro, Cd. Altamirano,Gro", R.drawable.yisusmap, "", "","Yisu's Barber","",""));
        itemLists.add(new ItemList("Barbería Air Force", "VARBER \n Lo escribimos mal, pero lo cortamos bien.", R.drawable.airforce, "767 106 0460", "Ejercito Mexicano Pte, Col. Centro, Cd. Altamirano, Gro.", R.drawable.airforcemap, "", "","","",""));
        itemLists.add(new ItemList("Peluquería El Kale", "Peluquería especializada en todo tipo de corte de cabello", R.drawable.elkale, "443 486 4557", "Ejercito mexicano Pte Gral Ignacio Allende Centro, Cd. Altamirano, Gro.", R.drawable.elkalemap, "", "","kalebarbershop","",""));
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


