/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 *
 * @author tusk
 */
public class Condicionales { //metodos 
    
    public Condicionales(){} // constructor

    
    public void numerosdeahastab () {
        
        int x, num1, num2;
        
        System.out.println("ingrese el primer Numero");
        Scanner sc= new Scanner (System.in);
        num1=sc.nextInt();
        System.out.println("ingrese el segundo numero"); 
        
        num2=sc.nextInt();
        
      if (num1>num2) {
          System.out.println(" los numeros no son correctos");
      }        
      else { for (x=num1; x<=num2; x++) {
          System.out.println(x);
      
      }
      
      }
    } 
    
 public void mulltinumdeahastab ()   {
 
 int num1, num2, x, sum;
 
     System.out.println("digite el primer numero");
     Scanner dg = new Scanner (System.in );
     num1= dg.nextInt();
     System.out.println("digite el segundo numero");
     num2=dg.nextInt();
     
     if(num1>num2 ){
         
         System.out.println("los numeros introducidos no son correctos");       
         
     }
 else{
        sum = 1;
        for(x=num1;x<=num2; x++) {
            sum=sum*x;
        }
     }


}
    public void pareasdeahastab (){
    
    int num1, num2,x;
    
        System.out.println("digite el primer numero");
        Scanner pa= new Scanner (System.in);
        num1= pa.nextInt();
         System.out.println("digite el segundo numero ");   
         num2= pa.nextInt();
         
         if (num1 > num2){
             
             System.out.println("los valosres son incorrectos, intentelo de nuevo");
         } else {
         for(x=num1; x<=num2; x++) {
          if (x%2==0){
              System.out.println(x);
          }
         }
         
         }
    }
    
}