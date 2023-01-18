package Enero.Colecciones;

import java.util.ArrayList;

public class Colecciones_01 {
    public static void main(String[] args) {
        //Creamos un ArrayList
        ArrayList<String> adversarios =new ArrayList<String>();
        //Ahora el array list no ocupa nada en memoria ram
        adversarios.add("Ramon");
        adversarios.add("Antonio");
        adversarios.add("Alejandro");
        adversarios.add("Pombe");
        adversarios.add("Javier");
        adversarios.add("Jose");
        System.out.println("Imprimimos los enemigos del juego");
        for(String nombre:adversarios) {
            System.out.println("Enemigo: "+nombre );
        }
    }
}
