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
public class NumerosPositivosFLag {
    public static void main(String[]args){
        boolean esNegativo=false; int numero, contador=0;
        Scanner objetoTeclado = new Scanner(System.in);
        do{
        System.out.println("Dime un numero");
        numero = objetoTeclado.nextInt();
        if(numero>=0){
            contador++;
        }else{
            esNegativo=true;
        }
        }while(esNegativo!=true);//negativo==false
        System.out.println("Se leyeron "+ contador);
    }
}
