package Arrays2;

public class Array4_2 {
    public static void main(String[] args) {
        //Creamos un Array
        int numeros[] = {3, 7, 4, 34, 5};
        //creamos una funcion que aplique el metodo quicksort
        //a esta funcion le pasamos el array , el comienzo y el final
        ordenarQuicksort(numeros,0,numeros.length-1);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static void ordenarQuicksort(int[] numeros, int i, int j) {
    }
}
