package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        int mayor_edad=0,mayor_175=0,suma_edad=0, media_edad=0;
        int edad = 0;
        double altura=0, suma_alt=0, media_altura=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4;i++){
            System.out.println("Alumno: "+(i+1));
            System.out.println("Introduce la edad: ");
            edad =sc.nextInt();
            System.out.println();
            altura = sc.nextDouble();
            System.out.println("La edad del alumno " + (i+1)+"es, "+altura);
        }
        if (edad>18){
            mayor_edad++;
        }
        if (altura>1.75){
            mayor_175++;
            suma_edad=suma_edad+edad;
            suma_alt=suma_alt+altura;
        }
        media_edad=suma_edad/4;
        media_altura=suma_alt/4;
        System.out.println("Edad media"+media_edad);
        System.out.println("Media de altura"+media_altura);
        System.out.println("Alumnos mayor de edad" +mayor_edad);
        System.out.println("Alumnos mayor de 1.75"+mayor_175);

    }


}


