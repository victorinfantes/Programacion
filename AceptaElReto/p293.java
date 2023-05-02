package AceptaElReto;

import java.util.Scanner;

public class p293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int botesBichos = sc.nextInt();
        int[] bichos = new int[5];
        for (int i = 0; i < botesBichos; i++) {
            for (int j = 0; j < bichos.length; j++) {
                bichos[j]=sc.nextInt();
            }
            int suma = 0;
            suma =bichos[0]*6+bichos[1]*8+bichos[2]*10+bichos[3]*bichos[4]*2;
            System.out.println(suma);
        }
        sc.close();
    }
}
