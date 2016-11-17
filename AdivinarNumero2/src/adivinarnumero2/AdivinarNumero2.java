/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero2;

/**
 * @author dam115
 */
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AdivinarNumero2 {

    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        String cadena = menuPrograma();
        empezarJuego(cadena);
    }//fin main
    
    //metodo numero aleatorio
    public static int numeroAleatorio(){
        Random r = new Random();
        int numeroAleatorio = r.nextInt(100)+1;
        return numeroAleatorio;
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
    //Menu del programa
    public static String menuPrograma() throws IOException{
        
        String siNo =leerTecladoString("Este juego es para ver si adivinas un numero \n"
                + "Quieres comenzar S/N");
        return siNo;
    }
    //Comprobacion
    public static void empezarJuego(String cadena) throws IOException{
        int numero=numeroAleatorio();
       if("S".equals(cadena)){
           for(int i = 1; i<=5; i++){
                int resultado =leerTecladoInt("Este es tu " + i + " introduce el numero");
                if(resultado == numero){
                    System.out.println("Eres un fenomeno acertastes en tu " + i + " intento");
                    return;
                }else if(resultado > numero){
                    if(Math.abs(resultado - numero) < 10){
                        System.out.println("Te has pasado pero estas muy cerca");
                    }else if(Math.abs(resultado - numero) < 30){
                        System.out.println("Te has pasado pero estas cerca");
                    }else 
                          System.out.println("Te has pasado estas muy lejos");
                }else if(resultado < numero){
                    if(Math.abs(resultado - numero) < 10){
                        System.out.println("Te has quedado corto pero estas muy cerca");
                    }else if(Math.abs(resultado - numero) < 30){
                        System.out.println("Te has quedado corto pero estas cerca");
                    }else 
                          System.out.println("Te has que dado corto estas muy lejos");
                }
            }
        }else
            System.out.println("Nos vemos");
    }
}//fin class AdivinarNumero2
