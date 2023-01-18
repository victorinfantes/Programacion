package Enero;

import java.util.Scanner;

public class Matriz_3_3_Sumar {
    public static void main(String[] args) {
        //Suma de dos matrices , se deven sumar los elementos que estan en la misma posición
        //las matrices deben de ser iguales(mismas dimensiones)
        //declaro las tres matrices
        int matriz1[][],matriz[][],suma[][];
        int i,j;//dos enteros para recorrelas
        matriz1=new int[3][3];
        matriz=new int[3][3];
        suma=new int[3][3];
        //Rellenar con valores del usuario
        Scanner sc=new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {//cada valor de j es una celda distinta
                System.out.println("Introduce un valor para matriz 1 ["+i+","+j+"]");
                matriz[i][j]=sc.nextInt();
                System.out.println("Introduce un valor para matriz 2 ["+i+","+j+"]");
                matriz1[i][j]= sc.nextInt();
                suma[i][j]=matriz[i][j]+matriz1[i][j];

            }
        }
        //Mostramos matriz
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
            }
            System.out.print("["+i+","+j+"]="+matriz[i][j]);
        }
        //Mostramos matriz1
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
            }
            System.out.print("["+i+","+j+"]="+matriz1[i][j]);
        }
        //Mostramos suma
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
            }
            System.out.print("["+i+","+j+"]="+suma[i][j]);
        }

    }
}
