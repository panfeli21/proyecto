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
public class NodoCircular {
    



    NodoCircular anterior;
    NodoCircular siguiente;
     
    
    
    EjercicioTiposDeDatosPersona dato;
    
    public EjercicioTiposDeDatosPersona getDato (){
     return dato;
     
     }
    
    public void setDato (String nombre, String cedula, String direccion, String telefono){
    
        EjercicioTiposDeDatosPersona p = new EjercicioTiposDeDatosPersona (nombre, cedula, direccion, telefono);
    this.dato=  p;
    
    }
    
    public  NodoCircular getSiguiente (){
        return siguiente;
    }
    
    public void setSiguiente (NodoCircular siguiente){
    
    this.siguiente= siguiente;
            
    }
    public NodoCircular getAnterior (){
    
        return anterior;
    }
    
    public void setAnterior(NodoCircular anterior){
    
    this.anterior= anterior;
    
    }
    
    public void CrearNuevoNodoCircular (){
    
    this.siguiente= null;
    this.anterior=null;
        EjercicioTiposDeDatosPersona dato1 = this.dato;    
    
    }
    
}