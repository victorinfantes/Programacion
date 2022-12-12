package Tema4;

import java.sql.SQLOutput;

public class ClassString {

    public static void main(String[] args) {

        //charAT
        String cadena = "Hola amigos esto es primer curso de DAM en el IES CASTELAR , ya pronto toca recreo";
        String cadena2 = "123";
        String cadena3 = "123";
        String nombre = "Victor Infantes Guerra";
        String nombre2 = "victor infantes guerra";
        System.out.println("En la posicion 7 de la cadena hay(empezamos por el 0) "+cadena.charAt(8)+'"');
        System.out.println("En la posicion 7 de la cadena hay(empezamos por el 0) "+cadena.charAt(8)+"'");
        //lenght
        System.out.println("La longitud de esta cadena es "+cadena.length());
        System.out.println("La longitud de esta cadena es "+cadena2.length());
        //substring
        System.out.println(cadena.substring(0, 11));//empìeza en la posicion 0 del string y acaba en la que indiquemos
        System.out.println(cadena.substring(12));//solo indicas las posicion en la que va a empezar hasta el final
        //delete
        //System.out.println(cadena.delete(11));
        //append(Añade un string a otro string)
        cadena = cadena + cadena2;
        System.out.println(cadena);
        //replace
        System.out.println(cadena.replace("a","*"));
        System.out.println(cadena.replace("123", "687"));
        //System.out.println(cadena.replaceAll(cadena, cadena2));
        //System.out.println(cadena.replaceFirst(cadena, cadena2));
        //compareTo
        System.out.println("Cuantos caracteres diferentes hay ??? "+cadena.compareTo(cadena2));
        System.out.println("Cuantos caracteres diferentes hay ??? "+cadena2.compareTo(cadena3));
        System.out.println("Cuantos caracteres diferentes hay ??? "+nombre.compareTo(nombre2));
        System.out.println("Cuantos caracteres diferentes hay ??? "+nombre.compareToIgnoreCase(nombre2));
        System.out.println("Son iguales cadena 1 y cadena 2  ??? "+cadena.equals(cadena2));
        System.out.println("Son iguales cadena 2 y cadena 3  ??? "+cadena2.equals(cadena3));
        System.out.println("Son iguales cadena 2 y cadena 3  ??? "+cadena2.equalsIgnoreCase(cadena3));
        System.out.println("Son iguales cadena 2 y cadena 3  ??? "+cadena2.equals(cadena3));
        //trim ( elimina los espacios solo del principio)
        System.out.println(cadena);
        System.out.println("Cadena : "+cadena.trim());
        //toUpperCase
        System.out.println(nombre.toUpperCase());
        //toLowerCase
        System.out.println(nombre.toLowerCase());
        System.out.println(cadena.contains(nombre));
        //valueOf
        System.out.println(cadena);






    }
}
