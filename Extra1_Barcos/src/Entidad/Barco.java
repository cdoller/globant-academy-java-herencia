package Entidad;

import java.time.Year;

public abstract class Barco {

    protected String matricula;
    protected Double esloraMetros;
    protected Year anioFabricacion;
    protected Double modulo;
    protected String tipoBarco;

    public Barco(String matricula, Double esloraMetros, Year anioFabricacion) {
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.anioFabricacion = anioFabricacion;
        modulo = esloraMetros * 10;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(Double esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public Year getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Year anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Double getModulo() {
        return modulo;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public abstract void calcularModulo();

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", esloraMetros=" + esloraMetros + ", anioFabricacion=" + anioFabricacion + ", modulo=" + modulo + '}';
    }

}
