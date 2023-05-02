package Marzo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class S11Ejercicio02 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));

            String linea = "";
            while (linea != null) {
                System.out.println(linea + " ");
                linea= br.readLine();
            }
            System.out.println();
            br.close();
        }catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
