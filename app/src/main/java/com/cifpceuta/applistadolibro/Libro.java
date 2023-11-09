package com.cifpceuta.applistadolibro;

public class Libro {
    private String titulo;
    private int paginas;

    private int imagen;

    private String descripcion;

    public Libro(String titulo, int paginas, int imagen,String descripcion) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.imagen = imagen;
        this.descripcion=descripcion;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
