package Entidad;

import java.time.Year;

public abstract class BarcoEspecial extends Barco{
    public Boolean pagaAlquiler = true;

    public BarcoEspecial(String matricula, Double esloraMetros, Year anioFabricacion) {
        super(matricula, esloraMetros, anioFabricacion);
    }

    public Boolean getPagaAlquiler() {
        return pagaAlquiler;
    }

    public void setPagaAlquiler(Boolean pagaAlquiler) {
        this.pagaAlquiler = pagaAlquiler;
    }
    
    public abstract void calcularModulo();
}
