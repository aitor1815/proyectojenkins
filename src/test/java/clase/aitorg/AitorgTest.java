/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package clase.aitorg;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aitorg
 */
public class AitorgTest {
    
    public AitorgTest() {
  }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of main method, of class AitorGarciaa.
     */
    @org.junit.jupiter.api.Test
        public void testDia_laboralLunes() {
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = Aitorg.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
        @org.junit.jupiter.api.Test
       public void testDia_laboralMartes() {
        String dia = "Martes";
        boolean expResult = true;
        boolean result = Aitorg.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       
     @org.junit.jupiter.api.Test
        public void testDia_laboralMiercoles() {
        String dia = "Miercoles";
        boolean expResult = true;
        boolean result = Aitorg.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
    
     @org.junit.jupiter.api.Test
        public void testDia_laboralJueves() {
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = Aitorg.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
        
      @org.junit.jupiter.api.Test
        public void testDia_laboralViernes() {
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = Aitorg.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
        
      @org.junit.jupiter.api.Test
        public void testDia_laboralSábado() {
        String dia = "Sábado";
        boolean expResult = false;
        boolean result = Aitorg.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
        
      @org.junit.jupiter.api.Test
        public void testDia_laboralDomingo() {
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = Aitorg.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
        
}
