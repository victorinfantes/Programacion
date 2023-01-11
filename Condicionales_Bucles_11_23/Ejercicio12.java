package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FuturoFactorial, Factorial=0;
        System.out.println("Introduce un numero para saber su factorial");
        FuturoFactorial=sc.nextInt();
        for(int i = 0 ; i <= FuturoFactorial;i++){
            Factorial = FuturoFactorial + i;
            System.out.println(FuturoFactorial +"+"+i+"="+Factorial);
        }

    }
}
