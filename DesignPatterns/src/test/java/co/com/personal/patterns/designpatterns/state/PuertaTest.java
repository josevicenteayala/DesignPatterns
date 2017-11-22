package co.com.personal.patterns.designpatterns.state;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Permtie probar la implementación del patron state
 * @author jayala
 * @since Nov 21, 2017
 * @version 1.0.0
 */
public class PuertaTest {
    
    public PuertaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Permite probar el cerrado de la puerta
     * @author Jos&eacute; Vicente Ayala Luna
     * @return void
     * @since Nov 21, 2017
     * @throws
     * @version 1.0.0 
     */
    @Test
    public void testCerrar() {
        System.out.println("cerrar");
        Puerta puerta = new PuertaImpl();
        puerta.cerrar();
        assertEquals(puerta.getNombreEstado(),Puerta.ESTADO_CERRADO);
    }

    /**
     * Permite probar la apertura de la puerta
     * @author Jos&eacute; Vicente Ayala Luna
     * @return void
     * @since Nov 21, 2017
     * @throws
     * @version 1.0.0 
     */
    @Test
    public void testAbrir() {
        System.out.println("abrir");
        Puerta puerta = new PuertaImpl();
        puerta.abrir();
        assertEquals(puerta.getNombreEstado(),Puerta.ESTADO_ABIERTO);
    }

    /**
     * Permite probar la forma de obtener el estado actual de la puerta
     * @author Jos&eacute; Vicente Ayala Luna
     * @return void
     * @since Nov 21, 2017
     * @throws
     * @version 1.0.0 
     */
    @Test
    public void testGetNombreEstado() {
        System.out.println("getNombreEstado");
        Puerta puerta = new PuertaImpl();
        String expResult = Puerta.ESTADO_ABIERTO;
        String result = puerta.getNombreEstado();
        assertEquals(expResult, result);
    }
    
}
