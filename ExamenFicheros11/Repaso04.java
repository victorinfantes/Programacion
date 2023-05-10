package ExamenFicheros11;

import java.io.File;

public class Repaso04 {
    public static void main(String[] args) {
        //Posicionarnos en el directorio actual
        //listar los ficheros que existen en ese directorio

        File f = new File(".");//Indica la ruta actual "."
        String[] listaDeArchivos = f.list(); //Array para meter los ficheros
        for (String nombreArchivo : listaDeArchivos) {
            System.out.println(nombreArchivo);
        }
    }
}
