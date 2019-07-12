/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author bryan torres
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma,resta,multiplicacion,division=0;
        
        double numero1=12;
        double numero2=13;
        
        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        
        if(numero2 !=0) {
            division=numero1/numero2;
        }
        System.out.println("la suma es :" + suma );
         System.out.println("la suma es :" + resta );
          System.out.println("la suma es :" + multiplicacion );
           System.out.println("la suma es :" + division );

    }
    
}
