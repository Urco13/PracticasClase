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
        /*Definimos el ojeto teclado con el clase BufferedReader metiendo en su argugmento
          La creacion de otro objeto InputStreamReader*/
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        //pedimos el primer numero
        System.out.println("Dame el primer nuemero");
        /**lo guardamos en la variable numeroA usando la Clase Integer con el metodo parseInt
         * y pasandole como argumento el objeto teclado con el metodo readline
         */
        numeroA = Integer.parseInt(teclado.readLine());
        //pedimos el segundo numero
        System.out.println("Dame el segundo numero");
        //lo guardamos en la variable numeroB
        numeroB = Integer.parseInt(teclado.readLine());
        //usamos la clase Math con sus metodos max min para ver el mayor y menor de los dos numeros
        mayor = Math.max(numeroA, numeroB);
        menor = Math.min(numeroA, numeroB);
        System.out.println("Numero menor "+ menor +" numero mayor" + mayor);
        for(i=menor; i<=mayor; i++){
            if(i%3==0)
                System.out.println("Numero divisible por 3 " + i); 
        }
        
    }
    
}
