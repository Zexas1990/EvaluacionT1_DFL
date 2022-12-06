package com.dam.evaluaciont1_dfl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SeleccionPaisEquipo extends AppCompatActivity implements View.OnClickListener {

    public static String PAIS = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Hide the status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_seleccion_pais_equipo);

        String pais;
        Button btnAlemania = findViewById(R.id.btnAlemania);
        Button btnArabia = findViewById(R.id.btnArabia);
        Button btnArgentina = findViewById(R.id.btnArgentina);
        Button btnAustralia = findViewById(R.id.btnAustralia);
        Button btnBelgica = findViewById(R.id.btnBelgica);
        Button btnBrasil = findViewById(R.id.btnBrasil);
        Button btnCamerun = findViewById(R.id.btnCamerun);
        Button btnCanada = findViewById(R.id.btnCanada);
        Button btnCorea = findViewById(R.id.btnCorea);
        Button btnCostaRica = findViewById(R.id.btnCostaRica);
        Button btnCroacia = findViewById(R.id.btnCroacia);
        Button btnDinamarca = findViewById(R.id.btnDinamarca);
        Button btnEcuador = findViewById(R.id.btnEcuador);
        Button btnEspana = findViewById(R.id.btnEspana);
        Button btnEstadosUnidos = findViewById(R.id.btnEstadosUnidos);
        Button btnFrancia = findViewById(R.id.btnFrancia);
        Button btnGales = findViewById(R.id.btnGales);
        Button btnGhana = findViewById(R.id.btnGhana);
        Button btnHolanda = findViewById(R.id.btnHolanda);
        Button btnInglaterra = findViewById(R.id.btnInglaterra);
        Button btnIran = findViewById(R.id.btnIran);
        Button btnJapon = findViewById(R.id.btnJapon);
        Button btnMarruecos = findViewById(R.id.btnMarruecos);
        Button btnMexico = findViewById(R.id.btnMexico);
        Button btnPolonia = findViewById(R.id.btnPolonia);
        Button btnPortugal = findViewById(R.id.btnPortugal);
        Button btnQatar = findViewById(R.id.btnQatar);
        Button btnSenegal = findViewById(R.id.btnSenegal);
        Button btnSerbia = findViewById(R.id.btnSerbia);
        Button btnSuiza = findViewById(R.id.btnSuiza);
        Button btnTunez = findViewById(R.id.btnTunez);
        Button btnUruguay = findViewById(R.id.btnUruguay);
        Button btnAceptar = findViewById(R.id.btnAceptar);
        Button btnCancelar = findViewById(R.id.btnCancelar);
        TextView txtPais = findViewById(R.id.txtPais);




        btnAlemania.setOnClickListener(this);
        btnArabia.setOnClickListener(this);
        btnArgentina.setOnClickListener(this);
        btnAustralia.setOnClickListener(this);
        btnBelgica.setOnClickListener(this);
        btnBrasil.setOnClickListener(this);
        btnCamerun.setOnClickListener(this);
        btnCanada.setOnClickListener(this);
        btnCorea.setOnClickListener(this);
        btnCostaRica.setOnClickListener(this);
        btnCroacia.setOnClickListener(this);
        btnDinamarca.setOnClickListener(this);
        btnEcuador.setOnClickListener(this);
        btnEspana.setOnClickListener(this);
        btnEstadosUnidos.setOnClickListener(this);
        btnFrancia.setOnClickListener(this);
        btnGales.setOnClickListener(this);
        btnGhana.setOnClickListener(this);
        btnHolanda.setOnClickListener(this);
        btnInglaterra.setOnClickListener(this);
        btnIran.setOnClickListener(this);
        btnJapon.setOnClickListener(this);
        btnMarruecos.setOnClickListener(this);
        btnMexico.setOnClickListener(this);
        btnPolonia.setOnClickListener(this);
        btnPortugal.setOnClickListener(this);
        btnQatar.setOnClickListener(this);
        btnSenegal.setOnClickListener(this);
        btnSerbia.setOnClickListener(this);
        btnSuiza.setOnClickListener(this);
        btnTunez.setOnClickListener(this);
        btnUruguay.setOnClickListener(this);





        //BOTONES DE ACEPTAR Y CANCELAR
        findViewById(R.id.btnAceptar).setOnClickListener(v -> {
            PAIS = txtPais.getText().toString();
            handleAceptar();
        });
        findViewById(R.id.btnCancelar).setOnClickListener(v -> {

            finish();
        });



    }
    //GUARDO LA INFORMACION POR SI SE DESTRUYE EL ACTIVITY AL ROTAR LA PANTALLA
    protected void onSavedInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("PAIS", PAIS);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        PAIS = savedInstanceState.getString("PAIS");
    }



    private void handleAceptar() {
        TextView txtPais = findViewById(R.id.txtPais);
        if(txtPais.getText().toString().equals("")){


            Toast.makeText(this, getString(R.string.no_seleccionado), Toast.LENGTH_SHORT).show();

        }else{
            Intent intent = new Intent();
            intent.putExtra(PAIS, txtPais.getText().toString());
            setResult(RESULT_OK, intent);
            finish();

        }

    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        TextView txtPais = findViewById(R.id.txtPais);
        txtPais.setText(btn.getText().toString());
    }
}