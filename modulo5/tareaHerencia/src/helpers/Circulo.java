/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author bryan torres
 */
public class Circulo extends Formas {
    private int Radio;
    
    public void establecerRadio (int Radio){
    this.Radio = Radio;
    }

    
    
    public void ImprimirInformacioCirculo(){
        System.out.println("Radio:" + Radio);
}
    
    public Circulo (){
    establecerColor("Rojo");
    establecerdibujar("Circulo");
    }

    @Override
   public String obtenerInformacionFormas() {
return "INFORMACION PARA CIRCULO";
    }
    
    
    
}
