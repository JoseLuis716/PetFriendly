package ing.agarcia1803.outlook.es;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MiMascotaFragment extends Fragment
{
    ListView listViewMain;
    ArrayList<DatosList> lista;

    public MiMascotaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_mi_mascota, container, false);

        listViewMain = vista.findViewById(R.id.listViewPrincipal);
        lista = new ArrayList<DatosList>();

        lista.add(new DatosList(1, "Rocky", "Raza Puppy color hueso claro", R.drawable.pet1));

        //Creacion del adapter
        Adaptador miadaptador = new Adaptador(getContext(),lista);
        listViewMain.setAdapter(miadaptador);

        return vista;
    }

}
