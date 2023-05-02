package AceptaElReto;

import java.util.Scanner;

public class p363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calorias= sc.nextInt();
        while (calorias != 0 ) {
            int numComidas = sc.nextInt();
            int caloriasConsumidas = sc.nextInt();
            while (numComidas > 0) {
                caloriasConsumidas = caloriasConsumidas + sc.nextInt();
            }
            int entrenamiento = caloriasConsumidas / calorias;
            if (caloriasConsumidas%calorias > 0 ){
                entrenamiento++;
            }
            System.out.println(entrenamiento);

            calorias = sc.nextInt();
        }
    }
}
