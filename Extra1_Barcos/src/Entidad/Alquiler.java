package Entidad;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler {

    private static int contador = 1;
    private int id;
    private Cliente cliente;
    private LocalDate comienzo;
    private LocalDate fin;
    private Barco barco;
    private Integer posicionAmarre;
    private Boolean finalizado = false;
    private Integer cantidadDias = 0;
    private Double precioAlquiler = 0d;

    public Alquiler(Cliente cliente, Barco barco, Integer posicionAmarre) {
        this.cliente = cliente;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
        comienzo = LocalDate.now();
        id = contador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(Integer cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public LocalDate getComienzo() {
        return comienzo;
    }

    public void setComienzo(LocalDate fechaAlquiler) {
        this.comienzo = fechaAlquiler;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
        finalizado = true;
        calcularAlquiler();
    }

    public boolean validarFechaFin(LocalDate fin) {
        if (!fin.isAfter(comienzo)) {
            System.out.println("La fecha de devolucion no es posterior a la de comienzo.");
            return false;
        }
        return true;

    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public void calcularAlquiler() {
        if (!finalizado) {
            System.out.println("No se puede calcular el alquiler porque aun no ha finalizado");
            return;
        }
        cantidadDias = Period.between(comienzo, fin).getDays();
        precioAlquiler = cantidadDias * barco.getModulo();
    }

    public Double cotizarAlquiler(LocalDate fin) {
        cantidadDias = Period.between(comienzo, fin).getDays();
        return cantidadDias * barco.getModulo();
    }

    /**
     * Imprime informacion sobre el precio del alquiler.
     */
    public void imprimirPrecioAlquiler() {
        System.out.println(" ______________");
        System.out.println("|Info Alquiler");
        System.out.println("|--------------");
        System.out.println("|BARCO: " + barco.getTipoBarco() + " - MATRICULA: " + barco.getMatricula() + " - MODULO: " + barco.getModulo());
        System.out.println("|CLIENTE: " + cliente.getNombre());
        System.out.println("|CANTIDAD DIAS: " + cantidadDias);
        System.out.println("|PRECIO ALQUILER: " + precioAlquiler);
        System.out.println("|--------------");
    }

    @Override
    public String toString() {
        return "Alquiler{" + "cliente=" + cliente + ", fechaAlquiler=" + comienzo + ", fechaDevolucion=" + fin + ", barco=" + barco + ", posicionAmarre=" + posicionAmarre + ", finalizado=" + finalizado + ", cantidadDias=" + cantidadDias + ", precioAlquiler=" + precioAlquiler + '}';
    }
}
