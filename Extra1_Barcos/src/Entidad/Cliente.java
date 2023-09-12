package Entidad;

import java.util.ArrayList;

public class Cliente extends Persona{
    protected ArrayList<Barco> barcos;

    public Cliente(String nombre, String dni) {
        super(nombre, dni);
        barcos = new ArrayList<Barco>();
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }
    
    public void agregarBarco(Barco b){
        barcos.add(b);
    }
    
    
}