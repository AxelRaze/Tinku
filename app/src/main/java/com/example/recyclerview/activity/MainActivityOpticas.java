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

public class MainActivityOpticas extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("GR Optica\nEspecialistas en salud visual", "Examen de la vista gratuito\n" +
                "Venta y adaptación de anteojos\n" +
                "Valoración clínica de fondo de ojo\n" +
                "Optometria pediatrica y geriatrica\n" +
                "Detencion de glaucoma\n" +
                "Detencion de estrabismo\n" +
                "Contactología clínica (lentes de contacto para patologías)\n" +
                "Alteraciones en musculatura extrinseca del ojo\n" +
                "Ameotropias\n" +
                "Infecciones\n", R.drawable.groptica, "767 672 5558", "Av. Vicente Guerrero. No.213 Col. Centro, Ciudad Altamirano, Guerrero", R.drawable.gropticamap, "", "","gropticaguerrero","767 103 1403",""));
        itemLists.add(new ItemList("Optica Ermita", "Examen de la vista por computadora GRATIS. Adaptacion a todo tipo de lentes ", R.drawable.opt, "767 103 6227", "Col del Centro, 40660 Ciudad Altamirano, Guerrero", R.drawable.optmap, "", "","","",""));

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


