import java.util.Scanner;

public class Raizcuadrada_ejer1 {

	public static void main(String[] args) {
		// Declarar variables de coeficientes;
		double a,b,c;
		double d,x1,x2;
		// Declaramos Scanner
		Scanner s = new Scanner(System.in);
		// Pedimos los valores de las variables por teclado;
		System.out.println("Dame el primer coeficiente (a):");
		a=s.nextDouble();
		System.out.println("Dame el segundo coeficiente (b):");
		b=s.nextDouble();
		System.out.println("Dame el tercero coeficiente (c):");
		c=s.nextDouble();
		// Calculamos lo de dentro de la raiz cuadrada;
		// b al cuadrado -(4ac);
		d=((b*b)-4*a*c);
		if(d<0)
		{
			System.out.println("No tiene solucion");
		}
		else
		{	
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Solucion 1 :"+x1);
			System.out.println("Solucion 2 :"+x2);
	    }

}
}
