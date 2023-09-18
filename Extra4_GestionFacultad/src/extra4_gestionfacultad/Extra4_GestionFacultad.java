/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra4_gestionfacultad;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalServicio;
import Entidad.Profesor;
import Enum.EstadoCivil;
import java.time.Year;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Extra4_GestionFacultad {

    public static void main(String[] args) {
        ArrayList<Persona> personasFacultad = new ArrayList<Persona>();

        personasFacultad.add(new Estudiante("Matematica", "Carlos", "Oller", "31231523", EstadoCivil.SOLTERO));
        personasFacultad.add(new Profesor("Matematica", Year.of(2020), 10, "Ramon", "Diaz", "123123", EstadoCivil.DIVORCIADO));
        personasFacultad.add(new PersonalServicio("Patio", Year.of(1999), 15, "Pedro", "Gonzalez", "2154235", EstadoCivil.VIUDO));

        for (Persona aux : personasFacultad) {
            System.out.println(aux.toString());
        }

        personasFacultad.get(0).setEstadoCivil(EstadoCivil.CASADO);

        if (personasFacultad.get(1) instanceof Profesor) {
            ((Profesor) personasFacultad.get(1)).setNumeroDespacho(32);
            ((Profesor) personasFacultad.get(1)).setDepartamento("Computacion");            
        }

        if (personasFacultad.get(0) instanceof Estudiante) {
            ((Estudiante) personasFacultad.get(0)).setCursoInscripto("Ciencias");
        }
        
        if(personasFacultad.get(2) instanceof PersonalServicio){
            ((PersonalServicio) personasFacultad.get(2)).setSeccionAsignada("Estacionamiento");
        }
        
        System.out.println("------------------");
        for (Persona aux : personasFacultad) {
            System.out.println(aux.toString());
        }
        
    }

}
