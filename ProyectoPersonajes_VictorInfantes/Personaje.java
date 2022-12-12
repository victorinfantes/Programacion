package ProyectoPersonajes_VictorInfantes;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Personaje {

    final int MAX_FUERZA = 100;
    final int MAX_INTELIGENCIA = 100;

    static int numeroPersonajes;

    String nombre;
    int edad,altura,inteligencia,fuerza;

    public Personaje(){
        this.nombre = null;
        this.edad = 0;
        this.altura = 0;
        if (inteligencia>100)
            inteligencia = 100;
        this.inteligencia = 100;

        if (fuerza>100)
            fuerza = 100;
        this.fuerza = fuerza;
        numeroPersonajes++;


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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        if(inteligencia>MAX_INTELIGENCIA)
            this.inteligencia=this.MAX_INTELIGENCIA;
        this.inteligencia = inteligencia;
    }

    public int getFuerza() {
        return fuerza;
    }
    public int sumarFuerza(Personaje p){
        return this.getFuerza()+p.getFuerza();

    }

    public void setFuerza(int fuerza) {
        if(fuerza>MAX_FUERZA)
            this.fuerza=this.MAX_FUERZA;
        else
            this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad + "años" +
                ", altura=" + altura + "cm" +
                ", inteligencia=" + inteligencia +
                ", fuerza=" + fuerza +
                '}';
    }

    public Personaje(String nombre, int edad, int altura, int inteligencia, int fuerza) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.inteligencia = inteligencia;
        this.fuerza = fuerza;
        numeroPersonajes++;
    }

    String consultaNombre() {
        return this.nombre;
    }
    void cambiaNombre(String nombre) {
        this.nombre=nombre;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre : ");
        Personaje p1=new Personaje();
        p1.setNombre(sc.next());
        System.out.println("El personaje nuevo se llama : "+p1.getNombre());
        System.out.println("Hasta ahora hay creado un total de :"+Personaje.numeroPersonajes+"personajes");
        System.out.println("Valores del personaje p1");
        p1.setEdad(50);
        p1.setAltura(100);
        p1.setFuerza(200);
        p1.setInteligencia(150);
        System.out.println("Datos del primer personaje :");
        System.out.println("Edad :"+p1.getEdad());
        System.out.println("Altura :"+p1.getAltura());
        System.out.println("Fuerza :"+p1.getFuerza());
        System.out.println("Inteligencia :"+p1.getInteligencia());

        Personaje p2=new Personaje();
        System.out.println("Datos del primer personaje :");
        System.out.println("Edad :"+p2.getEdad());
        System.out.println("Altura :"+p2.getAltura());
        System.out.println("Fuerza :"+p2.getFuerza());
        System.out.println("Inteligencia :"+p2.getInteligencia());
        System.out.println("Hasta ahora hay un numero total de "+numeroPersonajes+" personajes");

        Personaje p3=new Personaje("Frodo",33,126,98,30);
        System.out.println(p3.toString());
        Personaje p4=new Personaje("Aragon",45,185,88,92);
        Personaje p5=new Personaje("Legolas",2931,178,93,84);
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        p3.setFuerza(p3.getFuerza()+10);
        p3.setInteligencia(p3.getInteligencia()-10);
        p4.setAltura(p4.getAltura()+5);
        p4.setEdad(p4.getEdad()-10);
        p5.setFuerza(p5.getFuerza()-5);
        p5.setInteligencia(p5.getInteligencia()+10);
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        Personaje p6=new Personaje("Gregorian",15,30,100,95);
        System.out.println(p6.toString());
        p6.setInteligencia(50);
        System.out.println("Hasta ahora hay un total de "+numeroPersonajes+" personajes");
        System.out.println(p6.toString());
        System.out.println("La fuerza de Chuky y Legolas juntas es "+p6.sumarFuerza(p5));
    }
}
