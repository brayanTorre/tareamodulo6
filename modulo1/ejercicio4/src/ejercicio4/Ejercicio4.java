/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;
/**
 *
 * @author bryan torres
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
  
        
   public static void main (String [] args) {
       Scanner sc= new Scanner(System.in);
       
       String clase[];
       String nom;
       clase = new String [10];
               
               for (int x=0; x<clase.length; x++){
           System.out.println("ingrese un nombre");
                  nom=sc.nextLine();
                  clase [x]= nom;
       }
              System.out.println("Lista:");
                System.out.println(clase [0]);
                System.out.println(clase [1]);
                System.out.println(clase [2]);
                System.out.println(clase [3]);
                System.out.println(clase [4]);
                System.out.println(clase [5]);
                System.out.println(clase [6]);
                System.out.println(clase [7]);
                System.out.println(clase [8]);
                System.out.println(clase [9]);
                
      }
   }
   
