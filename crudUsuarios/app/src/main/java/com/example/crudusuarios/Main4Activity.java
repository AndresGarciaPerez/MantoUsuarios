package com.example.crudusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
/*Confirmacion para crear nuevo usuario*/

    bdusuarios bd = new bdusuarios();
    TextView tvNombre, tvCorreo, tvClave, tvTipo;
    Button btnConfirmar, btnSalir;
    String Nombre,Correo,Clave,type;

    bdusuarios bdUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tvNombre = findViewById(R.id.tvNombre);
        tvCorreo = findViewById(R.id.tvCorreo);
        tvClave = findViewById(R.id.tvClave);
        tvTipo = findViewById(R.id.tvTipo);
        btnConfirmar = findViewById(R.id.btnConfirmar);
        btnSalir = findViewById(R.id.btnSalir);


       final Bundle datos = getIntent().getExtras();
        tvCorreo.setText("Correo: "+datos.getString("correo"));
        tvNombre.setText("Nombre: "+datos.getString("nombre"));
        tvClave.setText("Contraseña: "+datos.getString("clave"));

        int typei = datos.getInt("tipo");
        type = typei == 1? "Usuario": typei == 2? "Asistente": "Administrador";
        tvTipo.setText("Nivel de usuario: "+type);


        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String tipos = tvTipo.getText().toString().trim();


            bdUsuarios.setNombres(datos.getString("nombre"));
            bdUsuarios.setCorreos(datos.getString("correo"));
            bdUsuarios.setClaves(datos.getString("clave"));
            bdUsuarios.setTipos(type);

            Intent actividad2 = new Intent(getApplicationContext(), Main2Activity.class);
            startActivityForResult(actividad2,1);
            }
        });


        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad3 = new Intent(getApplicationContext(), Main3Activity.class);
                startActivityForResult(actividad3,3);
            }
        });

    }





}
