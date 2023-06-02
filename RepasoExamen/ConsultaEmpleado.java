package RepasoExamen;

import java.sql.*;

public class ConsultaEmpleado {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Nos conectamos a la base de datos
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleadoss_departamentoss","root","");
            Statement miStatement = miConexion.createStatement();
            //Hacemos la query
            String miConsulta = "SELECT nomEmp,salEmp,fecNac FROM empleados";
            //Me creo un Result Set para hacer la consulta guardada en la variable
            ResultSet miResulSet = miStatement.executeQuery(miConsulta);
            //Recorrer el Resul Set e imprimirlo
            while (miResulSet.next()) {
                System.out.println(miResulSet.getString(1));

            }
            miResulSet.close();
            miStatement.close();
            miConexion.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
