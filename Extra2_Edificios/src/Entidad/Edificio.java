/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 * Representa un edificio.
 *
 * @author User
 */
public abstract class Edificio {

    protected String nombre;
    protected double ancho;
    protected double largo;
    protected double alto;
    protected double volumen;
    protected double superficie;

    /**
     * Crea un nuevo edificio.
     *
     * @param nombre Es el nombre que va a tener el edificio. Ej: Nazareno IX
     * @param ancho
     * @param largo
     * @param alto
     */
    public Edificio(String nombre, double ancho, double largo, double alto) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        volumen = 0d;
        superficie = 0d;
    }

    /**
     * Calcula el volumen del edificio.
     */
    public abstract void calcularVolumen();

    /**
     * Calcula la superficie del edificio.
     */
    public abstract void calcularSuperficie();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    
}
