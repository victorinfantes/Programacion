package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        int notas;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            System.out.println("Introduce la nota del alumno :");
            notas = sc.nextInt();
            if (notas >= 5) {
                aprobados = aprobados + 1;
            }

            if (notas <= 3) {
                suspensos = suspensos + 1;
            }

            if (notas ==4) {
                condicionados = condicionados + 1;
            }

        }
        System.out.println("El numero de aprobados que hay es : "+aprobados);
        System.out.println("El numero de suspensos que hay es : "+suspensos);
        System.out.println("El numero de condicionados que hay es : "+condicionados);

    }
}
