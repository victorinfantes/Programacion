package Arrays2;

public class Array4_1 {
    public static void main(String[] args) {
        int numeros[] = {1, 23, 543, 5, 2, 6, 8, 34, 65, 7, 45};
        ordenarBurbuja(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "_|_");
        }
    }

    private static void ordenarBurbuja(int[] vector) {
        int cuentaintercambio = 0;
        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    int variableauxiliar = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = variableauxiliar;
                    cuentaintercambio++;
                }
            }
            if (cuentaintercambio == 0) {
                ordenado = true;
            }
        }
    }
}
