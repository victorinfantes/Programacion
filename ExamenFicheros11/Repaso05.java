package ExamenFicheros11;

import java.io.File;
import java.util.Scanner;

public class Repaso05 {
    public static void main(String[] args) {
        //Comprobamos que existe un fichero y lo borramos

        Scanner sc = new Scanner(System.in);

        System.out.println("Digame el nombre del fichero que quiere borrar");
        String nombreFichero = sc.next();
        File fichero = new File(nombreFichero);
        if (fichero.exists()) {
            fichero.delete();
            System.out.println("El fichero " + nombreFichero + " ha sido eliminado");
        } else {
            System.out.println("El fichero " + nombreFichero + " no existe");
        }

    }
}
