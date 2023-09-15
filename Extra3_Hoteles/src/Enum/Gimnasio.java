package Enum;

public enum Gimnasio {
    A(50), B(30);

    private final double agregado;

    Gimnasio(double agregado) {
        this.agregado = agregado;
    }

    public double getAgregado() {
        return agregado;
    }

}
