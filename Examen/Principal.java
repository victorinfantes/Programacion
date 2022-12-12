package Examen;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Victor Infantes Guerra

        Persona persona1 = new Persona("Luisa Perez", 32, 170,8 );
        System.out.println(persona1);



        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre :");
        String nombre;
        nombre = sc.next();
        System.out.println("Introduce la edad :");
        int edad;
        edad=sc.nextInt();
        System.out.println("Introduce la altura :");
        float altura;
        altura = sc.nextFloat();
        System.out.println("Introduce la nota :");
        int nota;
        nota = sc.nextInt();

        Persona persona2 =new Persona(nombre,edad,altura,nota);
        System.out.println(persona2);
    }


}
