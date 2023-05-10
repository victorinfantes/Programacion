package ExamenFicheros11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerObjetoPersona {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))){

            Object persona;

            while (true) {
                persona = ois.readObject();
                System.out.println(persona);
            }

        }catch (IOException e) {
            e.getStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
