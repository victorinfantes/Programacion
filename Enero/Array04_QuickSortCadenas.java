package Enero;

public class Array04_QuickSortCadenas {
    public static void main(String[] args) {
        //Creamos el array
        String cadenas[] = {"Fernando", "Alejandro", "Miguel Angel", "Daniel", "Pablo", "Sergio"};
        //llamamos a la funcion de ordenazión
        ordenacionQuicksort(cadenas, 0, cadenas.length - 1);
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Alumno Posicion:"+i+" "+cadenas[i]);
        }
    }

    private static void ordenacionQuicksort(String[] array, int izq, int der) {
        int i = izq;
        int j = der;
        int pivote = (i + j) / 2; //es la posicion del centro
        do {
            while (array[i].compareToIgnoreCase(array[pivote]) < 0) {
                i++;//saldra del bucle cuando encuentro un bucle mayor que el pivote
            }
            //miramos si hay algun elemento a la izquierda del pivote que sea mayor que el pivote
            //miramos si hay algun elemento a la derecha del pivote que sea menor que el pivote
            while (array[j].compareToIgnoreCase(array[pivote]) > 0) {
                j--;
            }
            if (i <= j) {//necesitamos crear una variable auxiliar para no perder uno de los valores i/j
                String auxiliar = array[i];
                array[i] = array[j];
                array[j] = auxiliar;
                i++;
                j--;
            }

        } while (i <= j);
        if (izq < j) {
            ordenacionQuicksort(array, izq, j);
        }
        if (i < der) {
            ordenacionQuicksort(array, i, der);
        }
    }
}



