/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author urco1
 */

public class Array1 {
    
    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    public static final int LONGITUDARRAY=5; 
    
    public static void main(String[] args) throws IOException {
        
        int[] arrayLeido=leerAlmacenar();
        ordenInverso(arrayLeido);
        mostrarMayor(arrayLeido);
        posicionArray(arrayLeido);
        
    }//fin main
    
    /**
     * 
     * @param texto
     * @return 
     * @throws IOException 
     */
    public static int leerTeclado(String texto) throws IOException{
        System.out.println(texto);
        int numeroArray = Integer.parseInt(teclado.readLine());
        return numeroArray;
    }
    
    /**
     * 
     * @return
     * @throws IOException 
     */
    public static int[] leerAlmacenar() throws IOException{
        
        int cantidad[]=new int[LONGITUDARRAY];
        for(int i=0; i<LONGITUDARRAY; i++){
            int numero = leerTeclado("Dime el " + i +" numero del array");
            cantidad[i]=numero;
        }
        return cantidad;
    }
    
    /**
     * 
     * @param arrayLeido
     * @throws IOException 
     */
    public static void ordenInverso(int[]arrayLeido) throws IOException{
        
        for(int i = LONGITUDARRAY-1; i>=0; i--){
            System.out.println(arrayLeido[i]);
        }
    }
    
    /**
     * 
     * @param arrayLeido 
     */
    public static void mostrarMayor(int[]arrayLeido){
        int mayor=Integer.MIN_VALUE;
        for(int i = 0; i<LONGITUDARRAY; i++){
            int numero=arrayLeido[i];
            mayor = Math.max(numero, mayor);
        }//fin for
       System.out.println("El numero mayor dentro del array es " + mayor);
    }//fin mostrarMayor()
    
    /**
     * 
     * @param arrayLeido
     * @throws IOException 
     */
    public static void posicionArray(int[]arrayLeido) throws IOException{
        int consulta = leerTeclado("El array tiene "+ LONGITUDARRAY +" posiciones cual"
                + "deseas saber");
        System.out.println(arrayLeido[consulta]);
    }
}//fin class
