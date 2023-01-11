package Arrays2;

import java.util.Arrays;

public class Array3_2 {
    public static void main(String[] args) {
        int numeros[] = {3, 4, 5, 7, 3};
        int numeros2[] = new int[numeros.length];
        numeros2 = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Recorro el Array1");
        for (int i = 0; i < numeros.length - 1; i++) {
            System.out.print(numeros[i]);
        }

        System.out.println("Recorro el Array2");
        for (int i = 0; i < numeros.length - 1; i++) {
            System.out.print(numeros2[i]);
        }


    }
}
