package Entidad;

import Interfaz.ICalculosFormas;

public class Rectangulo extends Forma implements ICalculosFormas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super("Rectangulo", color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }    

    @Override
    public void calcularArea() {
        area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = (base + altura) * 2;
    }
    
    
}