package ing.agarcia1803.outlook.es;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment
{

    public PrincipalFragment()
    {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_principal, container, false);

        ArrayList<FuenteForo> lista =new ArrayList<>();
        lista.add(new FuenteForo("Imagen numero 1",R.drawable.mascotas,0));

        RecyclerView contenedor = vista.findViewById(R.id.reciclerForo);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new AdaptadorForo(lista));
        contenedor.setLayoutManager(layout);

        return vista;
    }

}
