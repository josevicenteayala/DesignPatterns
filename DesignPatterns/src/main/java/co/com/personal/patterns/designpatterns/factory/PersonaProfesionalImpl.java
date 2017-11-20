/**
 * 
 */
package co.com.personal.patterns.designpatterns.factory;

/**
 * @author jayala
 *
 */
public class PersonaProfesionalImpl implements Persona {

	private String nombre;
	private String apellido;
	private int identificacion;
	
	public PersonaProfesionalImpl() {
		
	}

	public static Persona crearPersonaProfesional(String nombre, String apellido, int identificacion) {
		return new PersonaProfesionalImpl(nombre, apellido, identificacion);
	}
	
	private PersonaProfesionalImpl(String nombre, String apellido, int identificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
	}	
	
	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.factory.Persona#obtenerNombre()
	 */
	@Override
	public String obtenerNombre() {
		return nombre;
	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.factory.Persona#obtenerApellido()
	 */
	@Override
	public String obtenerApellido() {
		return apellido;
	}

	/* (non-Javadoc)
	 * @see co.com.personal.patterns.designpatterns.factory.Persona#obtenerIdentificacion()
	 */
	@Override
	public int obtenerIdentificacion() {
		return identificacion;
	}

}
