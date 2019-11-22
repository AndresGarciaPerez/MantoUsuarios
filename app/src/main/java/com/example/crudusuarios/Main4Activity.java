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

public class Main4Activity extends AppCompatActivity {
/*Confirmacion para crear nuevo usuario*/

    baseDatos bd;
    SQLiteDatabase base;


    TextView tvNombre, tvCorreo, tvClave, tvTipo;
    Button btnConfirmar, btnCancelar;
    String Nombre,Correo,Clave,type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        bd = new baseDatos(getApplicationContext(),"usuarios",null,1);
        base=bd.getWritableDatabase();

        tvNombre = findViewById(R.id.tvNombre);
        tvCorreo = findViewById(R.id.tvCorreo);
        tvClave = findViewById(R.id.tvClave);
        tvTipo = findViewById(R.id.tvTipo);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnCancelar = findViewById(R.id.btnCancelar);


        Bundle datos = getIntent().getExtras();
        tvNombre.setText("Correo: "+datos.getString("correo"));
        tvCorreo.setText("Nombre: "+datos.getString("nombre"));
        tvClave.setText("Contraseña: "+datos.getString("clave"));

        final int Typei = datos.getInt("tipo");
        type = Typei == 1? "Usuario": Typei == 2? "Asistente": "Administrador";
        tvTipo.setText("Nivel de usuario: "+type);
        //bd.setNombres(type);

        Nombre = datos.getString("nombre");
        Correo = datos.getString("correo");
        Clave = datos.getString("clave");

        Toast.makeText(getApplicationContext(), Correo, Toast.LENGTH_SHORT).show();
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                //SENTENCIA SQLite
                String query = "insert into Usuarios(correo,nombre,clave,tipo) values('"+Correo+"','"+Nombre+"','"+Clave+"','"+Typei+"')";
                Cursor cursor = base.rawQuery(query,null);

                if (cursor.moveToNext()){
                    Toast.makeText(getApplicationContext(), "Datos Almacenados", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Error en la bd", Toast.LENGTH_LONG).show();
                }

                Intent actividad4 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(actividad4,1);


            }
        });


        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad4 = new Intent(getApplicationContext(), Main3Activity.class);
                startActivityForResult(actividad4,1);
            }
        });

    }





}
