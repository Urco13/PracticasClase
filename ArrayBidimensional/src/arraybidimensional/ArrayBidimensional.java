/*
Crear Matriz de 3x4
Almacenar numeros
metodo mostrar tabla,
mostrar los datos de la fila 3,
mostrar suma de cada fila,
mostrar suma columna 3,
Donde esta el numero?
Recorrer por columnas y mostrar
*/
package arraybidimensional;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 *
 * @author dam115
 */
public class ArrayBidimensional {

    /**
     * @param args the command line arguments
     */
    static BufferedReader leerFlujo = new BufferedReader(new InputStreamReader(System.in));
    public static final int FILAS = 3;
    public static final int COLUMNAS = 4;
    //comienzo main
    public static void main(String[] args) {
      int miMatriz[][];
      miMatriz=guardarNumerosArray();
      
    }//fin main
    
    
    //Metodo mostrar tabla
    public static void mostrarTabla(int matriz[][]){
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.println("Fila "+i+" numero "+matriz[i][j]);
            }
        }
        
    }//fin metodo
    
    //Metodo guardar numero array
    public static int[][] guardarNumerosArray(){
        int matriz[][] = new int[FILAS][COLUMNAS];
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                matriz[i][j]=leerStringI("Dime un numero");   
            }
        }
       
    }//fin metodo
    
    
    //METODO LEER
    public static int leerStringI(String texto){
        int numero=0;
        System.out.println(texto);
        try {
            numero = Integer.parseInt(leerFlujo.readLine());
        } catch (NumberFormatException ex) {
            System.out.println("Dime un numero entero no decimal");
        } catch (Exception ex) {
            System.out.println("Erro");
        }
        return numero;
//          int tabla[][]=new int[FILA][COLUM];
//          System.out.println("numero filas "+tabla.length);
//          System.out.println("elementos fila 0 ==> "+tabla[0].length);
    }//fin metodo
  
}//fin class

