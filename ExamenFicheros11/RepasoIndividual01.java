package ExamenFicheros11;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class RepasoIndividual01 {
    public static void main(String[] args) {
        //1.Escribir numeros en un fichero binario
        //Lee numeros enteros por teclado y los escribe en el fichero datos.dat
        //La lectura de datos acaba cuando se introduce -1

        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        int numero ;

        try {
            fos = new FileOutputStream("datos.dat");
            dos = new DataOutputStream(fos);

            System.out.println("Introduce un numero a escribir -1 para acabar");
            numero = sc.nextInt();
            while (numero != -1) {
                dos.writeInt(numero);
                System.out.println("Introduce un numero a escribir -1 para acabar");
                numero = sc.nextInt();
            }
            System.out.println("Cerrando flujos");
            fos.close();
            dos.close();
            System.out.println("Flujos cerrados");

        } catch (FileNotFoundException f){
            System.out.println("El fichero no ha sido encontrado");
            f.printStackTrace();
            System.out.println(f.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
