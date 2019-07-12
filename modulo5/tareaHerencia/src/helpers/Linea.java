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
public class Linea extends Formas {
     private int Largo;
    
      public void establecerLargo (int Largo){
    this.Largo = Largo;
    }

   
    public void ImprimirInformacioLinea(){
        System.out.println("Largo:" + Largo);
}
   
    public Linea (){
        establecerColor("Azul");
   establecerdibujar("Linea Verticar");
}
      @Override
    public String obtenerInformacionFormas() {
        return "INFORMACION PARA LINEA";
    }
}
