package ExamenFicheros11;

import java.io.*;
import java.util.Scanner;

public class Casa5 {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        String fichero;
        int suma = 0;
        String linea;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero");

        try {
            fr = new FileReader(sc.next());
            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                suma = suma + Integer.parseInt(linea);
            }
            System.out.println(suma);

        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            }catch (IOException e) {
                e.getStackTrace();
            }
        }

    }

}
