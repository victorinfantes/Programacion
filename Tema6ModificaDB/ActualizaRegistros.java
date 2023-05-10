package Tema6ModificaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizaRegistros {
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
            String sentencia = "UPDATE CLIENTESCSV SET EMPRESA='LA ESPAÑOLA' WHERE CODIGOCLIENTE='CT03'";

            miStatement.executeUpdate(sentencia);
            System.out.println("PRODUCTO ACTUALIZADO EN LA BASE DE DATOS");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
