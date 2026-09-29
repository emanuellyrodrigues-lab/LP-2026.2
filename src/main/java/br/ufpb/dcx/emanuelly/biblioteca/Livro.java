package br.ufpb.dcx.emanuelly.biblioteca;

public class Livro {

    private String titulo;
    private String autor;

    public Livro() {
        this("", "");
    }


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    }

    public String toString() {
        return this.titulo + ", escrito por " + this.autor;

    }
}