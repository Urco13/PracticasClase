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
public class PintarCuadradoHueco {
    public static void main(String[]args){
        int i, a, b, lado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el un numero");
        lado = teclado.nextInt();
        
        for(i=1; i<=lado; i++){
           if(i==1 || i==lado){
               //pintamos el primer y ultimo lado
               for(a=1; a<=lado; a++){
                System.out.print("* ");
                }
               System.out.println("");
           }else{
                if(i>1 && i<lado){
                  for(b=1; b<=lado; b++){
                      if(b==1 || b==lado){
                          System.out.print("* ");
                      }else{
                          System.out.print("  ");
                      }                    
                  }
                   System.out.println("");
                }           
            }
        }   
    }
}