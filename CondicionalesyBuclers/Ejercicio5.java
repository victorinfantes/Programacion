package CondicionalesyBuclers;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		
		int nota, contador=0, sumaNota=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una nota  : ");
		nota = sc.nextInt();
		while(nota>=0)
		{
			contador=contador+1;
			sumaNota=sumaNota + nota;
			System.out.println("introduce una nota , negativo si quieres salir");
			nota=sc.nextInt();
		
		}
System.out.println("El numero total de notas leidas es :  "+contador);
System.out.println("La nota media de la clase es : "+sumaNota/contador);
	
}
}