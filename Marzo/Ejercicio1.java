package Marzo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1.Escribir numeros en un fichero binario
        //Lee numeros enteros por teclado y los escribe en el fichero datos.dat
        //La lectura de datos acaba cuando se introduce -1

        Scanner sc=new Scanner(System.in);
        DataOutputStream salida=null;
        FileOutputStream fos=null;
        int numero;

        try {
            fos = new FileOutputStream("datos.dat");
            salida = new DataOutputStream(fos);
            System.out.println("Introduce numero para escribir al fichero -1 para acabar");
            numero=sc.nextInt();
            while (numero != -1) {
                salida.write(numero);
                System.out.println("Introduce numero para escribir al fichero -1 para acabar");
                numero=sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //fos.close();
        //salida.close();

    }
}
