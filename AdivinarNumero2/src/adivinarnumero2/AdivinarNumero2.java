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
        
    }//fin main
    
    //metodo numero aleatorio
    public static int numeroAleatorio(){
        Random r = new Random();
        int numeroAleatorio = r.nextInt(100)+1;
        return numeroAleatorio;
    }
    //Leer teclado string devolver string
    public static String leerTeclado(String texto) throws IOException{
        
        System.out.println(texto);
        String numeroTeclado = teclado.readLine();
        return numeroTeclado;
    }
    //Menu del programa
    public static String menuPrograma() throws IOException{
        
        String siNo =leerTeclado("Este juego es para ver si adivinas un numero \n"
                + "Quieres comenzar S/N");
        return siNo;
    }
    //Comprobacion
    public static void empezarJuego(String siNO){
       
    }
    
}//fin class AdivinarNumero2
