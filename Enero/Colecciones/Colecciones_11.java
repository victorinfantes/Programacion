package Enero.Colecciones;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Colecciones_11 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("ordenador", "computer");
        diccionario.put("osito", "teddybear");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("contenedor", "container");
        diccionario.put("arbol", "tree");
        diccionario.put("agua", "water");
        diccionario.put("coche", "car");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("botella", "bottle");
        diccionario.put("ratón", "mouse");
        diccionario.put("ratones", "mice");
        diccionario.put("cena", "dinner");
        diccionario.put("cuerpo", "body");
        diccionario.put("cabeza", "head");
        diccionario.put("pierna", "leg");
        diccionario.put("viento", "wind");
        diccionario.put("primavera", "spring");
        diccionario.put("hombre", "man");
        int i = 0;
        int numero;
        Scanner sc=new Scanner(System.in);
        //Sacamos todas las claves del dircionario(palabras en español)
        //y las metemos en un Array de String .
        String[] claves = diccionario.keySet().toArray(new String[0]);
        /*for (int j = 0; j < claves.length; j++) {
            System.out.println(claves[j]);
        }
        for (String s: claves) {
            System.out.println(s);
        }*/
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add((int) Math.random() * (claves.length));

        for (i = 0; i < 4; i++) {
            do {
                numero = (int) Math.random() * (claves.length);
            } while (numeros.contains(numero));
            numeros.add(numero);
        }
        //YA TENGO EL ARRAY QUE VA A INDICAR QUE PALABRA VA A TOCAR Y NO PUEDE REPETIRSE
        //MONSTRAMOS LA PALABRA EN ESPAÑOL Y PREGUNTAMOS LA TRADUCCION
        int puntos = 0;
        System.out.println("Le monstraré las palabras en español y usted tiene que ir traduciendo ");
        for (i = 0; i < numeros.size(); i++) {
            System.out.println(claves[numeros.get(i)]+ " :");
            String palabraIntro=sc.nextLine();
            if (palabraIntro.equals(diccionario.get(claves[numeros.get(i)]))) {
                System.out.println("Correcto!!! has acertado.");
                puntos++;
            }else {
                System.out.println("Lo siento , no has acertado.");
                System.out.println("La respuesta correcta es : "+diccionario.get(claves[numeros.get(i)]));
            }
            //CON ESTA LÍNEA CONSEGUIMOS SACAR UN NUMERO DEL ARRAY LIST DE NUMEROS HE INDICA LA POSICION EN
            //EL DICCIONARIO
        }
        //Aqui ya estamos fuera del for por lo que podemos imprimir el resultado de puntos .
        System.out.println("Usted ha obtenido un total de "+puntos);
        System.out.println("Gracias por usar el programa , hasta la vista ");

    }
}
