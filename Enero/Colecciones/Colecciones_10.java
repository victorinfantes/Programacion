package Enero.Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Colecciones_10 {
    public static void main(String[] args) {
        HashMap<String,String> diccionario=new HashMap<String,String>();
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

        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor , introduzca una palabra en español :");
        String palabra=sc.nextLine();
        if (diccionario.containsKey(palabra)) {
            System.out.println(palabra+" en ingles es : "+diccionario.get(palabra));
        }
        else {
            System.out.println(palabra+" no se encuentra en el diccionario");
        }
    }
}
