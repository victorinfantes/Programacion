package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        int sumaSalarios;
        int salario;
        int sumaMayores;
        sumaSalarios=0;salario=0;sumaMayores=0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<10;i++) {

            System.out.println("Introduce un salario :");
            salario = sc.nextInt();
            sumaSalarios = sumaSalarios + salario;

            if (salario > 1000) {
                sumaMayores++;
            } else {
                System.out.println("Este salario esta por debajo del los 1000 euros");
            }
        }
        System.out.println("El numero de salarios por encima de los 1000 euros son : "+sumaMayores);
        System.out.println("La suma de todos los salarios por debajo de los 1000 euros es : "+sumaSalarios+" euros");
    }
}
