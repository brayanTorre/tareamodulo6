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
public abstract class Formas {
    
   private String color;
    private String dibujar;
    private String establecerColor;
    
    public Formas () {
    }
    
    public void establecerdibujar (String dibujar){
    this.dibujar = dibujar;
    }
    public String obtenerdibujar(){
    return this.dibujar;
    }
    
    public void establecerColor (String establecerColor){
    this.color = establecerColor ;
    }
    public String obtenerColor(){
    return this.color;
    }

public void ImprimirInformacio(){
System.out.println("color:" + color);

System.out.println("dibujar:" + dibujar);
}


abstract String obtenerInformacionFormas();

}
