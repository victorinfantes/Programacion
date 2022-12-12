package Examen;

public class Persona {
//Victor Infantes Guerra
    private String nombre;
    private int edad;
    private float altura;
    private int notaExpediente;

    public Persona() {

    }
    public String consulta_Nombre(){
        return nombre;
    }
    public void cambia_Nombre(String nom){
        nombre=nom;
    }


    public Persona(String nombre, int edad, float altura, int notaExpediente) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.notaExpediente = notaExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getNotaExpediente() {
        return notaExpediente;
    }

    public void setNotaExpediente(int notaExpediente) {
        this.notaExpediente = notaExpediente;
    }
    public String toString() {
        return this.nombre + " Edad:" + this.edad + " Altura:" + this.altura + " Nota:" + this.notaExpediente;
    }

}
