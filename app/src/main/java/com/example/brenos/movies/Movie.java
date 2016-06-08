package com.example.brenos.movies;

import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

public class Movie {

    private String titulo;
    private String ano;
    private String duracao;
    private String nota;
    private boolean isFavorito;
    private String descricao;
    private int imagemDrawable;

    private String trailer;

    public Movie(String titulo, String ano, String duracao, String nota, String descricao, boolean isFavorito, int imagemDrawable, String trailer) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
        this.nota = nota;
        this.descricao = descricao;
        this.isFavorito = isFavorito;
        this.imagemDrawable = imagemDrawable;
        this.trailer = trailer;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAno() {
        return ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getNota() { return nota; }

    public boolean isFavorito() {
        return isFavorito;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIndDrawable() { return imagemDrawable; }

    public String getTrailer() { return trailer; }
}
