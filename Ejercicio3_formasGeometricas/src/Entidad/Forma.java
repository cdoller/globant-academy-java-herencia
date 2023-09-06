package Entidad;

public class Forma {

    protected String tipo;
    protected String color;
    protected double area;
    protected double perimetro;

    public Forma(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
        area = 0;
        perimetro = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
