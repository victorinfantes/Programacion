import java.util.*;
public class Ejercicio1_1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

	String nombre;
	byte edad;//byte
	float salario;//4 bytes
	boolean carnet;
	//INICIALIZACIÓN DE VARIABLEs
	System.out.println("Introducir nombre de alumno: ");
	nombre = s.next();
	System.out.println("Introducir salario de alumno: ");
	salario = s.nextFloat();
	System.out.println("Introducir edad de alumno: ");
	edad = s.nextByte();
    carnet=true;
    //IMRPIMIR VARIABLES EN PANTALLA
    System.out.println("DAM1: Nombre alumno, edad, salario, ¿carnet?");
    System.out.print("DAM1:" + "\t"+nombre +"\t"+edad +" "+salario+"   "+carnet);
}
}