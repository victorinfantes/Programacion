package Abril;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6ContarVocales {
    public static void main(String[] args) {
        String nombreFichero;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        try {//Pedimos el nombre del fichero
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el nombre del fichero");
            nombreFichero = teclado.next();
            //conectamos los flujos para leer , entonces un fr y un br
            BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
            String nuevaLinea = br.readLine();
            while (nuevaLinea != null) {
                System.out.println(nuevaLinea);//debemos averiguar cuantos caracteres tiene
                int longitud = nuevaLinea.length();
                int indice = 0;
                char letra;
                do {//necesito conseguir un caracter de la linea
                    letra = nuevaLinea.toLowerCase().charAt(indice); //charAT se posiciona en la posicion que se le pase por parametro
                    switch (letra) {
                        case 'a': a++;break;
                        case 'e': e++;break;
                        case 'i': i++;break;
                        case 'o': o++;break;
                        case 'u': u++;break;
                        default:break;
                    }
                    indice++;
                }while (indice < longitud);
                //ai estoy aqui, es que he acabado de chequear una linea: siguiente linea
                nuevaLinea = br.readLine();
            }
            //si estoy aqui, ya he terminado de procesar todos los caracteres y los imprimo
            System.out.println("Cantidad de letras 'a' en la frase"+a);
            System.out.println("Cantidad de letras 'e' en la frase"+e);
            System.out.println("Cantidad de letras 'i' en la frase"+i);
            System.out.println("Cantidad de letras 'o' en la frase"+o);
            System.out.println("Cantidad de letras 'u' en la frase"+u);
        } catch (FileNotFoundException ex) {
            System.err.println("Fichero no encontrado");
        } catch (IOException eio) {
            System.err.println("Error de entrada/salida"+eio);
        } catch (Exception ex) {
            System.err.println("Error generico"+ex);
        }
    }
}
