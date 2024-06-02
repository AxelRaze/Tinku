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

public class MainActivity2 extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Viajes dos ríos", "SOMOS TU MEJOR OPCION\n\nDestinos:\nCiudad de México\nToluca\nMorelia\nIguala\nChilpancingo \n \n Morelia\nCalle guerrero 1003 col. Molino de parras esquina con avenida mariano michelena \n \nCiudad de México\nCalle San marcos #14 esquina con santa salome \n" +
                "Col. Molino de santo domingo Alcaldía alvaro obregon", R.drawable.viajesdosrios, "767 681 4322","Riva Palacio, Mich. A un lado de la gasolinera.",R.drawable.viajesdosriosmap, "", "","ViajesDosRiosRivaPalacio","767 120 4904",""));
        itemLists.add(new ItemList("Taxi", "SITIO PUNGARABATO", R.drawable.taxi, "7676727602","Ignacio Zaragoza, Guaracha, 40660 Cd Altamirano, Gro.",R.drawable.taximap, "", "","","",""));
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
