package Enums;

public enum ConsumoEnergetico {
    A(1000), B(800), C(600), D(500), E(300), F(100);

    private final double precioBase;

    ConsumoEnergetico(double precio) {
        precioBase = precio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

}
