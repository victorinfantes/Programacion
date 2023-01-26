/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Víctor Infantes Guerra
 */
public class Contratador {

    private List<Departamento> departamentos;

    public Contratador() {
        this.departamentos = new ArrayList<>();

    }

    /**
     * Genera departamentos con sus atributos.
     */
    public void generarDepartamentos() {
        Departamento dep1 = new Departamento(1, "Ventas", 12);
        departamentos.add(dep1);
    }

    /**
     * Genera empleados con sus atributos.
     */
    public void generarEmpleados() {

        String nombre[] = {"HUGO", "DANIEL", "ALVARO", "PABLO", "ALEJANDRO", "MANUEL", "ADRIAN", "DAVID", "JAVIER", "MARIO", "LUCIA", "MARIA", "VALERIA", "DANIELA", "CARLA", "PAULA", "CARMEN", "SOFIA", "MARTINA", "ALBA"};
        String apellido[] = {"CAMPOS", "VEGA", "FUENTES", "DIEZ", "CARRASCO", "CABALLERO", "NIETO", "REYES", "AGUILAR", "PASCUAL", "HERRERO", "SANTANA", "LORENZO", "MONTERO", "HIDALGO", "GIMENEZ", "IBAÑEZ", "FERRER", "DURAN", "SANTIAGO", "VICENTE", "BENITEZ", "MORA", "ARIAS", "VARGAS", "CARMONA", "CRESPO", "ROMAN", "PASTOR", "SOTO", "SAEZ", "VELASCO", "MOYA", "SOLER", "ESTEBAN", "PARRA", "BRAVO", "GALLARDO", "ROJAS"};
        Random rnd = new Random();

        for (int i = 0; i < 10000; i++) {
            Empleado emp = new Empleado(nombre[rnd.nextInt(nombre.length)], apellido[rnd.nextInt(apellido.length)], apellido[rnd.nextInt(apellido.length)], ((rnd.nextInt(18)) + 8) * 100);
            departamentos.get(0).getEmpleados().add(emp);
        }
    }



}
