package com.dam.evaluaciont1_dfl;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import datos.Resultado;

public class RegistroResultado extends AppCompatActivity {

    EditText etFecha;
    EditText etFase1;
    EditText etPrimer;
    EditText etSegundo;
    Button btnSelec1;
    Button btnSelec2;
    EditText etGoles1;
    EditText etGoles2;
    Button btnGuardar;
    Button btnLimpiar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);  //Hide the status bar

        setContentView(R.layout.activity_registro_resultado);

        etFecha = findViewById(R.id.fecha);
        etFase1 = findViewById(R.id.fase1);
        etPrimer = findViewById(R.id.primerEquipo);
        etSegundo = findViewById(R.id.segundoEquipo);
        etGoles1 = findViewById(R.id.golesEquipo1);
        etGoles1 = findViewById(R.id.golesEquipo2);
        btnSelec1 = findViewById(R.id.btnSeleccionar1);
        btnSelec2 = findViewById(R.id.btnSeleccionar2);
        btnGuardar = findViewById(R.id.btnGuardar);
        btnLimpiar = findViewById(R.id.btnLimpiar);

        private void elegirEquipoUno() {
            Intent i = new Intent(this, SeleccionPaisEquipo.class);
            startActivityForResult.launch(i);
        }
        ActivityResultLauncher<Intent> startActivityForResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == SeleccionPaisEquipo.RESULT_OK_PAIS) {
                            etPrimer.setText(result.getData().getStringExtra(SeleccionPaisEquipo.NOMBRE_PAIS));
                        }
                    }
                }
        );







        btnSelec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroResultado.this, SeleccionPaisEquipo.class);
                startActivityForResult(i, 1);
            }
        });


        btnSelec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroResultado.this, SeleccionPaisEquipo.class);
                startActivityForResult(i, 1);
            }
        });


        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etFecha.setText("");
                etFase1.setText("");
                etPrimer.setText("");
                etSegundo.setText("");
                etGoles1.setText("");
                etGoles1.setText("");
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fecha = etFecha.getText().toString();
                String fase = etFase1.getText().toString();
                String primer = etPrimer.getText().toString();
                String segundo = etSegundo.getText().toString();
                int goles1 = Integer.parseInt(etGoles1.getText().toString());
                int goles2 = Integer.parseInt(etGoles2.getText().toString());

                Resultado resultado = new Resultado(fecha, fase, primer, segundo, goles1, goles2);
            }
        });

    }
}