/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructurasdedatos.cap1.complejidad.Ciclos;
import estructurasdedatos.cap1.complejidad.Condicionales;
import estructurasdedatos.cap1.tiposdedatos.EjercicioTiposDeDatosPersona;

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
        Ciclos fe= new Ciclos();
        Condicionales li= new Condicionales ();
        EjercicioTiposDeDatosPersona pe= new EjercicioTiposDeDatosPersona ();
        
       fe.pares1al100();
       fe.sumanum1a100();
       fe.primo();
       fe.sumaimpares1a100();
       
       li.numerosdeahastab();
       li.mulltinumdeahastab();
       li.pareasdeahastab();
    }
    
}
