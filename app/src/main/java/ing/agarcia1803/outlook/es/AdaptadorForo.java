package ing.agarcia1803.outlook.es;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorForo extends RecyclerView.Adapter<viewHolderForo>
{
    List<FuenteForo> ListaObjeto;

    public AdaptadorForo(List<FuenteForo> listaObjeto) {
        ListaObjeto = listaObjeto;
    }

    @Override
    public viewHolderForo onCreateViewHolder(ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.principal_card_item,parent,false);
        return new viewHolderForo(vista,ListaObjeto);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderForo holder, int position) {

    }

    @Override
    public int getItemCount() {
        return ListaObjeto.size();
    }
}
