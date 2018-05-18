package co.com.personal.patterns.designpatterns.factory;

public class PersonaNoProfesionalImpl implements Persona {

	private String nombre;
	private String apellido;
	private int identificacion;
	
	private PersonaNoProfesionalImpl() {
		
	}

	public static Persona crearPersonaNoProfesional(String nombre, String apellido, int identificacion) {
		return new PersonaNoProfesionalImpl(nombre, apellido, identificacion);
	}
	
	private PersonaNoProfesionalImpl(String nombre, String apellido, int identificacion) {
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
