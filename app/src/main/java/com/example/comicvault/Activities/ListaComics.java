package com.example.comicvault.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.comicvault.Activities.CV;
import com.example.comicvault.Datos.ArrayListComics;
import com.example.comicvault.Logica.Comic;
import com.example.comicvault.Logica.MiAdaptador;
import com.example.comicvault.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaComics extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerView;

    private ImageView logo;
    private FloatingActionButton fabCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_comics);

        fabCV = findViewById(R.id.fabCV);
        fabCV.setOnClickListener(this);
        recyclerView = (RecyclerView) findViewById(R.id.rvLista);
        Comic[] lista = ArrayListComics.listaComics();
        MiAdaptador adaptador = new MiAdaptador(lista);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adaptador);
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