/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoCircular;



/**
 *
 * @felipe
 */
public class ListaCircular {
    // declaracion de variables
    NodoCircular inicio;

    /*
     creamos una listacircular
     */
    public ListaCircular() {
        // al crear la lista inicializamos en inicio en null
        this.inicio = null;
    }

    /*
     creamo una funcio que nos verifique si la lista esta vacia 
     */
    public boolean vacia() {
        // verificamos que el inicio sea null 
        if(inicio == null) {
            // si es null retorna verdadero     
            return true;
        } else {
            // si no es null por que ya tiene un dato retorna falso
            return false;
        }
    }

    /*
     funcion para insertar datos
     @param todos los atrivutos de la clase Actividad
     */
    public void insertardatos(String nombre, String cedula, String direccion, String telefono) {
        //creaos un nuevo nodo de la clase nodo 
        NodoCircular nuevo = new NodoCircular();
        //creamos el nodo y le asignamos el dato que ha ingreaso 
        nuevo.CrearNuevoNodoCircular();
        nuevo.setDato(nombre, cedula, direccion, telefono);
        // verificamos que la lista esta vacia 
        if (vacia()) {
            // si esta vacia asigna los valores al nuevo nodo
            inicio = nuevo;
            inicio.setSiguiente(inicio);
        } else {
            // si no esta vacia conecta el siguiente con el inicio.
            nuevo.setSiguiente(inicio.getSiguiente());
            // en nodo inicio apunta al nuevo
            inicio.setSiguiente(nuevo);
        }
    }

    /*
     listar recorre la lista imprimiendo los datos de la lista 
     */
    public void listar() {
        // Verificamos que la lista este vacia
        if (!vacia()) {
            // Crea una nodo y lo inicializamos en el inicio
            NodoCircular aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta llegar nuevamente al incio de la lista.
            do {
                System.out.println("el dato :" + " " + "[" + aux.getDato().getNombre() + "]" + " " + "esta en la posicion:"
                        + " " + "(" + i + ")" + "de la lista");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador del ciclo
                i++;
            } while (aux != inicio);
        }
        System.out.println("");
    }


    /*
     funcion para eliminar un dato de la lista 
     @param un dato de tipo String 
     */
    public void eliminardato(String dato) {
        // creamos un nodo auxiliar para recorrer la lista 
        NodoCircular aux = inicio;
        //verificamos que solo haya un nodo y que el dato a eliminar sea ese nodo 
        System.out.println("el dato " + dato + " se ha eliminado" + "\n");
        if (inicio.getSiguiente() == inicio && inicio.getDato().getNombre().equals(dato)) {
            // si esta en el primer nodo instaciamos su inicio y si siguiente en null.
            inicio.setSiguiente(null);
            inicio = null;
        } else {
            // si hay mas nodos verificamos que el dato a eliminar es el primer nodo 
            if (aux.getDato().getNombre().equals(dato)) {

                while (aux.getSiguiente()!= inicio) {
                    aux = aux.getSiguiente();
                }
                inicio.setSiguiente(inicio.getSiguiente()); 
                aux.setSiguiente(inicio);
            }

        //System.out.print("el dato:" + aux.getDato()+ " ha sido eliminado");
            // recorremos la lista completamente hasta el dato que esta antes del inicio
            while (aux.getSiguiente()!= inicio) {
                //durante el recorrido verificamos que el dato de cada nodo sea igual al dato introducido
                if (aux.getSiguiente().getDato().getNombre().equals(dato)) {
                    // creamos un nodo axuliar para almacenar el dato aliminar
                    NodoCircular eliminar = aux.getSiguiente();
                    // puntamos entre si el nodo que esta antes y despues del nodo eliminado
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    break;
                }
                // aumentamos el contador del ciclo
                aux = aux.getSiguiente();
            }
        }
    }

    /*
     buscar recorre la lista comparando los datos de cada nodo con el dato ingresado y 
     si lo encuentra lo imprime
     @param String
     */
    public void buscar(String dato) {
        // verificamos que la lista no este vacia 
        if (!(vacia())) {
            // cremos un nodo auxiliar 
            NodoCircular aux = inicio;
            // veriticamos y comparamos que el dato a buscar este en el pimer nodo
            if ((aux.getDato().getNombre().equals(dato))) {
                System.out.println("el dato no existe en la lista");
            }
            if (aux.getDato().getNombre().equals(dato)) {
                // imprimimos en pantalla los datos que encontramos 
                System.out.println("el dato " + aux.getDato().getNombre() + " si existe en la lista");
            } else {
                // si no esta en el inicio recorremos la lista comparando los datos de cada nodo 
                while (aux.getSiguiente()!= inicio) {
                    // verificamos el dato de cada nodo sea igual al dato a buscar
                    if (aux.getSiguiente().getDato().getNombre().equals(dato)) {
                        // imprimimos en pantalla los datos que se encontraron 
                        System.out.println("el dato " + aux.getSiguiente().getDato().getNombre() + " si existe en la lista");
                        break;
                    }
                    // aumentamos en contador del ciclo.
                    aux = aux.getSiguiente();
                }
            }
            // en caso de que el dato no este en la lista
            if (!(aux.getDato().getNombre().equals(dato))) {
                System.out.println("el dato no existe en la lista");

            }
        }

    }

}
