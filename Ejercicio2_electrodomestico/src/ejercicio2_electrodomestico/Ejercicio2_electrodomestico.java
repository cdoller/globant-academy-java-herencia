package ejercicio2_electrodomestico;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Enums.ConsumoEnergetico;
import Servicio.ServicioElectrodomestico;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Ejercicio2_electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 2
//        ServicioElectrodomestico servElectrEj2 = new ServicioElectrodomestico();
//        Televisor tv = new Televisor();
//        Lavadora lavadora = new Lavadora();
//        tv.crearTelevisor();
//        lavadora.crearLavadora();
//        servElectrEj2.addElectrodomestico(lavadora);
//        servElectrEj2.addElectrodomestico(tv);
//        servElectrEj2.imprimirListaElectrodomesticos();
        // Ejercicio 3
        ServicioElectrodomestico servElectrEj3 = new ServicioElectrodomestico();
        servElectrEj3.setListaElectrodom(cargarElectrodomesticos());
        servElectrEj3.ejecutarPrecioFinal();
        servElectrEj3.calcularSumaPrecios();
        servElectrEj3.imprimirListado();
    }

    public static ArrayList<Electrodomestico> cargarElectrodomesticos() {
        ArrayList<Electrodomestico> listado = new ArrayList<Electrodomestico>();
        listado.add(new Televisor(43, true, "Blanco", "A", 10d));
        listado.add(new Televisor(50, false, "Gris Oscuro", "B", 20d));
        listado.add(new Lavadora(10d, "Negro", "D", 30d));
        listado.add(new Lavadora(15d, "Purpura", "H", 50d));
        return listado;
    }

}
