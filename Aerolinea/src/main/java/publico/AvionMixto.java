package publico;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Cristian Romero
 * @version 1.0
 * Clase avion que contiene sillas economicas y VIP
 */
public class AvionMixto extends Silla{
    /**
     * Mapa para agregar posteriormente sus items al mapa de aviones
     */
    static Map<Integer, Silla> silla = new HashMap();
    /**
     * Mapa para agregar posteriormente las sillas al avion
     */
    static Map<Integer, Avion> avion = new HashMap();
    /**
     * Instancia clase silla
     */
    static Silla claseSilla = new Silla();
    /**
     * Metodo que crea las sillas caras dentro del avio mixto
     */
    public void PonerSillasCaras(){
        try{
            Avion a1 = new Avion("AVION MIXTO");
            Avion a2 = new Avion("AVION ECONOMICO");
            Avion a3 = new Avion("AVION VIP");
            silla.put(1, new Silla("M1",100000,true,a1));
            silla.put(2, new Silla("M2",100000,true,a1));
            silla.put(3, new Silla("M3",100000,true,a1));
            silla.put(4, new Silla("M4",100000,true,a1));
            silla.put(5, new Silla("M5",100000,true,a1));
            silla.put(6, new Silla("M6",100000,true,a1));
            silla.put(7, new Silla("M7",100000,true,a1));
            silla.put(8, new Silla("M8",100000,true,a1));
            silla.put(9, new Silla("M9",100000,true,a1));
            silla.put(10, new Silla("M10",100000,true,a1));
            silla.put(11, new Silla("M11",100000,true,a1));
            silla.put(12, new Silla("M12",100000,true,a1));
            silla.put(13, new Silla("M13",100000,true,a1));
            silla.put(14, new Silla("M14",100000,true,a1));
            silla.put(15, new Silla("M15",100000,true,a1));
            silla.put(16, new Silla("M16",100000,true,a1));
            silla.put(17, new Silla("M17",100000,true,a1));
            silla.put(18, new Silla("M18",100000,true,a1));
            claseSilla.getSilla().putAll(silla);
            
            
            
        }catch(Exception e){System.out.println("No se pudieron crear las sillas VIP del avion mixto");}
        
    }
    /**
     * Metodo que crea las sillas caras dentro del avio mixto
     */
    public void PonerSillasEconomicas(){
        try{
            Avion a1 = new Avion("AVION MIXTO");
            Avion a2 = new Avion("AVION ECONOMICO");
            Avion a3 = new Avion("AVION VIP");
            claseSilla.getSilla().put(19, new Silla("M19",50000,true,a1));
            claseSilla.getSilla().put(20, new Silla("M20",50000,true,a1));
            claseSilla.getSilla().put(21, new Silla("M21",50000,true,a1));
            claseSilla.getSilla().put(22, new Silla("M22",50000,true,a1));
            claseSilla.getSilla().put(23, new Silla("M23",50000,true,a1));
            claseSilla.getSilla().put(24, new Silla("M24",50000,true,a1));
            claseSilla.getSilla().put(25, new Silla("M25",50000,true,a1));
            claseSilla.getSilla().put(26, new Silla("M26",50000,true,a1));
            claseSilla.getSilla().put(27, new Silla("M27",50000,true,a1));
            claseSilla.getSilla().put(28, new Silla("M28",50000,true,a1));
            claseSilla.getSilla().put(29, new Silla("M29",50000,true,a1));
            claseSilla.getSilla().put(30, new Silla("M30",50000,true,a1));
            claseSilla.getSilla().put(31, new Silla("M31",50000,true,a1));
            claseSilla.getSilla().put(32, new Silla("M32",50000,true,a1));
            claseSilla.getSilla().put(33, new Silla("M33",50000,true,a1));
            claseSilla.getSilla().put(34, new Silla("M34",50000,true,a1));
            claseSilla.getSilla().put(35, new Silla("M35",50000,true,a1));
            claseSilla.getSilla().put(36, new Silla("M36",50000,true,a1));
        }catch(Exception e){System.out.println("No se pudieron crear las sillas economicas del avion mixto");}
    }
}
