package Marzo;


import java.io.*;

public class EjercicioResuelto2 {
    public static void main(String[] args) {
        aplicaCensura("datos.txt","censura.txt","salida.txt");

    }

    private static void aplicaCensura(String fentrada, String fcensura, String fsalida) {
        try {
            File fe = new File(fentrada);
            FileReader fr = new FileReader(fe);
            BufferedReader br = new BufferedReader(fr);

            File fs = new File(fsalida);
            FileWriter fw = new FileWriter(fs);
            BufferedWriter bw = new BufferedWriter(fw);

        } catch (FileNotFoundException e) {
            System.err.println("No se encuentra algun fichero: "+fentrada+" "+fcensura+" "+fsalida);
        }
        catch (IOException e) {
            System.err.println("Error al procesar : "+fentrada+" "+fcensura+" "+fsalida);
        }

    }
}
