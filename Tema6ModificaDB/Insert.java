package Tema6ModificaDB;

import java.sql.*;

public class Insert {
    public static void main(String[] args) {
        //PASO 1: ESTABLECER CONEXION CON LA BASE DE DATOS

        String cadena = "jdbc:mysql://localhost:3306/gestiondepedidos";
        String usuario = "root";
        String contra = "";

        try {
            Connection miconexion = (Connection) DriverManager.getConnection(cadena, usuario, contra);
            System.out.println("Conexion establecida");

            //Crear objeto STATEMENT
            Statement miStatement = miconexion.createStatement();

            //EJECUTAR LA INSTRUCCIÓN DE ACTUALIZACIÓN
            String sentencia = "INSERT INTO PRODUCTOS (CODIGOARTICULO,NOMBREARTICULO,PRECIO) VALUES ('AR42','MARTILLO PILON','20')";

            miStatement.executeUpdate(sentencia);
            System.out.println("PRODUCTO INSERTADO CORRECTAMENTE EN LA BASE DE DATOS");

            System.out.println("CERRANDO STATEMENT");
            miStatement.close();
            System.out.println("CERRANDO CONEXION CON LA BASE DE DATOS : "+miconexion.getCatalog());
            miconexion.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

