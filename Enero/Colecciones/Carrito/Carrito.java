package Enero.Colecciones.Carrito;

import java.util.ArrayList;

public class Carrito {
    ArrayList<Elemento> a =new ArrayList<>();

    public void agrega(Elemento e) {
        a.add(e);
    }
    public int numerodeElementos() {
        return a.size();
    }
    public double importeTotal() {
        double total=0;
        for(Elemento e: a) {
            total=total+(e.getPrecio()*e.getCantidad());
        }
    return total;
    }

    @Override
    public String toString() {
        String mensaje="Contenido del carrito";
        for (Elemento e:a) {
            mensaje=mensaje+e +"\n";
        }
        return mensaje;
    }
}
