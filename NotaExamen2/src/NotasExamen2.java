/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public class NotasExamen2 {
    public static void main(String args[]){
        int nota=5;
        if(nota >=9 && nota<=10){
            System.out.println("Tienes un sobresaliente");
        }else if(nota>=7 && nota<=8){
            System.out.println("Tienes un notable");
        }else if(nota>=5 && nota<=6){
            System.out.println("Tienes un suficiente");
        }else{
            System.out.println("Tienes un insuficiente");
        }
    }
}
