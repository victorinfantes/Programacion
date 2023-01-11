package Arrays2;

import java.util.Arrays;

public class Array2_3 {
    public static void main(String[] args) {
        int numeros[]= {3,4,5,4,3};
        int auxiliar[]=new int[numeros.length];
        //Recorremos el array de izquierda a derecha y al mismo tiempo
        for (int i = numeros.length-1,j=0; i > 0;i--,j++) {
            auxiliar[j]=numeros[i];
        }
        if(Arrays.equals(numeros, auxiliar)){
            System.out.println("El array es capicua");
        }
        else {
            System.out.println("El array NO es capicua");
        }
    }
}
