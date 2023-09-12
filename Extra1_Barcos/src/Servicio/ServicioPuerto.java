/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Cliente;
import Entidad.Puerto;
import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class ServicioPuerto {

    Puerto puerto;
    private ArrayList<Cliente> listaClientes;

    public ServicioPuerto(String nombrePuerto, int capacidadAmarres) {
        listaClientes = new ArrayList<Cliente>();
        puerto = new Puerto(nombrePuerto, capacidadAmarres);
        inicializarDatosPrueba();
        cargarBarcos();
    }

    private void inicializarDatosPrueba() {
        listaClientes.add(new Cliente("Carlos", "38123640"));
        listaClientes.add(new Cliente("Pepe", "40230510"));
    }

    private void cargarBarcos() {
        listaClientes.get(0).agregarBarco(new BarcoMotor(250, "ASD-123", 20.0, Year.of(2005)));
        listaClientes.get(0).agregarBarco(new Velero(2, "PRP-433", 15.0, Year.of(2015)));
        listaClientes.get(1).agregarBarco(new Yate(3, 250, "OLAKASE", 30.0, Year.of(2022)));
    }

    /**
     * Crea alquileres para los clientes cargados.
     */
    public void cargarAlquileres() {
        Cliente cliente1 = listaClientes.get(0), cliente2 = listaClientes.get(1);
        puerto.agregarAlquiler(new Alquiler(cliente1, cliente1.getBarcos().get(0), puerto.obtenerPosicionAmarre()));
        puerto.agregarAlquiler(new Alquiler(cliente1, cliente1.getBarcos().get(1), puerto.obtenerPosicionAmarre()));
        puerto.agregarAlquiler(new Alquiler(cliente2, cliente2.getBarcos().get(0), puerto.obtenerPosicionAmarre()));
    }

    /**
     * Imprime informacion del puerto, su nombre, capacidad y listado de barcos
     * amarrados.
     */
    public void imprimirInfo() {
        System.out.println("PUERTO: " + puerto.getNombre() + " - LUGARES DISPONIBLES: " + puerto.getLugaresDisponibles());
        System.out.println("OCUPACION: [" + puerto.getListadoBarcosAmarrados().size() + "/" + puerto.getCapacidadAmarres() + "]");
        System.out.println("LISTA BARCOS: ");
        System.out.printf("%-10s | %-10s | %-10s | %-10s | %-12s | %-10s | %-10s | %-10s %n",
                "Matricula", "TipoBarco", "Modulo", "Eslora(m)", "PagaAlquiler", "PotenciaCV", "Camarotes", "NumeroMastiles");
        for (Barco b : puerto.getListadoBarcosAmarrados()) {
            if (b instanceof Yate) {
                System.out.printf("%-10s | %-10s | %-10s | %-10s | %-12s | %-10s | %-10s | %-10s %n",
                        b.getMatricula(), b.getTipoBarco(), b.getModulo(), b.getEsloraMetros(), ((Yate) b).getPagaAlquiler(), ((Yate) b).getPotenciaCV(), ((Yate) b).getCantidadCamarotes(), "N/A");
                continue;
            }
            if (b instanceof BarcoMotor) {
                System.out.printf("%-10s | %-10s | %-10s | %-10s | %-12s | %-10s | %-10s | %-10s %n",
                        b.getMatricula(), b.getTipoBarco(), b.getModulo(), b.getEsloraMetros(), ((BarcoMotor) b).getPagaAlquiler(), ((BarcoMotor) b).getPotenciaCV(), "N/A", "N/A");
                continue;
            }

            if (b instanceof Velero) {
                System.out.printf("%-10s | %-10s | %-10s | %-10s | %-12s | %-10s | %-10s | %-10s %n",
                        b.getMatricula(), b.getTipoBarco(), b.getModulo(), b.getEsloraMetros(), ((Velero) b).getPagaAlquiler(), "N/A", "N/A", ((Velero) b).getNumeroMastiles());
                continue;
            }
        }
    }

    /**
     * Imprime el listado de alquileres del puerto.
     *
     * @param finalizado Si es true, muestra los finalizados, si es false los
     * activos.
     */
    public void verListadoAlquileres(boolean finalizado) {
        for (Alquiler alquiler : puerto.getListadoAlquileres()) {
            if (alquiler.getFinalizado() == finalizado) {
                System.out.print("ID:" + alquiler.getId() + " - ");
                System.out.println(alquiler.toString());
            }
        }
    }

    /**
     * Finaliza un alquiler.
     *
     * @param idAlquiler Debe existir, de lo contrario no se podra finalizar.
     * @param fin Debe ser una fecha posterior a la de alquiler, de lo contrario
     * no podra finalizar.
     */
    public void finalizarAlquiler(int idAlquiler, LocalDate fin) {
        if (!puerto.idAlquilerValido(idAlquiler)) {
            System.out.println("Id de alquiler no valido.");
            return;
        }
        puerto.finalizarAlquiler(buscarAlquiler(idAlquiler), fin);
    }

    /**
     * Busca un alquiler por su id.
     *
     * @param idAlquiler El id del alquiler.
     * @return Un alquiler especifico del listado del puerto.
     */
    private Alquiler buscarAlquiler(int idAlquiler) {
        return puerto.getListadoAlquileres().get(idAlquiler - 1);
    }

}
