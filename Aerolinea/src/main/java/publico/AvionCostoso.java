package publico;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Cristian Romero
 */
public class AvionCostoso extends Silla{
    /**
     * Mapa para agregar posteriormente sus items al mapa de aviones
     */
    Map<Integer, Silla> silla = new HashMap();
    /**
     * Mapa para agregar posteriormente las sillas al avion
     */
    Map<Integer, Avion> avion = new HashMap();
    /**
     * Instancia clase silla
     */
    Silla claseSilla = new Silla();
    /**
     * Metodo que crea las sillas para los aviones costosos
     */
    public void PonerSilla(){
        try{
            Avion a1 = new Avion("AVION MIXTO");
            Avion a2 = new Avion("AVION ECONOMICO");
            Avion a3 = new Avion("AVION VIP");
            silla.put(34,new Silla("C1",1300000,true,new Avion("AVION VIP")));
            silla.put(35,new Silla("C2",1300000,true,new Avion("AVION VIP")));
            silla.put(36,new Silla("C3",1300000,true,new Avion("AVION VIP")));
            silla.put(37,new Silla("C4",1300000,true,new Avion("AVION VIP")));
            silla.put(38,new Silla("C5",1300000,true,new Avion("AVION VIP")));
            silla.put(39,new Silla("C6",1300000,true,new Avion("AVION VIP")));
            silla.put(40,new Silla("C7",1300000,true,new Avion("AVION VIP")));
            silla.put(41,new Silla("C8",1300000,true,new Avion("AVION VIP")));
            silla.put(42,new Silla("C9",1300000,true,new Avion("AVION VIP")));
            claseSilla.getSilla().putAll(silla);   
            
        }catch(Exception e){ System.out.println("No se pudo crear el avion VIP"); }
    }
}
