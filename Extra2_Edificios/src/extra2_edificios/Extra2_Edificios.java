package extra2_edificios;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import Enum.TipoInstalacion;
import java.util.ArrayList;

public class Extra2_Edificios {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<Edificio>();
        
        edificios.add(new Polideportivo(TipoInstalacion.ABIERTO, "Poli abierto", 50, 100, 0));
        edificios.add(new Polideportivo(TipoInstalacion.TECHADO, "Poli techado", 50, 100, 4));
        edificios.add(new EdificioDeOficinas(10, 50, "Globant", 50, 50, 30));
        edificios.add(new EdificioDeOficinas(3, 40, "Cabify", 25, 30, 15));
        
        int cantidadTechados = 0, cantidadAbiertos = 0;
        for (Edificio aux : edificios) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
            System.out.println(aux.getNombre() + " - Volumen: " + aux.getVolumen() + "m3 - Superficie: " + aux.getSuperficie() + "m2");
            
            if(aux instanceof Polideportivo){
                if(((Polideportivo) aux).getTipoInstalacion().equals(TipoInstalacion.ABIERTO)){
                    cantidadAbiertos++;
                }else{
                    cantidadTechados++;
                }
            }
            
            if(aux instanceof EdificioDeOficinas){
                ((EdificioDeOficinas) aux).cantPersonas();
            }
            System.out.println("----");
        }
        System.out.println("Hay " + cantidadAbiertos + " polideportivos abiertos");
        System.out.println("Hay " + cantidadTechados + " polideportivos techados");
    }
    
}
