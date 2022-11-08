package Tema2;
import java.util.Scanner;
public class Basicos02_10_LeerNumerosContar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador,numero;
		Scanner sc=new Scanner(System.in);
		numero=sc.nextInt();
		contador=0;
		//Bucle para leer numeros hasta que me pasen un -1
		while(numero!=-1)
					{
					contador++;
					System.out.println("Introduce un numero");
					numero=sc.nextInt();
					}
System.out.println("Final. Se ha leido "+contador+"numeros");		
		
		
	}

}
