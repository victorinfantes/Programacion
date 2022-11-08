package octubre;
import java.util.Scanner;

public class pedirnumeros {

	public static void main(String[] args) {
		// Pedir dos numeros y decir si son iguales o no
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el primer numero:");
		a=sc.nextInt();
		System.out.println("Dame el segundo numero:");
		b=sc.nextInt();
		if (a==b)
		{
			System.out.println("Los dos valores son iguales");
		}
		else if (a>b)
		{
			System.out.println("El primer numero es mayor que el segundo");
		}
		else 
		{
			System.out.println("El segundo numero es mayor que el primero ");
		}
	}


}
