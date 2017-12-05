/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import java.util.Scanner;

import estructurasdedatos.cap1.complejidad.Ciclos;
import estructurasdedatos.cap1.complejidad.Condicionales;
import estructurasdedatos.cap5.grafos.Grafo;


/*
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
        
        System.out.println("bienvenido a el proyecto estructura de datos  ");
        System.out.println("1. Capitulo 1: Complejidad");
        System.out.println("2. Capitulo 2: tipos de datos ");
        System.out.println("3. Capitulo 3: arreglos");
        System.out.println("4. Capitulo 4: listas");
        System.out.println("5. Capitulo 5: Mapas");
        System.out.println("6. Capitulo 6: Arboles");
        System.out.println("7. Capitulo 7: grafos");
        System.out.println("8. Nodos Utiles");
        
        Scanner a = new Scanner (System.in);   
    
        System.out.println("Digite la opcion que desea probar:");
        
        
        int num= a.nextInt();
     
        
        switch (num){
            case 1: 
                System.out.println(" Cpitulo 1 Complejidad: ");
                System.out.println("1. Ciclos");
                System.out.println("2. Condicionales");
                System.out.println("3. Ejercicios De Complejidad");
                System.out.println("Digite la opcion que desee de Complejidad ");  
                int num1= a.nextInt();
                
                switch (num1){ 
                    case 1: //ciclos
                        Ciclos fe= new Ciclos();
                        System.out.println("que ejercicio desea probar:");
                        System.out.println("1. Muestra los numeros pares del 1 al 100");
                        System.out.println("2. Muestra la suma de los numero del 1 al 100");
                        System.out.println("3. Dice si el numero es primo ");
                        System.out.println("4. Muestra la suma de los pares desde el 1 al 100 ");
                    int num2= a.nextInt();
                    
                    
                    switch (num2){                        
                        case 1: 
                            System.out.println(" el ejercicio muestra los pares del 1 al 100");
                            fe.pares1al100();
                                    
                    break;
                    
                        case 2:
                            System.out.println("EL ejercicio muestra la suma de los numeros desde el 1 hasta el 100");
                            fe.sumanum1a100();
                    break;
                    
                        case 3: 
                            System.out.println("este ejercicio te dice si el numero digitado es primo  ");
                            fe.primo();
                    break;     
                    
                        case 4:
                            System.out.println("este ejercicio muestra la suma de los pares desde el 1 hasta el 100");
                    fe.sumaimpares1a100();
                            
                            break;
                    } break;
            
                    case 2: //condicionales
                        Condicionales li= new Condicionales ();
                        System.out.println("ejercicios de condicionales");  
                        System.out.println("que ejercicio desea probar:");
                        System.out.println("1. Muestra los numeros pares del 1 al 100");
                        System.out.println("2. Muestra la suma de los numero del 1 al 100");
                        System.out.println("3. Dice si el numero es primo ");
                        
                }}
        }
   
          
   
    }
        
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
      
      /*ArbolB nuevo = new ArbolB();
      nuevo.insertar(10);
      nuevo.insertar(7);
      nuevo.insertar(50);
      nuevo.insertar(30);
      nuevo.insertar(1);
      System.out.println("postorden");
      nuevo.insertar(0);
      nuevo.postorden();
*/
   /*Grafo gr = new Grafo(5);
   //gr.insertaArista(4, 7, 3);
   //gr.insertaArista(4, 6, 2);
   //gr.eliminarArista(4, 7);
   gr.mostrarGrafo();
   gr.listaAdyVacia(3);*/
    

    

