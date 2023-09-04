package Entidad;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    protected static String tipo = "Televisor";
    protected double tamanioPulgadas;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double tamanioPulgadas, boolean sintonizadorTDT, double precioUsd, String color, char categoriaConsumoEnergetico, double pesoKg) {
        super(precioUsd, color, categoriaConsumoEnergetico, pesoKg);
        this.tamanioPulgadas = tamanioPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getTamanioPulgadas() {
        return tamanioPulgadas;
    }

    public void setTamanioPulgadas(double tamanioPulgadas) {
        this.tamanioPulgadas = tamanioPulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner input = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.print("Ingrese el tamanio el pulgadas: >> ");
        tamanioPulgadas = input.nextDouble();
        System.out.print("Posee sintonizador TDT? Y/N >> ");
        if (!input.next().matches("Y$")) {
            sintonizadorTDT = false;
        } else {
            sintonizadorTDT = true;
        }
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (tamanioPulgadas > 40) {
            precioUsd *= 1.3;
        }
        if (sintonizadorTDT) {
            precioUsd += 500;
        }
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\n" + 
               "tamanioPulgadas: " + tamanioPulgadas + "\n" +
               "sintonizadorTDT: " + sintonizadorTDT + "\n" +
               super.toString();
    }
}
