package Entidad;

import Enum.Gimnasio;

public class Hotel5Estrellas extends Hotel4Estrellas {

    protected int cantSalonesConferencia;
    protected int cantSuites;
    protected int cantLimosinas;

    public Hotel5Estrellas(int cantSalonesConferencia, int cantSuites, int cantLimosinas, Gimnasio gym, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numeroCamas, int cantPisos, String nombre, String direccion, String localidad, String gerenteEncargado, String tipo) {
        super(gym, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numeroCamas, cantPisos, nombre, direccion, localidad, gerenteEncargado, tipo);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public void calcularPrecioHabitacion() {
        super.calcularPrecioHabitacion();

        precioHabitacion += agregadoLimosina();
    }

    protected double agregadoLimosina() {
        return cantLimosinas * 15d;
    }

    @Override
    public String toString() {
        return this.getClass().getName() 
               + "\n" + super.toString()
               + "\nCantSalonesConferencia = " + cantSalonesConferencia 
               + "\nCantSuites = " + cantSuites 
               + "\nCantLimosinas = " + cantLimosinas + "\n";
    }
    
    

}
