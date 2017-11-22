package co.com.personal.patterns.designpatterns.factory;

/**
 * Interface que describe el comportamiento de la Persona
 * @author jayala
 * @since Nov 21, 2017
 * @version 1.0.0
 */
public interface Persona {

	/**
	 * Método que permite obtener el nombre de la persona
	 * @author Jos&eacute; Vicente Ayala Luna
	 * @return
	 * @return String
	 * @since Nov 21, 2017
	 * @throws
	 * @version 1.0.0 
	 */
	String obtenerNombre();
	/**
	 * Método que permite obtener el apellido de la persona
	 * @author Jos&eacute; Vicente Ayala Luna
	 * @return
	 * @return String
	 * @since Nov 21, 2017
	 * @throws
	 * @version 1.0.0 
	 */
	String obtenerApellido();
	/**
	 * Método que permite obtener la identificación de la persona
	 * @author Jos&eacute; Vicente Ayala Luna
	 * @return
	 * @return int
	 * @since Nov 21, 2017
	 * @throws
	 * @version 1.0.0 
	 */
	int obtenerIdentificacion();
}
