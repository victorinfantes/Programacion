package Enero.Colecciones.HashMapCapitales;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Capitales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> capitales=new HashMap<>();
        capitales.put("España","Madrid");
        capitales.put("Portugal","Lisboa");
        capitales.put("Francia","Paris");
        String cadenaIntroducida="";
        do {
            System.out.println("Introduce en nombre del Pais");
            cadenaIntroducida=sc.nextLine();
            if (!cadenaIntroducida.equals("salir")) {
                if (capitales.containsKey(cadenaIntroducida)) {
                    System.out.println("La capital de :" + cadenaIntroducida + "es :");
                    System.out.println(capitales.get(cadenaIntroducida));
                }
                else {
                    System.out.println("No conozco ese País");
                    System.out.println("Lo añado al diccionario, ¿Cual es su capital?");
                    String capital=sc.nextLine();
                    capitales.put(cadenaIntroducida, capital);
                    System.out.println("Gracias. Capital Añadida");
                }
            }
        }while(!cadenaIntroducida.equals("salir"));
        System.out.println("Gracias por usar la aplicacion");
    }
}
