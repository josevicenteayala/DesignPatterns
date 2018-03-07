package co.com.personal.patterns.designpatterns.state;

public class SolucionConSwitch {

	private static final String ESTADO_ABIERTO = "estadoAbierto";
	private static final String ESTADO_CERRADO = "estadoCerrado";
	private static final int CODIGO_ESTADO_ABIERTO = 2;
	private static final int CODIGO_ESTADO_CERRADO = 1;

	public static void main(String[] args) {
		String estadoSiguiente = ESTADO_CERRADO;
		System.out.println("El estado actual es: "+estadoSiguiente);
		
		estadoSiguiente = identificacionsiguienteEstado(CODIGO_ESTADO_CERRADO);
		System.out.println("El estado siguiente es: "+estadoSiguiente);
		
		estadoSiguiente = identificacionsiguienteEstado(CODIGO_ESTADO_ABIERTO);
		System.out.println("El estado siguiente es: "+estadoSiguiente);
		
		estadoSiguiente = identificacionsiguienteEstado(9);
		System.out.println("El estado siguiente es: "+estadoSiguiente);		
	}
	

	/**
	 * Determina el estado que sigue de acuerdo a una constante
	 */
	private static String identificacionsiguienteEstado(int estado) {
		String estadoActual = ESTADO_CERRADO;
		
		switch(estado) {
		case CODIGO_ESTADO_CERRADO: {
			estadoActual = ESTADO_ABIERTO;
			break;
		}
		case CODIGO_ESTADO_ABIERTO:{
			estadoActual = ESTADO_CERRADO;
			break;
		}
		default: estadoActual = ESTADO_CERRADO;
		}
		
		return estadoActual;
	}

}
