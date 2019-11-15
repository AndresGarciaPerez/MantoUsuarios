package com.example.crudusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    EditText edtCorreo, edtClave;
    Button btnIngresar, btnCerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCorreo = findViewById(R.id.edtCorreo);
        edtClave = findViewById(R.id.edtClave);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnCerrar = findViewById(R.id.btnCerrar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Correo = edtCorreo.getText().toString().trim();
                String Clave = edtClave.getText().toString().trim();

                if (Correo.equals("")){
                    edtCorreo.setError("Campo Obligatorio");
                    edtCorreo.requestFocus();
                } else if (Clave.equals("")){
                    edtClave.setError("Campo Obligatorio");
                } else if (Correo.equals("andres") && (Clave.equals("123"))){
                    Toast.makeText(getApplicationContext(),"Ingreso Correctamente",Toast.LENGTH_LONG).show();

                    Intent objeto1 = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivityForResult(objeto1,1);
                }




                else{
                    Toast.makeText(getApplicationContext(),"Correo o contraseña invalida",Toast.LENGTH_LONG).show();
                    edtCorreo.setText("");
                    edtClave.setText("");
                }
            }
        });





        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
