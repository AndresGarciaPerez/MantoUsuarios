package com.example.crudusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
/*ACTIVITY NUEVO*/

    EditText edtNombre, edtCorreo, edtClave, edtConfirmar;
    RadioButton rbUsuario, rbAsistente, rbAdministrador;
    Button btnGuardar, btnSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edtNombre = findViewById(R.id.edtNombre);
        edtCorreo = findViewById(R.id.edtCorreo);
        edtClave = findViewById(R.id.edtClave);
        edtConfirmar = findViewById(R.id.edtConfirmar);
         rbUsuario = findViewById(R.id.rbUsuario);
         rbAsistente = findViewById(R.id.rbAsistente);
         rbAdministrador = findViewById(R.id.rbAdministrador);

         btnGuardar = findViewById(R.id.btnGuardar);
         btnSalir = findViewById(R.id.btnSalir);


        btnGuardar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String Nombre = edtNombre.getText().toString().trim();
                 String Correo = edtCorreo.getText().toString().trim();
                 String Clave = edtClave.getText().toString().trim();
                 String Confirmar = edtConfirmar.getText().toString().trim();
                 int tipo = rbUsuario.isChecked()? 1: rbAsistente.isChecked()? 2: 3;


                 if (Nombre.equals("")){
                     edtNombre.setError("Error campo requerido");
                     edtNombre.requestFocus();
                 } else if (Correo.equals("")){
                     edtCorreo.setError("Campo requerido");
                     edtCorreo.requestFocus();
                 } else if (Clave.equals("")){
                     edtClave.setError("Campo requerido");
                     edtClave.requestFocus();
                 } else if (Confirmar.equals("")){
                     edtConfirmar.setError("Campo Requerido");
                     edtConfirmar.requestFocus();
                 } else if (Clave.equals(Confirmar)){
                     Intent objNuevo = new Intent(getApplicationContext(),Main4Activity.class);
                     objNuevo.putExtra("nombre",Nombre);
                     objNuevo.putExtra("correo",Correo);
                     objNuevo.putExtra("clave",Clave);
                     objNuevo.putExtra("tipo",tipo);
                     startActivityForResult(objNuevo,3);
                 } else{
                     edtConfirmar.setError("Error las claves no coinciden");
                     edtConfirmar.setText("");
                     edtConfirmar.requestFocus();
                 }



             }
         });

         btnSalir.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent actividad3 = new Intent(getApplicationContext(), Main2Activity.class);
                 startActivityForResult(actividad3,1);
             }
         });

    }
}
