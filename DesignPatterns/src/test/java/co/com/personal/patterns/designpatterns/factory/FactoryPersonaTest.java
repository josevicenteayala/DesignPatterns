package co.com.personal.patterns.designpatterns.factory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import co.com.personal.patterns.designpatterns.factory.FactoryPersona;
import co.com.personal.patterns.designpatterns.factory.FactoryPersona.TIPOPERSONA;
import co.com.personal.patterns.designpatterns.factory.Persona;
import co.com.personal.patterns.designpatterns.factory.PersonaProfesionalImpl;

/**
 * Clase para probar la funcionalidad del patrón Factory
 * @author jayala
 * @since Nov 21, 2017
 * @version 1.0.0
 */
public class FactoryPersonaTest {

	/**
	 * Método que permite probar la manera de crear una instancia de Persona
	 * @author Jos&eacute; Vicente Ayala Luna
	 * @return void
	 * @since Nov 21, 2017
	 * @throws
	 * @version 1.0.0 
	 */
	@Test
	public void testCrearPersona() {
		Persona personaProfesional = FactoryPersona.crearPersona(TIPOPERSONA.PROFESIONAL, "Jose Vicente", "Ayala Luna", 98641625);
		assertNotNull("La clase persona no debe ser null ",personaProfesional);
		assertTrue("Debe ser una persona profesional",personaProfesional instanceof PersonaProfesionalImpl);
	}

}
