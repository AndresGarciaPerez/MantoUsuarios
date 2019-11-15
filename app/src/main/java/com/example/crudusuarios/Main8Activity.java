package com.example.crudusuarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main8Activity extends ListActivity {

    ListView lvLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main8);

        lvLista = findViewById(R.id.lvLista);

        List<String> listData = new ArrayList<String>();
        
        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        lvLista.setAdapter(adaptador);
        listData.add("Audi");
        listData.add("Benz");
        listData.add("BMW");
        listData.add("Ford");
        listData.add("Honda");
        listData.add("Toyoto");


    }





}
