package publico;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * @author Cristian Romero
 */
public class PrincipalTest {
    
    public PrincipalTest() {
    }
    @After
    public void tearDown() {
        System.out.println("El programa ha finalizado satisfactoriamente !");
    }
    @Test
    public void casoUno(){
        String respuesta = "1";
        Principal instancia= new Principal();
        instancia.paraTest(respuesta);
        assertEquals("1",respuesta);
    }
    @Test
    public void casoDos(){
        String respuesta = "2";
        Principal instancia= new Principal();
        instancia.paraTest(respuesta);
        assertEquals("2",respuesta);
    }
    @Test
    public void casoTres(){
        String respuesta = "3";
        Principal instancia= new Principal();
        instancia.paraTest(respuesta);
        assertEquals("3",respuesta);
    }
}
