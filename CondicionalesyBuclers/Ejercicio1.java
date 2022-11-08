package CondicionalesyBuclers;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		int numero, cuadrado;
		System.out.println("Introduce un numero : ");
		numero = sc.nextInt();
		while(numero>0)
		{
		cuadrado = numero * numero;
		System.out.println("El cuadrado de "+numero+" es "+cuadrado);
		System.out.println("Introduce de nuevo un numero : ");
		numero = sc.nextInt();
		}
		System.out.println("Fin del programa ");
	
	
	}

}
