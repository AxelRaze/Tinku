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

public class MainActivityMeca1 extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("ELECTRO MECANICO\nEL COMINO", "Especialista en fuel injection \nContamos con escaner para todas las marcas \nServicio a marcas nacionales y extranjeras", R.drawable.comino, "767 672 2656", "Mariano Abasolo No. 1002 Col. Linda vista, Ciudad Altamirano", R.drawable.cominomap, "", "","","",""));
        itemLists.add(new ItemList("Taller Mecánico Chucho\nEspecialistas Nissan", "Servicio general afianciones\nFrenos\nReparacion de motores, de todas las marcas\nServicio de aires acondicionados", R.drawable.tallermecanicochucho, "767 100 7307", "Rey Irepan Pte. 302, Col del Centro, 40660 Cd Altamirano, Gro.", R.drawable.tallermecanicochuchomap, "", "","","767 100 7307",""));
        itemLists.add(new ItemList("ABURTO BOAT CENTER", "Barcos de plástico rígido, botes inflables y reparaciones de embarcaciones", R.drawable.aburto, "464 652 6958", "Álvaro Obregón 607, El Calvario, Cd Altamirano, Gro.", R.drawable.aburtomap, "", "","","",""));

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


