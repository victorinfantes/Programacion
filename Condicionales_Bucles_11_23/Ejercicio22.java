package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        int nota ;
        boolean suspenso;
        Scanner sc = new Scanner(System.in);
        suspenso=false;int cuantosSuspensos=0;
        for(int i=1;i<=5;i++)
            {
                System.out.println("Porfavor introduce la nota del alumno ");
                nota=sc.nextInt();
                if(nota<5)
                    {
                        suspenso=true;
                        cuantosSuspensos++;
                    }
            }
        if(suspenso)
            System.out.println("Hay alumnos suspensos :"+cuantosSuspensos);
        else
            System.out.println("No hay suspensos ");
    }
}
