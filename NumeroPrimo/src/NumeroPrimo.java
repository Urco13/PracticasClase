/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[]args){
        int numero, contador=0, i, resultado;
        Scanner objetoLeer = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = objetoLeer.nextInt();
        for(i=1; i<=numero; i++){
            resultado = numero % i;
            if(resultado == 0){
                contador++;
            }
        }
        if(contador == 2){
            System.out.println("Es un numero primo");
        }else{
            System.out.println("No es un numero primo");
        }
    }
}
