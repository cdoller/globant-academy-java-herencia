package extra1_barcos;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Cliente;
import Entidad.Puerto;
import Entidad.Velero;
import Entidad.Yate;
import Servicio.ServicioPuerto;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Extra1_Barcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPuerto servPuerto = new ServicioPuerto("Puerto de Mar del Plata", 3);
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        boolean seguir = true;
        do {
            System.out.println("\n-------------------------------");
            System.out.println("Sistema administracion amarres:");
            System.out.println("-------------------------------");
            System.out.println("1 - Imprimir listado de barcos amarrados");
            System.out.println("2 - Simular alquileres");
            System.out.println("3 - Ver listado de alquileres ACTIVOS");
            System.out.println("4 - Finalizar un alquiler");
            System.out.println("8 - Ver listado de alquileres FINALIZADOS");
            System.out.println("9 - SALIR");
            System.out.print(">>>> ");
            int opcionElegida = input.nextInt();
            System.out.println("-------------------------------");
            switch (opcionElegida) {
                case 1:
                    servPuerto.imprimirInfo();
                    break;
                case 2:
                    servPuerto.cargarAlquileres();
                    break;
                case 3:
                    servPuerto.verListadoAlquileres(false);
                    break;
                case 4:
                    System.out.print("Ingrese el id del alquiler que desea finalizar: ");
                    int idAlquiler = input.nextInt();
                    System.out.print("Introduce una fecha de fin de alquiler(aaaa-MM-dd): ");
                    String fechaFin = input.next();
                    
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
                    try {
                        LocalDate fechaValida = LocalDate.parse(fechaFin, dateFormatter);
                        servPuerto.finalizarAlquiler(idAlquiler, fechaValida);
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de fecha invalido. Formato aaaa-MM-dd.");
                    }
                    break;
                case 8:
                    servPuerto.verListadoAlquileres(true);
                    break;
                case 9:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese nuevamente");
            }

        } while (seguir);

//        Alquiler alquilerAFinalizar = puerto.getListadoAlquileres().get(0);
//
//        puerto.finalizarAlquiler(alquilerAFinalizar, LocalDate.of(2023, Month.OCTOBER, 12));
//
//        System.out.println("El monto del alquiler por: " + alquilerAFinalizar.getCantidadDias() + " dias es de: $" + alquilerAFinalizar.getPrecioAlquiler());
//        System.out.println(alquilerAFinalizar.getBarco().toString());
//        puerto.imprimirInfo();
//
//        System.out.println("El precio del alquiler seria de : " + puerto.cotizarAlquiler(puerto.getListadoAlquileres().get(0), LocalDate.of(2023, Month.OCTOBER, 30)));
    }

}
