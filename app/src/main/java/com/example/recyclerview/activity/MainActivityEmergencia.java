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

public class MainActivityEmergencia extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("GUARDIA NACIONAL", "JUSTICIA Y PAZ", R.drawable.gn, "767 672 1333", "40663, Coyuca De Catalan - Cd Altamirano 1909, Loma Linda, 40660 Cd Altamirano, Gro.", R.drawable.gnmap, "", "","","",""));
        itemLists.add(new ItemList("34/o Batallon de Inf.", "Unidad milotar táctica", R.drawable.sedena, "7676720078","Calzada Rey Irepan Oriente 12, Lazaro Cardenas, 40662 Cd Altamirano, Gro.", R.drawable.sedenamap,  "", "","","",""));
        itemLists.add(new ItemList("Cruz Roja Pungarabato",  "Institución de asistencia privada", R.drawable.cruz, "7676721286","Jaime Nuño, Benito Juárez Ote. &, Barrio de Esquipula, 40660 Cd Altamirano, Gro.", R.drawable.cruzmap, "", "","","",""));
        itemLists.add(new ItemList("Cuerpo de Bomberos",  "", R.drawable.bomb, "7676722286","40660, Rey Irepan Pte. 301, Col del Centro, Cd Altamirano, Gro.", R.drawable.bombmap, "", "","H. Cuerpo Bomberos Altamirano Gro","",""));


        return itemLists;
    }



    @Override
    public void itemClick(ItemList item) {
        Intent intent = new Intent(this, DetailActivityhermi.class);
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


