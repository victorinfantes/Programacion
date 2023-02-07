package Febrero.Tareas.Tarea4v2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeportesConIF_Victor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int temperatura = 0;
        //Validamos la temperatura
        do {
            System.out.println("Dame la temperatura de hoy:");
            try {
                temperatura = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException ime) {
                System.out.println("Debe introducir un numero entero");
                correcto = false;
                sc.next();
            }
        } while (!correcto);

        System.out.println("El deporte mas apropiado para hoy es:");
        if (temperatura>30) {
            System.out.println("Nadar seria la mejor opcion");
        } else if (temperatura>15 && temperatura<=30) {
            System.out.println("Hacer golf no es mala opcion");
        } else if (temperatura>5 && temperatura<=15) {
            System.out.println("Jugar tenis");
        } else if (temperatura>-10 && temperatura<=5) {
            System.out.println("Esquiar");
        }else {
            System.out.println("Quedate en casa");
        }
    }
}
