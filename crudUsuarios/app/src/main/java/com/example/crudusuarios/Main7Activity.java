package com.example.crudusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Main7Activity extends AppCompatActivity {

    bdusuarios bdUsuarios;
    EditText edtNombre, edtCorreo, edtClave, edtConfirmar;
    RadioButton rbUsuario, rbAsistente, rbAdministrador;
    Button btnGuardar, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        edtNombre = findViewById(R.id.edtNombre);
        edtCorreo = findViewById(R.id.edtCorreo);
        edtClave = findViewById(R.id.edtClave);
        edtConfirmar = findViewById(R.id.edtConfirmar);
        rbUsuario = findViewById(R.id.rbUsuario);
        rbAsistente = findViewById(R.id.rbAsistente);
        rbAdministrador = findViewById(R.id.rbAdministrador);

        btnGuardar = findViewById(R.id.btnGuardar);
        btnSalir = findViewById(R.id.btnSalir);


        Bundle datos = getIntent().getExtras();

        String nombre = datos.getString("nombre");
        String clave = datos.getString("pass");
        String correo = datos.getString("correo");
        String tipoUsuario = datos.getString("tipoUsuario");

        if (nombre == null) {
            nombre = "";
        }

        if (clave == null) {
            clave = "";
        }

        if (correo == null) {
            correo = "";
        }
        if (tipoUsuario == null) {
            tipoUsuario = "";
        }
        edtNombre.setText("Nombre: " +nombre);
        edtCorreo.setText("Correo: " +correo);
        edtClave.setText("Clave: " +clave);
        edtConfirmar.setText("Tipo de Uusuario: " +tipoUsuario);

        if (tipoUsuario == "Administrador"){
            rbAdministrador.isChecked();
        } else if (tipoUsuario=="Asistente"){
            rbAsistente.isChecked();
        } else if(tipoUsuario=="Usuario"){
            rbUsuario.isChecked();
        }


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad6 = new Intent(getApplicationContext(), Main6Activity.class);
                startActivity(actividad6);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad2 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(actividad2);
            }
        });
    }
}
