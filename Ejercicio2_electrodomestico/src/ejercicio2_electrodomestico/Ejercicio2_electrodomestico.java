/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_electrodomestico;

import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ServicioElectrodomestico;

/**
 *
 * @author User
 */
public class Ejercicio2_electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioElectrodomestico servElectr = new ServicioElectrodomestico();
        
        
        Lavadora drean = new Lavadora();
        drean.crearLavadora();
        Televisor lg = new Televisor();
        lg.crearTelevisor();
        
        servElectr.addElectrodomestico(drean);
        servElectr.addElectrodomestico(lg);
//        System.out.println(servElectr.getListaElectrodom().toString());
        servElectr.imprimirListaElectrodomesticos();
    }
    
}
