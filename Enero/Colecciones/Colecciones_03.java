package Enero.Colecciones;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Colecciones_03 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Introduzca 10 numeros enteros :");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame un numero: " + (i + 1));
            numeros.add(sc.nextInt());
        }
        //Ordenamos el arrayList
        System.out.println("La lista original es "+numeros);
        Collections.sort(numeros);
        System.out.println("La lista ordenada es : "+numeros);
    }
}
