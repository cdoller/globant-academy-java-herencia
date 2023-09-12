package Entidad;

import java.time.Year;

public class Yate extends BarcoMotor {

    protected int cantidadCamarotes;

    public Yate(int cantidadCamarotes, Integer potenciaCV, String matricula, Double esloraMetros, Year anioFabricacion) {
        super(potenciaCV, matricula, esloraMetros, anioFabricacion);
        this.cantidadCamarotes = cantidadCamarotes;
        tipoBarco = "Yate";
        calcularModulo();
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public void calcularModulo() {
        super.calcularModulo();
        modulo += cantidadCamarotes;
    }

}
