package CondicionalesyBuclers;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero, contador;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		numero = sc.nextInt();
		contador = 0;
		while(numero>=0)
		{
			contador=contador+1;
			System.out.println("introduce un numero");
			numero=sc.nextInt();
		
		}
System.out.println("El numero total de numero leidos es :  "+contador);
}
}