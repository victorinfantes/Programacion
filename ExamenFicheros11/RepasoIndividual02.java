package ExamenFicheros11;

import java.io.*;

public class RepasoIndividual02 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        DataInputStream dis = null;
        int numero;




        try {
            fis = new FileInputStream("datos.dat");
            dis = new DataInputStream(fis);

            while (true) {
                numero = dis.readInt();
                System.out.println(numero);
            }

        } catch (FileNotFoundException f) {
            f.printStackTrace();
            System.out.println("Fichero no encotrado");
            System.out.println(f.getMessage());
        } catch (EOFException eof) {
            eof.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Tenenmos que cerrar los flujos

    }
}
