package extra3_hoteles;

import Servicio.ServicioAlojamiento;
import java.util.Scanner;

public class Extra3_Hoteles {

    public static ServicioAlojamiento servAlojamiento = new ServicioAlojamiento();
    public static Scanner input = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de Alojamientos");
        System.out.print("Ingrese la cantidad de alojamientos del sistema:\n>>> ");
        
        servAlojamiento.generarAlojamientosRandom(input.nextInt());
        menu();
    }

    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("Opciones Permitidas: ");
        System.out.println("1- Imprimir alojamientos");
        System.out.println("2- Imprimir hoteles");
        System.out.println("3- Imprimir campings con restaurantes");
        System.out.println("4- Imprimir Residencias con descuento");
        System.out.println("9- SALIR");
        System.out.print(">>> ");
        int opcionElegida = input.nextInt();
        System.out.println("---------------------------");
        switch (opcionElegida) {
            case 1:
                servAlojamiento.imprimirAlojamientos();
                break;
            case 2:
                servAlojamiento.imprimirHoteles();
                break;
            case 3:
                servAlojamiento.imprimirCampingsConRestaurante();
                break;
            case 4:
                servAlojamiento.imprimirResidenciasConDescuento();
                break;
            case 9:
                System.out.println("Gracias por usar el sistema.");
                return;
            default:
                System.out.println("Opcion incorrecta");
        }
        menu();        
    }

}
