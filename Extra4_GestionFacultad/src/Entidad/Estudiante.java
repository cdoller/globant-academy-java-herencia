/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entidad;

import Enum.EstadoCivil;

public class Estudiante extends Persona{
    protected String cursoInscripto;

    public Estudiante(String cursoInscripto, String nombre, String apellido, String nroIdentificacion, EstadoCivil estadoCivil) {
        super(nombre, apellido, nroIdentificacion, estadoCivil);
        this.cursoInscripto = cursoInscripto;
    }

    public String getCursoInscripto() {
        return cursoInscripto;
    }

    public void setCursoInscripto(String cursoInscripto) {
        this.cursoInscripto = cursoInscripto;
    }

    @Override
    public String toString() {
        return  "Estudiante: " + super.toString() +
                "cursoInscripto=" + cursoInscripto + "\n";
    }
    
    
}