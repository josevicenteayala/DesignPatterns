/**
 * 
 */
package co.com.personal.patterns.designpatterns.creational.factory.person;


/**
 * Clase que identifica a las personas que son profesionales
 * @author jayala
 * @since Nov 21, 2017
 * @version 1.0.0
 */
public class PersonProfessionalImpl implements Persona {

	private String nombre;
	private String apellido;
	private int identificacion;
	
	private PersonProfessionalImpl() {
		
	}

	public static Persona crearPersonaProfesional(String nombre, String apellido, int identificacion) {
		return new PersonProfessionalImpl(nombre, apellido, identificacion);
	}
	
	private PersonProfessionalImpl(String nombre, String apellido, int identificacion) {
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
