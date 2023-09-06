package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

public class ServicioElectrodomestico {

    private ArrayList<Electrodomestico> listaElectrodom;

    public ServicioElectrodomestico() {
        listaElectrodom = new ArrayList<Electrodomestico>();
    }

    public void addElectrodomestico(Electrodomestico electroDom) {
        listaElectrodom.add(electroDom);
    }

    public ArrayList<Electrodomestico> getListaElectrodom() {
        return listaElectrodom;
    }

    public void imprimirListaElectrodomesticos() {
        for (Electrodomestico e : listaElectrodom) {
            System.out.println(e.toString());
        }
    }

    public void setListaElectrodom(ArrayList<Electrodomestico> listaElectrodom) {
        this.listaElectrodom = listaElectrodom;
    }
    
    public void ejecutarPrecioFinal(){
        for (Electrodomestico e : listaElectrodom) {
            e.precioFinal();
        }
    }
    
    public double calcularSumaPrecios(){
        double suma = 0d;
        for (Electrodomestico e : listaElectrodom) {
            suma += e.getPrecioUsd();
        }
        System.out.println("La suma de todos los electrodomesticos es: USD " + suma);
        return suma;
    }
    
    public void imprimirListado(){
        System.out.println("------Listado Electrodomesticos------");
        System.out.printf("%-10s | %-10s | %-8s | %-6s | %-5s | %-8s | %-10s%n",
                "Tipo", "PrecioUSD", "CatEnerg", "PesoKg", "Carga", "TamPulg", "Sintonizador");
        for (Electrodomestico e : listaElectrodom) {
            if (e instanceof Televisor){
                System.out.printf("%-10s | %-10s | %-8s | %-6s | %-5s | %-8s | %-10s%n",
                e.getTipo(), e.getPrecioUsd(), e.getCategoria(), e.getPesoKg(), "n/a", ((Televisor) e).getTamanioPulgadas(), ((Televisor) e).isSintonizadorTDT());
            }
            
            if(e instanceof Lavadora){
                System.out.printf("%-10s | %-10s | %-8s | %-6s | %-5s | %-8s | %-10s%n",
                e.getTipo(), e.getPrecioUsd(), e.getCategoria(), e.getPesoKg(), ((Lavadora) e).getCarga(), "n/a", "n/a");
            }
        }
    }

}
