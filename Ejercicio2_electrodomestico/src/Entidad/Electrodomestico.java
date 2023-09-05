package Entidad;

import Enums.ConsumoEnergetico;
import java.util.Scanner;

public class Electrodomestico {

    protected double precioUsd;
    protected String color;
    protected ConsumoEnergetico categoria;
    protected double pesoKg;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioUsd, String color, String categoria, double pesoKg) {
        this.precioUsd = precioUsd;
        this.color = comprobarColor(color);
        this.categoria = comprobarConsumoEnergetico(categoria.charAt(0));
        this.pesoKg = comprobarPeso(pesoKg);
    }

    public double getPrecioUsd() {
        return precioUsd;
    }

    public void setPrecioUsd(double precioUsd) {
        this.precioUsd = precioUsd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ConsumoEnergetico getCategoria() {
        return categoria;
    }

    public void setCategoria(ConsumoEnergetico categoria) {
        this.categoria = categoria;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    private ConsumoEnergetico comprobarConsumoEnergetico(char categoriaConsumo) {
        String categoria = "" + categoriaConsumo;
        for (ConsumoEnergetico cons : ConsumoEnergetico.values()) {
            if (cons.toString().equals(categoria)) {
                return cons;
            }
        }
        return ConsumoEnergetico.F;
    }

    private String comprobarColor(String color) {
        if (!color.toUpperCase().matches("^(BLANCO|NEGRO|ROJO|AZUL|GRIS)$")) {
            return "BLANCO";
        }
        return color;
    }

    private double comprobarPeso(double peso) {
        if (peso < 0) {
            return 1d;
        }
        return peso;
    }

    public void crearElectrodomestico() {
        Scanner input = new Scanner(System.in);
        this.precioUsd = 1000d;
        System.out.print("Ingrese la categoria energetica: >> ");
        categoria = comprobarConsumoEnergetico(input.next().charAt(0));
        System.out.print("Ingrese el color: >> ");
        color = comprobarColor(input.next());
        System.out.print("Ingrese el peso: >> ");
        pesoKg = comprobarPeso(input.nextDouble());
    }

    public void precioFinal() {
        precioUsd += categoria.getPrecioBase();
        if (pesoKg >= 80) {
            precioUsd += 1000;
        } else if (pesoKg >= 50 && pesoKg <= 79) {
            precioUsd += 800;
        } else if (pesoKg >= 20 && pesoKg <= 49) {
            precioUsd += 500;
        } else if (pesoKg >= 1 && pesoKg <= 19) {
            precioUsd += 100;
        }
    }

    @Override
    public String toString() {
        return "precioUsd: " + precioUsd + "\n"
                + "color: " + color + "\n"
                + "categoriaConsumoEnergetico: " + categoria.toString() + "\n"
                + "pesoKg: " + pesoKg + "\n";
    }

}
