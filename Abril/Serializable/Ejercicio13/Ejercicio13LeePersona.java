package Abril.Serializable.Ejercicio13;

import java.io.*;

public class Ejercicio13LeePersona {
    public static void main(String[] args) {
        String[] nombres = {"Fernando", "Alejandro", "Manuel", "Matias"};
        String[] apellidos = {"Redondo", "Magno", "Cantero", "Rodriguez"};
        long[] telefono = {123456789, 987654321, 546372819, 647689751};

        try {
            FileOutputStream fos = new FileOutputStream("personas13.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < nombres.length; i++) {
                Persona p = new Persona(nombres[i], apellidos[i], telefono[i]);
                oos.writeObject(p);
            }
            System.out.println("Fichero de objetos creado adecuadamente");
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
            //Escribe todos los objetos en el fichero que hemos pasado.
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File fichero = new File("personas13.txt");
            if (fichero.exists()) {
                FileInputStream fis = new FileInputStream(fichero);
                ObjectInputStream ois = new ObjectInputStream(fis);
                while (true) {
                    Persona p = null;
                    p = (Persona) ois.readObject();
                    System.out.println(p);
                }
            }
        } catch (FileNotFoundException fn) {
            System.err.println("Fichero no encontrado " + fn);
        } catch (EOFException eof) {
            System.out.println("Se ha producido un error");
            eof.getStackTrace();
        } catch (Throwable t) {
            System.out.println("Se ha producido un error");
            t.getStackTrace();
        }
    }
}
