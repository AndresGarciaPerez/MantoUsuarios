package com.example.crudusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main6Activity extends AppCompatActivity {

    EditText edtCorreo;
    Button btnBuscar, btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        edtCorreo = findViewById(R.id.edtCorreo);
        btnBuscar = findViewById(R.id.btnBuscar);
        btnCancelar = findViewById(R.id.btnCancelar);


        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent objetoConfirmar = new Intent(getApplicationContext(),Main7Activity.class );
                startActivityForResult(objetoConfirmar,1);
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad6 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(actividad6,1);
            }
        });

    }

}
