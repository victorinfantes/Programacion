package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cant_sueldos=0, sueldo=0, max_sueldo=0;
            System.out.println("Introduce la cantidad de sueldos que vas a introducir");
            for(cant_sueldos=sc.nextInt();cant_sueldos>0;cant_sueldos--){
                System.out.println("Introduce el sueldo");
                sueldo = sc.nextInt();
                if (sueldo > max_sueldo){
                    max_sueldo=sueldo;
                }
            }
            System.out.println("El sueldo mas alto es "+max_sueldo);
        }
    }

