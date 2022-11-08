package CondicionalesyBuclers;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		numero = sc.nextInt();
		while(numero!=0)
		{
		if(numero%2==0)
			{System.out.println("El numero "+numero+" es par ");}
		else 
			{System.out.println("El numero "+numero+" es impar ");}
		
		System.out.println("Introduce un numero , 0 si quiere finalizar el programa ");
		numero=sc.nextInt();
	}
System.out.println("Fin del programa gracias ");
}
}