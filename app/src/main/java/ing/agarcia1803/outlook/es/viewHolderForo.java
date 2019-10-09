package ing.agarcia1803.outlook.es;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolderForo extends RecyclerView.ViewHolder implements View.OnClickListener
{
    Button btnUno;
    Button btnDos;
    ImageView imagen;
    TextView titulo;
    int Position;
    List<FuenteForo> ListaObjeto;

    public viewHolderForo(@NonNull View itemView,List<FuenteForo> datos) {
        super(itemView);

        btnUno = (Button) itemView.findViewById(R.id.btnUno);
        btnDos = (Button) itemView.findViewById(R.id.btnDos);
        imagen = (ImageView) itemView.findViewById(R.id.imagen);
        titulo = (TextView) itemView.findViewById(R.id.texto);
        ListaObjeto = datos;

        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();
        FuenteForo objeto = ListaObjeto.get(position);
        if (view.getId()== btnUno.getId()){
            Toast.makeText(btnUno.getContext(),"Presionó el boton 1 del item "+ position+ " Correspondiente al titulo: "+objeto.getTitulo(),Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(btnUno.getContext(),"Presionó el boton del item "+ position+ " Correspondiente al titulo: "+objeto.getTitulo(),Toast.LENGTH_SHORT).show();
        }
    }
}
