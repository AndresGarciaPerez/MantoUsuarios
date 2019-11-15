package com.example.crudusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {

    Button btnMenu, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        btnMenu = findViewById(R.id.btnMenu);
        btnRegresar = findViewById(R.id.btnRegresar);

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
