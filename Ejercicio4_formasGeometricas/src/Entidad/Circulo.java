package Entidad;

import Interfaz.ICalculosFormas;

public class Circulo extends Forma implements ICalculosFormas {

    private double radio;

    public Circulo(double radio, String color) {
        super("Circulo", color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = ICalculosFormas.PI * Math.pow(radio, 2);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * ICalculosFormas.PI * radio;
    }

}
