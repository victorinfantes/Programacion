package ExamenFicheros11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Repaso02 {
    public static void main(String[] args) {
        /*
        * Ejemplo de uso de la clase file
        * Escritura en un fichero de texto*/

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("frutas.txt"));
            bw.write("manzanas\n");
            bw.write("peras\n");
            bw.write("limones\n");
            bw.write("platanos\n");

            bw.close();
            System.out.println("Fichero cerrado correctamente");
        } catch (IOException e) {
            System.out.println("Error generico de entrada/salida");
        }
    }
}
