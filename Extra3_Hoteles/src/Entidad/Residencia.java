package Entidad;

public class Residencia extends ExtraHotelero{
    private int cantHabitaciones;
    private boolean haceDescuentosGremios;
    private boolean poseeCampoDeportivo;

    public Residencia(int cantHabitaciones, boolean haceDescuentosGremios, boolean poseeCampoDeportivo, boolean privado, double superficieM2, String nombre, String direccion, String localidad, String gerenteEncargado, String tipo) {
        super(privado, superficieM2, nombre, direccion, localidad, gerenteEncargado, tipo);
        this.cantHabitaciones = cantHabitaciones;
        this.haceDescuentosGremios = haceDescuentosGremios;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isHaceDescuentosGremios() {
        return haceDescuentosGremios;
    }

    public void setHaceDescuentosGremios(boolean haceDescuentosGremios) {
        this.haceDescuentosGremios = haceDescuentosGremios;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCantHabitaciones = " + cantHabitaciones + 
                "\nHaceDescuentosGremios = " + haceDescuentosGremios + 
                "\nPoseeCampoDeportivo = " + poseeCampoDeportivo;
    }
    
    
}