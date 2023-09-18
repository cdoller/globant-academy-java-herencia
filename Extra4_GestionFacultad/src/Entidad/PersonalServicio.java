/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enum.EstadoCivil;
import java.time.Year;

public class PersonalServicio extends Empleado {

    protected String seccionAsignada;

    public PersonalServicio(String seccionAsignada, Year anioIncorporacion, int numeroDespacho, String nombre, String apellido, String nroIdentificacion, EstadoCivil estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombre, apellido, nroIdentificacion, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    @Override
    public String toString() {
        return  "Personal de servicio: " + super.toString() + 
                "seccionAsignada=" + seccionAsignada + "\n";
    }
    
    

}
