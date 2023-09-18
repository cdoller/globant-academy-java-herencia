package Servicio;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4Estrellas;
import Entidad.Hotel5Estrellas;
import Entidad.Residencia;
import Enum.Gimnasio;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Random;

public class ServicioAlojamiento {

    private ArrayList<Alojamiento> alojamientos;

    public ServicioAlojamiento() {
        alojamientos = new ArrayList<Alojamiento>();
    }

    public ArrayList<Alojamiento> getAlojamientos() {
        return alojamientos;
    }

    public void generarAlojamientosRandom(int cantAlojamientos) {
        int opcion = 1;
        for (int i = 0; i < cantAlojamientos; i++) {
            opcion = (int) (Math.random() * 4) + 1;

            Alojamiento alojamiento = nuevoAlojamiento(opcion);
            if (alojamiento instanceof Hotel) {
                ((Hotel) alojamiento).calcularPrecioHabitacion();
            }
            alojamientos.add(alojamiento);
        }
    }

    private Alojamiento nuevoAlojamiento(int opcion) {
        int cantSalones = generarNumeroRandom(1, 3);
        int cantSuites = generarNumeroRandom(1, 3);
        int cantLimosinas = generarNumeroRandom(1, 5);
        Gimnasio gym = generarNumeroRandom(1, 2) == 1 ? Gimnasio.A : Gimnasio.B;
        String nombreRestaurante = generarNombreRandom(1);
        int capacidadRestaurante = generarNumeroRandom(10, 100);
        int cantHabitaciones = generarNumeroRandom(10, 40);
        int numeroCamas = cantHabitaciones * 2;
        int cantPisos = numeroCamas / 10 + 1;
        String nombreAlojamiento = generarNombreRandom(2);
        String direccion = generarNombreRandom(3) + " " + ((int) (Math.random() * 1000) + 1);
        String localidad = generarNombreRandom(4);
        String nombreGerente = generarNombreRandom(5);
        int capacidadMaximaCarpas = generarNumeroRandom(10, 40);
        int capacidadBaniosDisponibles = generarNumeroRandom(5, 20);
        boolean poseeRestaurante = generarNumeroRandom(1, 2) == 1;
        boolean esPrivado = generarNumeroRandom(1, 2) == 1;
        int superficie = generarNumeroRandom(500, 5000);
        boolean haceDescuentosGremiales = generarNumeroRandom(1, 2) == 1;
        boolean poseeCampoDeportivo = generarNumeroRandom(1, 2) == 1;

        switch (opcion) {
            case 1:
                return new Hotel5Estrellas(cantSalones, cantSuites, cantLimosinas, gym,
                        nombreRestaurante, capacidadRestaurante, cantHabitaciones, numeroCamas, cantPisos,
                        nombreAlojamiento, direccion, localidad, nombreGerente, "Hotel 5 estrellas");
            case 2:
                return new Hotel4Estrellas(gym, nombreRestaurante, capacidadRestaurante, cantHabitaciones,
                        numeroCamas, cantPisos, nombreAlojamiento, direccion, localidad,
                        nombreGerente, "Hotel 4 estrellas");
            case 3:
                return new Camping(capacidadMaximaCarpas, capacidadBaniosDisponibles, poseeRestaurante,
                        esPrivado, superficie, nombreAlojamiento, direccion, localidad, nombreGerente, "Camping");
            case 4:
                return new Residencia(cantHabitaciones, haceDescuentosGremiales, poseeCampoDeportivo, esPrivado,
                        superficie, nombreAlojamiento, direccion, localidad, nombreGerente, "Residencia");
            default:
                throw new AssertionError();
        }
    }

    private int generarNumeroRandom(int minimo, int maximo) {
        return (int) (Math.random() * maximo) + minimo;
    }

    /**
     * Genera String aleatorio en base a diferentes listas.
     *
     * @param nroListado : 1 - listado de nombres de restaurante 2 - listado de
     * nombres de hoteles 3 - listado de nombres de calle 4 - listado de nombres
     * de localidades 5 - nombre gerente
     * @return un nombre aleatorio del listado
     */
    private String generarNombreRandom(int nroListado) {
        Random random = new Random();
        ArrayList<String> lista1 = new ArrayList<>(Arrays.asList("El Sabor del Sur", "La Trattoria", "Casa de la Abuela", "La Parrilla de Don Juan", "Mariscos del Pacifico", "La Cuchara de Oro", "El Rincon Gourmet", "Parrillada El Vaquero", "Sushi Fusion", "La Cantina Mexicana", "El Paladar Cubano", "Sabores del Mediterraneo", "Cafe Paris", "La Taberna Espaniola", "Asia Wok", "La Brasserie", "Sabor a Mar", "Cocina Peruana", "Delicias Argentinas", "Cafe de la Plaza"));
        ArrayList<String> lista2 = new ArrayList<>(Arrays.asList("Hostal Amanecer", "Posada Acogedora", "Motel Brisas del Mar", "Hostal del Arce", "Motel Vista al Pino", "Refugio del Rio", "Posada Frente al Lago", "Escondite del Bosque", "Estancia Urbana", "Hotel Puerto", "Suites Economicas", "Cabanias del Valle", "Hotel Vista a la Montania", "Hostal del Mar", "Hotel Estrella", "Motel Arena Dorada", "Camping Riverside", "Camping del Bosque", "Albergue del Cielo", "Hotel del Valle"));
        ArrayList<String> lista3 = new ArrayList<>(Arrays.asList("Calle de la Rosa", "Avenida del Sol", "Carrera del Mar", "Paseo de la Montana", "Callejon de los Alamos", "Avenida de los Olivos", "Camino del Rio", "Pasaje de la Luna", "Calle de la Palma", "Avenida de las Flores", "Calle Mayor", "Paseo de la Playa", "Avenida de la Libertad", "Carrera del Pino", "Paseo de los Pajaros", "Callejon de las Estrellas", "Avenida del Bosque", "Calle de los Jazmines", "Paseo de las Mariposas", "Avenida de la Esperanza"));
        ArrayList<String> lista4 = new ArrayList<>(Arrays.asList("Villa Nueva", "San Jose", "Santa Rosa", "San Juan", "Santa Cruz", "San Miguel", "San Fernando", "Santa Fe", "San Carlos", "Santo Domingo", "San Rafael", "San Martin", "San Antonio", "San Luis", "Santa Maria", "San Pedro", "Santa Clara", "San Ignacio", "San Gabriel", "Santiago"));
        ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList("Manolo", "Nikita", "Takeshi", "Vladimir", "Martha", "Aristoteles", "Hypatia", "Deborah", "Kim"));
        ArrayList<String> listaApellidos = new ArrayList<>(Arrays.asList("Putin", "Nakamura", "Jimenez", "Mussolini", "Khan", "Hotpants", "Coldpants", "Solis", "Zheng"));

        switch (nroListado) {
            case 1:
                return lista1.get(random.nextInt(lista1.size()));
            case 2:
                return lista2.get(random.nextInt(lista2.size()));
            case 3:
                return lista3.get(random.nextInt(lista3.size()));
            case 4:
                return lista4.get(random.nextInt(lista4.size()));
            case 5:
                return listaNombres.get(random.nextInt(listaNombres.size())) + " " + listaApellidos.get(random.nextInt(listaApellidos.size()));
            default:
                return "No posee";
        }

    }

    public void imprimirAlojamientos() {
        System.out.println("------Listado Alojamientos------");
        System.out.printf("%-20s | %-25s | %-30s | %-20s %n",
                "TIPO", "NOMBRE", "DIRECCION", "LOCALIDAD");

        for (Alojamiento aux : alojamientos) {
            System.out.printf("%-20s | %-25s | %-30s | %-20s %n",
                    aux.getTipo(), aux.getNombre(), aux.getDireccion(), aux.getLocalidad());
        }
    }

    public void imprimirHoteles() {
        boolean noHayHoteles = true;
        alojamientos.sort(compararPorTipo);
        alojamientos.sort(compararPorPrecio);

        System.out.println("------Listado Hoteles------");
        System.out.printf("%-20s | %-25s | %-30s | %-20s | %-10s%n",
                "TIPO", "NOMBRE", "DIRECCION", "LOCALIDAD", "PRECIO");
        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Hotel) {
                System.out.printf("%-20s | %-25s | %-30s | %-20s | %-10s%n",
                        aux.getTipo(), aux.getNombre(), aux.getDireccion(), aux.getLocalidad(), NumberFormat.getCurrencyInstance(Locale.US).format(((Hotel) aux).getPrecioHabitacion()));
                noHayHoteles = false;
            }
        }

        if (noHayHoteles) {
            System.out.println("No hay hoteles en la lista.");
        }
    }

    public void imprimirCampingsConRestaurante() {
        boolean noHayCampings = true;
        System.out.println("------Listado Campings con restaurante ------");
        System.out.printf("%-20s | %-25s | %-30s | %-20s%n",
                "TIPO", "NOMBRE", "DIRECCION", "LOCALIDAD");

        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isPoseeRestaurante()) {
                    System.out.printf("%-20s | %-25s | %-30s | %-20s%n",
                            aux.getTipo(), aux.getNombre(), aux.getDireccion(), aux.getLocalidad());
                    noHayCampings = false;
                }
            }
        }

        if (noHayCampings) {
            System.out.println("No hay campings con restaurante.");
        }
    }

    public void imprimirResidenciasConDescuento() {
        boolean noHayResidencia = true;
        System.out.println("------Listado Residencias con descuento ------");
        System.out.printf("%-20s | %-25s | %-30s | %-20s%n",
                "TIPO", "NOMBRE", "DIRECCION", "LOCALIDAD");

        for (Alojamiento aux : alojamientos) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isHaceDescuentosGremios()) {
                    System.out.printf("%-20s | %-25s | %-30s | %-20s%n",
                            aux.getTipo(), aux.getNombre(), aux.getDireccion(), aux.getLocalidad());
                    noHayResidencia = false;
                }
            }
        }

        if (noHayResidencia) {
            System.out.println("No hay residencias con descuentos.");
        }
    }

    public static Comparator<Alojamiento> compararPorTipo = (Alojamiento a, Alojamiento a1)
            -> a.getTipo().compareTo(a1.getTipo());

    public static Comparator<Alojamiento> compararPorPrecio = (Alojamiento a, Alojamiento a1) -> {
        if (a instanceof Hotel && a1 instanceof Hotel) {
            Hotel h = (Hotel) a;
            Hotel h1 = (Hotel) a1;
            return Double.compare(h1.getPrecioHabitacion(), h.getPrecioHabitacion());
        }
        return 0;
    };
}
