package com.example.crudusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {


    EditText edtCorreo;
    Button btnBuscar, btnCancelar;
    bdusuarios bdUsuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        edtCorreo = findViewById(R.id.edtCorreo);
        btnBuscar = findViewById(R.id.btnBuscar);
        btnCancelar = findViewById(R.id.btnSalir);


        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = edtCorreo.getText().toString().trim();

                boolean buscarUsers = bdUsuarios.buscarUsuario(correo);
                if (buscarUsers) {

                    Intent objShowUserFinded = new Intent(getApplicationContext(), Main7Activity.class);
                    objShowUserFinded.putExtra("nombre", bdUsuarios.getNombres(correo));
                    objShowUserFinded.putExtra("correo", correo);
                    objShowUserFinded.putExtra("pass", bdUsuarios.getClaves(correo));
                    objShowUserFinded.putExtra("tipoUsuario", bdUsuarios.getTipos(correo));
                    startActivityForResult(objShowUserFinded, 1);
                } else {
                    Toast.makeText(getApplicationContext(), "El usuario no existe", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad6 = new Intent(getApplicationContext(), Main7Activity.class);
                startActivityForResult(actividad6,1);
            }
        });

    }

}
