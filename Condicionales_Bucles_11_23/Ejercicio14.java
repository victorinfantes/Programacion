package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        int sumaSalarios;
        int mayores;
        int salario;
        int sumaMayores;
        sumaSalarios=0;mayores=0;salario=0;sumaMayores=0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<10;i++)

            System.out.println("Introduce un salario :");
            salario=sc.nextInt();
            sumaSalarios=sumaSalarios+salario;

            if(salario>1000)

            else
                {
                    System.out.println("Este salario esta por debajo del los 1000 euros");
                }
    }
}
