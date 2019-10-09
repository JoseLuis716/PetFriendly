package ing.agarcia1803.outlook.es;


import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReportesFragment extends Fragment
{
    Spinner spinnersexo;
    Spinner spinnertamaño;
    Spinner spinneredad;
    Spinner spinnercolor;
    ImageView foto;
    FloatingActionButton btnFoto;
    Button enviarreporte;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    public ReportesFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_reportes, container, false);

        spinnersexo = vista.findViewById(R.id.spinnerSexo);
        spinnertamaño = vista.findViewById(R.id.spinnerTamaño);
        spinneredad = vista.findViewById(R.id.spinnerEdad);
        spinnercolor = vista.findViewById(R.id.spinnerColor);
        foto = vista.findViewById(R.id.imageReporte);
        btnFoto = vista.findViewById(R.id.btnCamera);
        enviarreporte = vista.findViewById(R.id.btnSubirReporte);

        ArrayAdapter<CharSequence> adaptersexo = ArrayAdapter.createFromResource(getActivity(), //this is where the error is called
                R.array.sexo, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adaptertamaño = ArrayAdapter.createFromResource(getActivity(), //this is where the error is called
                R.array.tamaños, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapteredad = ArrayAdapter.createFromResource(getActivity(), //this is where the error is called
                R.array.edad, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adaptercolor = ArrayAdapter.createFromResource(getActivity(), //this is where the error is called
                R.array.colores, android.R.layout.simple_spinner_item);

        spinnersexo.setAdapter(adaptersexo);
        spinnertamaño.setAdapter(adaptertamaño);
        spinneredad.setAdapter(adapteredad);
        spinnercolor.setAdapter(adaptercolor);

        //metodo del btnFoto
        btnFoto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                llamarIntent();
            }
        });

        enviarreporte.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getActivity(), "Tu reporte ha sido enviado con Exito", Toast.LENGTH_SHORT).show();
            }
        });

        return vista;
    }

    public void llamarIntent()
    {
        Intent tomarfoto = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if(tomarfoto.resolveActivity(getActivity().getPackageManager()) != null)
        {
            startActivityForResult(tomarfoto, REQUEST_IMAGE_CAPTURE);
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK)
        {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            foto.setImageBitmap(imageBitmap);
        }
    }

}
