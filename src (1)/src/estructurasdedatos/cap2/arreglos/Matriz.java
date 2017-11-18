/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author felipe
 */
public class Matriz {
    
        //constructor: aqui van los atributos
    
        private int fila;
        private int columna;
        private int [][] matriz;
        
        public void crearMatriz(int c, int f){ // creo la matriz de enteros
            
           this.fila=f;           
           this.columna=c;
           this.matriz= new int [f][c];
        }
        
        public void Insertar (int c, int f, int dato){
        
            this.fila= f;
            this.columna= c;
            this.matriz [f][c]=dato;      
        
        
        }
        
        public void Eliminar (int c,int f, int dato) {
            
            this.fila= f;
            this.columna= c;
            this.matriz[f][c]=0;
        }

        public void Imprimir(){
        
        for(int f=0; f< matriz.length; f++ ){
        
        for(int c=0; c< matriz[f].length; c++){
            System.out.println(matriz[f][c]+ " ");
        
        }
        
        }
        
        }
        public void BuscarDato(int dato){
        
         for (int f = 0; f < matriz.length; f++) {   // cilco por el cual recorre las filas de la mattriz
            for (int c = 0; c < matriz.length; c++) {  // ciclo por el cual reccore las columnas de la matriz/
                if (this.matriz[f][c] == dato) {       // verifica el que dato ingresado sea igual al dato de la posicion
                    System.out.println("el dato se encuenta en la posicion: " + f
                            + "," + c);
                }
            }
        }
        }
        
        }
    
    
    
    
    

