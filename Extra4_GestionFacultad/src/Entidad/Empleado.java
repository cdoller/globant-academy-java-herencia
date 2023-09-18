/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

import Enum.EstadoCivil;
import java.time.Year;

public class Empleado extends Persona{
    protected Year anioIncorporacion;
    protected int numeroDespacho;

    public Empleado(Year anioIncorporacion, int numeroDespacho, String nombre, String apellido, String nroIdentificacion, EstadoCivil estadoCivil) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public Year getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(Year anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "anioIncorporacion=" + anioIncorporacion + 
                "\nnumeroDespacho=" + numeroDespacho + "\n";
    }
    
    
}