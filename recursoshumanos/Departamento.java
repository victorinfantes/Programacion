/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Víctor Infantes Guerra
 */
public class Departamento {
    private int codDepartamento;
    private String nombre;
    private int planta;
    private List<Empleado> empleados;

    public Departamento(int codDepartamento, String nombre, int planta) {
        this.codDepartamento = codDepartamento;
        this.nombre = nombre;
        this.planta = planta;
        this.empleados = new ArrayList<>();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * @return the codDepartamento
     */
    public int getCodDepartamento() {
        return codDepartamento;
    }

    /**
     * @param codDepartamento the codDepartamento to set
     */
    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the planta
     */
    public int getPlanta() {
        return planta;
    }

    /**
     * @param planta the planta to set
     */
    public void setPlanta(int planta) {
        this.planta = planta;
    }


}
