package Entidad;

import java.time.Year;

public class BarcoMotor extends BarcoEspecial{
    protected Integer potenciaCV;

    public BarcoMotor(Integer potenciaCV, String matricula, Double esloraMetros, Year anioFabricacion) {
        super(matricula, esloraMetros, anioFabricacion);
        this.potenciaCV = potenciaCV;
        tipoBarco = "BarcoMotor";
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public void calcularModulo() {
        modulo += potenciaCV;
    }
    
    
}