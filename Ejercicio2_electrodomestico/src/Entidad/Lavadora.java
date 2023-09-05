package Entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected static String tipo = "Lavadora";
    protected Double cargaKg;

    public Lavadora() {
    }

    public Lavadora(Double carga, double precioUsd, String color, String categoriaConsumoEnergetico, double pesoKg) {
        super(precioUsd, color, categoriaConsumoEnergetico, pesoKg);
        this.cargaKg = carga;
    }

    public String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Lavadora.tipo = tipo;
    }

    public Double getCarga() {
        return cargaKg;
    }

    public void setCarga(Double carga) {
        this.cargaKg = carga;
    }

    public void crearLavadora() {
        Scanner input = new Scanner(System.in);
        System.out.println("Creamos una lavadora :");
        super.crearElectrodomestico();
        System.out.print("Introduzca la carga: >> ");
        cargaKg = input.nextDouble();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (cargaKg > 30) {
            precioUsd += 500;
        }
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\n"
                + "cargaKg: " + cargaKg + "\n"
                + super.toString();
    }

}
