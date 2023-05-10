package ExamenFicheros11;

import java.io.*;

public class Casa6v2 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        DataInputStream bis = null;

        int n;
        try {
            fis = new FileInputStream("primos.dat");
            bis = new DataInputStream(fis);


            while (true) {
                n = bis.readInt();
                System.out.println(n);
            }

        }catch (IOException e) {
            e.getStackTrace();
        }
    }
}
