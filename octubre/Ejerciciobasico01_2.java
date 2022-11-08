package octubre;
import java.util.Scanner;

public class Ejerciciobasico01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		char caracter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		a=sc.nextInt();
		caracter =(char)a;
		System.out.println("El número a : "+a+" tiene el valor del caracter: "+caracter);
		sc.close();
		
		
	}

}
