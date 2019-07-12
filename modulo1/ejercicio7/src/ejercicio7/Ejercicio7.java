/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author bryan torres
 */
public class Ejercicio7 {
 
    public static void  main (String [] args){
    Scanner sc=new Scanner (System.in);
    
    System.out.println("Numeros pares");
    
    for (int x=1; x<101; x++){
    if (x%2==0){
        System.out.println(x);
       }
     }
   }
}
   
