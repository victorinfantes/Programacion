package ExamenCorredigo;
import java.util.Scanner;
public class Principal2 {
    public static void main(String[] args) {
        Examen[] examenes=new Examen[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< examenes.length;i++){

            examenes[i]=new Examen();
            System.out.println("Dame el nombre de la persona :");
            examenes[i].setNombre(sc.next());
            System.out.println("Dame la edad de la persona :");
            examenes[i].setEdad(sc.nextInt());
            System.out.println("Dame la altura de la persona :");
            examenes[i].setAltura(sc.nextFloat());
            System.out.println("Dame la nota de la persona :");
            examenes[i].setNotExpediente(sc.nextInt());
            System.out.println("examen:"+i +examenes[i].toString());
        }


    }
}
