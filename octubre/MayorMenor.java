package octubre;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO multiplos 

		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero :");
		num1=sc.nextInt();
		System.out.println("Dame otro numero :");
		num2=sc.nextInt();
		if (num1>num2)
			{System.out.println(+num1+ "es mayor que" +num2);}
		else if (num2>num1)
			{System.out.println(+num2+ "es mayor que" +num1);}
		else
			{System.out.println(+num2+ "es igual que" +num1);}
	
	}

}
