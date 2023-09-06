package ejercicio3_formasgeometricas;

import Entidad.Circulo;
import Entidad.Rectangulo;
import Servicio.ServicioForma;

/**
 *
 * @author User
 */
public class Ejercicio3_formasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioForma servForma = new ServicioForma();
        servForma.agregarFormaListado(new Rectangulo(10, 5, "Rojo"));
        servForma.agregarFormaListado(new Rectangulo(25, 15, "Verde"));
        servForma.agregarFormaListado(new Rectangulo(22.5, 10, "Azul"));
        servForma.agregarFormaListado(new Rectangulo(3, 4, "Amarillo"));
        servForma.agregarFormaListado(new Circulo(15, "Negro"));
        servForma.agregarFormaListado(new Circulo(10, "Gris"));
        servForma.agregarFormaListado(new Circulo(4.3, "Celeste"));
        servForma.agregarFormaListado(new Circulo(0.3, "Rosa"));
        
        servForma.calcularAreas();
        servForma.calcularPerimetros();
        
        servForma.imprimirDetallesListado();
    }
    
}
