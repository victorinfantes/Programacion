package CondicionalesyBuclers;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		int numero , suma=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero , 0 para terminar : ");
		numero = sc.nextInt();
		while(numero!=0)
			{
			suma=suma + numero;
			}

	}

}
