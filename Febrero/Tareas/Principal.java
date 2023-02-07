package Febrero.Tareas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int NUM_INT_DEFAULT=5;
        int NUM_MAX_DEFAULT=10;
        boolean salir=false;
        int opcion=0;
        int numInt=NUM_INT_DEFAULT;
        int numMax=NUM_MAX_DEFAULT;
        while (!salir) {
            System.out.println("1.Configurar");
            System.out.println("2.Jugar");
            System.out.println("3.Salir");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1://CONFIGURAR EL JUEGO
                    System.out.println("Introduce el numero de intentos");
                    numInt=sc.nextInt();
                    System.out.println("Introduce el numero máximo generado");
                    numMax=sc.nextInt();
                    break;
                case 2://JUGAR
                    //GENERAMOS EL NUMERO OCULTO ALEATORIO
                    int numOculto=(int) Math.floor(Math.random()*numMax+1);
                    int intentosJugador=1;
                    int numJugador=0;
                    boolean acertado=false;
                    while (intentosJugador<numInt && !acertado) {
                        System.out.println("Introduce un numero");
                        numJugador=sc.nextInt();
                        if (numJugador==numOculto) {
                            System.out.println("Has ganado y has necesitado "+intentosJugador+" intentos");
                            acertado = true;
                        }else {
                            if (numJugador>numOculto) {
                                System.out.println("El numero que buscas es menor");
                            }else {
                                System.out.println("El numero que buscas es mayor");
                            }

                            System.out.println("Te quedan "+(numInt-intentosJugador));
                            intentosJugador++;
                        }
                    }
                    break;
                case 3 :
                    salir=true;
                    System.out.println("FIN DEL JUEGO GRACIAS POR JUGAR");
                    break;


            }
        }
    }
}
