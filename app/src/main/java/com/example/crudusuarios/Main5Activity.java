package com.example.crudusuarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Main5Activity extends AppCompatActivity {
    ListView listado;
    bdusuarios bd = new  bdusuarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        listado = findViewById(R.id.listado);

        ArrayList contenido = new ArrayList();
        contenido.add("Andres 123");
        contenido.add("Jose 123");
        contenido.add("Samantha 123");
        contenido.add("Acevedo 123");
        contenido.add("Fatima 123");

        //Toast.makeText(getApplicationContext(),String.valueOf(bd.getNombres()),Toast.LENGTH_LONG).show();


        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1, contenido);
        listado.setAdapter(ad);


    }
}
