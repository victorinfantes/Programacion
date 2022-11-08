package Viernes21;
import java.util.Scanner;
public class PROG02_Ejerc5 {

	public static void main(String[] args) {
		// Dado un numero de segundos muestra en pantalla cuantos minutos , horas y días contiene 
		
		Scanner sc=new Scanner(System.in);
		int minutos,dias,horas,numero;
		
		System.out.println("Introduce los segundos : ");
		
		numero=sc.nextInt();
		horas=numero/3600;
		minutos=(numero-(3600*horas))/60;
		dias=numero/(3600*24);
		
		System.out.println(dias+" dias "+horas+" horas " +minutos+" minutos ");

	}

}
