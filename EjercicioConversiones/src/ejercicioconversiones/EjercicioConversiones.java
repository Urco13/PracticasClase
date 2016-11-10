/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioconversiones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class EjercicioConversiones {
    //Creamos la clase para capturar la entrada del teclado
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    //Modulo menu
    public static int menuConversio() throws IOException{
        //variable
        int option=0;
        
        
        do{
            System.out.println("Menu conversiones");
            System.out.println("1-Pulgadas-----------Centimetros");
            System.out.println("2-Pies---------------Metros");
            System.out.println("3-Millas/Hora--------Km/h");
            System.out.println("4-Finalizar Programa");
        }while(option<1 && option>4);
        option = Integer.parseInt(teclado.readLine());
        return option;
    }
    
    //Modulo pulgadas a centimetros
    public static int pulgadasCentimetros() throws IOException{
        //variable
        int numero;
        
        System.out.println("Que deseas hacer:");
        System.out.println("1-Pasar Pulgadas a Centimetros");
        System.out.println("2-Pasar Centimetros a Pulgadas");
        numero = Integer.parseInt(teclado.readLine());
        switch(numero){
            case(1):
            break;
            case(2):
            break;
        }
        return numero;
    }
    public static void MetododoPulgadasCentimetros() throws IOException{
        //variable
        float numero;
        
        //inicio
        System.out.println("Dame un numero");
        numero = (float)Integer.parseInt(teclado.readLine());
        //numero *= 2.5;
        System.out.println(numero +" Centimetros son " + numero * 2.5 + "pulgadas");
        
    }
    public static void CentimetrosPulgadas() throws IOException{
        //variable
        float numero;
        
        //inicio
        System.out.println("Dame un numero");
        numero = (float)Integer.parseInt(teclado.readLine());
        //numero *= 2.5;
        System.out.println(numero +" Centimetros son " + numero * 2.5 + "pulgadas");
        
    }
    public static void main(String[] args) {
        
    }
    
}
