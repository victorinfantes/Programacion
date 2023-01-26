/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

/**
 * @author Víctor Infantes Guerra
 */
public class RecursosHumanos {
    public static void main(String[] args) {
        System.out.println("Insertando datos ");
        Contratador contratador = new Contratador();
        contratador.generarDepartamentos();
        contratador.generarEmpleados();
        System.out.println(contratador);
    }
}
