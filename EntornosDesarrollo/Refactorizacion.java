package EntornosDesarrollo;

public class Refactorizacion {

    public static final float NOTA = 6.60f;

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Persona persona1 = new Persona(1,18,180, 1.60f, "Ana");
        Persona persona2 = new Persona(2,20,190, NOTA, "Jose");

        Persona[] personas = new Persona[10];
        for (int i = 0; i < 10; i++) {

            personas[i] = new Persona(NOTA);
            System.out.println(personas[i]);
        }



    }
}
