package fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dam.evaluaciont1_dfl.R;

import java.util.ArrayList;

import datos.ListaResultados;
import datos.Resultado;


public class ConsultaFragment extends Fragment {
    private static final String ARG_EQUIPO = "EQUIPO";
    private String equipo;
    ListaResultados listaResultados = new ListaResultados();

    TextView tvFase;
    TextView tvFecha;
    TextView tvEquipoUno;
    TextView tvEquipoDos;
    TextView tvSeparador;
    TextView tvGolesUno;
    TextView tvGolesDos;
    TextView tvFase2;
    TextView tvFecha2;
    TextView tvEquipoUno2;
    TextView tvEquipoDos2;
    TextView tvSeparador2;
    TextView tvGolesUno2;
    TextView tvGolesDos2;
    TextView tvFase3;
    TextView tvFecha3;
    TextView tvEquipoUno3;
    TextView tvEquipoDos3;
    TextView tvSeparador3;
    TextView tvGolesUno3;
    TextView tvGolesDos3;
    TextView tvFase4;
    TextView tvFecha4;
    TextView tvEquipoUno4;
    TextView tvEquipoDos4;
    TextView tvSeparador4;
    TextView tvGolesUno4;
    TextView tvGolesDos4;
    TextView tvFase5;
    TextView tvFecha5;
    TextView tvEquipoUno5;
    TextView tvEquipoDos5;
    TextView tvSeparador5;
    TextView tvGolesUno5;
    TextView tvGolesDos5;
    TextView tvFase6;
    TextView tvFecha6;
    TextView tvEquipoUno6;
    TextView tvEquipoDos6;
    TextView tvSeparador6;
    TextView tvGolesUno6;
    TextView tvGolesDos6;
    TextView tvFase7;
    TextView tvFecha7;
    TextView tvEquipoUno7;
    TextView tvEquipoDos7;
    TextView tvSeparador7;
    TextView tvGolesUno7;
    TextView tvGolesDos7;

    public ConsultaFragment() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 nombre del equipo.
     * @return A new instance of fragment ConsultaFragment.
     */

    public static ConsultaFragment newInstance(String param1) {
        ConsultaFragment fragment = new ConsultaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_EQUIPO, param1);
        fragment.setArguments(args);
        return fragment;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            equipo = getArguments().getString(ARG_EQUIPO);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_consulta, container, false);

        tvFase = vista.findViewById(R.id.tvFase);
        tvFecha = vista.findViewById(R.id.tvFecha);
        tvEquipoUno = vista.findViewById(R.id.tvEquipoUno);
        tvEquipoDos = vista.findViewById(R.id.tvEquipoDos);
        tvGolesUno = vista.findViewById(R.id.tvGolesEquipoUno);
        tvGolesDos = vista.findViewById(R.id.tvGolesEquipoDos);
        tvSeparador = vista.findViewById(R.id.tvSeparador);
        tvFase2 = vista.findViewById(R.id.tvFase2);
        tvFecha2 = vista.findViewById(R.id.tvFecha2);
        tvEquipoUno2 = vista.findViewById(R.id.tvEquipoUno2);
        tvEquipoDos2 = vista.findViewById(R.id.tvEquipoDos2);
        tvGolesUno2 = vista.findViewById(R.id.tvGolesEquipoUno2);
        tvGolesDos2 = vista.findViewById(R.id.tvGolesEquipoDos2);
        tvSeparador2 = vista.findViewById(R.id.tvSeparador2);
        tvFase3 = vista.findViewById(R.id.tvFase3);
        tvFecha3 = vista.findViewById(R.id.tvFecha3);
        tvEquipoUno3 = vista.findViewById(R.id.tvEquipoUno3);
        tvEquipoDos3 = vista.findViewById(R.id.tvEquipoDos3);
        tvGolesUno3 = vista.findViewById(R.id.tvGolesEquipoUno3);
        tvGolesDos3 = vista.findViewById(R.id.tvGolesEquipoDos3);
        tvSeparador3 = vista.findViewById(R.id.tvSeparador3);
        tvFase4 = vista.findViewById(R.id.tvFase4);
        tvFecha4 = vista.findViewById(R.id.tvFecha4);
        tvEquipoUno4 = vista.findViewById(R.id.tvEquipoUno4);
        tvEquipoDos4 = vista.findViewById(R.id.tvEquipoDos4);
        tvGolesUno4 = vista.findViewById(R.id.tvGolesEquipoUno4);
        tvGolesDos4 = vista.findViewById(R.id.tvGolesEquipoDos4);
        tvSeparador4 = vista.findViewById(R.id.tvSeparador4);
        tvFase5 = vista.findViewById(R.id.tvFase5);
        tvFecha5 = vista.findViewById(R.id.tvFecha5);
        tvEquipoUno5 = vista.findViewById(R.id.tvEquipoUno5);
        tvEquipoDos5 = vista.findViewById(R.id.tvEquipoDos5);
        tvGolesUno5 = vista.findViewById(R.id.tvGolesEquipoUno5);
        tvGolesDos5 = vista.findViewById(R.id.tvGolesEquipoDos5);
        tvSeparador5 = vista.findViewById(R.id.tvSeparador5);
        tvFase6 = vista.findViewById(R.id.tvFase6);
        tvFecha6 = vista.findViewById(R.id.tvFecha6);
        tvEquipoUno6 = vista.findViewById(R.id.tvEquipoUno6);
        tvEquipoDos6 = vista.findViewById(R.id.tvEquipoDos6);
        tvGolesUno6 = vista.findViewById(R.id.tvGolesEquipoUno6);
        tvGolesDos6 = vista.findViewById(R.id.tvGolesEquipoDos6);
        tvSeparador6 = vista.findViewById(R.id.tvSeparador6);
        tvFase7 = vista.findViewById(R.id.tvFase7);
        tvFecha7 = vista.findViewById(R.id.tvFecha7);
        tvEquipoUno7 = vista.findViewById(R.id.tvEquipoUno7);
        tvEquipoDos7 = vista.findViewById(R.id.tvEquipoDos7);
        tvGolesUno7 = vista.findViewById(R.id.tvGolesEquipoUno7);
        tvGolesDos7 = vista.findViewById(R.id.tvGolesEquipoDos7);
        tvSeparador7 = vista.findViewById(R.id.tvSeparador7);

        ArrayList<Resultado> resultados;

        resultados = listaResultados.comprobarResultados(equipo);


        for (int i = 0; i < resultados.size(); i++) {
            if (i == 0) {
                tvFase.setText(resultados.get(i).getFase());
                tvFecha.setText(resultados.get(i).getFecha());
                tvEquipoUno.setText(resultados.get(i).getPrimer());
                tvEquipoDos.setText(resultados.get(i).getSegundo());
                tvGolesUno.setText(String.valueOf(resultados.get(i).getGoles1()));
                tvGolesDos.setText(String.valueOf(resultados.get(i).getGoles2()));

            } else if (i == 1) {
                tvFase2.setText(resultados.get(i).getFase());
                tvFecha2.setText(resultados.get(i).getFecha());
                tvEquipoUno2.setText(resultados.get(i).getPrimer());
                tvEquipoDos2.setText(resultados.get(i).getSegundo());
                tvGolesUno2.setText(String.valueOf(resultados.get(i).getGoles1()));
                tvGolesDos2.setText(String.valueOf(resultados.get(i).getGoles2()));

            } else if (i == 2) {
                tvFase3.setText(resultados.get(i).getFase());
                tvFecha3.setText(resultados.get(i).getFecha());
                tvEquipoUno3.setText(resultados.get(i).getPrimer());
                tvEquipoDos3.setText(resultados.get(i).getSegundo());
                tvGolesUno3.setText(String.valueOf(resultados.get(i).getGoles1()));
                tvGolesDos3.setText(String.valueOf(resultados.get(i).getGoles2()));

            } else if (i == 3) {
                tvFase4.setText(resultados.get(i).getFase());
                tvFecha4.setText(resultados.get(i).getFecha());
                tvEquipoUno4.setText(resultados.get(i).getPrimer());
                tvEquipoDos4.setText(resultados.get(i).getSegundo());
                tvGolesUno4.setText(String.valueOf(resultados.get(i).getGoles1()));
                tvGolesDos4.setText(String.valueOf(resultados.get(i).getGoles2()));

            } else if (i == 4) {
                tvFase5.setText(resultados.get(i).getFase());
                tvFecha5.setText(resultados.get(i).getFecha());
                tvEquipoUno5.setText(resultados.get(i).getPrimer());
                tvEquipoDos5.setText(resultados.get(i).getSegundo());
                tvGolesUno5.setText(String.valueOf(resultados.get(i).getGoles1()));
                tvGolesDos5.setText(String.valueOf(resultados.get(i).getGoles2()));

            } else if (i == 5) {
                tvFase6.setText(resultados.get(i).getFase());
                tvFecha6.setText(resultados.get(i).getFecha());
                tvEquipoUno6.setText(resultados.get(i).getPrimer());
                tvEquipoDos6.setText(resultados.get(i).getSegundo());
                tvGolesUno6.setText(String.valueOf(resultados.get(i).getGoles1()));
                tvGolesDos6.setText(String.valueOf(resultados.get(i).getGoles2()));

            } else if (i == 6) {
                tvFase7.setText(resultados.get(i).getFase());
                tvFecha7.setText(resultados.get(i).getFecha());
                tvEquipoUno7.setText(resultados.get(i).getPrimer());
                tvEquipoDos7.setText(resultados.get(i).getSegundo());
                tvGolesUno7.setText(String.valueOf(resultados.get(i).getGoles1()));
                tvGolesDos7.setText(String.valueOf(resultados.get(i).getGoles2()));

            }
        }



        return vista;
    }


}