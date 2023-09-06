package Servicio;

import Entidad.Circulo;
import Entidad.Forma;
import Entidad.Rectangulo;
import java.util.ArrayList;
import java.util.List;

public class ServicioForma {

    private List<Forma> listado;

    public ServicioForma() {
        listado = new ArrayList<Forma>();
    }

    public List<Forma> getListado() {
        return listado;
    }

    public void setListado(List<Forma> listado) {
        this.listado = listado;
    }

    public void agregarFormaListado(Forma forma) {
        listado.add(forma);
    }

    public void calcularAreas() {
        for (Forma forma : listado) {
            if (forma instanceof Rectangulo) {
                ((Rectangulo) forma).calcularArea();
            }
            if (forma instanceof Circulo) {
                ((Circulo) forma).calcularArea();
            }
        }
    }

    public void calcularPerimetros() {
        for (Forma forma : listado) {
            if (forma instanceof Rectangulo) {
                ((Rectangulo) forma).calcularPerimetro();
            }
            if (forma instanceof Circulo) {
                ((Circulo) forma).calcularPerimetro();
            }
        }
    }

    public void imprimirDetallesListado() {
        System.out.println("------Listado Formas------");
        System.out.printf("%10s | %10s | %10s | %10s%n", "Tipo", "Area", "Perimetro", "Color");
        for (Forma f : listado) {
            System.out.printf("%10s | %10.2f | %10.2f | %10s%n", f.getTipo(), f.getArea(), f.getPerimetro(), f.getColor());
        }
    }

}
