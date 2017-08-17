/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.personal.patterns.designpatterns.state;

/**
 *
 * @author vin001
 */
public class Puerta implements IStatePuerta{
    private IStatePuerta estadoActualDeLaPuerta = new StateAbierta();

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
    
    private class StateAbierta implements IStatePuerta{
        private IStatePuerta proximoEstado = new StateCerrada(this);
        private String nombreEstado;
        
        StateAbierta(){
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
    
    private class StateCerrada implements IStatePuerta{
        private String nombreEstado;
        private IStatePuerta proximoEstado;
        
        StateCerrada(IStatePuerta nuevoEstado){
            proximoEstado = nuevoEstado;
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
}
