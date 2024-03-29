package Entidad;

public abstract class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerenteEncargado;
    protected String tipo;

    public Alojamiento(String nombre, String direccion, String localidad, String gerenteEncargado, String tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerenteEncargado = gerenteEncargado;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerenteEncargado() {
        return gerenteEncargado;
    }

    public void setGerenteEncargado(String gerenteEncargado) {
        this.gerenteEncargado = gerenteEncargado;
    }

    @Override
    public String toString() {
        return "------------------"
                + "\nTipo Alojamiento: " + tipo.toUpperCase()
                + "\nNombre: " + nombre
                + "\nDireccion = " + direccion
                + "\nLocalidad = " + localidad
                + "\nGerenteEncargado = " + gerenteEncargado;
    }

}
