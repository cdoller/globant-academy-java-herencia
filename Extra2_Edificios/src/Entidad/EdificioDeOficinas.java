package Entidad;

public class EdificioDeOficinas extends Edificio {

    private int numeroOficinas;
    private int cantidadPersonasPorOficina;
    private int numeroPisos;

    public EdificioDeOficinas(int numeroOficinas, int cantidadPersonasPorOficina, String nombre, double ancho, double largo, double alto) {
        super(nombre, ancho, largo, alto);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
        numeroPisos = numeroOficinas;
    }
    
    public void cantPersonas(){
        System.out.println("En un piso entran: " + cantidadPersonasPorOficina + " personas");
        System.out.println("En el edificio completo entran: " + cantidadPersonasPorOficina * numeroOficinas + " personas");
    }

    /**
     * Calcula el volumen del polideportivo.
     */
    @Override
    public void calcularVolumen() {
        volumen = ancho * largo * alto;
    }

    /**
     * Calcula la superficie del polideportivo.
     */
    @Override
    public void calcularSuperficie() {
        superficie = ancho * largo;
    }

}
