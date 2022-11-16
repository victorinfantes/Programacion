package Tema2;

import java.util.Scanner;

public class Basicos02_09 {

    public static void main(String[] args) {

        //Suma del 1 al número que nos indiquen y debe ser mayor que 1

        //Pedimos un numero por teclado

        //lo guardamos en una varible de tipo entero,llamada numero

        //comprobamos que el numero es mayor que 1, o imprimimos el error y salimos

        //hacemos un bucle(for, while, do --while)desde 1 hasta el numero

        //vamos sumando en otra variable llamada suma

        //cuando acabe el bucle tendremos la suma total

        int numero, suma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un numero entero mayor que 1 :");

        do {//pedimos el numero por teclado

            numero = sc.nextInt();

            if (numero <= 1) {

                System.err.println("Error. NO has introducico un valor correcto");

                System.out.println("Vuelva a intentarlo: mayor que 1.");

            }


        }

        while (!(numero >= 1));//condicion para salir

        //ya nos hemos asegurado que el usuario ha metido un numero entero positivo

        suma = 0;

        for (int contador = 1; contador <= numero; contador++) {

            //suma+=contador;

            suma = suma + contador;

            System.out.println(contador + "-->Suma parcial : " + suma);

        }

        System.out.println("Suma total e : " + suma);


    }


}
