package Entidad;

public abstract class Hotel extends Alojamiento{
    protected int cantHabitaciones;
    protected int numeroCamas;
    protected int cantPisos;
    protected double precioHabitacion;

    public Hotel(int cantHabitaciones, int numeroCamas, int cantPisos, String nombre, String direccion, String localidad, String gerenteEncargado, String tipo) {
        super(nombre, direccion, localidad, gerenteEncargado, tipo);
        this.cantHabitaciones = cantHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantPisos = cantPisos;
    }

    public void calcularPrecioHabitacion(){
        precioHabitacion = 50d + numeroCamas;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCantHabitaciones = " + cantHabitaciones 
                + "\nNumeroCamas = " + numeroCamas 
                + "\nCantPisos = " + cantPisos 
                + "\nPrecioHabitacion = " + precioHabitacion;
    }
    
    
    
    
}