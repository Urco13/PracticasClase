/*
 * Calcular el factorial de un numero en un metodo
 * recibe dato como argumento
 * calcula factorial y mustra resultado
 */
package factorialnumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class FactorialNumero {

   
    public static void main(String[] args) throws IOException {
        int numero;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dame un numero");
        numero = Integer.parseInt(teclado.readLine());
        factorialNum(numero);
    }
       public static void factorialNum(int numero){
        
            long factorial = 1; int contador;
    
        if(numero>0){
            for(contador=1; contador<=numero; contador++){
                factorial *= contador;
            }
        }
           System.out.println("El factorial del numero "+numero+" es 6"
                   + "" + factorial);
    }
    
}
 
