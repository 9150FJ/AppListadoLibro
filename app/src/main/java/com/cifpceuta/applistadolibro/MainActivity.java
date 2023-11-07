package com.cifpceuta.applistadolibro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listaLibros;

    private MiArrayAdapterLibros adapterLibros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaLibros= (ListView) findViewById(R.id.listaLibros);
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Acceso a datos",420,R.drawable.acceso_datos));
        libros.add(new Libro("Lenguaje de marcas",250,R.drawable.lenguaje_marcas));
        libros.add(new Libro("Sistemas informaticos",321,R.drawable.sistemas_informaticos));
        libros.add(new Libro("Administracion de bases",312,R.drawable.administracion_bases));
        libros.add(new Libro("Emtornos",541,R.drawable.entornos));

        adapterLibros = new MiArrayAdapterLibros(this,libros);

        listaLibros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Libro libros = (Libro) adapterLibros.getItem(position);
                Toast.makeText(view.getContext(),"Libro: "+ libros.getTitulo(),Toast.LENGTH_LONG).show();

                intent(position);

            }
        });

        listaLibros.setAdapter(adapterLibros);

    }

    public void intent(int position){
        Intent i = new Intent(this,Activity_Layout_Detalles.class);
        //i.putExtra(adapterLibros.getItem(i));
    }

}