package co.com.personal.patterns.designpatterns.factory;

/**
 * Permite construir un objeto Persona mediante la identificacion del tipo de persona y los atributos que la caracterizan
 * @author Jose Vicente Ayala Luna
 * @since 2017-11-20
 * @version 1.0.0
 *
 */
public class FactoryPersona {

	public enum TIPOPERSONA {
		PROFESIONAL, NOPROFESIONAL
	};

	/**
	 * Permite crear un objeto de tipo Persona, para ello metiante el TIPOPERSONA determina el objeto que debe instanciar
	 * y lo inicializa con el nombre, el apellido y la identificacion
	 * @author Jos&eacute; Vicente Ayala Luna
	 * @param tipoPersona
	 * @param nombre
	 * @param apellido
	 * @param identificacion
	 * @return Persona
	 * @since Nov 21, 2017
	 * @throws none
	 * @version 1.0.0 
	 */
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
