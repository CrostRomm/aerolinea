package publico;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Cristian Romero
 * @version 1.0
 */
public class Avion {
    /**
     * Variable para los diferentes aviones
     */
    private String tipoAvion;
    /**
     * Mapa de las sillas para el avion
     */
    private static Map<Integer, Avion> mapaAvion = new HashMap();
    /**
     * Constructor de la clase Avion
     * @param tipoAvion 
     */
    public Avion(String tipoAvion) {    
        this.tipoAvion = tipoAvion;
    }

    public Avion() {
    }
    
    /**
     * Get del tipo de avion
     * @return String
     */
    public String getTipoAvion() {
        return tipoAvion;
    }
    /**
     * Set del tipo de avion
     * @param tipoAvion 
     */
    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }
    /**
     * Get del mapa del avion
     * @return mapa de sillas
     */
    public Map<Integer, Avion> getMapaAvion() {
        return mapaAvion;
    }
    /**
     * Set del mapa de sillas
     * @param mapaAvion 
     */
    public void setMapaAvion(Map<Integer, Avion> mapaAvion) {
        this.mapaAvion = mapaAvion;
    }
}
