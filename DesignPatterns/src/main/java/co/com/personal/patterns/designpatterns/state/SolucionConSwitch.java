package co.com.personal.patterns.designpatterns.state;

public class SolucionConSwitch {

	private static final int CODIGO_ESTADO_TRANSITORIO = 2;
	private static final int CODIGO_ESTADOINICIAL = 1;

	public static void main(String[] args) {
		String estadoSiguiente = identificacionEstado(CODIGO_ESTADOINICIAL);
		System.out.println("El estado actual es: "+estadoSiguiente);
		
		estadoSiguiente = identificacionEstado(CODIGO_ESTADO_TRANSITORIO);
		System.out.println("El estado actual es: "+estadoSiguiente);
		
		estadoSiguiente = identificacionEstado(9);
		System.out.println("El estado actual es: "+estadoSiguiente);		
	}
	

	/**
	 * Determina el estado que sigue de acuerdo a una constante
	 */
	private static String identificacionEstado(int estado) {
		String estadoActual = "estadoInicial";
		
		switch(estado) {
		case CODIGO_ESTADOINICIAL: {
			estadoActual = "estadoTransitorio";
			break;
		}
		case CODIGO_ESTADO_TRANSITORIO:{
			estadoActual = "estadoFinal";
			break;
		}
		default: estadoActual = "estadoInicial";
		}
		
		return estadoActual;
	}

}
