package Servicio;

import Entidad.Electrodomestico;
import java.util.ArrayList;

public class ServicioElectrodomestico {

    ArrayList<Electrodomestico> listaElectrodom;

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
}
