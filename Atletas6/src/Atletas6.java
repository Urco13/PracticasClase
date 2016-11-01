
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public class Atletas6 {
    public static void main(String[]args){
       String cadena; 
       int edad; 
       float tiempo; //Tiempo tiene que ser con coma para el scanner
       
       Scanner objetoTeclado = new Scanner(System.in);// Se crea el ojeto para capturar del teclado
        
        System.out.println("Dime tu sexo H/M ");
        cadena = objetoTeclado.next();
        char sex = cadena.charAt(0);
        System.out.println("Dime tu edad");
        edad = objetoTeclado.nextInt();
        System.out.println("Dime tu tiempo");
        tiempo = objetoTeclado.nextFloat();
        
        if(sex == 'H' && edad <=40 && tiempo <=1.5){
            System.out.println("Estas seleccionado");
        }else if(sex == 'H' && edad>40 && tiempo <=1.75){
            System.out.println("Estas seleccionado");
        }else if(sex == 'M' && tiempo <=1.8){
            System.out.println("Estas selecionada");
        }else{
            System.out.println("No estas selecionado");
        }
    }
}
