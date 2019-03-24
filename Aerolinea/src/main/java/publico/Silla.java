package publico;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cristian Romero
 * @version 1.0
 * clase padre que va a contener las sillas a reservar
 */
public class Silla {
    /**
     * Codigo de la silla
     */
    private String codigoSilla;
    /**
     * Precio de la silla
     */
    private double precioSilla;
    /**
     * Disponibilidad de una silla;
     */
    private boolean disponible; 
    /**
     * Dinero con el que arranca el avión mixto
     */
    private double precioArranque1;
    /**
     * Dinero con el que arranca el avión economico
     */
    private double precioArranque2;
    /**
     * Dinero con el que arranca el avión VIP
     */
    private double precioArranque3;
    /**
     * Objeto de avion
     */
    private static Avion claseAvion = new Avion();
    /**
     * Mapa que contiene las sillas de los aviones
     */
    private static Map<Integer, Silla> silla = new HashMap(); 
    /**
     * Constructor de la clase padre silla
     */
    public Silla() {
    }
    /**
     * Constructor para cargar las sillas
     * @param codigoSilla codigo de la silla
     * @param precioSilla precio de la silla por reserva
     * @param disponible disponibilidad de una silla
     * @param claseAvion
     */
    public Silla(String codigoSilla, double precioSilla, boolean disponible, Avion claseAvion) {
        this.codigoSilla = codigoSilla;
        this.precioSilla = precioSilla;
        this.disponible = disponible;
        this.claseAvion = claseAvion;
    }
    /**
     * Get del mapa de sillas
     * @return Map
     */
    public Map<Integer, Silla> getSilla() {
        return silla;
    }
    /**
     * Set del mapa de sillas
     * @param silla 
     */
    public void setSilla(Map<Integer, Silla> silla) {
        this.silla = silla;
    }
    /**
     * Get del codigo de la silla
     * @return String
     */
    public String getCodigoSilla() {
        return codigoSilla;
    }
    /**
     * Set del codigo de la silla
     * @param codigoSilla 
     */
    public void setCodigoSilla(String codigoSilla) {
        this.codigoSilla = codigoSilla;
    }
    /**
     * Get del precio de la silla
     * @return double
     */
    public double getPrecioSilla() {
        return precioSilla;
    }
    /**
     * Set del precio de la silla
     * @param precioSilla 
     */
    public void setPrecioSilla(double precioSilla) {
        this.precioSilla = precioSilla;
    }
    /**
     * Get de la disponibilidad de una silla
     * @return 
     */
    public boolean isDisponible() {    
        return disponible;
    }
    /**
     * Set de la disponibilidad de una silla
     * @param disponible 
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    /**
     * Get precio del arranque del avion mixto
     * @return double
     */
    public double getPrecioArranque1() {
        return precioArranque1;
    }
    /**
     * Set del precio de arranque del avion mixto
     * @param precioArranque1 
     */
    public void setPrecioArranque1(double precioArranque1) {
        this.precioArranque1 = precioArranque1;
    }
    /**
     * Get precio del arranque del avion economico
     * @return double
     */
    public double getPrecioArranque2() {
        return precioArranque2;
    }
    /**
     * Set precio del arranque del avion economico
     * @param precioArranque2 
     */
    public void setPrecioArranque2(double precioArranque2) {
        this.precioArranque2 = precioArranque2;
    }
    /**
     * Get precio del arranque del avion VIP
     * @return double
     */
    public double getPrecioArranque3() {
        return precioArranque3;
    }
    /**
     * Set precio del arranque del avion VIP
     * @param precioArranque3 
     */
    public void setPrecioArranque3(double precioArranque3) {
        this.precioArranque3 = precioArranque3;
    }
    /**
     * Get del tipo de avion de la silla
     * @return Avion
     */
    public Avion getClaseAvion() {
        return claseAvion;
    }
    /**
     * Set del tipo de avion de la silla
     * @param claseAvion 
     */
    public void setClaseAvion(Avion claseAvion) {
        this.claseAvion = claseAvion;
    }
    
}
