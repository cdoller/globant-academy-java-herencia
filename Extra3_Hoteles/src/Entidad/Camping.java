package Entidad;

public class Camping extends ExtraHotelero{
    private int capacidadMaximaCarpas;
    private int cantBaniosDisponibles;
    private boolean poseeRestaurante;

    public Camping(int capacidadMaximaCarpas, int cantBaniosDisponibles, boolean poseeRestaurante, boolean privado, double superficieM2, String nombre, String direccion, String localidad, String gerenteEncargado, String tipo) {
        super(privado, superficieM2, nombre, direccion, localidad, gerenteEncargado, tipo);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantBaniosDisponibles = cantBaniosDisponibles;
        this.poseeRestaurante = poseeRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantBaniosDisponibles() {
        return cantBaniosDisponibles;
    }

    public void setCantBaniosDisponibles(int cantBaniosDisponibles) {
        this.cantBaniosDisponibles = cantBaniosDisponibles;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCapacidadMaximaCarpas = " + capacidadMaximaCarpas + 
                "\nCantBaniosDisponibles = " + cantBaniosDisponibles + 
                "\nPoseeRestaurante = " + poseeRestaurante ;
    }

    
    
    
}