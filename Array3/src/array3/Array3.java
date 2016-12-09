/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 *
 * @author dam115
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    static int ELEM= 3;
    //main
    public static void main(String[] args) {
        
        int[] miMatriz = leerNumeros();
        mostrarArrays(miMatriz);
        consulta(miMatriz);
        
    }//fin main
    
    //Consulta
    public static void consulta(int[]array){
        int numeroConsulta =0;
        numeroConsulta=leerTeclado("Dime el numero que quieres consultar");
        Arrays.sort(array);
        mostrarArrays(array);

    }//fin consulta
    
    //leerTeclado
    public static int leerTeclado(String Texto){
        int numero = 0;
        System.out.println(Texto);
        try {
            numero = Integer.parseInt(teclado.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Tiene que ser un numero entero");
        } catch (Exception ex) {
            System.out.println("Error");
        }
    return numero;
    }//fin leer teclado
    
    
    public static int[] leerNumeros(){
//        int numeroArray = 0;
        int matriz [] = new int[ELEM]; 
        for(int i=0; i<matriz.length; i++){
            matriz [i] = leerTeclado("Necesito que me digas 15 numeros dime el " +(i+1));   
        }
         return matriz; 
    }//Leer Numeros
   
    
    public static void mostrarArrays(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    
}//fin class
