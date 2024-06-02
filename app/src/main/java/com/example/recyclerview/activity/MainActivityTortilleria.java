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

public class MainActivityTortilleria extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("ELÉCTRICO\nJulio César Roman García", "Realizamos trabajos de electricidad en general:\nDiseño de un nuevo sistema de la instalación eléctrica\n" +
                "Ampliación de las instalaciones\n" +
                "Remodelaciones de la electricidad\n" +
                "Reparación de los cuadros eléctricos\n" +
                "Documentación en planos de las nuevas instalaciones aplicadas\n" +
                "Mejora de la instalación con sistema contra incendio\n" +
                "Instalación de porteros digitales en edificios comunitarios\n" +
                "Reparaciones referentes a la electricidad y al factor de potencia", R.drawable.electricistajulio, "767 671 3349", "Col del Centro, Cd. Altamirano, Gro.", R.drawable.electricistajuliomap, "", "","","767 671 3349",""));
        itemLists.add(new ItemList("PIPAS\nAGUA EXPRESS", "DISTRIBUCIÓN DE AGUA EN PIPA\n\nPide tu mini pipa CAPACIDAD 1,100 Litros\n\nHorario:\nLunes a Domingo 07:00 am a 07:00 pm", R.drawable.pipasaguaexpress, "767 672 1467", "Col del Centro, Cd Altamirano, Gro.", R.drawable.electricistajuliomap, "", "","","767 115 2468",""));
        itemLists.add(new ItemList("PLOMERO\nFrancisco García", "Realizamos trabajos de plomería en general:\nInstalaciones\nLimpieza de cisternas y tinacos\nBombas\nHidroneumáticos\nDrenajes\nTomas de agua\nInstalacion de baños completos.", R.drawable.plomero, "767 110 7458", "Ignacio Zaragoza 604, Col del Centro, 40660 Cd Altamirano, Gro.", R.drawable.pekinmap, "", "","","767 110 7458",""));
        itemLists.add(new ItemList("Tu Negocio", "La Descricion de tu Negocio .", R.drawable.logoejemplo, "Tu Numero", "Donde Estas Ubicado.", R.drawable.mapa, "Tu Correo", "Tu Instagram","Tu Facebook","",""));
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
