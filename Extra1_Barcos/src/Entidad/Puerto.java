package Entidad;

import java.time.LocalDate;
import java.util.ArrayList;

public class Puerto {

    private String nombre;
    private String direccion;
    private ArrayList<Alquiler> listadoAlquileres;
    private ArrayList<Barco> listadoBarcosAmarrados;
    private Integer capacidadAmarres;
    private Integer lugaresDisponibles;

    public Puerto(String nombre, Integer capacidadAmarres) {
        this.nombre = nombre;
        this.capacidadAmarres = capacidadAmarres;
        lugaresDisponibles = capacidadAmarres;
        listadoAlquileres = new ArrayList<Alquiler>();
        listadoBarcosAmarrados = new ArrayList<Barco>();
        direccion = "No definida";
    }

    public Integer getLugaresDisponibles() {
        return lugaresDisponibles;
    }

    public void setLugaresDisponibles(Integer lugaresDisponibles) {
        this.lugaresDisponibles = lugaresDisponibles;
    }

    public ArrayList<Barco> getListadoBarcosAmarrados() {
        return listadoBarcosAmarrados;
    }

    public Boolean setListadoBarcosAmarrados(ArrayList<Barco> listadoBarcos) {
        if (listadoBarcos.size() > lugaresDisponibles) {
            System.out.println("La capacidad del puerto no es sufuciente para ese listado");
            return false;
        }
        this.listadoBarcosAmarrados = listadoBarcosAmarrados;
        lugaresDisponibles -= listadoBarcos.size();
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Alquiler> getListadoAlquileres() {
        return listadoAlquileres;
    }

    public void setListadoAlquileres(ArrayList<Alquiler> listadoAlquileres) {
        this.listadoAlquileres = listadoAlquileres;
    }

    public Integer getCapacidadAmarres() {
        return capacidadAmarres;
    }

    public void setCapacidadAmarres(Integer capacidadAmarres) {
        this.capacidadAmarres = capacidadAmarres;
    }

    public void amarrarBarco(Barco barco) {
        listadoBarcosAmarrados.add(barco);
        lugaresDisponibles--;
    }

    /**
     * Desamarra un barco. Lo quita del listado y aumenta la cantidad lugares
     * disponibles.
     *
     * @param barco
     */
    public void desamarrarBarco(Barco barco) {
        listadoBarcosAmarrados.remove(barco);
        lugaresDisponibles++;
    }

    /**
     * Imprime informacion del puerto, su nombre, capacidad y listado de barcos
     * amarrados.
     */
    public void imprimirInfo() {
        System.out.println("PUERTO: " + nombre + " - LUGARES DISPONIBLES: " + lugaresDisponibles);
        System.out.println("OCUPACION: [" + listadoBarcosAmarrados.size() + "/" + capacidadAmarres + "]");
        System.out.println("LISTA BARCOS: ");
        System.out.printf("%-10s | %-10s | %-10s | %-10s | %-12s | %-10s | %-10s | %-10s %n",
                "Matricula", "TipoBarco", "Modulo", "Eslora(m)", "PagaAlquiler", "PotenciaCV", "Camarotes", "NumeroMastiles");
        for (Barco b : listadoBarcosAmarrados) {
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
     * Devuelve la siguiente posicion de amarre.
     *
     * @return un entero formado por la cantidad de barcos amarrados mas uno.
     */
    public Integer obtenerPosicionAmarre() {
        return listadoBarcosAmarrados.size() + 1;
    }

    /**
     * Realiza el alquiler de un barco del puerto
     *
     * @param alquiler
     */
    public void agregarAlquiler(Alquiler alquiler) {
        if (lugaresDisponibles == 0) {
            System.out.println("No hay lugares disponibles");
            return;
        }
        listadoAlquileres.add(alquiler);
        amarrarBarco(alquiler.getBarco());
        System.out.println("Se pudo alquilar un amarre");
    }

    /**
     * Finaliza el alquiler de un amarre y calcula el total del alquiler.
     * Tambien se encarga de desamarrar al barco.
     *
     * @param alquiler El alquiler que se desea finalizar.
     * @param fin Fecha fin de alquiler.
     * @return Precio total del alquiler.
     */
    public void finalizarAlquiler(Alquiler alquiler, LocalDate fin) {
        if (!alquiler.validarFechaFin(fin)) {
            return;
        }
        alquiler.setFin(fin);
        desamarrarBarco(alquiler.getBarco());
        System.out.println("Alquiler finalizado correctamente.");
        alquiler.imprimirPrecioAlquiler();
    }

    /**
     * Cotiza cuanto costaria un alquiler ya creado.
     *
     * @param alquiler Alquiler de la lista.
     * @param fin Fecha de fin del alquiler.
     * @return Precio total del alquiler teniendo en cuenta el Barco y los dias.
     */
    public Double cotizarAlquiler(Alquiler alquiler, LocalDate fin) {
        return alquiler.cotizarAlquiler(fin);
    }

    /**
     * Determina si el id de alquiler es valido.
     *
     * @param id
     * @return
     */
    public boolean idAlquilerValido(int id) {
        if (id <= listadoAlquileres.size() && id > 0) {
            return true;
        }
        return false;
    }
}
