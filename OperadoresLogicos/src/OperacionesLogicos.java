/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public class OperacionesLogicos {
    public static void main(String args[]){
        //Declaracion constantes varialbles
        int i=5, j=4;
        boolean aux, verdad=true, falso=false;
        
        //Operadores logicos con booleanos
        System.out.println(" Operaciones logicas...");
        System.out.println(" NOT verdad es "+ !verdad);
        System.out.println("\n NOT falso es "+ !falso);
        aux = verdad && falso;
        System.out.println("\n verdad AND falso es "+ aux);
        aux = verdad || falso;
        System.out.println("\n verdad OR falso es "+ aux);
        
            //Operadores relacionales
        System.out.println(" Mayor o igual que...");
        System.out.println(" (i>=j) = " + (i>=j));
        System.out.println(" (j>=1) = " + (j>=1));
        System.out.println(" (i!=j) = " + (i!=j));
        
                //Operadores logicos con enteros
        System.out.println(" operaciones logicas con enteros...");
        System.out.println("NOT (i>=j) = "+ !(i>=j));
        aux = (i>=j) && (j>=i);
        System.out.println("\n (i>=j) AND (j>=i) = "+ aux);
        aux = (i>=j) || (j>=i);
        System.out.println("i>j OR (j>=i) = "+ aux);
        
        if(!aux==false)
            System.out.println("entonces es cierto");
    }
}
