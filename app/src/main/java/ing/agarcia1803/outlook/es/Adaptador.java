package ing.agarcia1803.outlook.es;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter
{
    Context contexto;
    List<DatosList> listaObjetos;

    public Adaptador(Context contexto, List<DatosList> listaObjetos)
    {
        this.contexto = contexto;
        this.listaObjetos = listaObjetos;
    }

    //Este método me va a entregarmee el numero de datos que tenga
    @Override
    public int getCount()
    {
        return listaObjetos.size();
    }

    //Este método retorna el objeto puntual de la posicion que indico
    @Override
    public Object getItem(int posicion)
    {
        return listaObjetos.get(posicion);
    }

    @Override
    public long getItemId(int posicion)
    {
        return listaObjetos.get(posicion).getId();
    }

    //Sera el que se va a ejecutar en cada secuencia que se quiera cargar el contenido del ito en el listview
    @Override
    public View getView(int posicion, View convertView, ViewGroup viewGroup)
    {
        /*Permite obtener acceso al metodo inflate que se
        utilizare basicamente para poder vincular mi layout
        dentro de lo que seria un item del listview*/

        //permitira inyectar el listview y colocarlo a la vista
        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.item_list_view, null); //vista modificada .item_list_view

        ImageView imagen = vista.findViewById(R.id.imageView);
        TextView titulo = vista.findViewById(R.id.txtTitulo);
        TextView descripcion = vista.findViewById(R.id.txtDescripcion);

        //Obtener el elemento de la posicion actual
        titulo.setText(listaObjetos.get(posicion).getTitulo());
        descripcion.setText(listaObjetos.get(posicion).getDetalle());
        imagen.setImageResource(listaObjetos.get(posicion).getImagen());

        return vista;
    }
}
