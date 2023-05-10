package ExamenFicheros11;

import java.io.*;
import java.util.Scanner;

public class Casa4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FileOutputStream fos = null;
        DataOutputStream dos = null;


        String n;

        try {
            fos = new FileOutputStream("vocales.dat");
            dos = new DataOutputStream(fos);

            System.out.println("Escribe lo que sea -1 para terminar");
            n = sc.next();
            while (!n.equals("-1")) {
                dos.writeChars(n);
                System.out.println("Escribe lo que esa -1 para terminar");
                n = sc.next();
            }

        }catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                if (fos != null ){
                    fos.close();
                }
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.getStackTrace();
            }

        }
    }
}
