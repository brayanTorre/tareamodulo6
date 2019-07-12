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
public class Estudiante {

    
    
    public String Nombre;
    
    private String Experiencia;
    
    private int Edad;
    
    public Estudiante (String Nombre, String Experiencia) {
    this.Nombre = Nombre;
    this.Experiencia = Experiencia;
    }
    
    public void imprimirNombre (){
    System.out.println(Nombre);
    }
    
    public void imprimirExperiencia (){
    System.out.println(Experiencia);
    }
    
    public void setEdad (int edadd){
    this.Edad = edadd;
    }
    
    public int getEdad (){
    return Edad;
    }

  
}
