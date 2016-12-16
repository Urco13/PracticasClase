/**
 * Llenamos un string con 4 elementos
 * System.arraycopy()
 * Arrays.binarySearch():buscar valor en orde
 * Array.fill()
 * Array.equals()
 * Arrays.copyOf()
 * Arrays.copyOfRange()
 */
package arrays2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author dam115
 */
public class Arrays2 {
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String matriz[]={"Juan","Pedro","Antonio","Maria","Jaina"};
        Arrays.sort(matriz);
        for(int i = 0; i<matriz.length; i++){
            System.out.println(matriz[i]);
        }
        System.out.println("Este es binarySearch");
            //Siempre hay que ordenar el array antes de usar binarysearch
         int posicion= Arrays.binarySearch(matriz,"Maria");
         //if(position>=0)
         //{sout +(position+1)}
         //if (Arrays.binarySearch
         System.out.println(posicion);
         
        System.out.println("Este es fill");
        Arrays.fill(matriz,"Carlos");
        System.out.println(matriz);
         
    }//fin main
  
}//fin class
