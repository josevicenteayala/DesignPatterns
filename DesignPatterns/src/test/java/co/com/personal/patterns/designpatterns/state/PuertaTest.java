/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.personal.patterns.designpatterns.state;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vin001
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
     * Test of cerrar method, of class Puerta.
     */
    @Test
    public void testCerrar() {
        System.out.println("cerrar");
        Puerta puerta = new Puerta();
        puerta.cerrar();
        assertEquals(puerta.getNombreEstado(),IStatePuerta.ESTADO_CERRADO);
    }

    /**
     * Test of abrir method, of class Puerta.
     */
    @Test
    public void testAbrir() {
        System.out.println("abrir");
        Puerta puerta = new Puerta();
        puerta.abrir();
        assertEquals(puerta.getNombreEstado(),IStatePuerta.ESTADO_ABIERTO);
    }

    /**
     * Test of getNombreEstado method, of class Puerta.
     */
    @Test
    public void testGetNombreEstado() {
        System.out.println("getNombreEstado");
        Puerta instance = new Puerta();
        String expResult = IStatePuerta.ESTADO_ABIERTO;
        String result = instance.getNombreEstado();
        assertEquals(expResult, result);
    }
    
}
