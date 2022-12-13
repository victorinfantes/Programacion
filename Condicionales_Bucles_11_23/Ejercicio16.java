package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Introduce un numero entre 0 y 10 : ");
            num=sc.nextInt();
        }
        while(!(num>=0 && num<=10));// ((num>=0 || num<=10))
        for (int i=1;i<=10;i++)
            System.out.println(num+" x "+ i+" es= "+num*i);
    }
}
