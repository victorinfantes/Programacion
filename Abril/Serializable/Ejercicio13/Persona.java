package Abril.Serializable.Ejercicio13;

import java.io.Serializable;

public class Persona implements Serializable {

    protected String nombre;
    protected String apellidos;
    protected long telefono;
    public Persona(String n,String a,long t) {
        this.nombre = n;
        this.apellidos = a;
        this.telefono = t;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
