package Viernes21;
import java.util.Scanner;
public class PROG02_Ejerc4 {

	public static void main(String[] args) {
		// Dada la edad de una persona , muestra un mensaje indicando si es mayor de edad .

		int edad; 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce tu edad : ");
		edad = sc.nextInt();
		
		while(edad >= 18)
		{
			System.out.println("Eres mayor de edad ");
			System.out.println("Introduce tu edad : ");
			edad = sc.nextInt();
			
		}
		System.out.println("Eres menor de edad ");
		
	}

}
