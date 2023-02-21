package com.example.comicvault.Logica;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.comicvault.R;
import com.example.comicvault.Activities.VistaComic;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {
    private Comic[] listaData;

    public  MiAdaptador(Comic[] listaData){this.listaData = listaData;}
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.contenedor_lista, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Comic myListData = listaData[position];
        holder.titulo.setText(listaData[position].getTitulo());
        holder.autor.setText(listaData[position].getAutor());


        String imageUrl = listaData[position].getImagen();
        Glide.with(holder.itemView.getContext())
                .load(imageUrl)
                .into(holder.portada);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), VistaComic.class);
                intent.putExtra("portada", myListData.getImagen());
                intent.putExtra("titulo", myListData.getTitulo());
                intent.putExtra("autor", myListData.getAutor());
                intent.putExtra("descripcion", myListData.getDescripcion());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return listaData.length; }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView titulo;
        public TextView autor;
        public ImageView portada;

        public ViewHolder (View itemView){
            super(itemView);
            this.titulo = (TextView) itemView.findViewById(R.id.tvTitulo);
            this.autor = (TextView) itemView.findViewById(R.id.tvAutor);
            this.portada = (ImageView) itemView.findViewById(R.id.ivPortada);

        }
    }
}
