package com.example.crudusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
/*Activity Menu Principal*/
    Button btnNuevo, btnBuscar, btnEditar, btnSalir, btnEliminar, btnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnNuevo = findViewById(R.id.btnNuevo);
        btnBuscar = findViewById(R.id.btnBuscar);
        btnEditar = findViewById(R.id.btnEditar);
        btnSalir = findViewById(R.id.btnSalir);
        btnEliminar = findViewById(R.id.btnEliminar);
        btnListar = findViewById(R.id.btnListar);


        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad2 = new Intent(getApplicationContext(), Main6Activity.class);
                startActivityForResult(actividad2,1);
            }
        });

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad2 = new Intent(getApplicationContext(), Main6Activity.class);
                startActivityForResult(actividad2,1);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(actividad2,1);
            }
        });

        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad2 = new Intent(getApplicationContext(), Main6Activity.class);
                startActivityForResult(actividad2,1);
            }
        });

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad2 = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(actividad2);
            }
        });

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad2 = new Intent(getApplicationContext(), Main8Activity.class);
                startActivityForResult(actividad2,1);
            }
        });

    }
}
