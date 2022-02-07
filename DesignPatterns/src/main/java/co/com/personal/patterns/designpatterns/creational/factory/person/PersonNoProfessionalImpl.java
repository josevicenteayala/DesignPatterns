package co.com.personal.patterns.designpatterns.creational.factory.person;

public class PersonNoProfessionalImpl implements Persona {

	private String nombre;
	private String apellido;
	private int identificacion;
	
	private PersonNoProfessionalImpl() {
		
	}

	public static Persona crearPersonaNoProfesional(String nombre, String apellido, int identificacion) {
		return new PersonNoProfessionalImpl(nombre, apellido, identificacion);
	}
	
	private PersonNoProfessionalImpl(String nombre, String apellido, int identificacion) {
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
