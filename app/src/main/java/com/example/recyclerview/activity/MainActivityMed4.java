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

public class MainActivityMed4 extends AppCompatActivity implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {
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
        itemLists.add(new ItemList("Consultorio Dental \nSmile Dent", "Dra. Estefanny castillo Alonso\n\nLunes a Sabado de 8 a 16 horas \n\nTratamientos: \nLimpieza dental\nExtracciones\nAmalgamas\nResinas\nIncrustaciones\nCoronas (metal y porcelana\nPrótesis fijas, removibles y totales\nBlanqueamiento dental\nEndodoncia\nOrtodoncia", R.drawable.smiledent, "767 104 5629", "Calle Moya 906, Col. Linda Vista, Cd. Altamirano, Gro.", R.drawable.smiledentmap, "", "","","",""));
        itemLists.add(new ItemList("My Dentista", "Dr. Armando Joshep Arellano Pineda \nCirujano Dentista \nCed. Prof. 11485392 \n \nLimpiezas\nResinas\nAmalgamas\nExtracciones\nPrótesis fijas y removibles\nPlacas totales\nPorcelana\nZirconia\nBrackes\nCarillas", R.drawable.mydentista, "767 102 5509", "Av. Rey Irepan Pte. 102 oriente, Col. Centro, 40660 Cd Altamirano, Gro.", R.drawable.mydentistamap, "", "","fb.com/josepharellanopineda","767 102 5509",""));
        itemLists.add(new ItemList("Dental Clear", "Clínica dental es un grupo de odontólogos de primer nivel acompañados con los mejores avances tecnológicos para brindar tratamientos éticos y de alta calidad a sus pacientes.", R.drawable.dentalclear, "767 672 0139", "Fray Juan Bautista Moya 804, Col del Centro, 40660 Cd Altamirano, Gro.", R.drawable.dentalclearmap, "", "","","",""));
        itemLists.add(new ItemList("Clínica Dental Astudillo", "Todos nuestros tratamientos y servicios se brindan en cómodas instalaciones con los más altos estándares de calidad.", R.drawable.clinicadentalastudillo, "767 107 0204","Ignacio Zaragoza, Col del Centro, 40660 Cd Altamirano, Gro.", R.drawable.clinicadentalastudillomap, "", "","","",""));
        itemLists.add(new ItemList("Radiología Dental Digital", "Radiología Dental ofrece:\nMedicina Bucal\nCirugía oral y maxilofacial\nImplantología\nOdontología Estética. \nHorario\n" +
                "Lunes a viernes de 9 am a 6 pm\n" +
                "Sábado de 9 am a 3 pm", R.drawable.radiologiadigitaldental, "","Col del Centro, 40660 Cd Altamirano, Gro.", R.drawable.radiologiadigitaldentalmap, "", "","","",""));
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


