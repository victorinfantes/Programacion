package Viernes21;
import java.util.Scanner;
public class PROG02_Ejerc6 {

	public static void main(String[] args) {
		// 
		Scanner sc=new Scanner(System.in);
		
		int random = 0;
		
		String var1,var2;	
		
		String [] perros={"Mastin","Terrier","Bulldog","Pekines","Caniche","Galgo"};
		
		for (int i = 0; i < perros.length; i++) {
			random = (int) (Math.random()*4);
			var1 = perros[random];
			random = (int) (Math.random()*4);
			var2 = perros[random];
		}
		
		for (int i = 0; i < perros.length; i++) {
			
		}

	}

}
