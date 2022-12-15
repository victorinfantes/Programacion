package Arrays;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int longitud = 0;
        System.out.println("Por favor, introduce las longitud de su array :");
        longitud=sc.nextInt();
        //Crea el arrray con el tamaña de longitud
        int numeros[]=new int[longitud];
        int numero = 0;
        //pedimos numero atraves de un bucle al usuario para rellear el array
        for(int i=0;i< numeros.length;i++)
            {
                System.out.println("Posicion array : "+(i+1)+" Porfavor introduce un numero entre el 1 y 10 :");
                do
                {
                    numero=sc.nextInt();
                    if(!(numero>=0 && numero<10))
                    System.out.println("Por favor inserte un numero correcto");
                }
                while(!(numero >= 0 && numero<10));
                numeros[i]=numero;
            }
        System.out.println("Array rellenado de numeros validos");
        System.out.println("Mostramos los numeros del array");
        for(int i=0;i< numeros.length;i++)
            {
                System.out.println("En la posicion "+(i+1)+" hemos guardado "+numeros[i]);
            }

    }
}
