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

public class MainActivityBienesrai extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Escuela Superior de Matemáticas No. 2", "UNIVERSIDAD DE CALIDAD CON INCLUSIÓN SOCIAL\n\nFormar y actualizar recursos humanos en el area de Matematicas y Computación de manera integral\n\nOferta Educativa\nLic. en Matemáticas Puras\nLic. en Matemática Educativa\nLic. en Matemáticas Área Computación", R.drawable.mate,"767 672 2929", "Av. Las delicias, S/N, fraccionamiento un Nuevo Horizonte, Cd. Altamirano, Gro.", R.drawable.matemap, "matematicascdaltamirano@gmail.com", "","profile.php?id=100078884286099","767 679 3173","profile.php?id=100078884286099"));
        itemLists.add(new ItemList("Instituto Tecnológico de Ciudad Altamirano", "Oferta Educativa\n\n" +
                "Ingeniería en Administración\n" +
                "Ingeniería Informática\n" +
                "Ingeniería en Agronomía\n" +
                "Contador Público\n" +
                "Licenciatura en Biología\n" +
                "Licenciatura en Administración\n" +
                "Ingeniería en Gestión Empresarial (a Distancia).",
                R.drawable.itca, "767 672 1213", "Av. Pungarabato Pte S/N, Pungarabato, Mexico.", R.drawable.itcamap, "web_cdaltamirano@tecnm.mx", "","ITCAltamirano","","ITCAltamirano"));


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
