package co.com.personal.patterns.designpatterns.factory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import co.com.personal.patterns.designpatterns.factory.FactoryPersona;
import co.com.personal.patterns.designpatterns.factory.FactoryPersona.TIPOPERSONA;
import co.com.personal.patterns.designpatterns.factory.Persona;
import co.com.personal.patterns.designpatterns.factory.PersonaProfesionalImpl;

public class FactoryPersonaTest {

	@Test
	public void testCrearPersona() {
		Persona personaProfesional = FactoryPersona.crearPersona(TIPOPERSONA.PROFESIONAL, "Jose Vicente", "Ayala Luna", 98641625);
		assertNotNull("La clase persona no debe ser null ",personaProfesional);
		assertTrue("Debe ser una persona profesional",personaProfesional instanceof PersonaProfesionalImpl);
	}

}
