/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiblespor3;

/**
 *mostrar todos los numeros divisibles por 3 que esten entre dos numeros
 * que se introduzcan por teclado
 * Ejemplo
 * if(numero1 > numero2)
 * aux = numero2;
 * numero2 = numero1;
 * numero1 = aux;
 * 
 * @author dam115
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DivisiblesPor3 {
    //throws IOException es para controlar las excepciones
    public static void main(String[] args) throws IOException {
        // Definimos variables
        int numeroA, numeroB, mayor, menor, i;
        /**Definimos el ojeto teclado con el clase BufferedReader metiendo en su argugmento
         * La creacion de otro objeto
        */
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dame el primer nuemero");
        numeroA = Integer.parseInt(teclado.readLine());
        System.out.println("Dame el segundo numero");
        numeroB = Integer.parseInt(teclado.readLine());
        mayor = Math.max(numeroA, numeroB);
        menor = Math.min(numeroA, numeroB);
        for(i=menor; i<=mayor; i++){
            if(i%3==0)
                System.out.println("");
            
    }
        
    }
    
}
