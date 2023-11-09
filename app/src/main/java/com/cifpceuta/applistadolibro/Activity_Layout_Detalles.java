package com.cifpceuta.applistadolibro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Layout_Detalles extends AppCompatActivity {


    TextView tvtitulo,tvdescripcion,tvpaginas;
    ImageView ivimagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_detalles);
        Intent i = this.getIntent();
        int imagen= i.getIntExtra("imagen",0);
        int paginas=i.getIntExtra("paginas",0);
        String titulo=i.getStringExtra("titulo");
        String descripcion=i.getStringExtra("descripcion");

        tvtitulo=(TextView)findViewById(R.id.textviewTitulo);
        tvdescripcion=(TextView)findViewById(R.id.textviewDescripcion);
        tvpaginas=(TextView)findViewById(R.id.textviewPaginas);
        ivimagen=(ImageView) findViewById(R.id.portada);
        ivimagen.setImageResource(imagen);
        tvtitulo.setText(titulo);
        tvpaginas.setText(String.valueOf(paginas));
        tvdescripcion.setText(descripcion);

    }

    public void volver(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}