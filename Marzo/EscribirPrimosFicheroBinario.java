package Marzo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//Escribe un programa que guarde en un fichero con nombre primos.dat, los numeros que hay entre 1 y 500
public class EscribirPrimosFicheroBinario {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            for (int i = 0; i < 501; i++) {
                if (esPrimo(i)) {
                    bw.write(String.valueOf(i) + "\n");
                }

            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
    }

    private static boolean esPrimo(int primo) {
        for (int i = 2; i < primo; i++) {
            if ((primo % i == 0)) {
                return false;
            }
        }
        return true;
    }
}
