package Marzo;

import java.io.*;

public class leerFicheroBinario_10_03_2023 {

    /* Leer números de un fichero binario Lee números del fichero datos.dat. Utilizamos un bucle cuando
    se llega al final del fichero se lanza la excepción EOFException para salir del bucle while.*/
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        int numero;
        try {
            fileInputStream= new FileInputStream("datos.dat");
            dataInputStream= new DataInputStream(fileInputStream);
            while (true) {
                numero=dataInputStream.readInt();
                System.out.println("Numero leido : "+numero);
            }

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (EOFException e){
            System.out.println("Has llegado al final del fichero");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        //hemos llegado al final hay que cerrar los flujos
    }
}
