package com.dam.evaluaciont1_dfl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnReg;
    Button btnCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LOCALIZO EL BOTON Y IMPLEMENTO A LOGICA PARA ABRIR LA SEGUNDA VENTANA
        btnReg = findViewById(R.id.btnRegistrar);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RegistroResultado.class);
                startActivity(i);
            }
        });

        btnCon = findViewById(R.id.btnConsultar);
        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}