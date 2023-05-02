package Marzo;

import java.io.File;
import java.io.FileInputStream;

public class ContadorVocalesDeUnFicheroBinario {
    public static void main(String[] args) {
        System.out.println("Contando vocales...");
        int a,e,i,o,u;
        a=e=i=o=u= 0;
        try {
            FileInputStream ficheroEntrada2 =
            new FileInputStream(new File("datosbinarios.dat"));
            int dato;
            while ((dato = ficheroEntrada2.read()) != -1) {
                switch (dato) {
                    case 97: a++;
                    break;
                    case 101: e++;
                    break;
                    case 105: i++;
                    break;
                    case 111: o++;
                    break;
                    case 117: u++;
                    break;
                    default: break;
                }
            }
            ficheroEntrada2.close();
        } catch (Exception errorDeFichero) {
            System.out.println(errorDeFichero.getMessage());
        }

        System.out.println("Cantidad de a :"+ a);
        System.out.println("Cantidad de e :"+ e);
        System.out.println("Cantidad de i :"+ i);
        System.out.println("Cantidad de o :"+ o);
        System.out.println("Cantidad de u :"+ u);

    }
}
