package com.babel.MVCJSP.models;

public class Libro {
    public Libro(String isbdn, String titulo, String autor) {
        this.isbdn = isbdn;
        this.titulo = titulo;
        this.autor = autor;
    }

    private String isbdn;
    private String titulo;
    private String autor;


    public String getIsbdn() {
        return isbdn;
    }

    public void setIsbdn(String isbdn) {
        this.isbdn = isbdn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
