package Entidad;

import java.time.Year;

public class Velero extends BarcoEspecial {

    protected Integer numeroMastiles;

    public Velero(Integer numeroMastiles, String matricula, Double esloraMetros, Year anioFabricacion) {
        super(matricula, esloraMetros, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
        tipoBarco = "Velero";
        calcularModulo();
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public void calcularModulo() {
        modulo += numeroMastiles;
    }

}
