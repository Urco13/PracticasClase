/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author dam115
 */
public class AdivinarNumero3 {

    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
       menuPrincipal();
       int rangoUno = primerNumero();
       int rangoDos = segundoNumero();
       int numeroIntentos = numeroIntentos(); 
    }//Fin main
    
     //Metodo Jugar
        
    
     //Metodo menu principal
    public static void menuPrincipal() throws IOException{
        System.out.println("!Hola quieres jugar!\nDime un rango de valores\n"
                + "y el numero de intentos\nComencemos :)");
    }
    
    //Metodo leer primer numero
    public static int primerNumero() throws IOException{
        int numeroMenu;
        numeroMenu = leerTecladoInt("Dime el primer numero para el rango");
        return numeroMenu;
    }
    
    //Metodo leer segundo numero
    public static int segundoNumero() throws IOException{
        int numeroMenu;
        numeroMenu = leerTecladoInt("Dime el segundo numero para el rango");
        return numeroMenu;
    }
    
     //Metodo numero intentos
    public static int numeroIntentos() throws IOException{
        int numeroMenu;
        numeroMenu = leerTecladoInt("Dime el numero de Intentos");
        return numeroMenu;
    }
    
    //Leer string devolver string
    public static String leerTecladoString(String texto) throws IOException{
        
        System.out.println(texto);
        String numeroTeclado = teclado.readLine();
        return numeroTeclado;
    }
    
    //Leer string devolver int
    public static int leerTecladoInt(String texto) throws IOException{
        
        System.out.println(texto);
        int numeroTeclado = Integer.parseInt(teclado.readLine());
        return numeroTeclado;
    }
    
     //metodo numero aleatorio
    public static int numeroAleatorio(){
        Random r = new Random();
        int numeroAleatorio = r.nextInt(100)+1;
        return numeroAleatorio;
    }
}//Fin Class