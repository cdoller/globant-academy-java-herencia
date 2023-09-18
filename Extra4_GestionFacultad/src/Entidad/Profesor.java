/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enum.EstadoCivil;
import java.time.Year;

public class Profesor extends Empleado {

    protected String departamento;

    public Profesor(String departamento, Year anioIncorporacion, int numeroDespacho, String nombre, String apellido, String nroIdentificacion, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, nroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString() + 
               "departamento=" + departamento + "\n";
    }

    

}
