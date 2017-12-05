/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoObjeto;

/**
 *
 * @author tusk
 */
public class Cola {
     //atributos_principales
    private NodoObjeto primero;
    private NodoObjeto ultimo;

    public boolean esVacia() {
        return primero == null;
    }

    //Metodo_Crear_Cola
    public void crearCola() {
        this.primero = null;
        this.ultimo = null;
    }
//Metodo_que_me hace_la _cola

    public void encolar(int dato) {
        NodoObjeto nodo1 = new NodoObjeto();
        nodo1.setDato(dato);
        if (esVacia()) {
            this.primero = nodo1;
            this.ultimo = nodo1;
        } else {
            NodoObjeto aux = primero;
            while (aux.getSiguiente()!= null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux);
        }
    }

    //Metodo_atender
    public void desencolar() {
        if (!esVacia()) {
            this.primero = primero.getSiguiente();
        } else {
            System.out.println("La cola esta vacia");
        }
    }

    //Metodo_Listar
    public void listar() {
        NodoObjeto aux = primero;
        int i = 1;
        while (aux != null) {
            System.out.println(i + "." + "[" + aux.getDato() + "]" + "->" + " ");
            aux = aux.getSiguiente();
            i++;
        }
        System.out.println("null");
    }

    //TamaÃ±o_de_la_cola
    public int size() {
        NodoObjeto aux = primero;
        int contador = 0;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }
    
}
