package Tema6ModificaDB;

import java.sql.*;
import java.util.Scanner;

public class ProductosV2 {
    public static void main(String[] args) {
        //PASO 1: ESTABLECER CONEXION CON LA BASE DE DATOS

        String cadena = "jdbc:mysql://localhost:3306/gestiondepedidos";
        String usuario = "root";
        String contra = "";

        try {

            Connection miconexion = (Connection) DriverManager.getConnection(cadena, usuario, contra);
            System.out.println("Conexion establecida con la base de datos : " + miconexion.getCatalog());

            //PREPAREDSTATEMENT
            String sentenciaPreparada = "SELECT * FROM PRODUCTOS WHERE SECCION=? AND PAISDEORIGEN=?";
            PreparedStatement miPS = miconexion.prepareStatement(sentenciaPreparada);

            int bucle = 1;

            while (bucle == 1) {

                Scanner sc = new Scanner(System.in);
                System.out.println("¿Que Sección te interesa?" +
                        "FERRETER?\n" +
                        "JUGUETER?\n" +
                        "DEPORTES\n" +
                        "CONFECCI?\n" +
                        "CER?MICA\n" +
                        "OFICINA");
                String seccion = sc.next();
                System.out.println("¿Que país le interesa?" +
                        "ESPA?A\n" +
                        "MARRUECOS\n" +
                        "USA\n" +
                        "FRANCIA\n" +
                        "JAP?N\n" +
                        "CHINA\n" +
                        "ITALIA\n" +
                        "SUECIA\n" +
                        "TURQU?A\n" +
                        "TAIW?N");
                String pais = sc.next();
                //PASAMOS LOS VALORES PEDIENTES
                miPS.setString(1, seccion);
                miPS.setString(2, pais);
                //LANZAR LA EJECUCIÓN DE LA SENTENCIA
                ResultSet miRs = miPS.executeQuery();
                //MONSTRAR LA QUERY CON UN BUCLE QUE RECORRA EL RESULT SET
                System.out.println("La consulta es correcta a continuación se monstrarán los datos");
                System.out.println("-------------------------------------");
                while (miRs.next()) {
                    System.out.println("CODIGO :" + miRs.getString(1) + " NOMBRE DEL ARTICULO : " + miRs.getString(3) + " PRECIO : " + miRs.getString(4));
                    System.out.println("----------------------------------");
                }
                System.out.println("SI QUIERE HACER OTRA CONSULTA PRESIONE 1, SI QUIERE TERMINAR PULSE 0");
                bucle = sc.nextInt();
                miRs.close();
            }
            System.out.println("GRACIAS POR CONSULTAR NUESTROS CATALOGOS, SI NO QUIERE NINGUNA CONSULTA MÁS ME DESPIDO");



            miPS.close();
            miconexion.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
