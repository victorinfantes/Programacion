package Tema6AccesoBaseDeDatos;

import java.sql.*;

public class ConectaDB {
    public static void main(String[] args) {


        //1 Crear conexión

        String cadena = "jdbc:mysql://localhost:3306/gestiondepedidos";
        String usuario = "root";
        String contra = "";

        try {
            Connection miconexion = (Connection) DriverManager.getConnection(cadena, usuario, contra);
            System.out.println("Conexion establecida");
            //Crear obajeto STATEMENT
            Statement miStatement = miconexion.createStatement();
            //Crear y ejecutar QUERY INSTRUCTION SQL
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM PRODUCTOS");
            //Recorrer la consulta
            System.out.println("Consulta realizada con exito");
            System.out.println("MONSTRANDO DATOS | TABLA PRODUCTOS");
            while (miResultSet.next()) {
                System.out.println("Codigo Articulo : "+miResultSet.getString("SECCION")+
                        "Seccion : "+miResultSet.getString(2)+
                        "NOMBRE ARTICULO : "+miResultSet.getString(3)+
                        "PAIS : "+miResultSet.getString(7));

            }
            miResultSet.close();
            System.out.println("Cerrando RESULT SET");
            miconexion.close();
            System.out.println("Cerrando conexion con la BBDD");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
