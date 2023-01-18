package Enero;

import java.util.Scanner;

public class Matriz_4_4_Simetrica {
    public static void main(String[] args) {

        int matriz[][]; //Matriz de enteros de dos dimensiones
        boolean simetrica;
        int i, j;//Dos enteros para recorrer la matriz
        matriz = new int[4][4];//declara la matriz
        //ahora rellenamos de datos , pedimos al usuario
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Introduce un valor para esta celda "+" ["+i+","+j+"]");
                matriz[i][j]=sc.nextInt();
            }

        }
        //Imprimimos la matriz
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("["+i+","+j+"]="+matriz[i][j]);
            }
            System.out.println("");
        }
        simetrica=true;
        i=0;
        while(i<4&&(simetrica=true)) {
            j=0;
            while(j<4&&(simetrica=true)) {
                if (matriz[i][j]!=matriz[j][i]) {
                    simetrica=false;
                }
                j++;//siguiente columna
            }
            i++;//siguiente fila
        }
        //ha salido, o por que he procesado todas las celdas(bucles terminados)
        //o por que no es simetrica
        if(simetrica) {
            System.out.println("La matriz es simetrica");
        }
        else {
            System.out.println("La matriz NO es simetrica");
            }

    }
}
