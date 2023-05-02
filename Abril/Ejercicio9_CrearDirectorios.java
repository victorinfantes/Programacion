package Abril;

import java.io.File;
import java.io.IOException;

public class Ejercicio9_CrearDirectorios {
    public static void main(String[] args) {
        try {

            //Declaramos una ruta valida
            String direcctorio = "C:\\Users\\dam1\\Desktop\\Arrays2\\ficheros2";
            //Declaramos la estructura de directorios que queremos crear
            String estructura = "C:\\Users\\dam1\\Desktop\\Arrays2\\ficheros2\\carpeta1\\carpeta2\\carpeta3";
            boolean exito = new File(direcctorio).mkdir();
            if (exito) {
                System.out.println("El directorio ha sido creado: " + direcctorio + " con exito");
                new File(estructura).mkdirs();
                exito = new File(estructura).mkdirs();
                if (exito) {
                    System.out.println("La estructura ha sido creado: " + estructura + " con exito");
                }
            }
        } catch (Exception e) {
            System.err.println("Error: "+e.getMessage());
        }
    }
}
