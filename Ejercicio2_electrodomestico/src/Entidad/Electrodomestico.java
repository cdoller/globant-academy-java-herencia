package Entidad;

import Enums.ConsumoEnergetico;
import java.util.Scanner;

public class Electrodomestico {

    protected double precioUsd;
    protected String color;
    protected char categoriaConsumoEnergetico;
    protected double pesoKg;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioUsd, String color, char categoriaConsumoEnergetico, double pesoKg) {
        this.precioUsd = precioUsd;
        this.color = comprobarColor(color);
        this.categoriaConsumoEnergetico = comprobarConsumoEnergetico(categoriaConsumoEnergetico);
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

    public char getCategoriaConsumo() {
        return categoriaConsumoEnergetico;
    }

    public void setCategoriaConsumo(char categoriaConsumoEnergetico) {
        this.categoriaConsumoEnergetico = categoriaConsumoEnergetico;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    private char comprobarConsumoEnergetico(char categoriaConsumo) {
        String categoria = "" + categoriaConsumo;
        if (!categoria.toUpperCase().matches("^(A|B|C|D|E|F)$")) {
            return 'F';
        }
        return categoria.charAt(0);
    }

    private String comprobarColor(String color) {
        if (!color.toUpperCase().matches("^(BLANCO|NEGRO|ROJO|AZUL|GRIS)$")) {
            return "BLANCO";
        }
        return color;
    }
    
    private double comprobarPeso(double peso){
        if(peso<0){
            return 1d;
        }
        return peso;
    }

    public void crearElectrodomestico() {
        Scanner input = new Scanner(System.in);
        this.precioUsd = 1000d;
        System.out.print("Ingrese la categoria energetica: >> ");
        categoriaConsumoEnergetico = comprobarConsumoEnergetico(input.next().charAt(0));
        System.out.print("Ingrese el color: >> ");
        color = comprobarColor(input.next());
        System.out.print("Ingrese el peso: >> ");
        pesoKg = comprobarPeso(input.nextDouble());
    }

    public void precioFinal() {
        switch (categoriaConsumoEnergetico) {
            case 'A':
                precioUsd += 1000;
                break;
            case 'B':
                precioUsd += 800;
                break;
            case 'C':
                precioUsd += 600;
                break;
            case 'D':
                precioUsd += 500;
                break;
            case 'E':
                precioUsd += 300;
                break;
            case 'F':
                precioUsd += 100;
                break;
            default:
                precioUsd += 0;
        }

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
        return  "precioUsd: " + precioUsd + "\n" +
                "color: " + color + "\n" +
                "categoriaConsumoEnergetico: " + categoriaConsumoEnergetico + "\n" +
                "pesoKg: " + pesoKg + "\n";
    }

}
