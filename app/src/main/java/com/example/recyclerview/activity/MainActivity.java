package com.example.recyclerview.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.adaptador.RecyclerAdapter;
import com.example.recyclerview.model.ItemList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Laboratorio AVSA", "El IMSS, es la institución con mayor presencia en la atención a la salud y en la protección social de los mexicanos.", R.drawable.labavsa, "767 672 3035", "Juan Álvarez Esq. Rey Irepan, Col. Linda Vista CP. Cd. Altamirano Gro.", R.drawable.labavsa, "", "","","",""));
        itemLists.add(new ItemList("Laboratorio Salva Vidas", "Rayos X\n" + "Ultrasonido\n" + "Ácido úrico\n" + "Exámen general de orina\n" + "Prueba de dengue\n" + "Plaquetas\n" + "Prueba Covid19\n" + "Prueba de embarazado\n" + "Antigeno prostático", R.drawable.labsalva, "767 672 7049","Ejército Mexicano Ote., Col. Centro, Cd Altamirano, Gro.", R.drawable.labsalvamap, "", "","","",""));
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


