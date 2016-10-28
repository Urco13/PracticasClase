/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor2;

/**
 *  Lee numeros y mustra cual es el mayor. El usuario nos indica si quiere introducir
 * otro numero o no.
 * @author dam115
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class NumeroMayor2 {

    public static void main(String[] args) throws IOException {
        // Definicion de variables
        int numeroEn, mayor=Integer.MIN_VALUE; int contador = 0;
Character respuesta;
        //BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        //Definimos el objeto que nos va a recoger los datos por el teclado
 
        do{
            System.out.println("Dame un numero");
            numeroEn = Integer.parseInt(teclado.readLine());
            mayor = Math.max(numeroEn, mayor); 
            System.out.println("Lleva introducidos" + contador);
            contador++;
            System.out.println("Desea continuar introduciendo numeros S/N");
            String cadena = teclado.readLine();
            respuesta = Character.toUpperCase(cadena.charAt(0));
                  
        }while(respuesta == 'S');
        System.out.println("El mayor de los numeros es: " + mayor);
    }
    
}
