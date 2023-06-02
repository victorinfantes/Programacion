package Tema6Transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transac_Clientes_Pedidos {
    public static void main(String[] args) {

        try {

            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
            Statement miStatement = miConexion.createStatement();
            String sqlCliente = "INSERT INTO CLIENTES (CÓDIGOCLIENTE,EMPRESA,DIRECCIÓN) VALUES ('ct84','IES CASTELAR','Calle la bomba')";
            miStatement.executeUpdate(sqlCliente);
            String sqlPedido = "INSERT INTO PEDIDOS";

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
