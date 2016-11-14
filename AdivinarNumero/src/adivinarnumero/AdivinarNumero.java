/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero;
/**
 * @author Urco
 */
///////////////////////////////////////////////////////////////
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AdivinarNumero {

    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
  
    public static void main(String[] args) throws IOException {
        
        int numero = menuPrincipal();
        int numeroComprobacion = comprobacionNumero(numero);
        menorMayor(numeroComprobacion);
    }//fin main
    
    //Metodo menu
    public static int menuPrincipal() throws IOException{
        int numeroMenu;
        numeroMenu = leerTexto("!Hola quieres jugar!\nDime un numero del 1 al 100\n");
        return numeroMenu;
    }
    //Metodo leer
    public static int leerTexto(String texto) throws IOException{
        System.out.println(texto);
        int numero = Integer.parseInt(teclado.readLine());
        return numero;
    }
    
    //Metodo comprobacion numero
    public static int comprobacionNumero(int numeroMenu) throws IOException{
        
       int numeroOperacion = numeroMenu;
        int sw = 0;
           do{ 
           if(numeroOperacion >= 1 && numeroOperacion <= 100){
               System.out.println("!Perfecto empieza a adivinar el numero!\n"
                       + "Solo tendras 5 intentos");
               sw=1;
            }else{
               numeroOperacion=leerTexto("!Te dije del 1 al 100!\n "
                       + "Intentalo de nuevo");
           }
           }while(sw==0);
            return numeroOperacion;
    }
    
    public static void menorMayor(int numeroOperacion) throws IOException{
        for(int i = 1; i<6; i++){
            int resultado = leerTexto("Dime un numero de tu " + i +" intento");
            int numeroComparacion = numeroOperacion;
                if(numeroComparacion == resultado){
                    System.out.println("Eres un fenomeno a tu "+ i + " intento");
                    return;
                }else if(numeroComparacion < resultado){
                    System.out.println("Demasiado alto estas cerca pero aun"
                            + "te falta intentalo otra vez te quedan "+ (5-i) +" intentos");
                }else{
                    System.out.println("Demasiado bajo estas cerca pero aun"
                            + "te falta intentalo otra vez te quedan "+ (5-i) +" intentos");
                }
        }
        System.out.println("Eres un paquete deseas volver a intentarlo");
    }
}