package ExamenCorredigo;

public class Examen {

    private String nombre;
    private int edad;
    private float altura;
    private int notExpediente;


    @Override
    public String toString() {
        return "Examen{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", notExpediente=" + notExpediente +
                '}';
    }

    public Examen(String nombre, int edad, float altura, int notExpediente) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.notExpediente = notExpediente;
    }
    public String consulta_nombre(){
        return nombre;
    }
    public void cambia_Nombre(String nom){
        nombre=nom;
    }

    public Examen() {
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

    public int getNotExpediente() {
        return notExpediente;
    }

    public void setNotExpediente(int notExpediente) {
        this.notExpediente = notExpediente;
    }
}
