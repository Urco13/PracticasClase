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
public class NotaFinalSwichç {
    public static void main(String[]args){
        int nota;
        Scanner objetoLeer = new Scanner(System.in);
        System.out.println("Dime tu nota");
        nota = objetoLeer.nextInt();
        switch(nota){
            case 0:
            case 1:
            case 2:
                System.out.println("Muy def");
                break;
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota incorrecta");
                
               
        }
    }
}
