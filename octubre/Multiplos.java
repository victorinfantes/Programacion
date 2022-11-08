package octubre;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO multiplos 

		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero :");
		num1=sc.nextInt();
		System.out.println("Dame otro numero :");
		num2=sc.nextInt();
		if((num2%num1==0)||(num1%num2==0)) 
			{System.out.println("Son multiplos"+num1+"y"+num2 );}
		else
			{System.out.println("No son multiplos"+num1+ "y"+num2);}
	}

}
