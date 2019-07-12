/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

import Helpers.IngenieriaIndustrial;
import Helpers.Medicina;
import Helpers.MedicinaDental;

/**
 *
 * @author bryan torres
 */
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        IngenieriaIndustrial ic = new IngenieriaIndustrial ();
        Medicina Medicina = new Medicina ();
        MedicinaDental md = new MedicinaDental ();
        
        System.out.println(ic.getUniversidad());
        System.out.println(ic.getRector());
        
        System.out.println (Medicina.getUniversidad());
        System.out.println(Medicina.getRector());
        
        System.out.println (md.getUniversidad());
        System.out.println(md.getRector());
      
        
        

        
    
     }
    
}
