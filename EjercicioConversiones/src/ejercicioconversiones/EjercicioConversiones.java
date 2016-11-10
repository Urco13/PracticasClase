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
    public static int menuConversion() throws IOException{
        //variable
        int option=0;
        
        
        do{
            System.out.println("Menu conversiones\n");
            System.out.println("1-Pulgadas-----------Centimetros");
            System.out.println("2-Pies---------------Metros");
            System.out.println("3-Millas/Hora--------Km/h");
            System.out.println("4-Finalizar Programa");
        }while(option<1 && option>4);
        option = Integer.parseInt(teclado.readLine());
        return option;
    }
    
    //Modulo pulgadas a centimetros
    public static int metodoPulgadasCentimetros() throws IOException{
        //variable
        int numero;
        
        System.out.println("Que deseas hacer:");
        System.out.println("1-Pasar Pulgadas a Centimetros");
        System.out.println("2-Pasar Centimetros a Pulgadas");
        numero = Integer.parseInt(teclado.readLine());
        switch(numero){
            case(1):
                pulgadasCentimetros();
            break;
            case(2):
                centimetrosPulgadas();
            break;
        }
        return numero;
    }
    //Modulo pies a metros
    public static int metodoPiesMetros() throws IOException{
         //variable
        int numero;
        
        System.out.println("Que deseas hacer:");
        System.out.println("1-Pasar Pies a Metros");
        System.out.println("2-Pasar Metros a Pies");
        numero = Integer.parseInt(teclado.readLine());
        switch(numero){
            case(1):
                piesMetros();
            break;
            case(2):
                metrosPies();
            break;
        }
        return numero;
    }
    
    //Metodo pulgadas a centimetros
    public static void pulgadasCentimetros() throws IOException{
        //variable
        float numero;
        
        //inicio
        System.out.println("Dame un numero");
        numero = (float)Integer.parseInt(teclado.readLine());
        //numero *= 2.5;
        System.out.println(numero +" Centimetros son " + numero * 2.5 + " pulgadas");
        
    }
    
    //Metodo centimetros a pulgadas
    public static void centimetrosPulgadas() throws IOException{
        //variable
        float numero;
        
        //inicio
        System.out.println("Dame un numero");
        numero = (float)Integer.parseInt(teclado.readLine());
        //numero /= 2.5;
        System.out.println(numero +" Pulgadas son " + numero / 2.5 + " Cetimetros");
    }
    //Metodo pie metros
    public static void piesMetros() throws IOException{
        //variable
        float numero;
        
        //inicio
        System.out.println("Dame un numero");
        numero = (float)Integer.parseInt(teclado.readLine());
        //numero *= 0.3048;
        System.out.println(numero +" Pies son " + numero * 0.3048 + " Metros");
    }
    //Metodo metros pies
    public static void metrosPies() throws IOException{
        //variable
        float numero;
        
        //inicio
        System.out.println("Dame un numero");
        numero = (float)Integer.parseInt(teclado.readLine());
        //numero *= 0.3048;
        System.out.println(numero +" Metros son " + numero / 0.3048 + " Pies");
    }
    //Metodo millas km
    public static float millasKm(float numero) throws IOException{
        float result;
        result = (float) (numero * 1.6);
        return result; 
    }
    //Metodo km millas
    public static float kmMillas(float numero) throws IOException{
        float result;
        result = (float) (numero / 1.6);
        return result; 
    }
    //Aqui comienza el programa
    public static void main(String[] args) throws IOException {
        int sw=0;
        do{
            int opciones = menuConversion();
            switch(opciones){
                case(1):
                    metodoPulgadasCentimetros();
                    break;
                case(2):
                    metodoPiesMetros();
                    break;
                case(3):
                    int option;
                    System.out.println("Que deseas hacer:");
                    System.out.println("1-Pasar Millas a km");
                    System.out.println("2-Pasar Km a Millas");
                    option = Integer.parseInt(teclado.readLine());
                    switch(option){
                        case(1):
                        float numero;
                        System.out.println("Dame un numero");
                        numero = (float)Integer.parseInt(teclado.readLine());
                        float result = millasKm(numero);
                        System.out.println(numero +" Millas son " + result +" Km");
                        break;
                        case(2):
                        float numero2;
                        System.out.println("Dame un numero");
                        numero2 = (float)Integer.parseInt(teclado.readLine());
                        float result2 = kmMillas(numero2);
                        System.out.println(numero2 +" Km son " + result2 +" Millas");
                        break;
                    }
                case(4):
                System.out.println("Hasta Pronto");
                sw = 1;
            }
        }while(sw==0);
    }
    
}
