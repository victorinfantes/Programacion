package Enero.Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class CartasApp {
    public static void main(String[] args) {
        ArrayList<Carta> cartas=new ArrayList<Carta>();
        Carta cartaAux=new Carta();
        cartas.add(cartaAux);
        for (int i = 0; i < 9; i++) {
            do {
                cartaAux=new Carta();
            }while(cartas.contains(cartaAux));
            //He generado una carta valida no repetetida o contenida ya en el ArrayList
            cartas.add(cartaAux);
        }
        //tendremos el arraylist de 10 cartas no repetidas aleatorias
        Collections.sort(cartas);//ordena el arraylist
        for(Carta miCarta: cartas) {
            System.out.println(miCarta);
        }
    }
}
