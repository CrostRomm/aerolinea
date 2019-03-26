package publico;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * @author Cristian Romero
 * @version 1.0
 */
public class Factura {
    private String fecha;
    private String tipoAvion;
    private String numSilla;
    private int documentoUsuario;
    private String nombreUsuario;
    private Date fechaNacimientoUsuario;
    private static List<Factura> listaFactura = new ArrayList();
    /**
     * Constructor de la factura
     * @param fecha fecha actual
     * @param tipoAvion tipo de avion
     * @param numSilla numero de la silla
     * @param documentoUsuario documento del usuario
     * @param nombreUsuario nombre del usuario
     * @param fechaNacimientoUsuario  fecha de nacimiento del usuario
     */
    public Factura(String fecha, String tipoAvion, String numSilla, int documentoUsuario, String nombreUsuario, Date fechaNacimientoUsuario) {
        this.fecha = fecha;
        this.tipoAvion = tipoAvion;
        this.documentoUsuario = documentoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.numSilla = numSilla;
    }
    /**
     * Constructor vacio
     */
    public Factura() {
    }
    /**
     * Get de la fecha actual
     * @return String
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * Set de la fecha actual
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * Get del documento del usuario
     * @return int
     */
    public int getDocumentoUsuario() {
        return documentoUsuario;
    }
    /**
     * Set del documento del usuario
     * @param documentoUsuario 
     */
    public void setDocumentoUsuario(int documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }
    /**
     * Get de nombre usuario
     * @return String
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    /**
     * Set del nombre del usuario
     * @param nombreUsuario 
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    /**
     * Get de fecha de nacimiento del usuario
     * @return Date
     */
    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }
    /**
     * Set de la fecha de nacimiento del usuario
     * @param fechaNacimientoUsuario 
     */
    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }
    /**
     * Lista de las facturas
     * @return List
     */
    public List<Factura> getListaFactura() {
        return listaFactura;
    }
    /**
     * Set de la lista factura
     * @param listaFactura 
     */
    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
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
     * get del numero de la silla
     * @return String
     */
    public String getNumSilla() {
        return numSilla;
    }
    /**
     * Set del numero de la silla
     * @param numSilla 
     */
    public void setNumSilla(String numSilla) {
        this.numSilla = numSilla;
    }
}
