/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @felipe
 */
public class Vector {
    //declarar de variables//

    private int tam;
    private String[] vector;


    public void crearVector(int n) {        // incluye un parametro un tamano n
        this.tam = n; 
        this.vector = new String[this.tam]; // crea un vector a partir del tamano n

    }

    public void setTam(int t) {
        this.tam = t;
    }

    public int gettam() {
        return tam;
    }
    
   
    public boolean Elimiar(int t) {  
        this.vector = null;
        return true;

    }


    public void Insertar(String n, int pos) { //implemta un dato que recibe como parametro un 
        vector[pos] = n;                      //dato string y una posicion dentro del vector 

    }



    public String[] listar() {

        for (int i = 0; i < tam; i++) {      // recorrer el vector por cada posicion
            System.out.println(vector[i]);   //imprime cada dato que hay guardado en cada posicion
        }
        return vector;
    }

    
    public void buscarDato(String dato) {  //recibe como parametro un dato String
        int i = 0;

        while (i < tam) {                    // recorre el vector por cada posicion 
            if (vector[i].equals(dato)) {    // verifica que el dato ingresado sea igual al dato de la posicion del vector.
                System.out.println("el dato esta en la posicion: " + i);  // impirme la posicion en la que se encuenta almacenado el dato

            }
            i++;
        }
    }
    
    public void actualizar (int pos, String dato){   // recibe como parametro una posicion y un dato String
        if(pos < tam){                               // verifica que la posicion ingresada este dentro del rango del vector.
            System.out.println("Indicar que la posicion no existe"); 
        }else {
            vector[pos]= dato;                       // si la pocision existe cambia el dato anterio por el dato que se acabo de ingresar.
        }
    }
    
    
    public void borrarposicion (int pos){             // recibe como parametro una posicion.
        vector[pos]= null;                            // se dirije directamente a esa posicion y la coloca en null.
    }
    
}
