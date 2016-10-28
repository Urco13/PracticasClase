/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayordevariosnumeros;

/**
 *
 * @author dam115
 */
import java.util.Scanner;
public class MayorDeVariosNumeros {
    public static void main(String[] args) {
       int num, mayor=Integer.MIN_VALUE;//Si ponemos 0 en mayor solo admite positivos
       final int TOPE=5;
        Scanner teclado = new Scanner(System.in);
        for(byte i = 1; i<=TOPE; i++){
            System.out.println("Introduzca un numero");
            num = teclado.nextInt();
            mayor = Math.max(num, mayor);
        }
        System.out.println("El mayor es " + mayor);

/////////Este es otro ejercicio
//          int num, mayor=0;//Si ponemos 0 en mayor solo admite positivos
//          final int TOPE=5;
//          Scanner teclado = new Scanner(System.in);
//            for(byte i = 1; i<=TOPE; i++){
//            System.out.println("Introduzca un numero");
//            num = teclado.nextInt();
//            mayor = Math.max(num, mayor);
//        }
//        System.out.println("El mayor es " + mayor);
    }
    
}
