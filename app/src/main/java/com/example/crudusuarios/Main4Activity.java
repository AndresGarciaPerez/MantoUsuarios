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

    bdusuarios bd = new bdusuarios();

    SQLiteDatabase base;
    TextView tvNombre, tvCorreo, tvClave, tvTipo;
    Button btnConfirmar, btnCancelar;
    String Nombre,Correo,Clave,type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        baseDatos db = new baseDatos(getApplicationContext(),"sistemas",null,1);
        base = db.getWritableDatabase();

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

        int typei = datos.getInt("tipo");
        type = typei == 1? "Usuario": typei == 2? "Asistente": "Administrador";
        tvTipo.setText("Nivel de usuario: "+type);
        bd.setNombres(type);

        Nombre = datos.getString("nombre");
        Correo = datos.getString("correo");
        Clave = datos.getString("clave");


        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bd.setNombres(Nombre);
                bd.setClaves(Clave);
                bd.setTipos(type);
                bd.setCorreos(Correo);
                Toast.makeText(getApplicationContext(),"Usuario Almacenado",Toast.LENGTH_LONG).show();
                Intent actividad4 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(actividad4,1);

                //SENTECIA SQLite
                String query = "insert into Usuarios(correo, nombre,clave,tipo) values(Correo,Nombre,Clave,Typei)";
                Cursor cursor = base.rawQuery(query,null);
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
