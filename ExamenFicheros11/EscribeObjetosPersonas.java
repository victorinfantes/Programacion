package ExamenFicheros11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribeObjetosPersonas {
    public static void main(String[] args) {
        PersonaSe p1 = new PersonaSe(01,"Juan","nadie","sin miedo");
        System.out.println(p1);
        PersonaSe p2 = new PersonaSe(02,"Alejandro","Magno","sin miedo");
        System.out.println(p2);
        PersonaSe p3 = new PersonaSe(03,"Antonio","Sanchez","Jus");
        System.out.println(p3);

        try {
            FileOutputStream fos = new FileOutputStream("personas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.close();
            fos.close();

        }catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
