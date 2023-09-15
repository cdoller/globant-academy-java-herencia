package extra3_hoteles;

import Entidad.Hotel;
import Entidad.Hotel5Estrellas;
import Enum.Gimnasio;
import Servicio.ServicioAlojamiento;
import java.text.NumberFormat;
import java.util.Locale;

public class Extra3_Hoteles {

    public static void main(String[] args) {
//        Hotel hotelA = new Hotel5Estrellas(3, 2, 
//                2, Gimnasio.A, "Las Camelias", 
//                50, 30, 60, 10,
//                0, "Sheraton", "Duarte Quiros 1234", 
//                "Cordoba", "Esteban Quito");
//        
//        hotelA.calcularPrecioHabitacion();
//        double precioHabitacion = hotelA.getPrecioHabitacion();
//        String precioHabitacionFormateado = NumberFormat.getCurrencyInstance(Locale.US).format(precioHabitacion);
//        System.out.println("El precio de la habitacion es: " + precioHabitacionFormateado);
          ServicioAlojamiento servAlojamiento = new ServicioAlojamiento();
          servAlojamiento.generarAlojamientosRandom(20);
          //System.out.println(servAlojamiento.getAlojamientos().toString());
          //servAlojamiento.imprimirAlojamientos();
          servAlojamiento.imprimirHoteles();
          //servAlojamiento.imprimirCampingsConRestaurante();
          //servAlojamiento.imprimirResidenciasConDescuento();
    }
    
}
