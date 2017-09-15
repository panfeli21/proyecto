/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 *
 * @author felipe 
 */
public class Ciclos { // aqui van los metodos y pueden ser cuantos yo quiera 
    
    public Ciclos (){}   //constructor,

public void pares1al100() {  // metodo que imprime los pares del 1 al 100

 int x;
 for (x=1; x<=100; x++){
 
    if(x%2==0)  {
        System.out.println(x);      
 }
 }

}

public void sumanum1a100 (){

int sum, x;
sum =0;

for (x=1; x<=100; x++){

sum= sum+x;

}
    System.out.println("la suma es");
    System.out.println(x);


}
  
 public void primo (){
 
 int num, cont,x;
 cont=0;
     System.out.println("introduzca el nunero a evaluar");
     Scanner pr= new Scanner (System.in);
    num= pr.nextInt();
    
    for (x=1; x<=num;x++){
        if (num%x==0){
        cont++;
        }        
    }
 if(cont==2 || num==1 || num==0) {
     System.out.println(num);
     System.out.println("es primo");
 } else {
 
     System.out.println(num);
     System.out.println("no es primo");
 }
 }   

public void sumaimpares1a100 () {

    int x, sum=0;
    
    for (x=1; x<=100; x++){
     if(x%2!=0){
     sum=sum+x;
     }
    }
    System.out.println("la suma es");
    System.out.println(x);
}





}
