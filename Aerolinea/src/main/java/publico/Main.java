package publico;
/**
 * @author Cristian Romero
 * @version 1.0
 */
public class Main {
    /**
     * Metodo que se ejecuta de primeras al iniciar el programa
     * @param args 
     */
    public static void main(String [] args){
        Principal p = new Principal();
        Silla s = new Silla();
        AvionMixto am = new AvionMixto();
        AvionEconomico ae = new AvionEconomico();
        AvionCostoso ac = new AvionCostoso();
        am.PonerSillasCaras();
        am.PonerSillasEconomicas();
        ae.PonerSilla();
        ac.PonerSilla();
        p.menu(100);
    }
}
