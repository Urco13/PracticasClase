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
 * @author urco1
 */
public class AdivinarNumero3 {
    
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
         menuPrincipal();
       int rangoUno = primerNumero();
       int rangoDos = segundoNumero();
       int numeroIntentos = numeroIntentos();
       jugarAdivina(rangoUno, rangoDos, numeroIntentos);
    }//fin main
    
     /**Metodo Jugar
      * 
      * @param rango1
      * @param rango2
      * @param numeroIntentos
      * @throws IOException 
      */
        public static void jugarAdivina(int rango1, int rango2, int numeroIntentos) throws IOException{
            
        int numeroAle = numeroAleatorio(rango1, rango2);
            for(int i =1; i<=numeroIntentos; i++){
                
                int resultado =leerTecladoInt("Este es tu " + i + " intento introduce el numero");
                
                if(resultado == numeroAle){
                    System.out.println("Eres un fenomeno acertastes en tu " + i + " intento");
                     return;
                }else if(resultado > numeroAle){
                    if(Math.abs(resultado - numeroAle) < 10){
                        System.out.println("Te has pasado pero estas muy cerca");
                    }else if(Math.abs(resultado - numeroAle) < 30){
                        System.out.println("Te has pasado pero estas cerca");
                    }else 
                          System.out.println("Te has pasado estas muy lejos");
                }else if(resultado < numeroAle){
                    if(Math.abs(resultado - numeroAle) < 10){
                        System.out.println("Te has quedado corto pero estas muy cerca");
                    }else if(Math.abs(resultado - numeroAle) < 30){
                        System.out.println("Te has quedado corto pero estas cerca");
                    }else 
                          System.out.println("Te has que dado corto estas muy lejos");
                }
            }
            System.out.println("Mejor suerte para la proxima vez :(");
        }
     /**
     *Metodo menu principal
     * @throws java.io.IOException
     */
    public static void menuPrincipal() throws IOException{
        System.out.println("!Hola quieres jugar!\nDime un rango de valores\n"
                + "y el numero de intentos\nComencemos :)");
    }
    
    /**
     * Metodo leer primer numero
     * @return 
     * @throws java.io.IOException
     */
    public static int primerNumero() throws IOException{
        int numeroMenu;
        numeroMenu = leerTecladoInt("Dime el numero mas pequeño del rango");
        return numeroMenu;
    }
    
    /**
     * Metodo leer segundo numero
     * @return 
     * @throws java.io.IOException
     */
    public static int segundoNumero() throws IOException{
        int numeroMenu;
        numeroMenu = leerTecladoInt("Dime el numero mas grande del rango");
        return numeroMenu;
    }
    
     /**Metodo numero intentos
      * 
     * @return 
     * @throws java.io.IOException
      */
    public static int numeroIntentos() throws IOException{
        int numeroMenu;
        numeroMenu = leerTecladoInt("Dime el numero de Intentos");
        return numeroMenu;
    }
    
    /**Leer string devolver string
     * 
     * @param texto
     * @return
     * @throws IOException 
     */
    public static String leerTecladoString(String texto) throws IOException{
        
        System.out.println(texto);
        String numeroTeclado = teclado.readLine();
        return numeroTeclado;
    }
    
    /**Leer string devolver int
     * 
     * @param texto
     * @return
     * @throws IOException 
     */
    public static int leerTecladoInt(String texto) throws IOException{
        
        System.out.println(texto);
        int numeroTeclado = Integer.parseInt(teclado.readLine());
        return numeroTeclado;
    }
    
     /**metodo numero aleatorio
      * 
      * @param numero1
      * @param numero2
      * @return 
      */
    public static int numeroAleatorio(int numero1, int numero2){
        Random r = new Random();
        int numeroAleatorio = r.nextInt((numero2-(numero1-1)))+numero1;
        return numeroAleatorio;
    }
}//fin class
