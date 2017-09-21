/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoDoble;

/**
 *
 * @author felipe
 */
public class ListaDoble {
    // declaramos variables cabeza y cola de la lista de tipo nodo
    private NodoDoble cabeza;
    private NodoDoble cola;
/*
    me crea una lista con  inicializando la cabeza y la cola en null
    */
    
    public void crearListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }
 
    /*
    inserta un dato en un nodo y lo enlaza con el anterior y el siguiente de
    los nodos si existen, asigna el dato como primer nodo de la lista
    @param entero
    */
    
   
    public void insertarOrdenado(int dato) {
        // creamos un nodo nuevo
        NodoDoble minodo = new NodoDoble();
        minodo.CrearNuevoNodoDoble();
        // al nuevo nodo le asignamos el dato ingresado
        minodo.setDato(dato);
        // creamos un nodo auxiliar que inicialize con el valor de la cabeza 
        //de la lista.
        NodoDoble aux = cabeza;
        // verificamos que la lista este vacia 
        if (this.cabeza == null && this.cola == null) {
        // si la lista esta vacia ponemos el nuevo nodo como primero de la lista// 
            this.cabeza = minodo;
            this.cola = minodo;
        // verificamos si hay un primero nodo y lo comparamos con el nuevo nodo 
        // comparamos de tal manera que el nuevo nodo sea menor al primero que esta creado    
        } else if (minodo.getDato() < aux.getDato() && aux.getSiguiente() == null) {
        // enlazamos el dato nuevo detras del nodo que ya esta creado
            minodo.setSiguiente(aux);
            minodo.setAnterior(this.cabeza);
            this.cabeza =minodo;
            
        } 
    }
/*
    listar me imprime todos los datos que hay en la lista 
     
    */
    public void listarDoble() {
        // verificiamos que la lista no este vacia 
        if (!(this.cabeza == null && this.cola == null)) {
            // creamos el nodo que nos va a recorres la lista nodo 
            // por nodo imprimedo el valor que hay en cada nodo 
            NodoDoble aux = cabeza;
            // ciclo por el cual el nodo recorre la lista hasta que la cola 
            //tenga el valor de null
            int i = 0;
            while (aux != null) {
            // se imprime en pantalla el dato que hay en cada nodo y la posicion de la lista    
                System.out.println("el dato :" + " " + "[" + aux.getDato() + "]" + " " + "esta en la posicion:"
                        + " " + "(" + i + ")" + "de la lista");
             // le pasamos al nodo auxiliar el siguiente nodo
                aux = aux.getSiguiente();
             // incrementamo el ciclo    
                i++;
            }
        }
    }
/*
    para elminar un dato se recorre la lista hasta encontrar el dato a eliminar
     
    */
    public void eliminarDoble(int dato) {
        // verifica si el nodo a eliminar es el primero
        if (cabeza.getDato() == dato) {
        // el primer nodo apunta el sieguiente
            cabeza = cabeza.getSiguiente();
        } else {
         // creamos un nodo auxiliar con la copia de la lista//
            NodoDoble aux = cabeza;
      //  recorremos la lista hasta llegar al nodo anterior del dato ingresado //
            while (aux.getSiguiente().getDato() != dato) {
                // le pasamos al nodo auxiliar el siguiente nodo
                aux = aux.getSiguiente();
            }
           // guaramos en nodo que va despues del nodo a eliminar
            NodoDoble siguiente = aux.getSiguiente().getSiguiente();
            // enlazamos el nodo que esta en la posicion antes del elminado con 
            // el que va despues del nodo eliminado
            aux.setSiguiente(siguiente);
            
        }

    }
/*
    insertamos un nodo al final de la lista enlazando el nuevo nodo con el anterior 
    y null despues de el
    
    */
    
    public void insertarFinal(int dato) {
    // cremos el nodo que vamos a ingresar en la lista
    NodoDoble minodo = new NodoDoble();
    minodo.CrearNuevoNodoDoble();
    // le asignamos el valor ingreado al nodo creado
    minodo.setDato(dato);
    // verificamos que la lista este vacia// 
    if (this.cabeza == null && this.cola == null) {
        // si la lista esta vacia ponemos el nuevo nodo como primero de la lista//
        cabeza = minodo;
        cola = minodo;
        
    } else {
        // creamos un nodo auxiliar con la copia de la lista 
        NodoDoble aux = cabeza;
        // recorremos la lista hasta el ultimo nodo
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();

            }
        // enlazamos el ultimo nodo con el nuevo nodo 
            aux.setSiguiente(minodo);
        // enlazamos el nuevo nodo con el anterior a el    
            minodo.setAnterior(aux);

        }

    }
}