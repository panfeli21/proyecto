/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

import estructurasdedatos.utiles.nodos.NodoArbolB;

/**
 *
 * @author tusk
 */
public class ArbolB{

private NodoArbolB raiz;

        public boolean esVacia() {
            return raiz == null;
        }

        public void insertar(int nodito) {
            if (esVacia()) {
                NodoArbolB nuevonodo = new NodoArbolB();
                nuevonodo.dato = nodito;
                nuevonodo.hijoderecho= new ArbolB();
                nuevonodo.hijoizquierdo= new ArbolB();
                raiz=nuevonodo;
           }else{
                if(nodito > raiz.dato){
                    raiz.hijoderecho.insertar(nodito);
                }
                if(nodito < raiz.dato){
                    raiz.hijoizquierdo.insertar(nodito);
                }
            }
        }
        
        public void preorden(){
            if(!esVacia()){
                System.out.print(raiz.dato + ",");
                raiz.hijoizquierdo.preorden();
                raiz.hijoderecho.preorden();
            }
        }
        
        public void inorder(){
            if(!esVacia()){
                raiz.hijoizquierdo.inorder();
                System.out.print(raiz.dato + ",");
                raiz.hijoderecho.inorder();
            }
        }
        
        public void postorder(){
            if(!esVacia()){
                raiz.hijoizquierdo.postorder();
                raiz.hijoderecho.postorder();
                System.out.print(raiz.dato + ",");
            }
        }
        
        public ArbolB buscar(int nodo){
            ArbolB subarbol = null;
            if(!esVacia()){
                if(nodo == raiz.dato){
                    return this;
                }else{
                    if(nodo < raiz.dato){
                        subarbol=raiz.hijoizquierdo.buscar(nodo);
                    }else{
                        subarbol=raiz.hijoderecho.buscar(nodo);
                    }
                }
            }
            
            return subarbol;
        }
        
        public int alturaArbol(){
            if(esVacia()){
                return 0;
            }else{
                int hi=raiz.hijoizquierdo.alturaArbol();
                int hd=raiz.hijoderecho.alturaArbol();
                return (1+Math.max(hi, hd));
            }
        }
        
        public int BuscarMinimo(){
            ArbolB actual = this;
            while(!actual.raiz.hijoizquierdo.esVacia()){
                actual=actual.raiz.hijoizquierdo;
            }
            int devuelvo = actual.raiz.dato;
            actual.raiz=null;
            return devuelvo;
        }
        
        public boolean esHoja(){
            boolean hoja=false;
            if(raiz.hijoizquierdo.esVacia() && raiz.hijoderecho.esVacia()){
                hoja = true;
            }
            return hoja;
        }
        
        public int cantidad(){
            if(esVacia()){
                return 0;
            }else{
                int hd=raiz.hijoderecho.cantidad();
                int hi=raiz.hijoizquierdo.cantidad();
                return (1+hd +hi);
            }
        }
    }



