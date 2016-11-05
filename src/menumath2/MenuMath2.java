/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menumath2;

/**
 *
 * @author CarlosRFG
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class MenuMath2 {
    
    public static int menuPrograma() throws IOException{
        int option;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("Pulse 1 para hallar su valor absoluto");//Pedimos que eliga entre una opcion
            System.out.println("Pulse 2 para calcular su raiz cuadrada");
            System.out.println("Pulse 3 para devolver el numero entero");
            System.out.println("Pulse 4 para redondear hacia arriba");
            System.out.println("Pulse 5 para elevarlo a un exponente");
            System.out.println("Pulse 6 para devolver el mayor de 2 numeros");
            System.out.println("Pulse 7 para salir del programa");
            option = Integer.parseInt(teclado.readLine());
            return option;
        }while(option!=7);
    }
    
    public static void main(String[] args) throws IOException {
        
        float numero, numero2; String cadena;
        int option, exp, sw=0;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        do{ 
            System.out.println("Dime un numero");
            numero = Integer.parseInt(teclado.readLine());
            //option = menuPrograma();Esto es otra forma de hacerlo
            switch(menuPrograma()){
                case(1):
                    System.out.println("El valor absoluto " + Math.abs(numero));
                break;
                case(2):
                    System.out.println("La raiz cuadrada " + Math.sqrt(numero));
                    break;
                case(3):
                    System.out.println("El numero entero es " + (int)Math.floor(numero) );//si no se va a guardar el valor no hace falta cambiar a (int)
                    break;
                case(4):
                    System.out.println("Redondeado hacia arriba " + Math.ceil(numero));
                    break;
                case(5):
                    System.out.println("Dame el exponente");
                    cadena = teclado.readLine();
                    exp = Integer.parseInt(cadena);
                    System.out.println("La pontencia de " + numero + " es " + Math.pow(numero, exp) );
                    break;
                case(6):
                    System.out.println("Dame otro numero"); 
                    cadena = teclado.readLine();
                    numero2 = Integer.parseInt(cadena);
                    System.out.println("El mayor de los dos numeros es " + Math.max(numero, numero2));
                    break;
                case(7):
                    System.out.println("Hasta pronto");
                    sw = 1;
                }   
            }while(sw == 0);
    }
    
}
