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

public class MainActivityImprenta extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Hermosos Momentos\nGracia Araceli", "Trabajos de imprenta y serigrafía. \nHorario: 10:00 am a 6:00 pm\n\nInvitaciones para:\nBoda, XV años, Bautizo, Presentación, Esquelas\n\nGorras\nPlayeras\nTazas Sublimadas\nVolantes\nTarjetas\nEncuedernación para titulación", R.drawable.hermosos, "767 672 6117", "Av. Jose Inocente Lugo Pte. #211.", R.drawable.hermososmap, "hermososmomentos@outlook.com", "hermos0smomentos","hermososmomentosaltamirano","767 121 4040","hermososmomentosaltamirano"));
        itemLists.add(new ItemList("CIBER CENTRO", "¡MEMORIAS USB, AUDIFONOS, Y MÁS!     \nLO MEJOR EN TECNOLOGÍA LO ENCUENTRAS EN CIBER CENTRO \n" +
                "TENEMOS DISPONIBLES MEMORIAS USB, AUDIFONOS CON MICROFONO Y MÁS.\n\n" +
                "WHATSAPP: 7671048634\n" +
                "Ó LLAMA AL TEL: 7676722507\n\n" +
                "NOS UBICAMOS EN AV. LÁZARO CÁRDENAS #510 COL. CENTRO CD. ALTAMIRANO GRO. \n" +
                "(ANTES DE LLEGAR A LA CALLE DE TELMEX, PASANDO LOS BILLETES DE LOTERIA) \n\nHorario de atención:\nLunes a viernes 7:00 am a 6:00 pm\nSábado 7:00 am a 4:00 pm\nDomingo 8:00 am a 2:00 pm", R.drawable.cibercentro, "767 672 2507", "LÁZARO CÁRDENAS 510 CENTRO, ALTAMIRANO GRO.", R.drawable.cibercentromap, "cibercentro3565@hotmail.com", "cibe.rcentro","profile.php?id=100054466089723","767 104 8634","profile.php?id=100054466089723"));
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
