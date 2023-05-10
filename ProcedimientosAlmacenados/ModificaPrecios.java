package ProcedimientosAlmacenados;

import java.sql.*;
import java.util.Scanner;

public class ModificaPrecios {
    public static void main(String[] args) {
        String cadena = "jdbc:mysql://localhost:3306/gestiondepedidos";
        String usuario = "root";
        String contra = "";
        Scanner sc = new Scanner(System.in);

        try {
            Connection miConexion = DriverManager.getConnection(cadena, usuario, contra);
            System.out.println("Conexion establecida");
            CallableStatement miLlamable = miConexion.prepareCall("{call ACTUALIZA_ARTICULO(?,?)}");
            Statement miSt = miConexion.createStatement();
            // PEDIR EL NOMBRE DEL ARTICULO AL USUARIO Y PEDIRLE EL NUEVO PRECIO A CAMBIAR

            System.out.println("Digame el nombre del producto que quiere cambiar");
            ResultSet miRs=miSt.executeQuery("SELECT DISTINCT NOMBREARTICULO FROM PRODUCTOS");
            while (miRs.next()) {
                System.out.println(miRs.getString(1)+"\n\r");
            }
            String articulo = sc.nextLine();
            System.out.println("Digame el nuevo precio del articulo :"+articulo+" que quiere cambiar");
            String precio = sc.nextLine();

            miLlamable.setString(1, precio);
            miLlamable.setString(2, articulo);

            miLlamable.execute();
            // AHORA SERIA CONVENIENTE UNA CONSULTA PARA VER QIE SE HA MODIFICADO
            System.out.println("Datos cambiados en la Base de Datos");
            miRs=miSt.executeQuery("SELECT * FROM PRODUCTOS WHERE NOMBREARTICULO="+"''  LIMIT 1");
            miRs.next();
            System.out.println(miRs.getString(1)+miRs.getString(2)+miRs.getString(3)+miRs.getString(4));
            miLlamable.close();
            miConexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
