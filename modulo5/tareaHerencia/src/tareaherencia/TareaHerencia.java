/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherencia;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;
/**
 *
 * @author bryan torres
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Circulo Circulo = new Circulo();
     Cuadrado Cuadrado = new Cuadrado();
     Linea Linea = new Linea();
     Triangulo Triangulo = new Triangulo();
     
        System.out.println (Circulo.obtenerInformacionFormas());
         Circulo.ImprimirInformacio();
         Circulo.establecerRadio(25);
         Circulo.ImprimirInformacioCirculo();
         
       System.out.println (Cuadrado.obtenerInformacionFormas());
         Cuadrado.ImprimirInformacio();
            Cuadrado.establecerArea(33);
            Cuadrado.ImprimirInformacioCuadrado();
            
        System.out.println (Linea.obtenerInformacionFormas());
        Linea.ImprimirInformacio();
        Linea.establecerLargo(23);
            Linea.ImprimirInformacioLinea();
            
            System.out.println (Triangulo.obtenerInformacionFormas());
         Triangulo.ImprimirInformacio();
            Triangulo.establecerArea(33);
            Triangulo.ImprimirInformacioTriangulo();
    }
       
       
}
