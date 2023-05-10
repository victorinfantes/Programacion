package ProcedimientosAlmacenados;

import java.sql.*;

public class ConsultaDeportes {
    public static void main(String[] args) {

        String cadena = "jdbc:mysql://localhost:3306/gestiondepedidos";
        String usuario = "root";
        String contra = "";

        try {
            Connection miConexion = DriverManager.getConnection(cadena,usuario,contra);
            CallableStatement miLlamable = miConexion.prepareCall("{call MUESTRADEPORTES()}");

            ResultSet miRs = miLlamable.executeQuery();

            while (miRs.next()) {
                System.out.println("Articulo : "+miRs.getString(1)+" Seccion : "+miRs.getString(2)+" Articulo : "+miRs.getString(3)+" Precio : "+miRs.getString(4)+" ");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
