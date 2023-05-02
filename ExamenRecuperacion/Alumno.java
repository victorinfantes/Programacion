package ExamenRecuperacion;

import java.util.Date;

public class Alumno extends Persona{
    private boolean matriculado;
    private String fechaMatricula; //Date fechaMatricula
    private int notaProgramacion;
    private int notaEntornos;
    private int notaBaseDeDatos;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String DNI, int edad, String direccion,
                  boolean matriculado, String fechaMatricula, int notaProgramacion, int notaEntornos,
                  int notaBaseDeDatos) {
        super(nombre, apellidos, DNI, edad, direccion);
        this.matriculado = matriculado;
        this.fechaMatricula = fechaMatricula;
        this.notaProgramacion = notaProgramacion;
        this.notaEntornos = notaEntornos;
        this.notaBaseDeDatos = notaBaseDeDatos;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public int getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(int notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public int getNotaEntornos() {
        return notaEntornos;
    }

    public void setNotaEntornos(int notaEntornos) {
        this.notaEntornos = notaEntornos;
    }

    public int getNotaBaseDeDatos() {
        return notaBaseDeDatos;
    }

    public void setNotaBaseDeDatos(int notaBaseDeDatos) {
        this.notaBaseDeDatos = notaBaseDeDatos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "matriculado=" + matriculado +
                ", fechaMatricula=" + fechaMatricula +
                ", notaProgramacion=" + notaProgramacion +
                ", notaEntornos=" + notaEntornos +
                ", notaBaseDeDatos=" + notaBaseDeDatos +
                ", nombre=" + this.getNombre() +
                ", apellidos=" + this.getApellidos() +
                ", DNI=" + this.getDNI() +
                ", edad=" + this.getEdad() +
                ", direccion=" + this.getDireccion() +
                '}';
    }
}
