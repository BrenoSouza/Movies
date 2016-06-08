package com.example.brenos.movies;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MovieDetails extends AppCompatActivity {

    private TextView titulo;
    private TextView ano;
    private TextView duracao;
    private TextView nota;
    private TextView descricao;
    private ImageView posterMovie;
    private CheckBox checkIsFavorito;
    private ImageButton play;
    private SharedPreferences shared_pref;
    private MoviesList listaFilme = new MoviesList();
    private Movie movie;
    public static final String FAVORITOS = "FilmesFavoritos";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        Bundle bundle = getIntent().getExtras();

        ano = (TextView) findViewById(R.id.ano);
        titulo = (TextView) findViewById(R.id.titulo);
        duracao = (TextView) findViewById(R.id.duracao);
        nota = (TextView) findViewById(R.id.nota);
        descricao = (TextView) findViewById(R.id.descricao);
        posterMovie = (ImageView) findViewById(R.id.posterMovie);
        checkIsFavorito = (CheckBox) findViewById(R.id.isFavorito);

        play = (ImageButton) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent trailerIntent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(movie.getTrailer()));
                startActivity(trailerIntent);
            }
        });


        for (int i = 0; i < listaFilme.getQuantidadeFilmes() / 4; i++) {

            if (bundle.containsKey(listaFilme.getFilme(i).getTitulo())) {
                movie = listaFilme.searchByTitle(listaFilme.getFilme(i).getTitulo());
                posterMovie.setImageDrawable(getResources().getDrawable(movie.getIndDrawable()));
                setTexts();
            } else if (bundle.containsKey(listaFilme.getFilme(i + 1).getTitulo())) {
                movie = listaFilme.searchByTitle(listaFilme.getFilme(i + 1).getTitulo());
                posterMovie.setImageDrawable(getResources().getDrawable(movie.getIndDrawable()));
                setTexts();
            } else if (bundle.containsKey(listaFilme.getFilme(i + 2).getTitulo())) {
                movie = listaFilme.searchByTitle(listaFilme.getFilme(i + 2).getTitulo());
                posterMovie.setImageDrawable(getResources().getDrawable(movie.getIndDrawable()));
                setTexts();
            } else if (bundle.containsKey(listaFilme.getFilme(i + 3).getTitulo())) {
                movie = listaFilme.searchByTitle(listaFilme.getFilme(i + 3).getTitulo());
                posterMovie.setImageDrawable(getResources().getDrawable(movie.getIndDrawable()));
                setTexts();
            }
        }

        SharedPreferences settings = getSharedPreferences(FAVORITOS, 0);
        checkIsFavorito.setChecked(settings.getBoolean(movie.getTitulo(), false));

    }


    private void setTexts() {
        titulo.setText(movie.getTitulo());
        ano.setText(movie.getAno());
        duracao.setText(movie.getDuracao());
        nota.setText(movie.getNota());
        descricao.setText(movie.getDescricao());
    }

    @Override
    protected void onStop() {
        super.onStop();

        SharedPreferences configuracao = getSharedPreferences(FAVORITOS, 0);
        SharedPreferences.Editor editor = configuracao.edit();
        editor.putBoolean(movie.getTitulo(), checkIsFavorito.isChecked());

        editor.commit();
    }
}
