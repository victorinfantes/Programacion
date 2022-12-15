package Condicionales_Bucles_11_23;
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        int numero = 0;
        boolean multiploDeTres = false;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            System.out.println("Porfavor introduce un numero ");
            numero=sc.nextInt();
            if(numero%3==0)
                {
                    multiploDeTres=true;
                }
        }
        if(multiploDeTres == false)
            System.out.println("No existen multiplos de 3 ");
        else
            System.out.println("El "+numero+" es multiplo de 3");
    }
}
