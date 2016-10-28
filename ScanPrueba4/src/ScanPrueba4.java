
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Programa que pase una velocidad Km/h a m/s
 */
import java.util.Scanner;
public class ScanPrueba4 {
    public static void main(String args[]){
        Scanner objeto = new Scanner(System.in);
                            //Constructor
        
        double velocidad = 0;
        float valorfloat;
        char car; //leer
        String cadena;
        
        System.out.println("Introduzca velocidad en KM/h: ");
        velocidad = objeto.nextDouble();
        
        System.out.println(velocidad + " KM/h --> " + velocidad * 1000/3600 + " m/s");
    }
}
