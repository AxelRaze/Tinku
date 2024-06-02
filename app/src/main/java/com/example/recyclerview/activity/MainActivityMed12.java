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
public class MainActivityMed12 extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Hospital de especialidades Pungarabato", "URGENCIAS 24 HORAS\n\nLaboratorio 24 horas\nRayos X 24 horas\nUltrasonido 24 horas\nFarmacia\n\n Lic. en Nutrición\nDalia Yareli Macedo\n\nTaumatólogo\nArmando Borja Pineda \n\nCardiólogo\nDr. Carlos Gómez Gómez \n\nContamos con especialidad en:\nTraumatología\nUrología\nGinecología\nMedicina Interna\nOtorrinología\nGastroenterología\nPsicología\nPediatría\nCirugía General", R.drawable.hospitalpungarabato, "767 672 3663", "Mariano Matamoros 904, Col del Centro, 40660 Cd Altamirano, Gro.", R.drawable.hospitalpungarabatomap, "", "","HospitalPungarabato","",""));
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