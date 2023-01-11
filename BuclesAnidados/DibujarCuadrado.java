package BuclesAnidados;
import java.util.Scanner;
public class DibujarCuadrado {
    public static void main(String[] args) {
        int tamanio;
        int fila,columna;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado : ");
        tamanio =sc.nextInt();
        for(fila=1;fila<=tamanio;fila++)
            {
                for (columna=1;columna<=tamanio;columna++)
                    {
                        System.out.print("* ");
                    }
                System.out.println("");
            }
    }
}
