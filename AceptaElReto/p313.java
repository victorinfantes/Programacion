package AceptaElReto;

import java.util.Scanner;

public class p313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt(),saldo, gastos;
        for (int i = 0; i < entrada; i++) {
            saldo = sc.nextInt();
            gastos = sc.nextInt();

            if (saldo + gastos >= 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
