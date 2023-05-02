package Marzo.Token;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class token {
    public static void main(String[] args) {
        contarPalabrasyNumeros("c:\\datos\\datos.txt");
    }

    private static void contarPalabrasyNumeros(String nombre_fichero) {
        //DIVIDIR EL FLUJO EN PARTES PARA ANALIZARLO
        StreamTokenizer sTokenizer = null;
        int contapal = 0, numNumeros = 0;
        try {
            sTokenizer = new StreamTokenizer(new FileReader(nombre_fichero));
            while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (sTokenizer.ttype == StreamTokenizer.TT_WORD) {
                    contapal++;
                } else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    numNumeros++;
                }

            }
            System.out.println("Numero de palabras en el fichero: " + contapal);
            System.out.println("Numero de numeros en el fichero: " + numNumeros);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
