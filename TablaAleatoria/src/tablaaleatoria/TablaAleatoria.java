/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaaleatoria;

import java.util.Random;

/**
 *
 * @author dam115
 */
public class TablaAleatoria {

   static Random aleatorio=new Random();
   /*
   *Retorna el n aleatorio entre 1 y modulo
   */
   static int calculoAleatorio(int modulo){
       return Math.abs(aleatorio.nextInt())%modulo+1;
   }
    public static void main(String[] args) {
       int tabla[];
       tabla=new int [calculoAleatorio(20)];
        System.out.println("tamaño tabla " + tabla.length);
        try{
            for(int i=0; i< tabla.length; i++){
                tabla[i]=i*7;
            }
            for(int i=0; i< tabla.length; i++){
                System.out.println("dato " + tabla[i]);
            }
        }catch(IndexOutOfBoundsException o){
            
        }catch(NumberFormatException o){
            
        }catch(Exception o){
            
        }
    }//fin main
    
}//fin class
