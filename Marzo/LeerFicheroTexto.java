package Marzo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto {
    public static void main(String[] args) {
        try {
            LeerFichero("ficheroMiercoles.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ha habido algun tipo de error entrada salida E/S");
        }
    }

    private static void LeerFichero(String fichero) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(fichero));
        String linea="";int contador = 0;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
            contador++;
        }
        System.out.println("Su fichero tiene "+contador+" lineas");
    }
}
