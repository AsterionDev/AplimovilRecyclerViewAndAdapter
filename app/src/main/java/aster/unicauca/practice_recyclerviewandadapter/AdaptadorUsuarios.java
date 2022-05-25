package aster.unicauca.practice_recyclerviewandadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorUsuarios extends RecyclerView.Adapter<AdaptadorUsuarios.viewHolderUsuarios> {
    ArrayList<Usuario> listaUsuario;
    public  AdaptadorUsuarios(ArrayList<Usuario> listaUsuario){
        this.listaUsuario = listaUsuario;
    }

    @NonNull
    @Override
    public AdaptadorUsuarios.viewHolderUsuarios onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_usuarios, null,  false);
        return new viewHolderUsuarios(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorUsuarios.viewHolderUsuarios holder, int position) {
        holder.tvNombre.setText(listaUsuario.get(position).getNombre());
        holder.tvDescripcion.setText(listaUsuario.get(position).getDescripcion());
        holder.ivFoto.setImageResource(listaUsuario.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaUsuario.size();
    }

    public class viewHolderUsuarios extends  RecyclerView.ViewHolder{
        TextView tvNombre;
        TextView tvDescripcion;
        ImageView ivFoto;

        public viewHolderUsuarios(@NonNull View itemView) {
            super(itemView);
            tvNombre = (TextView) itemView.findViewById(R.id.idNombre);
            tvDescripcion = (TextView) itemView.findViewById(R.id.idDescripcion);
            ivFoto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
