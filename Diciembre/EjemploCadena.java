package Diciembre;

public class EjemploCadena {

    public static void EjemploCadena() {
        String cadena ="Esto es un ejemplo de cadena de caracteres";
        System.out.println(cadena.charAt(0));//Nos devuelve E
        System.out.println(cadena.charAt(9));//Nos devuelve n
        System.out.println(cadena.length());//Nos devuelve la longitud:42
        System.out.println(cadena.substring(11, 18));//nos devuelve la subcadena:ejemplo
        System.out.println(cadena.endsWith("s"));//nos devuelve true
        System.out.println(cadena.startsWith("e"));//false java distingue mayusculas y minisculas
        System.out.println(cadena.replace('a', 'e'));//cambia todas las "a" por "e"
        System.out.println(cadena.indexOf("cadena"));//encuentra la posición de "cadena"
        System.out.println(cadena.toLowerCase());//pasa el string a minusculas
        System.out.println(cadena.toUpperCase());//pasa el string a mayusculas

    }

}
