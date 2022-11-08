import java.util.Scanner;

public class EjercicioRama33 {

	public static void main(String[] args) {
		// Realiza un programa en Java que dada dos variables a y b, intercambie los valores entre a y b.

		int a,b,aux;
		
		Scanner s =  new Scanner(System.in);
		System.out.println("Dame el valor de a:");
		a=s.nextInt();
		System.out.println("Dame el valor de b:");
		b=s.nextInt();
		System.out.println("El valor de a es: "+a);
		System.out.println("El valor de b es: "+b);
		System.out.println("Intercambiamos los valores de a por b ");
		aux=a;
		a=b;
		b=aux;
		System.out.println("El valor de a es: "+a);
		System.out.println("El valor de b es: "+b);
	
		
	}

}
