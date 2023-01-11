package Arrays2;

public class Array2_3Capicua {
    public static void main(String[] args) {
        int numeros[] = {3, 4, 5, 4, 3};
        boolean capicua = true;
        int i = numeros.length - 1;
        int j = 0;

        while (i > ((numeros.length) / 2) && (capicua == true)) {
            if ((numeros[j]) != (numeros[i]))
            {
                capicua = false;
            }
            j++;
            i--;
        }
        System.out.println("¿Es el Array Capicúa?"+ capicua);

    }
}
