package com.example.crudusuarios;

import android.app.ListActivity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main8Activity extends ListActivity {
    bdusuarios bdUsuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main8);

      /*  bdusuarios bdUsuarios = new bdusuarios();

        ArrayList contenido = new ArrayList();
        //contenido = bdUsuarios.getNombres();

        int idx = 0 ;
        for(idx = 0; idx<99; idx++ ){
            contenido.add(bdUsuarios.getUsuario(idx++));
        }

        */
        String[] datos;
        Resources recursos = getResources();
        //datos = recursos.getStringArray(R.array.datos);


        ArrayAdapter<String> ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1, contenido);
        setListAdapter(ad);

    }

    public void onListItemClick(ListView lista, View vista, int indice, long id ){
        Toast.makeText(getApplicationContext(), "Hola que hace",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),String.valueOf(indice),Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),bdUsuarios.getUsuario(indice),Toast.LENGTH_LONG).show();
    }
}
