package EntornosDesarrollo;

public class Persona {

    private int id;
    private int edad;
    private int altura;
    private float nota;
    private String nombre;

    public Persona() {
    }

    public Persona(int id, int edad, int altura, float nota, String nombre) {
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.nota = nota;
        this.nombre = nombre;
    }

    public Persona(float nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", edad=" + edad +
                ", altura=" + altura +
                ", nota=" + nota +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
