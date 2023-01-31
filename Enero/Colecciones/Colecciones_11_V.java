package Enero.Colecciones;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Colecciones_11_V {
    public static void main(String[] args) {

        HashMap<String,String> diccionario= new HashMap<String,String>();

        diccionario.put("ordenador", "computer");

        diccionario.put("gato", "cat");

        diccionario.put("osito", "teddybear");

        diccionario.put("verde", "green");

        diccionario.put("azul", "blue");

        diccionario.put("arbol", "tree");

        diccionario.put("agua", "water");

        diccionario.put("coche", "car");

        diccionario.put("puerta", "door");

        diccionario.put("contenedor", "container");

        diccionario.put("botella", "bottle");

        diccionario.put("ratón", "mouse");

        diccionario.put("ratones", "mice");

        diccionario.put("cena", "dinner");

        diccionario.put("cuerpo", "body");

        diccionario.put("viento", "wind");

        diccionario.put("primavera", "spring");

        diccionario.put("hombre", "man");

        diccionario.put("invierno", "winter");

        diccionario.put("verano", "summer");

        diccionario.put("vacaciones", "holidays");

        int i=0;

        int numero;

        //sacamos todas las claves del diccionario(palbras en español)

        //y las metemos en un array de Strings

        String[] claves=diccionario.keySet().toArray(new String[0]);

        /*

         * for (int j=0;j<claves.length;j++) { System.out.println(claves[j]); } for

         * (String s: claves) { System.out.println(s); }

         */

        //generamos 5 números aleatorios(para las posiciones de las palabras) y los metemos en un ArrayList

        ArrayList<Integer> numeros= new ArrayList<Integer>();

        numeros.add((int)(Math.random()*(claves.length)));//revisar

        //NO SE PUEDEN REPETIR LOS NUMERO ALEATORIOS

        for(i=0;i<4;i++) {

            do {

                numero=(int)(Math.random()*(claves.length));

            }while(numeros.contains(numero));

            numeros.add(numero);



        }

        //YA TENGO EN EL ARRAY LIST 5 NUMERO DISTINTOS Y ALEATORIOS

        //MOSTRAMOS  LAS PALABRAS EN ESPAÑOL Y PREGUNTAMOS LA TRADUCCIÓN

        int puntos=0;Scanner sc=new Scanner(System.in);



        System.out.println("Le mostraré las palabras en español, y usted traduzca:");

        for (i=0;i<numeros.size();i++) {

            System.out.println(claves[numeros.get(i)]+ " :");//

            String palabraIntro=sc.nextLine();//ahora debemos mirar en el diccionario para ver  si es corrcto

            if(palabraIntro.equals(diccionario.get(claves[numeros.get(i)]))) {

                System.out.println("Correcto!!! has acertado.");

                puntos++;



            }else {

                System.out.println("Lo siento, no has acertado.");

                System.out.println("la respuesta correcta es:"+diccionario.get(claves[numeros.get(i)]));





            }

        }

        //fuera del FOR

        System.out.println("usted ha obtenido :"+puntos+ "puntos.");

        System.out.println("Gracias por usar el programa, hasta la vista.");







    }




}

