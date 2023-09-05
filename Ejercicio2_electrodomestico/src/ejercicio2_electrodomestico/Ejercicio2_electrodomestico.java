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

        Televisor tv = new Televisor();
        Lavadora lavadora = new Lavadora();

        tv.crearTelevisor();
        lavadora.crearLavadora();

        servElectr.addElectrodomestico(lavadora);
        servElectr.addElectrodomestico(tv);

        servElectr.imprimirListaElectrodomesticos();
    }

}
