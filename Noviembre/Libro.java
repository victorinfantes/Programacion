package Noviembre;

public class Libro {

    private String ISBN, Titulo, Autor;
    private int NumeroPaginas;

    public Libro() {
    }


    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        Titulo = titulo;
        Autor = autor;
        NumeroPaginas = numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        NumeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "El libro"+ Titulo +"con ISBN"+ISBN+"creado por el autor"+Autor+"tiene"+NumeroPaginas+"paginas";
    }
}
