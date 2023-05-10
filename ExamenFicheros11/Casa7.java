package ExamenFicheros11;

import java.io.File;
import java.io.IOException;

public class Casa7 {
    public static void main(String[] args) {

        try {
            String directorio = "D:\\pruebasDeFicheros";

            String estructura = directorio + "/carpeta1/carpeta2/carpeta3";

            boolean exito = new File(directorio).mkdir();
            if (exito) {
                System.out.println("El directorio " + directorio + " fue creado correctamente");
                exito = new File(estructura).mkdirs();
            }
            if (exito) {
                System.out.println("La estructura de directorios " + estructura + " fue creada correctamente");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
