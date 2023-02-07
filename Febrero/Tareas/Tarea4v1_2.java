package Febrero.Tareas;

import java.util.Scanner;

public class Tarea4v1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDivisiones = 0;
        int num1 = 0;
        int num2 = 0;
        double resultado = 0;
        while (num1 != -1 && num2 != -1) {
            try {


                System.out.println("Introduce el dividendo");
                num1 = sc.nextInt();
                System.out.println("Introduce el divisor");
                num2 = sc.nextInt();
                if (num1 != -1 && num2 != -1) {
                    resultado = num1 / num2;
                    System.out.println("Resultado :" + resultado);
                    numDivisiones++;
                }

            } catch (ArithmeticException ae) {
                System.out.println("Se ha intentado una división entre 0 y eso no es posible");

            }
        }
        System.out.println("El numero de divisiones totales calculadas son "+numDivisiones);
    }
}
