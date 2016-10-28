
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Leer numeros mientras no se introduzca un valor negativo Mostrar cuantos numeros se leyeron
 */
public class NumerosPositivosWhile8 {
    public static void main(String[]args){
        int flag=0, numero, contador=0; 
        Scanner objetoLeer = new Scanner(System.in);
        while(flag==0){
          System.out.println("Dame un numero");
            numero = objetoLeer.nextInt();
            if(numero>=0){
              System.out.println("Numero " + numero +'\n');
               contador++;
            }else{
                System.out.println("No admito numero negativos: " + numero + '\n');
                flag = 1;
            }
        }//fin while
        System.out.println("Hemos leido "+contador+" numueros");
        //Comienzo do While
        /*do{
            Scanner objetoTeclado = new Scanner(System.in);
            numero = objetoTeclado.nextInt();
            if(numero>=0){
                contador++;
            }
        }while(flag==0);
        System.out.println("Hemos leido "+contador+" numueros");*/
    }
}
