
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public class NotaFinalScan5 {
    public static void main(String args[]){
        Scanner objetoEsca = new Scanner(System.in);
        float notaFinal, nota, faltas;
        System.out.println("Dime tu nota");
                nota = objetoEsca.nextFloat();
        System.out.println("Dime las faltas");
                faltas = objetoEsca.nextFloat();
        if(faltas< 5){
            notaFinal = nota;
        }else if(faltas>=5 && faltas<=10){
            notaFinal = nota - 0.5F;
        }else if(faltas>10 && faltas<=20){
            notaFinal = nota -1F;
        }else if(faltas>20){
            notaFinal = 3;
        }else{
            notaFinal = 3;
        }
        System.out.println("Tu nota es " + notaFinal);
    }

}
