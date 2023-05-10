package ExamenFicheros11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Casa3V2 {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("fichero.txt");
            br = new BufferedReader(fr);
            String mensaje;
            while ((mensaje = br.readLine()) != null) {
                System.out.println(mensaje);
            }
            System.out.println("Fichero terminado, cerrando flujos");
            fr.close();
            br.close();
        }catch (FileNotFoundException f) {
            f.printStackTrace();
        }
        catch (IOException e) {
            e.getStackTrace();
        }

    }
}
