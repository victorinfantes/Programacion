package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        int numero=0, negativos=0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10;i++){
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
            if  (numero < 0){
                negativos++;
            }
        }
        System.out.println("Se han introduciodo "+negativos+" numero negativos");

    }
}
