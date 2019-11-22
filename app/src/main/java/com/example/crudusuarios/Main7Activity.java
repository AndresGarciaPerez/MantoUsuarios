package com.example.crudusuarios;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {

    Button btnMenu, btnRegresar;
    baseDatos bd;
    SQLiteDatabase base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        btnMenu = findViewById(R.id.btnMenu);
        btnRegresar = findViewById(R.id.btnRegresar);

        TextView tvCorreo = findViewById(R.id.tvCorreo);
        TextView tvNombre = findViewById(R.id.tvNombre);
        TextView tvClave = findViewById(R.id.tvClave);
        TextView tvTipo = findViewById(R.id.tvTipo);

        bd = new baseDatos(getApplicationContext(),"usuarios",null,1);
        base = bd.getWritableDatabase();

        Bundle datos = getIntent().getExtras();
        String elCorreo = datos.getString("elCorreo");
        final int tipoo;
        final  String tipo;

        String query = "select *from Usuarios where Correo= '"+elCorreo+"'" ;
        Cursor cursor = base.rawQuery(query,null);

        if (cursor.moveToNext()){
            tvCorreo.setText("Correo: "+cursor.getString(0));
            tvNombre.setText("Nombre: "+cursor.getString(1));
            tvClave.setText("Clave: "+cursor.getString(2));
            tipoo =cursor.getInt(3);
            tipo = String.valueOf(tipoo);
            tvTipo.setText(tipo);

        } else {
            Toast.makeText(getApplicationContext(), "Usuario no encontrado", Toast.LENGTH_SHORT).show();
        }


        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad7 = new Intent(getApplicationContext(), Main3Activity.class);
                startActivityForResult(actividad7,1);
            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad7 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(actividad7,1);
            }
        });
    }
}
