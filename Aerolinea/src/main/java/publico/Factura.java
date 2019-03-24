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

    public Factura(String fecha, String tipoAvion, String numSilla, int documentoUsuario, String nombreUsuario, Date fechaNacimientoUsuario) {
        this.fecha = fecha;
        this.tipoAvion = tipoAvion;
        this.documentoUsuario = documentoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.numSilla = numSilla;
    }

    public Factura() {
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(int documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public String getNumSilla() {
        return numSilla;
    }

    public void setNumSilla(String numSilla) {
        this.numSilla = numSilla;
    }
    
}
