package Abril;

import java.io.*;
import java.util.StringTokenizer;

public class Ej_resuelto3_Ordenar_Fichero {
    public static void main(String[] args) {
        ordenar("ordename.txt");
    }

    private static void ordenar(String fichero) {
        try {
            File fe = new File(fichero);
            FileReader fr = new FileReader(fe);
            BufferedReader br = new BufferedReader(fr);
            String numeros = new String();
            String linea;
            while ((linea = br.readLine())!= null) {
                numeros = numeros+ linea +" ";
            }
            //Si estoy aqui es porque he leido el fichero completo
            System.out.println(numeros);
            if (fr!=null) fr.close();
            StringTokenizer str;
            boolean ordenado = false;
            while (!ordenado) { //mientras que sea falso
                ordenado = true;
                String anterior, posterior="";
                str = new StringTokenizer(numeros);
                anterior = str.nextToken();
                numeros ="";
                while (str.hasMoreElements()) {
                    posterior=str.nextToken();
                    if (Integer.parseInt(anterior)>Integer.parseInt(posterior)){
                        //Si el primer String es mayor que el segundo
                        //Swapping intercambio
                        String aux = anterior;
                        anterior = posterior;
                        posterior = aux;
                        ordenado = false;
                    }
                    numeros = numeros + anterior + " ";
                    anterior = posterior;
                }
                numeros = numeros + posterior;
                System.out.println(numeros);
            }
            File fs = new File(fichero);
            FileWriter fw = new FileWriter(fs);
            str = new StringTokenizer(numeros);
            while (str.hasMoreTokens()) {
                fw.write(str.nextToken());
                fw.write("\r\n"); //Retorno de carro y salto de linea
            }
            //Ya he terminado de escribir en el fichero
            if (fw != null) fw.close();
        } catch (FileNotFoundException fnf) {
            System.err.println("Fichero no encontrado");
        }
        catch (IOException iof) {
            System.err.println("Error de entrada/salida");
        }
        catch (Exception e) {
            System.err.println("Algún error");
        }
    }
}
