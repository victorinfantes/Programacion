package Marzo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EscribirVocalesFicheroBinario {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        FileOutputStream fos = null;

        DataOutputStream salida = null;

        String n;

        try {
            fos = new FileOutputStream("datosbinarios.dat");
            salida = new DataOutputStream(fos);
            System.out.println("Introduce numero entero. -1 para acabar");
            n=sc.next();
            while (!n.equals("-1")) {
                salida.writeChars(n);
                System.out.println("Introduce numero entero. -1 para acabar");
                n=sc.next();
            }
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
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


    }
}
