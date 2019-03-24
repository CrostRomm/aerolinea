package publico;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Cristian Romero
 * @version 1.0
 */
public class Usuario {
    /**
     * identificacion del usuario
     */
    private int documento;
    /**
     * nombre del usuario
     */
    private String nombre;
    /**
     * Fecha de nacimiento del usuario
     */
    private String fechaNacimiento;
    /**
     * Lista que va a contener a los usuarios
     */
    private static List<Usuario> usuarioLista = new ArrayList();
    /**
     * Constructor de la clase de los usuarios
     * @param documento almacena el documento del usuario
     * @param nombre almacena el nombre del usuario
     * @param fechaNacimiento almacena la fecha de nacimiento del usuario
     */
    public Usuario(int documento, String nombre, String fechaNacimiento) {
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     *Constructor vacio 
     */
    public Usuario(){
    }
    /**
     * Get del documeto del usuario
     * @return int
     */
    public int getDocumento() {
        return documento;
    }
    /**
     * Set del documento del usuario
     * @param documento 
     */
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    /**
     * Get del nombre del usuario
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Set del nombre del usuario
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Get de la decha de nacimiento del usuario
     * @return Date
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * Set de la fecha de nacimiento del usuario
     * @param fechaNacimiento 
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Get de la lista de usuario
     * @return List
     */
    public List<Usuario> getUsuarioLista() {
        return usuarioLista;
    }
    /**
     * Set de la lista de usuario
     * @param usuarioLista 
     */
    public void setUsuarioLista(List<Usuario> usuarioLista) {
        this.usuarioLista = usuarioLista;
    }
}
