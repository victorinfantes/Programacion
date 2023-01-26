package Enero.Colecciones.Disco;

import java.util.Objects;

public class Disco {


    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;
    private int precio;

    public Disco(String codigo, String autor, String titulo, String genero, int duracion, int precio) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disco disco = (Disco) o;
        return duracion == disco.duracion && precio == disco.precio && Objects.equals(codigo, disco.codigo) && Objects.equals(autor, disco.autor) && Objects.equals(titulo, disco.titulo) && Objects.equals(genero, disco.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, autor, titulo, genero, duracion, precio);
    }

    @Override
    public String toString() {
        return "Disco{" +
                "codigo='" + codigo + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", precio=" + precio +
                '}';
    }
}
