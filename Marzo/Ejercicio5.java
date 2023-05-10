package Marzo;

import java.io.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("USO DEL PROGRAMA : S11Ejercicio5 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
            System.exit(-1);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            String lineaOrigen="";
            String lineaDestino="";
            boolean comentarioDeBloque = false;
            int i = 0;

            while ((lineaOrigen = br.readLine()) != null) {

                int l = lineaOrigen.length();
                lineaDestino = lineaOrigen;

                if ((i = lineaOrigen.indexOf("/*")) != -1) {
                    comentarioDeBloque = true;
                    lineaDestino = lineaOrigen.substring(0,i);
                    lineaOrigen = lineaDestino;
                }

                if ((i = lineaOrigen.indexOf("*/")) != -1) {
                    comentarioDeBloque = false;
                    lineaDestino = lineaOrigen.substring(i + 2,1);
                }

                if (((i = lineaOrigen.indexOf("//")) != -1)&& !comentarioDeBloque) {
                    lineaDestino = lineaOrigen.substring(0,i);
                }

                if (!comentarioDeBloque) {
                    bw.write(lineaDestino + "\n");
                }
            }

            br.close();
            bw.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

    }
}
