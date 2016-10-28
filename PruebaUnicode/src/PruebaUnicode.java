/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public class PruebaUnicode {
    public static void main(String[]args){
        char c='€';
        System.out.println("le \ntra " + (int) 'A');//Unicode 2 bytes \n salto linea
        System.out.println("letras "+'\u0041'+" "+'\u00c1'); //La letra A en unicode
        System.out.println(" euro "+(int)'€'+" "+ c);
        System.out.println(" euro "+'\u20AC'+" "+ c);
        System.out.println(" letras Ñ ñ "+(int)'Ñ'+" "+ (int)'ñ');
        System.out.println("secuencias de escape "+"\"$\" "+ "\\A\\");
        System.out.println("letra Ñ "+ '\u00D1'+ " " +'\u00F1');
        System.out.println("Letra & "+ (int)'&' + " " +'\u0026'); //De caracter a entero y entero y unicode a char
    }
}
