/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enum.Gimnasio;

public class Hotel4Estrellas extends Hotel {

    protected Gimnasio gym;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4Estrellas(Gimnasio gym, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numeroCamas, int cantPisos, String nombre, String direccion, String localidad, String gerenteEncargado, String tipo) {
        super(cantHabitaciones, numeroCamas, cantPisos, nombre, direccion, localidad, gerenteEncargado, tipo);
        this.gym = gym;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Gimnasio getGym() {
        return gym;
    }

    public void setGym(Gimnasio gym) {
        this.gym = gym;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public void calcularPrecioHabitacion() {
        super.calcularPrecioHabitacion();

        precioHabitacion += agregadoRestaurante() + agregadoGimnasio();

    }

    protected double agregadoRestaurante() {
        if (capacidadRestaurante < 30 && capacidadRestaurante > 0) {
            return 10d;
        } else if (capacidadRestaurante > 50) {
            return 50d;
        } else {
            return 30d;
        }
    }

    protected double agregadoGimnasio() {
        return gym.getAgregado();
    }

    @Override
    public String toString() {
        return    "\n" + super.toString()
                + "\nGym = " + gym 
                + "\nNombreRestaurante = " + nombreRestaurante 
                + "\nCapacidadRestaurante = " + capacidadRestaurante;
    }
    
    

}
