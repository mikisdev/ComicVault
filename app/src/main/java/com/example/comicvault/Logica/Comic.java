package com.example.comicvault.Logica;

public class Comic {
    private String titulo;
    private String imagen;
    private String autor;

    private String descripcion;

    public Comic(String titulo, String imagen, String autor, String descripcion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
