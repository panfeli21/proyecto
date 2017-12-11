/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @felipe
 */
public class NodoArbolAVL {
     private NodoArbolAVL hIzq; 
    private NodoArbolAVL hDer;
    private int dato;
    private int fe;
    
    public NodoArbolAVL(int dato){
        this.hIzq = null;
        this.hDer = null;
        this.dato = dato;
        this.fe = 0;
    }

    /**
     * @return the HijoIzquierdo
     */
    public NodoArbolAVL gethIzq() {
        return hIzq;
    }

    /**
     * @param HijoIzquierdo the hIzq to set
     */
    public void sethIzq(NodoArbolAVL hIzq) {
        this.hIzq = hIzq;
    }

    /**
     * @return the HijoDerecho
     */
    public NodoArbolAVL gethDer() {
        return hDer;
    }

    /**
     * @param HijoDerecho the hDer to set
     */
    public void sethDer(NodoArbolAVL hDer) {
        this.hDer = hDer;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the FactorEquilibrio
     */
    public int getFe() {
        return fe;
    }

    /**
     * @param FactorEquilibrio the factor to set
     */
    public void setFe(int fe) {
        this.fe = fe;
    }
    
    
}
