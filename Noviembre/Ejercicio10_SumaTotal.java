package Noviembre;
import java.util.Scanner;
public class Ejercicio10_SumaTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumaTotal=0, numero;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=15;i++)
				{
				System.out.println("Introduce un numero");
				numero=sc.nextInt();
				sumaTotal=sumaTotal+numero;
				}
		System.out.println("El resultado es : "+sumaTotal);
		
		

	}

}
