package Abril;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio8_FiltrarFicheros {
    public static void main(String[] args) {
        String nombre_fichero, extension;
        System.out.println("Escribe la ruta");
        Scanner sc = new Scanner(System.in);
        nombre_fichero = sc.next();
        System.out.println("Escribe la extension");
        extension = sc.next();
        File file = new File(nombre_fichero);
        if (file.isDirectory()) {
            String[] ficheros = file.list();
            for (String f : ficheros) {
                if (f.endsWith(extension)) {
                    System.out.println(f);
                }
            }
        }
    }
}
