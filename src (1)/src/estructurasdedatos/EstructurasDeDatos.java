/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructurasdedatos.cap1.complejidad.Ciclos;
import estructurasdedatos.cap1.complejidad.Condicionales;
import estructurasdedatos.cap1.tiposdedatos.EjercicioTiposDeDatosPersona;
import estructurasdedatos.cap4.arboles.ArbolB;

/**
 *
 * @author felipe
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Ciclos fe= new Ciclos();
        Condicionales li= new Condicionales ();
        EjercicioTiposDeDatosPersona pe= new EjercicioTiposDeDatosPersona ();*/
        
      /* fe.pares1al100();
       fe.sumanum1a100();
       fe.primo();
       fe.sumaimpares1a100();
       
       li.numerosdeahastab();
       li.mulltinumdeahastab();
       li.pareasdeahastab();*/
      
      ArbolB nuevo = new ArbolB();
      nuevo.insertar(10);
      nuevo.insertar(7);
      nuevo.insertar(50);
      nuevo.insertar(30);
      nuevo.insertar(1);
      System.out.println("postorden");
      nuevo.insertar(0);
      nuevo.postorden();
    }
    
}
