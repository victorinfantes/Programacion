package Arrays2;
import java.util.Scanner;
public class Array2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba su frase :");
        String frase=sc.nextLine();
        //Pasar esta frase a un array de char .
        //Creamos un array de char
        char frasecaracteres[]=new char[frase.length()];
        //Recorremos la frase (String) y metemos cada caracter
        for (int i = 0; i < frase.length(); i++) {
            frasecaracteres[i]=frase.charAt(i);
        }
        for (int i = 0; i < frasecaracteres.length; i++) {
            System.out.print(frasecaracteres[i]+"-");
        }
    }
}
