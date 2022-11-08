package CondicionalesyBuclers;
import java.util.Scanner;
public class Ejercicio5_V {

	public static void main(String[] args) {
		
		int numero, contador=0; int numAdivinado;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero , negativo para salir");
		numero = sc.nextInt();
		numAdivinado=(int)(Math.random()*100);
		while(!(numero==numAdivinado))
		{ contador++;
			System.out.println("No has acertado ");
			if(numero>numAdivinado)
				System.out.println("El numero es menor");
			else
				System.out.println("El numero es mayor");
			numero=sc.nextInt();
		}
		System.out.println("Bien has ganado : "+(100-(contador)));

	}

}
