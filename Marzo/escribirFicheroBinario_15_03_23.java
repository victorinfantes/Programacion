package Marzo;

import java.io.*;
import java.util.Scanner;

public class escribirFicheroBinario_15_03_23 {

    public static void main(String[] args) {
        //1.Escribir numeros en un fichero binario
        //Lee numeros enteros por teclado y los escribe en el fichero datos.dat
        //La lectura de datos acaba cuando se introduce -1

        Scanner sc = new Scanner(System.in);
        DataOutputStream salida = null;
        FileOutputStream fos = null;
        int numero;

        try {
            fos = new FileOutputStream("datos.dat");
            salida = new DataOutputStream(fos);
            System.out.println("Introduce numero para escribir al fichero -1 para acabar");
            numero = sc.nextInt();
            while (numero != -1) {
                salida.writeInt(numero); //IMPORTANTE : salida.write(numero) NO FUNCIONA TIENES QUE AÑADIR
                //EL TIPO DE DATO QUE QUIERES LEER
                System.out.println("Introduce numero para escribir al fichero -1 para acabar");
                numero = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Gracias por usar nuestra aplicacion");
            sc.close();
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        //fos.close();
        //salida.close();

    }

}


