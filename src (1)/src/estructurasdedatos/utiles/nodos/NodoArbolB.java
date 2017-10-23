/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

import estructurasdedatos.cap4.arboles.ArbolB;

/**
 *
 * @author tusk
 */
public class NodoArbolB {
 public ArbolB hijoderecho;
        public ArbolB hijoizquierdo;
        public int dato;

        public void NodoArbol() {
            this.hijoderecho = null;
            this.hijoizquierdo = null;
            this.dato = 0;
        }     
}
