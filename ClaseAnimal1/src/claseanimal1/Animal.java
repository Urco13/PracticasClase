/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseanimal1;

/**
 *
 * @author dam115
 */
public class Animal {
    
     int edad;
    String nombre;
    
    public  Animal(){}//Constructor clase java
    
    public  Animal(String n){ //Constructor clase
        nombre=n;
    }
    public void nace(){
        System.out.println("Hola mundo");
    }
    public void getNombre(){
        System.out.println(nombre);
    }
    public void getEdad(){
        System.out.println(edad);
    }
}
