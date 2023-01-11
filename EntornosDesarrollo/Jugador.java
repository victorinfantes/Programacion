package EntornosDesarrollo;

public class Jugador {
    private String nombre;
    private int dorsal;
    private double altura;
    private int edad;
    private String posicion;

    public Jugador() {
    }

    public Jugador(String nombre, int dorsal, double altura, int edad, String posicion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.altura = altura;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", altura=" + altura +
                ", edad=" + edad +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}

