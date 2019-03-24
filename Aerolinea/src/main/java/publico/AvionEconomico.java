package publico;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Cristian Romero
 * @version 1.0
 */
public class AvionEconomico extends Silla{
    /**
     * Mapa para agregar posteriormente sus items al mapa de aviones
     */
    Map<Integer, Silla> silla = new HashMap();
    /**
     * Instancia clase silla
     */
    Silla claseSilla = new Silla();
    /**
     * Metodo que crea las sillas dentro del avion económico
     */
    public void PonerSilla(){
        try{
            Avion a1 = new Avion("AVION MIXTO");
            Avion a2 = new Avion("AVION ECONOMICO");
            Avion a3 = new Avion("AVION VIP");
            silla.put(19,new Silla("E1",30000,true,a2));
            silla.put(20,new Silla("E2",30000,true,a2));
            silla.put(21,new Silla("E3",30000,true,a2));
            silla.put(22,new Silla("E4",30000,true,a2));
            silla.put(23,new Silla("E5",30000,true,a2));
            silla.put(24,new Silla("E6",30000,true,a2));
            silla.put(25,new Silla("E7",30000,true,a2));
            silla.put(26,new Silla("E8",30000,true,a2));
            silla.put(27,new Silla("E9",30000,true,a2));
            silla.put(28,new Silla("E10",30000,true,a2));
            silla.put(29,new Silla("E11",30000,true,a2));
            silla.put(30,new Silla("E12",30000,true,a2));
            silla.put(31,new Silla("E13",30000,true,a2));
            silla.put(32,new Silla("E14",30000,true,a2));
            silla.put(33,new Silla("E15",30000,true,a2));
            claseSilla.getSilla().putAll(silla);
        }catch(Exception e){System.out.println("No se pudo crear el avion economico");}
    }
}
