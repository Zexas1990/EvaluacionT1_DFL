package com.dam.evaluaciont1_dfl;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import fragmentos.ConsultaFragment;

public class ConsultaResultado extends AppCompatActivity {


    private ActivityResultLauncher<Intent> selectPais;
    Button btnConsultar;
    EditText eTequipoConsultado;
    int contador = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);  //Hide the status bar
        setContentView(R.layout.activity_consulta_resultado);




        btnConsultar = findViewById(R.id.btnConsultar);
        eTequipoConsultado = findViewById(R.id.eTequipoConsultado);




        selectPais = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == RESULT_OK) {
                            eTequipoConsultado.setText(result.getData().getStringExtra(SeleccionPaisEquipo.PAIS));

                            iniciarFragmento();
                        }
                    }
                });


        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eTequipoConsultado.setEnabled(true);

                if(contador == 1){
                Intent intent = new Intent(ConsultaResultado.this, SeleccionPaisEquipo.class);
                selectPais.launch(intent);

                btnConsultar.setText(getString(R.string.limpiar_datos));
                }else if (contador ==2){
                    eTequipoConsultado.setText("");
                    borarFragmento();
                    btnConsultar.setText(getString(R.string.btn_ConsultarEquipo));

                    contador = 0;
                }



                contador++;
            }
        });
    }

    private void borarFragmento() {

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.flContenedor);
        if(fragment != null){
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }
    }

    private void iniciarFragmento() {

        //INICIAMOS EL FRAGMENTO Y LE PASAMOS EL PARAMETRO DEL EQUIPO CONSULTADO
        String equipo = eTequipoConsultado.getText().toString();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.flContenedor, ConsultaFragment.newInstance(equipo));
        ft.addToBackStack(null);
        ft.commit();
    }


}