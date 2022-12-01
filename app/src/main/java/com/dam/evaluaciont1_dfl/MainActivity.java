package com.dam.evaluaciont1_dfl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnReg;
    Button btnCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();  //Hide the action bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);  //Hide the status bar

        setContentView(R.layout.activity_main);

        //LOCALIZO EL BOTON E IMPLEMENTO A LOGICA PARA ABRIR LA SEGUNDA VENTANA
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