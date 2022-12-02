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
import android.widget.Toast;

import datos.Resultado;



public class RegistroResultado extends AppCompatActivity {

    private ActivityResultLauncher<Intent> selectPais;
    private ActivityResultLauncher<Intent> selectPais2;


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




        selectPais = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == RESULT_OK) {
                            etPrimer.setText(result.getData().getStringExtra(SeleccionPaisEquipo.PAIS));
                        }
                    }
                });
        selectPais2 = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == RESULT_OK) {
                            etSegundo.setText(result.getData().getStringExtra(SeleccionPaisEquipo.PAIS));
                        }
                    }
                });



        btnSelec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroResultado.this, SeleccionPaisEquipo.class);
                selectPais.launch(i);
            }
        });


        btnSelec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistroResultado.this, SeleccionPaisEquipo.class);
                selectPais2.launch(i);
            }
        });


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etFecha.getText().toString().isEmpty() || etFase1.getText().toString().isEmpty() ||
                        etPrimer.getText().toString().isEmpty() || etSegundo.getText().toString().isEmpty() ||
                        etGoles1.getText().toString().isEmpty() || etGoles2.getText().toString().isEmpty()){
                    Toast.makeText(RegistroResultado.this, "Rellene todos los campos", Toast.LENGTH_SHORT).show();
                }else{
                    String fecha = etFecha.getText().toString();
                    String fase = etFase1.getText().toString();
                    String primer = etPrimer.getText().toString();
                    String segundo = etSegundo.getText().toString();
                    int goles1 = Integer.parseInt(etGoles1.getText().toString());
                    int goles2 = Integer.parseInt(etGoles2.getText().toString());

                    Resultado resultado = new Resultado(fecha, fase, primer, segundo, goles1, goles2);

                    Toast.makeText(RegistroResultado.this, getString(R.string.datos_guardados), Toast.LENGTH_SHORT).show();
                }

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



    }
}