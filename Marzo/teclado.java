package Marzo;

import java.io.IOException;

public class teclado {
    public static void main(String[] args) {
        //Cadena donde iremos almacenando los caracteres que se escriban
        StringBuilder str = new StringBuilder();
        char c;
        // Por si ocurre alguna excepcion ponemos el bloque try catch
        try {
            //Mientras la entrada del teclado no sea Intro
            while ((c = (char) System.in.read()) != '\n') {
                //Añadir el caracter leido a la cadena str
                str.append(c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //Escribir la cadena que se ha ido tecleando
        System.out.println("Cadena introducida: " + str);
    }
}
