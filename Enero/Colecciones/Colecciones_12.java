package Enero.Colecciones;

import java.util.ArrayList;
import java.util.HashMap;

public class Colecciones_12 {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();
        HashMap<String, Integer> valores = new HashMap<String, Integer>();
        int puntos = 0;
        //Introducir valores dentro de un HashMap | PUT
        valores.put("as", 11);
        valores.put("dos", 0);
        valores.put("tres", 10);
        valores.put("cuatro", 0);
        valores.put("cinco", 0);
        valores.put("seis", 0);
        valores.put("siete", 0);
        valores.put("sota", 2);
        valores.put("caballo", 3);
        valores.put("rey", 4);
        Carta cartaAux = new Carta();
        cartas.add(cartaAux);
        for (int i = 0; i < 4; i++) {
            do {
                cartaAux = new Carta();
            } while (cartas.contains(cartaAux));
            cartas.add(cartaAux);


        }

        for (Carta miCarta : cartas) {
            System.out.println(miCarta);
            puntos = puntos + valores.get(miCarta.getFigura());
        }
        System.out.println("Tienes : "+puntos+" puntos en total");
    }
}
