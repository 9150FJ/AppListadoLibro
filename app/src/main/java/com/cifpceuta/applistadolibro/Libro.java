package com.cifpceuta.applistadolibro;

public class Libro {
    private String titulo;
    private int paginas;

    private int imagen;

    public Libro(String titulo, int paginas, int imagen) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.imagen = imagen;
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
