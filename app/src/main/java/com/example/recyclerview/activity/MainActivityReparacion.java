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

public class MainActivityReparacion extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Servicio Tecnico TVR SOTO\nElectrónica en general", "\nReparación de pantallas LED\nHornos de mircroondas\nModulares amplificadores\nBocinas amplificadoras", R.drawable.tvrsoto, "767 103 5297", "Calz. Rey Irepan Ote. S/N, Centro, 40660 Cd Altamirano, Gro.", R.drawable.tvrsotomap, "", "","","",""));
        itemLists.add(new ItemList("CIBER PEAR\nVenta y reparaciónde computadoras", "\nImpresionesVenta de computadoras\nVideojuegos\nReparacion de computadoras\nMantenimiento de computadoras", R.drawable.ciberpear, "767 104 8737", "Rey Irepan Pte. 610, Col del Centro, Cd. Altamirano, Gro.", R.drawable.cibercommap, "", "","","",""));
        itemLists.add(new ItemList("Cerrajería Ruíz", "DUPLICADOS AL MINUTO\nDuplicados de llaves\nApertura de autos\nTrabajos a domicilio", R.drawable.cerrajeriaruiz, "767 104 8488", "Lázaro Cárdenas 1002, Col. Centro, Cd Altamirano, Gro.", R.drawable.cerrajeriaruizmap, "", "","","",""));
        itemLists.add(new ItemList("CIBER .COM\nReparación de computadoras", "Renta de computadoras\nImpresiones\nMantenimiento de computadoras\nClases de computación\nVenta de videojuegos", R.drawable.cibercom, "732 123 7727", "Lázaro Cárdenas 1002, Col. Centro, Cd. Altamirano, Gro.", R.drawable.cibercommap, "", "","","",""));

//Vicente Guerrero 115-101, El Calvario, 40660 Cd Altamirano, Gro.//
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
