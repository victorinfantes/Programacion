package ExamenCorredigo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        int nota=0;
        Examen examen1=new Examen("luisa perez",32,170,8  );
        System.out.println("La persona 1 es :"+examen1.toString());
        System.out.println("La nota que llevas hasta ahora es : "+(++nota));

        System.out.println("Nombre :"+examen1.getNombre());
        System.out.println("Edad :"+examen1.getEdad());
        System.out.println("Altura :"+examen1.getAltura());
        System.out.println("Expediente :"+examen1.getNotExpediente());
        System.out.println("La nota que llevas hasta ahora es : "+(++nota));

        Scanner sc=new Scanner(System.in);
        System.out.println("Dame Nombre :");
                examen1.setNombre(sc.next());
        System.out.println("Dame Edad :");
                examen1.setEdad(sc.nextInt());
        System.out.println("Dame Altura :");
                examen1.setAltura(sc.nextFloat());
        System.out.println("Dame Expediente :");
                examen1.setNotExpediente(sc.nextInt());
        System.out.println("La persona 1 ahora es :"+examen1.toString());



    }


}
