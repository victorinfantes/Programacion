package Enero.Colecciones;

import java.util.ArrayList;
//Math.random genera un numero aleatorio entre 0 y 1 , lo multiplicamos por 100 para que sea un num de 0 a 100
public class Colecciones_02 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int suma = 0;
        int minimo = 100;
        int maximo = 0;
        int tamanno = (int) (Math.random() * 11 + 10);
        System.out.println("El tamaño del Array es: "+tamanno);
        for (int i = 0; i < tamanno; i++) {
            numeros.add((int) (Math.random() * 101));
            System.out.println("Se ha añadido "+numeros.get(i)+" posicion: "+(i+1));
        }
        System.out.println("Mostramos la suma , el maximo y el minimo");
        for(int n: numeros) {
            if (n<minimo) {
                minimo = n;
            }
            if (n>minimo) {
                maximo = n;
            }
            suma=suma+n;
        }
        System.out.println("La suma total es : "+suma);
        System.out.println("La media total es : "+suma/tamanno);
        System.out.println("El numero maximo es : "+maximo);
        System.out.println("El numero minimo es : "+minimo);



    }
}
