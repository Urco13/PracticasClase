/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam115
 */
public class MoldeosDatos7 {
    public static void main(String[]args){
        int x = 3;
        double y=5.12345678;
        float z, raiz;
        z = x + 8.9F; //probar sin letra (F,L,D)
        z=(float) (200* y+x); //hacer con y sin moldeo. Casting (float)
        System.out.println("valor float: " + z);
        System.out.println("valor double: " + (double)z);
        System.out.println("3-valor int: " + (int)z);
        System.out.println("valor byte: "+ (byte)z);
        //int d=(float)x/2; error division no puede ser entera
        z= (float) (200*x); //probar error alt+enter
        //raiz=(float)Math.sqrt(10);// perdida de dato
    }
}
