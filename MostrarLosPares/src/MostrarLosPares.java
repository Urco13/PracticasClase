/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public class MostrarLosPares {
    public static void main(String[]args){
        int i, numero = 1000; 
        for(i=2; i<=numero; i++){
            int resultado = i%2;
            if(resultado == 0){
                System.out.println(i);
            }
                    //            System.out.println(i);      
        }
    }
}
