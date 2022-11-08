package Noviembre;
import java.util.Scanner;
public class Persona {

	
	
	
	//El método constructor se tiene que llamar oblitoraimente igual que la clase
	

	public static void main(String[] args) {
		int idP;String dniP;String nombreP;	String dirP;int telefonoP;
		Scanner sc=new Scanner(System.in);
		//Pedimos los datos de la persona por teclado como me pedía el enunciado
				System.out.println("Por favor introduce el ID de la primera persona: ");
				idP=sc.nextInt();
				System.out.println("Por favor introduce el DNI de la primera persona: ");
				sc.nextLine();
				dniP=sc.nextLine();
				System.out.println("Por favor introduce el Nombre de la primera persona: ");
				System.out.println("-");
				nombreP=sc.nextLine();
				System.out.println("Por favor introduce la dirección de la primera persona: ");
				dirP=sc.nextLine();
				System.out.println("Por favor introduce el teléfono de la primera persona: ");
				telefonoP=sc.nextInt();
		//Ya podemos "instanciar", o crear el primer objeto Persona.
				Persona persona1=new Persona(idP,dniP,nombreP,dirP,telefonoP);
				System.out.println("La primera persona está creada:");
				persona1.imprimirPersona();
				//SEGUNDA PERSONA:
				//Pedimos los datos de la persona por teclado como me pedía el enunciado
				System.out.println("Por favor introduce el ID de la segunda persona: ");
				idP=sc.nextInt();
				System.out.println("Por favor introduce el DNI de la segunda persona: ");
				sc.nextLine();
				dniP=sc.nextLine();
				System.out.println("Por favor introduce el Nombre de la segunda persona: ");
				System.out.println("-");
				nombreP=sc.nextLine();
				System.out.println("Por favor introduce la dirección de la segunda persona: ");
				dirP=sc.nextLine();
				System.out.println("Por favor introduce el teléfono de la segunda persona: ");
				telefonoP=sc.nextInt();
		//Ya podemos "instanciar", o crear otro objeto Persona.
				Persona persona2=new Persona(idP,dniP,nombreP,dirP,telefonoP);
				System.out.println("La segunda persona está creada:");
				persona2.imprimirPersona();			
					
	

}

}

