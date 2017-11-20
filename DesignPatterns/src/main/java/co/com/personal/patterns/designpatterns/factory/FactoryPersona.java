package co.com.personal.patterns.designpatterns.factory;

public class FactoryPersona {

	public enum TIPOPERSONA {
		PROFESIONAL, NOPROFESIONAL
	};

	public static Persona crearPersona(TIPOPERSONA tipoPersona, String nombre, String apellido, int identificacion) {
		switch (tipoPersona) {
		case PROFESIONAL:
			return PersonaProfesionalImpl.crearPersonaProfesional(nombre, apellido, identificacion);
		case NOPROFESIONAL:
			return PersonaNoProfesionalImpl.crearPersonaNoProfesional(nombre, apellido, identificacion);
		}
		return PersonaProfesionalImpl.crearPersonaProfesional(nombre, apellido, identificacion);
	}

}
