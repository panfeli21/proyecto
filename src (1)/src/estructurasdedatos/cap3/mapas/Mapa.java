/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap3.mapas;

/**
 *
 * @author felipe jejeje 
 */
public class Mapa <c,v> { //template , clave y valor 
    
    private c clave;
    private v valor;    
    private Mapa <c,v> siguiente;
    
    public Mapa(c clave, v valor) {
        
        this.clave= clave;
        this.valor= valor;  
}

    public Mapa() {
    }
  

    
    
    public c getClave() {
        return clave;
    }

    public void setClave(c clave) {
        this.clave = clave;
    }

    public v getValor() {
        return valor;
    }

    public void setValor(v valor) {
        this.valor = valor;
    }

    public Mapa<c, v> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Mapa<c, v> siguiente) {
        this.siguiente = siguiente;
    }
    
}
