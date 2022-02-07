/**
 * 
 */
package co.com.personal.patterns.designpatterns.creational.factory;


/**
 * Clase que identifica a las personas que son profesionales
 * @author jayala
 * @since Nov 21, 2017
 * @version 1.0.0
 */
public class PersonaProfesionalImpl implements Persona {

	private String nombre;
	private String apellido;
	private int identificacion;
	
	private PersonaProfesionalImpl() {
		
	}

	public static Persona crearPersonaProfesional(String nombre, String apellido, int identificacion) {
		return new PersonaProfesionalImpl(nombre, apellido, identificacion);
	}
	
	private PersonaProfesionalImpl(String nombre, String apellido, int identificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
	}	
	
	@Override
	public String obtenerNombre() {
		return nombre;
	}
	@Override
	public String obtenerApellido() {
		return apellido;
	}
	@Override
	public int obtenerIdentificacion() {
		return identificacion;
	}

}
