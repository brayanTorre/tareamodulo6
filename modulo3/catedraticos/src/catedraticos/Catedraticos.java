/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catedraticos;

/**
 *
 * @author bryan torres
 */
public class Catedraticos {

 public static void main(String[] args) {


    

    Maestra Maestra = new Maestra();

    Maestra.setNombre("Tania");

    Maestra.setApellido("Alvarado");

    Maestra.setEdad (30);

    Maestra.setSexo ("F");


System.out.println("Nombre: " + Maestra.getNombre() );

System.out.println("apellido: " + Maestra.getApellido() );

System.out.println("Edad: " + Maestra.getEdad() );

System.out.println("Sexo: " + Maestra.getSexo() );

}


public static class Maestra{


    private String nombre;

    private String apellido;

    private int edad;

    private String sexo;   




    public String getNombre(){

        return nombre;

    }

    public String getApellido(){

        return apellido;

    }

    public int getEdad(){

        return edad;

    }

    public String getSexo(){

        return sexo;

    }


   

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public void setApellido(String apellido){

        this.apellido = apellido;

    }

    public void setEdad(int edad){

        this.edad = edad;

    }

    public void setSexo(String sexo){

        this.sexo = sexo;

    }

   }

  }
