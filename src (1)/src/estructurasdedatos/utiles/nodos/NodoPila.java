/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

import estructurasdedatos.cap1.tiposdedatos.EjercicioTiposDeDatosPersona;


/**
 *
 * @author Risaralda
 */
public class NodoPila {
    
    private EjercicioTiposDeDatosPersona dato;
    public NodoPila siguiente;

    /**
     * @return the dato
     */
    public EjercicioTiposDeDatosPersona getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(EjercicioTiposDeDatosPersona dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoPila getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
}
