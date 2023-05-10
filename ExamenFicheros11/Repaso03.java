package ExamenFicheros11;

import java.io.*;

public class Repaso03 {
    public static void main(String[] args) {
        //Mezclando ficheros clase file
        try {

            BufferedReader br1 = new BufferedReader(new FileReader("fichero1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("fichero2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"));
            String linea1 = "";
            String linea2 = "";
            System.out.println("Leyendo ficheros y escribiendo la mezcla");
            while ((linea1!=null)||(linea2!=null)) {
                linea1 = br1.readLine();
                linea2 = br2.readLine();
                if (linea1 != null) {
                    bw.write(linea1+"\n");
                }
                if (linea2 != null) {
                    bw.write(linea2+"\n");
                }
            }
            System.out.println("Hemos acabado de procesar los ficheros");
            br1.close();
            br2.close();
            bw.close();

            System.out.println("Flujos cerrados");

        } catch (IOException e){
            System.out.println("Se ha producido un error E/S");
            System.err.println(e.getMessage());
        }
    }
}
