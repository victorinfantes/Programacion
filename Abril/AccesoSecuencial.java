package Abril;

import java.io.*;

public class AccesoSecuencial {
    public static void main(String[] args) {
        DataOutputStream archivo = null;
        DataInputStream fich = null;
        String nombre = null;
        int edad = 0;
        try {
            archivo = new DataOutputStream(new FileOutputStream("secuencial.dat",true));
            // Escribir el nombre y los apellidos
            archivo.writeUTF("Antonio López Pérez ");
            archivo.writeInt(33);
            archivo.writeUTF("Pedro Piqueras Peñaranda");
            archivo.writeInt(45);
            archivo.writeUTF("José Antonio Ruiz Pérez ");
            archivo.writeInt(51);
            // Cerrar fichero
            archivo.close();
            // Abrir para leer
            fich = new DataInputStream(new FileInputStream("secuencial.dat"));
            nombre = fich.readUTF();
            System.out.println(nombre);
            edad = fich.readInt();
            System.out.println(edad);
            nombre = fich.readUTF();
            System.out.println(nombre);
            edad = fich.readInt();
            System.out.println(edad);
            nombre = fich.readUTF();
            System.out.println(nombre);
            edad = fich.readInt();
            System.out.println(edad);
            fich.close();

        } catch (FileNotFoundException fnfe) { /* Archivo no encontrado */ } catch (
                IOException ioe) { /* Error al escribir */ } catch (Exception e) { /* Error de otro tipo*/
            System.out.println(e.getMessage());
        }

    }
}
