package com.example.comicvault.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.comicvault.Activities.CV;
import com.example.comicvault.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class VistaComic extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivImagen;
    private TextView tvAutor;
    private TextView tvTitulo;
    private TextView tvDescripcion;
    private FloatingActionButton fabCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_comic);

        Bundle extras = getIntent().getExtras();
        String ruta;
        String titulo;
        String autor;
        String descripcion;
        ivImagen = findViewById(R.id.ivPortada2);
        tvTitulo = findViewById(R.id.tvTitulo2);
        tvAutor = findViewById(R.id.tvAutor2);
        tvDescripcion = findViewById(R.id.tvDescripcion);
        fabCV = findViewById(R.id.fabCV);
        fabCV.setOnClickListener(this);


        titulo = extras.getString("titulo");
        autor = extras.getString("autor");
        ruta = extras.getString("portada");
        descripcion = extras.getString("descripcion");

        tvTitulo.setText(titulo);
        tvAutor.setText(autor);
        Glide.with(this)
                .load(ruta)
                .into(ivImagen);
        tvDescripcion.setText(descripcion);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fabCV:
                Intent intent = new Intent(this, CV.class);
                startActivity(intent);
                break;
        }
    }
}