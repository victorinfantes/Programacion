package Noviembre;

public class Pajaro {
    private String id, raza, nombre, tipo;

    public Pajaro(String id, String raza, String nombre, String tipo){
        this.id=id;
        this.raza=raza;
        this.nombre=nombre;
        this.tipo=tipo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void imprimePajaro(){
        System.out.println("\tID "+this.id+"\t nombre "+this.nombre+"\t Raza "+this.raza+"\t tipo "+this.tipo);
    }
}



