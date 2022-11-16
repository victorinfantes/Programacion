package Tema2;

import javax.swing.JOptionPane;

public class Basicos_03_11_ContarVocales {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String frase;
        int contador;
        boolean esVocal;
        char caracterActual;

        frase = JOptionPane.showInputDialog("Inserta la frase");

        System.out.println(frase);

        //Pasar a minusculas toda la frase

        frase = frase.toLowerCase();

        System.out.println(frase);

        //Debemos tener presente las vocales,las guardamos en un array de caracteres.

        char vocales[] = {'a', 'e', 'i', 'o', 'u'};//guardar en una array las vocales

        //recorrer la frase letra a letra, e ir comprobando si cada letra es vocal o no,


        for (int i = 0; i < frase.length(); i++) {

            caracterActual = frase.charAt(i);

            //Recorro las vocales comparando con el caracter

            //Cuando lo encuentra, aumenta el contador y sale del bucle

            for (int j = 0; j < vocales.length; j++) {

                if (caracterActual == vocales[j]) {
                    System.out.println("La letra " + caracterActual + " en la posción " + (i + 1) + " es vocal");
                }


            }


        }


    }

}

