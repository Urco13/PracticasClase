/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayalmacenarnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class ArrayAlmacenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    public static final int LONGITUDARRAY=5; 
    
    public static void main(String[] args) throws IOException {
        
        int[] arrayLeido=leerAlmacenar();
        ordenInverso(arrayLeido);
        mostrarMayor(arrayLeido);
        localizarNumero(arrayLeido);
        //posicionArray(arrayLeido);
       
    }//fin main
   /**
     * 
     * @param texto
     * @return 
     * @throws IOException 
     */
    public static int leerTeclado(String texto) throws IOException{
        System.out.println(texto);
        int numeroArray=0;
        boolean sw = true;
        do{
        try{
         numeroArray = Integer.parseInt(teclado.readLine());
        }
        catch(NumberFormatException o){
            System.out.println("");
            sw = false;
        }
        }while(sw==false);
        return numeroArray;
    }//fin leerTeclado
    
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
        for(int i = 0; i<LONGITUDARRAY; i++){//se puede usar array.length
            int numero=arrayLeido[i];
            mayor = Math.max(numero, mayor);
        }//fin for
       System.out.println("El numero mayor dentro del array es " + mayor);
    }//fin mostrarMayor()
    
    public static void localizarNumero(int[]arrayLeido) throws IOException{
        boolean existe = false;
        int numeroABuscar = leerTeclado("Dime el numero que deseas saber si esta en"
                + "el array");
        
        for(int i=0; i<arrayLeido.length && existe==false; i++){
            int posicion=arrayLeido[i];
            if(posicion == numeroABuscar){
                existe=true;
                i +=1;
                System.out.println("Tu numero se encuentra en el array en la "
                        + "posicion " + i);
                }
            }
            if(existe==false){
                System.out.println("No se encuentra en la tabla");
            }
    }//fin localizarNumero
    
    
    
    
    /**
     * 
     * @param arrayLeido
     * @throws IOException 
     */
    public static void posicionArray(int[]arrayLeido) throws IOException{
        int consulta = leerTeclado("El array tiene "+ LONGITUDARRAY +" posiciones cual"
                + "deseas saber");
        System.out.println(arrayLeido[consulta]);
    }//fin posicionArray
}//fin class
/**
 * for(byte i = 0; i<(array.length/2); i++){
 * numTemp = array[i];
 * array[i] = array[array.length-(i+1)];
 * array[array.length-(i+1)] = numTemp;
 * }
 */