package Variables;
import java.util.Scanner;
public class Ejercicio4_EuroPesetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pesetas; float euros;
		System.out.println("Dime cuantos euros tienes ");
		Scanner sc=new Scanner(System.in);
		euros=sc.nextFloat();
		pesetas=(int)(euros*166.86);
		System.out.println("Tus euros son :"+pesetas+" pesetas");
		System.out.printf("%f euros son %d ptas.", euros, pesetas);
	}

}
