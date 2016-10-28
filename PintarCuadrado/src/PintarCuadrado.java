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
public class PintarCuadrado {
    public static void main(String[]args){
        int lado, i;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el numero de lados de tu cuadrado");
        lado = teclado.nextInt();
        for(int a=1; a<=lado; a++){
            for(i=1; i<=lado; i++){
                System.out.printf("* ");
        }
            System.out.print("\n");
        }  
    }
}
