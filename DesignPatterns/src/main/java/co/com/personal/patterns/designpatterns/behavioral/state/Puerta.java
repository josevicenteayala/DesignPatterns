package co.com.personal.patterns.designpatterns.state;

/**
 * Interface que define el comportamiento de una puerta
 * @author jayala
 * @since Nov 21, 2017
 * @version 1.0.0
 */
public interface Puerta {
    String ESTADO_CERRADO = "ESTADO CERRADO";
    String ESTADO_ABIERTO = "ESTADO ABIERTO";
    
    /**
     * Método que describe la forma de cerrar una puerta y dejarla en condición cerrada
     * @author Jos&eacute; Vicente Ayala Luna
     * @return void
     * @since Nov 21, 2017
     * @throws
     * @version 1.0.0 
     */
    public void cerrar();
    /**
     * Método que describe la forma de abrir una puerta y dejarla en condición abierta
     * @author Jos&eacute; Vicente Ayala Luna
     * @return void
     * @since Nov 21, 2017
     * @throws
     * @version 1.0.0 
     */
    public void abrir();
    /**
     * Método que describe la forma de conocer si la puerta esta cerrada o abierta
     * @author Jos&eacute; Vicente Ayala Luna
     * @return
     * @return String
     * @since Nov 21, 2017
     * @throws
     * @version 1.0.0 
     */
    public String getNombreEstado();
    
}
