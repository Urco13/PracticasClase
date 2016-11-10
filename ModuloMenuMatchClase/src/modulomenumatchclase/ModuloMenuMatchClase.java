/**
 * 
 */
package modulomenumatchclase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class ModuloMenuMatchClase {
    //static BufferedReader teclado = new BufferedRader(new InputStreamReader(System(in)))Esto nos permite usar este objeto en todo el programa
    //Modulo Menu
    public static int menuPrograma() throws IOException {
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
        }while(option<1 && option<7);
        return option;
    }
    
    //Modulo valor absoluto
    public static void valorAbsoluto(float numero){
        float absoluto = Math.abs(numero);
        System.out.println("El valor absoluto es " + absoluto);
    }
    
    //Modulo raiz cuadrada
    public static void raizCuadrada() throws IOException{
        //variable
        float numero;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dime un numero");
        numero = Float.parseFloat(teclado.readLine());
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz cuadrada es " + raiz);
    }
    
    //Modulo numero entero
    public static void numeroEntero(double numero){
        double entero =  Math.floor(numero);
        System.out.println("El numero entero es " + entero);
    }
    
    //Modulo redondeoArriba
    public static double redondeoArriba(double numero){
        double arriba = Math.ceil(numero);
        return arriba;
    }
    
    //Modulo potencia
    public static void potenciaExp(int numero) throws IOException{
        String cadena; int exp;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dame el exponente");
        cadena = teclado.readLine();
        exp = Integer.parseInt(cadena);
        System.out.println("La pontencia de " + numero + " es " + Math.pow(numero, exp) );
    }
    
    //El mayor de dos numeros
    public static void mayorDosNumeros(float numero) throws IOException{
        String cadena; float numero2;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dame otro numero"); 
        cadena = teclado.readLine();
        numero2 = Integer.parseInt(cadena);
        System.out.println("El mayor de los dos numeros es " + Math.max(numero, numero2)); 
    }
    public static void main(String[] args) throws IOException {
       float numero, numero2; String cadena;
        int option, exp, sw=0;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        do{ 
            System.out.println("Dime un numero");
            numero = Float.parseFloat(teclado.readLine());
            //option = menuPrograma();Esto es otra forma de hacerlo
            switch(menuPrograma()){
                case(1)://valor absoluto
                    valorAbsoluto(numero);
                break;
                case(2)://raiz cuadrada
                    raizCuadrada();
                    break;
                case(3)://numero entero
                    numeroEntero(numero);
                    break;
                case(4)://redondeo Arriba
                    double resultado = redondeoArriba(numero);
                    System.out.println("Redondeo hacia arriba " + resultado);
                    break;
                case(5)://potencia
                    potenciaExp((int)numero); 
                    break;
                case(6):// mayor de dos numeros
                    mayorDosNumeros((int)numero);    
                    break;
                case(7)://fin
                    System.out.println("Hasta pronto");
                    sw = 1;
                }   
            }while(sw == 0);
    }
}
   
