/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularpintacuadrado;

/**
 *
 * @author urco1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ModularPintaCuadrado {

    
    public static void main(String[] args) throws IOException {
        int lado, area;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Dame el valor de una lado");
        lado = Integer.parseInt(teclado.readLine());
         area = pintaCuadrado(lado);
        System.out.println("El area del cuadrado es " + area);
    }
    public static int pintaCuadrado(int lado){
        int i, area;
        for(i=1; i<=lado; i++ ){
           for(int b=1; b<=lado; b++){
               System.out.print(" *");
           }  
            System.out.println("");
        }
        area = lado *=lado;
        return area;
    }
}

