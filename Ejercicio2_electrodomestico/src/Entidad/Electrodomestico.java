package Entidad;

import Enums.ConsumoEnergetico;
import java.util.Scanner;

/**
 * Modela un electrodomestico con ciertos atributos.
 * En base a sus caracteristicas tendra un precio especifico.
 * Posee metodos para validar algunos atributos.
 * Es una clase que puede ser extendida.
 * 
 * @author Carlos
 */
public class Electrodomestico {

    protected double precioUsd = 1000;
    protected String color;
    protected ConsumoEnergetico categoria;
    protected double pesoKg;
    protected String tipo;

    /**
     * Crea un electrodomestico sin parametros.
     * Trabaja en conjunto con los constructores de sus hijos.
     */
    public Electrodomestico() {
    }

    /**
     * Crea un nuevo electrodomestico
     * @param color 
     * @param categoria categoria energetica
     * @param pesoKg 
     * @param tipo tipo de electrodomestico, ej: televisor, lavadora, etc
     */
    public Electrodomestico(String color, String categoria, double pesoKg, String tipo) {
        this.color = comprobarColor(color);
        this.categoria = comprobarConsumoEnergetico(categoria.charAt(0));
        this.pesoKg = comprobarPeso(pesoKg);
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Comprueba que la categoria de consumo sea valida.
     * En caso de no serlo coloca una por defecto.
     * @param categoriaConsumo
     * @return categoria energetica valida
     * @return F en caso de que no sea una categoria energetica valida
     */
    private ConsumoEnergetico comprobarConsumoEnergetico(char categoriaConsumo) {
        String categoria = "" + categoriaConsumo;
        for (ConsumoEnergetico cons : ConsumoEnergetico.values()) {
            if (cons.toString().equals(categoria)) {
                return cons;
            }
        }
        return ConsumoEnergetico.F;
    }

    /**
     * Comprueba que el color sea valido.
     * En caso de no serlo, coloca uno por defecto
     * @param color
     * @return color valido
     * @return "BLANCO" en caso de no ser un color valido
     */
    private String comprobarColor(String color) {
        if (!color.toUpperCase().matches("^(BLANCO|NEGRO|ROJO|AZUL|GRIS)$")) {
            return "BLANCO";
        }
        return color;
    }

    /**
     * Comprueba que el peso sea un valor positivo.
     * En caso de no serlo coloca un valor por defecto.
     * @param peso
     * @return peso valido
     * @return 1kg en caso de no ser un peso valido
     */
    private double comprobarPeso(double peso) {
        if (peso < 0) {
            return 1d;
        }
        return peso;
    }

    /**
     * Crea un electrodomestico solicitando los datos al usuario.
     */
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

    /**
     * Calcula el precio final de un electrodomestico.
     * Este metodo es sobreescrito en las clases que heredan.
     */
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
