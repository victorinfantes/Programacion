package Enero;

public class Matriz_5_5 {
    public static void main(String[] args) {

        int matriz[][]; // definimos t como una tabla bidimensional

        matriz = new int[5][5]; // creamos la tabla de 5x5

        for (int fila = 0;fila < 5; fila++) // utilizamos i para la primera dimensión

        {

            for (int columna = 0; columna < 5; columna++) // utilizamos j para la segunda dimensión

            {

                matriz[fila][columna] = fila + columna;

            }

        }//rellenada



        //ahora la recorremos y la mostramos

        System.out.println("TABLA : ");



        for (int i = 0; i < matriz.length; i++) {

            System.out.println("");

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }

        }

    }

}


