/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

 

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc= new Scanner (System.in);
        
        int nota;
        
        String nomb;
        
        
        System.out.println("ingrese nombre del alumno");
        nomb=sc.nextLine();
        
        System.out.println("ingrese nota del alumno");
        nota=sc.nextInt();
        
        if (nota >70) {
            System.out.println(nomb+"  " +nota+ " "+ "Aprobado");
        }
        else { System.out.println(nomb+"  " +nota+ " "+ "Reprobado");
    }
       
 }
}