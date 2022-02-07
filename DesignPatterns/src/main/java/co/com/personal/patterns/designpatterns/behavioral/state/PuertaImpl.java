package co.com.personal.patterns.designpatterns.behavioral.state;


/**
 * Clase que implementa el comportamiento de una puerta
 * @author jayala
 * @since Nov 21, 2017
 * @version 1.0.0
 */
public class PuertaImpl implements Puerta{
    private Puerta estadoActualDeLaPuerta = new PuertaCerradaImpl();

    @Override
    public void cerrar() {
        estadoActualDeLaPuerta.cerrar();
    }

    @Override
    public void abrir() {
        estadoActualDeLaPuerta.abrir();
    }

    @Override
    public String getNombreEstado() {
        return estadoActualDeLaPuerta.getNombreEstado();
    }
    
    /**
     * Clase que conoce el comportamiento de una clase cerrada
     * @author jayala
     * @since Nov 21, 2017
     * @version 1.0.0
     */
    private class PuertaCerradaImpl implements Puerta{
        private Puerta proximoEstado = new PuertaAbiertaImpl(this);
        private String nombreEstado;
        
        PuertaCerradaImpl(){
            nombreEstado = ESTADO_CERRADO;
        }
        
        @Override
        public void cerrar() {
        		System.out.println("La puerta ya esta cerrada");
        }

        @Override
        public void abrir() {
            System.out.println("Abriendo la puerta");
            estadoActualDeLaPuerta = proximoEstado;
        }
        
        @Override
        public String getNombreEstado(){
            return nombreEstado;
        }         
    }
    
    /**
     * Clase que conoce el comportamiento de una clase abierta
     * @author jayala
     * @since Nov 21, 2017
     * @version 1.0.0
     */
    private class PuertaAbiertaImpl implements Puerta{
        private String nombreEstado;
        private Puerta proximoEstado;
        
        PuertaAbiertaImpl(Puerta nuevoEstado){
            proximoEstado = nuevoEstado;
            nombreEstado = ESTADO_ABIERTO;
        }
        
        @Override
        public void cerrar() {
            System.out.println("Cerrando la puerta");
            estadoActualDeLaPuerta = proximoEstado;
        }

        @Override
        public void abrir() {
        	 	System.out.println("La puerta ya esta abierta");
        }
        
        @Override
        public String getNombreEstado(){
            return nombreEstado;
        } 
        
    }
}
