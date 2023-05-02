package Abril;

import java.io.File;

public class TestFichero_6_4_2 {
    public static void main(String[] args) {
        File dir = new File("RUTA ABSOLUTA DEL DIRECTORIO");
        if (dir.exists()) {
            System.out.println("Existe el directorio " + dir.getName());
        } else {
            System.out.println("El directorio no existe");
        }
        if (dir.canRead())
            System.out.println("El directorio existe y tiene permiso de lectura");
        if (dir.canWrite())
            System.out.println("El directorio existe y tiene permiso de escritura");
        File[] ficheros = dir.listFiles();
        for (File f : ficheros)
            System.out.println(f.getName());

    }
}
