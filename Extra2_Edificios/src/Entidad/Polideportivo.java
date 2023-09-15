package Entidad;

import Enum.TipoInstalacion;

/**
 * Representa un tipo particular de Edificio, un Polideportivo.
 *
 * @author User
 */
public class Polideportivo extends Edificio {

    protected TipoInstalacion tipoInstalacion;

    /**
     * Crea un nuevo Polideportivo, es un tipo de edificio.
     *
     * @param tipoInstalacion El tipo de instalacion del techo del
     * polideportivo.
     * @param nombre
     * @param ancho
     * @param largo
     * @param alto
     */
    public Polideportivo(TipoInstalacion tipoInstalacion, String nombre, double ancho, double largo, double alto) {
        super(nombre, ancho, largo, alto);
        this.tipoInstalacion = tipoInstalacion;
    }

    public TipoInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(TipoInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
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
