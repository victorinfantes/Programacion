package ExamenFicheros11;

import java.io.*;

public class Casa4v2 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        BufferedInputStream bis = null;

        String n;

        try {
            fis = new FileInputStream(new File("vocales.dat"));


            while ((n = fis.toString()) != null) {
                System.out.println(n);
            }

        } catch (FileNotFoundException f) {
            f.printStackTrace();
        }

    }
}
