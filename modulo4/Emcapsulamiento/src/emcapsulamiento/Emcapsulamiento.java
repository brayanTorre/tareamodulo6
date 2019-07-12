/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emcapsulamiento;

import helpers.Estudiante;

/**
 *
 * @author bryan torres
 */
public class Emcapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Estudiante Estudiante = new Estudiante ( "Bryan", "3 años experiencia");
        
        Estudiante.imprimirNombre();
        Estudiante.imprimirExperiencia ();
        Estudiante.setEdad(30);
        System.out.println(Estudiante.getEdad());
    }
    
}
