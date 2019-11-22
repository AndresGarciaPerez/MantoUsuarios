package com.example.crudusuarios;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Main5Activity extends AppCompatActivity {
    ListView listado;

    baseDatos bd;
    SQLiteDatabase base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        bd = new baseDatos(getApplicationContext(), "usuarios",null,1);
        base=bd.getWritableDatabase();

        String query = "select *from Usuarios order by correo ";
        Cursor cursor = base.rawQuery(query,null);

        listado = findViewById(R.id.listado);
        ArrayList contenido = new ArrayList();

        while (cursor.moveToNext())
        {
            contenido.add("Correo: "+cursor.getString(0));
        }

        //Toast.makeText(getApplicationContext(),String.valueOf(bd.getNombres()),Toast.LENGTH_LONG).show();
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1, contenido);
        listado.setAdapter(ad);


    }
}
