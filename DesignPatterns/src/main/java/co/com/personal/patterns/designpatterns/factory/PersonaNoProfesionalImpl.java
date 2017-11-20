package co.com.personal.patterns.designpatterns.factory;

public class PersonaNoProfesionalImpl implements Persona {

	private String nombre;
	private String apellido;
	private int identificacion;
	
	public PersonaNoProfesionalImpl() {
		
	}

	public static Persona crearPersonaNoProfesional(String nombre, String apellido, int identificacion) {
		return new PersonaNoProfesionalImpl(nombre, apellido, identificacion);
	}
	
	private PersonaNoProfesionalImpl(String nombre, String apellido, int identificacion) {
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
