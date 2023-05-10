package Tema6ModificaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class BorrarFilas {
    public static void main(String[] args) {


   //PASO 1: ESTABLECER CONEXION CON LA BASE DE DATOS

    String cadena = "jdbc:mysql://localhost:3306/gestiondepedidos";
    String usuario = "root";
    String contra = "";

    //PASO 2: CREAR OBJETO STATEMENT

    try {
        Connection miconexion = (Connection) DriverManager.getConnection(cadena, usuario, contra);
        System.out.println("Conexion establecida");

        //Crear obajeto STATEMENT
        Statement miStatement = miconexion.createStatement();

        //3 EJECUTAR LA INSTRUCCION DE BORRADO

        String SentenciaDeBorrado="DELETE FROM PRODUCTOS WHERE CODIGOARTICULO = 'AR02'";

        miStatement.executeUpdate(SentenciaDeBorrado);
        System.out.println("PRODUCTO BORRADO ADECUADAMENTE DE LA TABLA");




    } catch (SQLException e) {
        e.printStackTrace();
    }

}
}