package com.example.brenos.movies;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton filme1x1;
    private ImageButton filme1x2;
    private ImageButton filme2x1;
    private ImageButton filme2x2;

    private MoviesList listaFilmes = new MoviesList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filme1x1 = (ImageButton) findViewById(R.id.filme1x1);
        filme1x1.setOnClickListener(this);
        filme1x2 = (ImageButton) findViewById(R.id.filme1x2);
        filme1x2.setOnClickListener(this);
        filme2x1 = (ImageButton) findViewById(R.id.filme2x1);
        filme2x1.setOnClickListener(this);
        filme2x2 = (ImageButton) findViewById(R.id.filme2x2);
        filme2x2.setOnClickListener(this);
        filme1x1.setImageDrawable(getResources(listaFilmes.getFilme(0).getIndDrawable()));

    }

    @Override
    public void onClick(View view) {
        Intent itnt = new Intent(this, MovieDetails.class);
        String nomeFilme;

        for (int i = 0; i < listaFilmes.getQuantidadeFilmes() / 4; i++) {

            switch (view.getId()) {
                case (R.id.filme1x1): {
                    nomeFilme = listaFilmes.getFilme(i).getTitulo();
                    itnt.putExtra(nomeFilme, nomeFilme);
                    break;
                }
                case (R.id.filme1x2): {
                    nomeFilme = listaFilmes.getFilme(i + 1).getTitulo();
                    itnt.putExtra(nomeFilme, nomeFilme);
                    break;
                }
                case (R.id.filme2x1): {
                    nomeFilme = listaFilmes.getFilme(i + 2).getTitulo();
                    itnt.putExtra(nomeFilme, nomeFilme);
                    break;
                }
                case (R.id.filme2x2): {
                    nomeFilme = listaFilmes.getFilme(i + 3).getTitulo();
                    itnt.putExtra(nomeFilme, nomeFilme);
                    break;
                }
            }
        }
        startActivity(itnt);
    }

}
