package ExamenFicheros11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Casa1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce mensaje");
        String mensaje = sc.next();
        String aux = "";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("fichero10.txt", true))) {
            bw.write(mensaje);

            System.out.println("Cerrando flujos");
            bw.close();

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
