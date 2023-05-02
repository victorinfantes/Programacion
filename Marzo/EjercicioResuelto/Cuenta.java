package Marzo.EjercicioResuelto;

import java.io.File;
import java.io.FileReader;

public class Cuenta {
    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        int palabras = cuentaPalabras("datos.txt");
        System.out.println("hay " +palabras+ " en el fichero");

    }

    private static int cuentaPalabras(String fichero) { //No hace falta poner el nombre del fichero porque arriba
                                                        // fichero es sustituido por datos.txt
        int contador = 0;
        File fe = new File(fichero);

        return 0;
    }
}
