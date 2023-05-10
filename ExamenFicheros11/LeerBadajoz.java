package ExamenFicheros11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerBadajoz {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("badajoz.txt"))){

            String cadena;
            while ((cadena = br.readLine()) != null) {
                System.out.println(cadena);
            }
            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
