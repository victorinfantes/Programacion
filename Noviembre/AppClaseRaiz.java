package Noviembre;
import java.util.Scanner;
public class AppClaseRaiz {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Introduce el coeficiente a");
        a=sc.nextDouble();
        System.out.println("Introduce el coeficiente a");
        b=sc.nextDouble();
        System.out.println("Introduce el coeficiente a");
        c=sc.nextDouble();

        ClaseRaiz raices = new ClaseRaiz(a,b,c);
        raices.calcular();

    }
}
