package octubre;
import java.util.Scanner;

public class CalculaTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int segundos,horas,resto,minutos;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame los segundos : ");
		segundos=sc.nextInt();
		horas=segundos/3600;
		System.out.println("Los segundos "+segundos+" tienen : "+horas+" horas. ");
		resto=segundos%3600;
		System.out.println("Los segundos "+resto+" me sobran");
		minutos=resto/60;
		System.out.println("Los minutos son "+minutos);
		
		
		
		
	}

}
