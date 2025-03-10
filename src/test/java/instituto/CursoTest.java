
package instituto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Víctor Merino
 */
public class CursoTest {
    
    public CursoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test del método GetNombre, de la clase Curso.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Curso instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del funcionamiento del método toString, de la clase Curso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Curso instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test que comprueba que el método aniadir alumno funciona correctamente.
     * Se crea una persona con la que se verá si se añade correctamente.
     */
    @Test
    public void testAniadirAlumno() {
        
        Persona p = new Persona(18088307, "Victor", 'H', 15, 3, 2005);
        Curso instance = new Curso("1ºMULWEB");
        instance.aniadirAlumno(p);
    }
    
}
