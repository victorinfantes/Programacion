package Diciembre;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

    public static void main(String[] args) {
        String cadena = "hola amigos esto es un ejemplo de cadenas abc";
        Pattern pat = Pattern.compile("hola amigos esto es un ejemplo de cadenas abc");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }


        cadena = "jabcd";
        pat = Pattern.compile(".*abc.*");//* da igual los caracteres que haya delante y detras
        mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        pat = Pattern.compile("^abc.*");
        mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Válido");
        } else {
            System.out.println("No Válido");
        }

        pat = Pattern.compile("^[aA]bc.*");
        mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}
