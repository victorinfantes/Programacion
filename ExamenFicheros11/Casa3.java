package ExamenFicheros11;

import java.io.*;

public class Casa3 {
    public static void main(String[] args) {

        try {
            leerFichero("fichero.txt");
        }catch (IOException e) {
            e.getStackTrace();
        }

    }

    public static void leerFichero(String fichero) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        String mensaje = "";
        while ((mensaje = br.readLine()) != null){
            System.out.println(mensaje);
        }
    }
}
