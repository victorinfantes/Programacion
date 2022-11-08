package octubre;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Pedir 3 números y ordenar de menor a mayor 
		
		int a,b,c;

		Scanner sc=new Scanner(System.in);

		System.out.println("Dame un numero :");

		a=sc.nextInt();

		System.out.println("Dame otro numero (2):");

		b=sc.nextInt();

		System.out.println("Dame otro numero (3):");

		c=sc.nextInt();

		if(a>b && b>c)

			 System.out.println( a+", "+b+", "+c);

			 else{

			 if(a>c && c>b)

			 System.out.println(a+", "+c+", "+b);

			 else{

				 if(b>a && a>c)

				 System.out.println(b+", "+a+", "+c);

				 	else{

				 		if(b>c && c>a)

				 		System.out.println(b+", "+c+", "+a);

				 			else{

				 				if(c>a && a>b)

				 				System.out.println(c+", "+a+", "+b);

				 				else{

				 					if(c>b && b>a)

				 						System.out.println(c+", "+b+", "+a);

				 }

				 }

				 }

				 }

				 }



	}



}