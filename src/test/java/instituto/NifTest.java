
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
public class NifTest {
    
    public NifTest() {
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
     * Test del método toString, de la clase Nif.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Nif instance = new Nif();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del método setNif, de la clase Nif. 
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        int numero = 0;
        Nif instance = new Nif();
        instance.setNif(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test del método equals, de la clase Nif.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Nif instance = new Nif();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
