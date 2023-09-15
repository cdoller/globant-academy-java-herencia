package Entidad;

public abstract class ExtraHotelero extends Alojamiento {

    protected boolean privado;
    protected double superficieM2;

    public ExtraHotelero(boolean privado, double superficieM2, String nombre, String direccion, String localidad, String gerenteEncargado, String tipo) {
        super(nombre, direccion, localidad, gerenteEncargado, tipo);
        this.privado = privado;
        this.superficieM2 = superficieM2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getSuperficieM2() {
        return superficieM2;
    }

    public void setSuperficieM2(double superficieM2) {
        this.superficieM2 = superficieM2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nPrivado = " + privado + 
                "\nSuperficieM2 = " + superficieM2 ;
    }
    
    

}
