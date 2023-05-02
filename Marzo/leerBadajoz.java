package Marzo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leerBadajoz {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("badajoz.txt"));
            String linea = "";int contadorLineas = 0;
            while (linea != null) {
                System.out.println(linea);
                linea = bf.readLine();
                contadorLineas++;
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se ha encontrado");
        }
        catch (IOException e) {
            System.out.println("Error de entrada y salida E/S");
        }
    }
}
