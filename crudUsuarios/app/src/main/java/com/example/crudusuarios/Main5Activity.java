package com.example.crudusuarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


public class Main5Activity extends AppCompatActivity {
    ListView listado;
    bdusuarios bdUsuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        listado = findViewById(R.id.listado);

        ArrayList contenido = new ArrayList();
        contenido = bdUsuarios.getNombres();


        ArrayAdapter<String> ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1, contenido);
        listado.setAdapter(ad);

    }
}
