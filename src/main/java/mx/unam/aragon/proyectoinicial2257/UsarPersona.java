/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.proyectoinicial2257;

/**
 *
 * @author Waldemar
 */
public class UsarPersona {
    public static void main(String[] args) {
        System.out.println("Programa Usar Persona");
        Persona per1=new Persona(); //llamada al constructor
        Persona per2=new Persona();
        
        System.out.println( per1.getNombre() );
        
        per2.setNombre("Saul");
        System.out.println( per2.getNombre() );
        
        System.out.println( per2.toString() );
        per2.setEdad(18);
        System.out.println( per2.toString() );
    }
}
