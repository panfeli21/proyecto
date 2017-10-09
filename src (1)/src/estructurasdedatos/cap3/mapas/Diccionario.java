/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap3.mapas;

/**
 *
 * @author tusk
 */
public class Diccionario<c, v> {

    Mapa<c, v> primero = new Mapa<>();     //instancio o creo nuevo mapa

    public boolean Vacio() {

        return primero.getClave() == null;
    }

    public void agregar(c clave, v valor) {

        Mapa<c, v> nuevo = new Mapa<>(clave, valor);
        if (Vacio()) {
            this.primero.setClave(clave);
            this.primero.setValor(valor);
        } else {
            Mapa<c, v> aux = this.primero;
            while (aux.getSiguiente() != null) {
                if (aux.getClave() != clave) {

                     aux = aux.getSiguiente();
                } else {

                   aux.setValor(valor);
                }
            }
            aux.setSiguiente(nuevo);
        }

    }

    public void listar() {
        if (!Vacio()) {
            Mapa<c, v> aux = this.primero;
            while (aux != null) {
                System.out.println(aux.getClave() + ":" + aux.getValor());
                aux = aux.getSiguiente();
            }
            
        } 
        System.out.println("\t");
    }
public void Buscarpalabra (c clave){

if(primero.getClave()== clave){

    System.out.println(primero.getClave()+":"+ primero.getValor());
}else {

Mapa<c, v> aux= primero;

while (aux.getSiguiente()!= null){

if(aux.getClave()== clave){

    System.out.println(aux.getClave()+":"+aux.getValor());
}
aux= aux.getSiguiente();
}
}


}

public void Eliminar(c clave){

    if (primero.getClave()== clave) {
    
    primero= primero.getSiguiente();
        System.out.println("el dato"+primero.getClave()+"ha sido eliminado");    
    
    }else{
    
    Mapa<c, v> aux= this.primero;
    
    while(aux.getSiguiente().getClave() != clave){
    aux= aux.getSiguiente();
    
        
    }
    Mapa<c, v> aux1= aux.getSiguiente().getSiguiente();
    aux.setSiguiente(aux1);
    
        System.out.println("el dato"+ clave+ "ha sido eliminado exitosamente");
    }

}



}
