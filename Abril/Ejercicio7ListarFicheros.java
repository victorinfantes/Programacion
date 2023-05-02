package Abril;

import java.io.File;
import java.util.Scanner;

public class Ejercicio7ListarFicheros {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\dam1\\Desktop\\";
        Scanner sc = new Scanner(System.in);
        ruta = sc.next();
        File file = new File(ruta);
        if (file.isDirectory()) {
            File[] ficheros = file.listFiles();
            for (File f : ficheros) {
                System.out.println(f.getName());
            }
        }
    }
}
