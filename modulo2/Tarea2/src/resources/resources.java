/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

/**
 *
 * @author bryan torres
 */
public class resources {
    
    public void Metodo1(){
        System.out.println("Estoy aprendiendo, pero sere el mejor programador");
    }
    
    public void Metodo2(int numero){
        if (numero >= 70){
            System.out.println("Aprobado");
            
        } else{
          System.out.println("Reprobado");  
        }
        
    }
    
    public void Metodo3(int numero1, int numero2){
        double division;
        
        division = 0;
        
        if (numero2 == 0){
            System.out.println("No se puede dividir entre cero");
        } else{
            division = numero1 / numero2;
            
          System.out.println(numero1 +" / " + numero2 + " = " + division);  
        }
    
    }
    public void Metodo4(int numero){
        int i;
        
        for( i=1; i <= numero; i++)
            System.out.println(i);    
        }

        
        
    }
    
    
  
