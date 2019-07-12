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
public class Triangulo extends Formas {
     private int Area;
    
      public void establecerArea(int Area){
    this.Area = Area;
    }

   
    public void ImprimirInformacioTriangulo(){
        System.out.println("Area:" + Area);
}
   
    public Triangulo (){
  establecerColor("Verde");
   establecerdibujar("Triangulo Equilatero");
    
    
    }

    @Override
    public String obtenerInformacionFormas() {
        return "INFORMACION PARA TRIANGULO";
    }
    
}
