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
public interface IStatePuerta {
    String ESTADO_CERRADO = "ESTADO CERRADO";
    String ESTADO_ABIERTO = "ESTADO ABIERTO";
    
    public void cerrar();
    public void abrir();
    public String getNombreEstado();
    
}
